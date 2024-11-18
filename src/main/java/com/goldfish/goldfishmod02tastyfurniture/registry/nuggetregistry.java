package com.goldfish.goldfishmod02tastyfurniture.registry;

import com.goldfish.goldfishmod02tastyfurniture.TastyFurnitureCompatabilityPack;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class nuggetregistry {
    public static final DeferredRegister<Item> FOODNUGGET = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurnitureCompatabilityPack.MODID);

        public static final DeferredHolder<Item, Item> ELDERBERRY_NUGGET = FOODNUGGET.register("elderberry_nugget",
    () -> new Item(new Item.Properties()));
    
}
