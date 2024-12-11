package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class nuggetcompatregistry {
    public static final DeferredRegister<Item> FOODNUGGET = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurnitureCompatAddon.MODID);

 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> ELDERBERRY_NUGGET = FOODNUGGET.register("elderberry_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> JUNIPER_NUGGET = FOODNUGGET.register("juniper_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> CHERRY_NUGGET = FOODNUGGET.register("cherry_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> COCONUT_NUGGET = FOODNUGGET.register("coconut_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> ORANGE_NUGGET = FOODNUGGET.register("orange_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> LEMON_NUGGET = FOODNUGGET.register("lemon_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> LIME_NUGGET = FOODNUGGET.register("lime_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> CORN_NUGGET = FOODNUGGET.register("corn_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> ONION_NUGGET = FOODNUGGET.register("onion_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> PECAN_NUGGET = FOODNUGGET.register("pecan_nugget",
    () -> new Item(new Item.Properties()));
    
}
