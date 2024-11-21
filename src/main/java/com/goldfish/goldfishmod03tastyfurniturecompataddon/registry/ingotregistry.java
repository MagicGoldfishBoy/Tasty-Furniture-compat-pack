package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ingotregistry {
    public static final DeferredRegister<Item> FOODINGOT = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurnitureCompatAddon.MODID);
    
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> ELDERBERRY_INGOT = FOODINGOT.register("elderberry_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> CHERRY_INGOT = FOODINGOT.register("cherry_ingot",
    () -> new Item(new Item.Properties()));
}
