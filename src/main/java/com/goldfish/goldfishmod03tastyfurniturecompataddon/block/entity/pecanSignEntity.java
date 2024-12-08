package com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity;

import org.jetbrains.annotations.NotNull;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class pecanSignEntity extends SignBlockEntity {
    public pecanSignEntity(BlockPos pos, BlockState state) {
      super(pos, state);
    }
    @Override
    public @NotNull BlockEntityType<?> getType() {
        return foodblockcompatregistry.PECAN_SIGN_ENTITY.get();
    }
    public static void tick(Level level, BlockPos pos, BlockState state, pecanSignEntity entity) {
          if (level instanceof ServerLevel) {
          }
    }
    }
