package com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity;

import org.jetbrains.annotations.NotNull;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.kiwifruitFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class kiwifruitFurnaceEntity extends AbstractFurnaceBlockEntity {
    public kiwifruitFurnaceEntity(BlockPos pos, BlockState state) {
        super(foodblockcompatregistry.KIWIFRUIT_FURNACE_ENTITY.get(), pos, state, RecipeType.SMELTING);
    }

    @Override
    protected @NotNull Component getDefaultName() {
        return Component.translatable("container.kiwifruit_furnace");
    }

    @SuppressWarnings("null")
    @Override
    protected @NotNull AbstractContainerMenu createMenu(int syncId, @NotNull Inventory playerInventory) {
        return new FurnaceMenu(syncId, playerInventory, this, this.dataAccess);
    }

    protected kiwifruitFurnace getBlock() {
        return (foodblockcompatregistry.KIWIFRUIT_FURNACE.get());
    }

    
}
