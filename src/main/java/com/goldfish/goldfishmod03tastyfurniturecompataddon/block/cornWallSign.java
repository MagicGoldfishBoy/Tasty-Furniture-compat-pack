package com.goldfish.goldfishmod03tastyfurniturecompataddon.block;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.cornSignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class cornWallSign extends WallSignBlock {
    public cornWallSign(BlockBehaviour.Properties properties, WoodType woodType) {
        super(woodType, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
    }

@Override
public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
    return createTickerHelper(type, foodblockcompatregistry.CORN_SIGN_ENTITY.get(), cornSignEntity::tick);
}

@Override
public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
  return new cornSignEntity(pos, state);
}

@Override
protected boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
return pLevel.getBlockState(pPos.relative(pState.getValue(FACING).getOpposite())) != null;
}

@Override
public String getDescriptionId() {
return "food_wall_sign";
}

}
