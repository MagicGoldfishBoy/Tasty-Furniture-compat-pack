package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ingotcompatregistry {
    public static final DeferredRegister<Item> FOODINGOT = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurnitureCompatAddon.MODID);
    
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> ELDERBERRY_INGOT = FOODINGOT.register("elderberry_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> JUNIPER_INGOT = FOODINGOT.register("juniper_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> CHERRY_INGOT = FOODINGOT.register("cherry_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> COCONUT_INGOT = FOODINGOT.register("coconut_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> ORANGE_INGOT = FOODINGOT.register("orange_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> LEMON_INGOT = FOODINGOT.register("lemon_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> LIME_INGOT = FOODINGOT.register("lime_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> CORN_INGOT = FOODINGOT.register("corn_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> ONION_INGOT = FOODINGOT.register("onion_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> PECAN_INGOT = FOODINGOT.register("pecan_ingot",
    () -> new Item(new Item.Properties()));
}
