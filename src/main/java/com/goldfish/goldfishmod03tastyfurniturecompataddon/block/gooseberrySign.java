package com.goldfish.goldfishmod03tastyfurniturecompataddon.block;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity.gooseberrySignEntity;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class gooseberrySign extends StandingSignBlock {
    public gooseberrySign(BlockBehaviour.Properties properties, WoodType woodType) {
        super(woodType, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
    }

     @SuppressWarnings("null")
    @Override
     public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
         return createTickerHelper(type, foodblockcompatregistry.GOOSEBERRY_SIGN_ENTITY.get(), gooseberrySignEntity::tick);
     }

     @SuppressWarnings("null")
    @Override
     public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
          return new gooseberrySignEntity(pos, state);
     }
}
