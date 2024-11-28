package com.goldfish.goldfishmod03tastyfurniturecompataddon.block.entity;

import org.jetbrains.annotations.NotNull;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.block.juniperFurnace;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatregistry;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class juniperFurnaceEntity extends AbstractFurnaceBlockEntity {
    public juniperFurnaceEntity(BlockPos pos, BlockState state) {
        super(foodblockcompatregistry.JUNIPER_FURNACE_ENTITY.get(), pos, state, RecipeType.SMELTING);
    }

    @Override
    protected @NotNull Component getDefaultName() {
        return Component.translatable("container.juniper_furnace");
    }

    @Override
    protected @NotNull AbstractContainerMenu createMenu(int syncId, @NotNull Inventory playerInventory) {
        return new FurnaceMenu(syncId, playerInventory, this, this.dataAccess);
    }

    protected juniperFurnace getBlock() {
        return (foodblockcompatregistry.JUNIPER_FURNACE.get()); //getBlockState().getBlock();
    }

    
}
