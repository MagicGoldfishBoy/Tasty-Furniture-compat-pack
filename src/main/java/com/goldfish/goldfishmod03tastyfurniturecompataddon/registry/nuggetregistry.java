package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class nuggetregistry {
    public static final DeferredRegister<Item> FOODNUGGET = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurnitureCompatAddon.MODID);

 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> ELDERBERRY_NUGGET = FOODNUGGET.register("elderberry_nugget",
    () -> new Item(new Item.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> CHERRY_NUGGET = FOODNUGGET.register("cherry_nugget",
    () -> new Item(new Item.Properties()));
    
}
