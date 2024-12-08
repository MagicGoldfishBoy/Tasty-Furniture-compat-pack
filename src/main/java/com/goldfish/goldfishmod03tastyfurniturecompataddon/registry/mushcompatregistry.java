package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class mushcompatregistry {

    public static final DeferredRegister<Item> MUSH = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurnitureCompatAddon.MODID);

 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> ELDERBERRY_MUSH = MUSH.register("elderberry_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> JUNIPER_MUSH = MUSH.register("juniper_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> CHERRY_MUSH = MUSH.register("cherry_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> COCONUT_MUSH = MUSH.register("coconut_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> ORANGE_MUSH = MUSH.register("orange_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> LEMON_MUSH = MUSH.register("lemon_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> CORN_MUSH = MUSH.register("corn_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> ONION_MUSH = MUSH.register("onion_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        public static final DeferredHolder<Item, Item> PECAN_MUSH = MUSH.register("pecan_mush",
                () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
                .alwaysEdible().nutrition(1).saturationModifier(0.3f).build())));

    }//class

