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
 //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> BANANA_INGOT = FOODINGOT.register("banana_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> BLACKBERRY_INGOT = FOODINGOT.register("blackberry_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> RASPBERRY_INGOT = FOODINGOT.register("raspberry_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> STRAWBERRY_INGOT = FOODINGOT.register("strawberry_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> SUGARAPPLE_INGOT = FOODINGOT.register("sugarapple_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> CHERRY_INGOT = FOODINGOT.register("cherry_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> BLACKCHERRY_INGOT = FOODINGOT.register("blackcherry_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> PEACH_INGOT = FOODINGOT.register("peach_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> COCONUT_INGOT = FOODINGOT.register("coconut_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> ORANGE_INGOT = FOODINGOT.register("orange_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> TANGERINE_INGOT = FOODINGOT.register("tangerine_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> KUMQUAT_INGOT = FOODINGOT.register("kumquat_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> PERSIMMON_INGOT = FOODINGOT.register("persimmon_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> SATSUMA_INGOT = FOODINGOT.register("satsuma_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> MANDARIN_INGOT = FOODINGOT.register("mandarin_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> LEMON_INGOT = FOODINGOT.register("lemon_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> CITRON_INGOT = FOODINGOT.register("citron_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> BUDDHASHAND_INGOT = FOODINGOT.register("buddhashand_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> LIME_INGOT = FOODINGOT.register("lime_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> KEYLIME_INGOT = FOODINGOT.register("keylime_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> FINGERLIME_INGOT = FOODINGOT.register("fingerlime_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> GRAPEFRUIT_INGOT = FOODINGOT.register("grapefruit_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> POMELO_INGOT = FOODINGOT.register("pomelo_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> CORN_INGOT = FOODINGOT.register("corn_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> ONION_INGOT = FOODINGOT.register("onion_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> TOMATO_INGOT = FOODINGOT.register("tomato_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> PECAN_INGOT = FOODINGOT.register("pecan_ingot",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, Item> ALMOND_INGOT = FOODINGOT.register("almond_ingot",
    () -> new Item(new Item.Properties()));
}
