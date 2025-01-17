package com.goldfish.goldfishmod03tastyfurniturecompataddon.block;

import javax.annotation.Nullable;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.compatMediumFoodContainerEntity;
import com.mojang.serialization.MapCodec;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class compatMediumFoodCabinet extends HorizontalDirectionalBlock implements EntityBlock {

    public static final MapCodec<compatMediumFoodCabinet> CODEC = simpleCodec(compatMediumFoodCabinet::new);
    public static final DirectionProperty HORIZONTALFACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    public compatMediumFoodCabinet(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(HORIZONTALFACING, Direction.NORTH).setValue(OPEN, Boolean.valueOf(false)));
    }

    @Override
    @Nullable
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new compatMediumFoodContainerEntity(pPos, pState);
    }

    @Override
    protected MapCodec<compatMediumFoodCabinet> codec() {
        return CODEC;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        VoxelShape facing = switch (state.getValue(HORIZONTALFACING)) {
            case Direction.NORTH -> Shapes.box(0.0, 0.125, 0.125, 1.0, 1.0, 1.0);
            case EAST -> Shapes.box(0.0, 0.125, 0.0, 0.875, 1.0, 1.0); 
            case SOUTH -> Shapes.box(0.0, 0.125, 0.0, 1.0, 1.0, 0.875); 
            case WEST -> Shapes.box(0.125, 0.125, 0.0, 1.0, 1.0, 1.0);
            default -> Shapes.box(0.0, 0.125, 0.0, 1.0, 1.0, 0.50);
        };
        return facing;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
        //System.out.println("used");
        if (pLevel.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            BlockEntity blockentity = pLevel.getBlockEntity(pPos);
            if (blockentity instanceof compatMediumFoodContainerEntity) {
                pPlayer.openMenu((compatMediumFoodContainerEntity)blockentity);
                PiglinAi.angerNearbyPiglins(pPlayer, true);
            }

            return InteractionResult.CONSUME;
        }
    }

    @Override
    protected void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        Containers.dropContentsOnDestroy(pState, pNewState, pLevel, pPos);
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Override
    protected void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        //System.out.println("tick");
        BlockEntity blockentity = pLevel.getBlockEntity(pPos);
        if (blockentity instanceof compatMediumFoodContainerEntity) {
            ((compatMediumFoodContainerEntity)blockentity).recheckOpen();
        }
    }

    @Override
    protected RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(HORIZONTALFACING, OPEN);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(HORIZONTALFACING, pContext.getHorizontalDirection().getOpposite());
    }
    
}
