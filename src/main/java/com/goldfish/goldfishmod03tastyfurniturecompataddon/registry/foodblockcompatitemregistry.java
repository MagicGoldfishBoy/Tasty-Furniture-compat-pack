package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class foodblockcompatitemregistry {
    
    public static DeferredRegister<Item> FOODBLOCKITEM = DeferredRegister.create(BuiltInRegistries.ITEM, TastyFurnitureCompatAddon.MODID);


//==============================================================================================================================================================================================
//                                                                                         Blocks
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_block_item",
     () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> JUNIPER_BLOCK_ITEM = FOODBLOCKITEM.register("juniper_block_item",
     () -> new BlockItem(foodblockcompatregistry.JUNIPER_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> JUNIPER_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("juniper_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.JUNIPER_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> JUNIPER_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("juniper_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.JUNIPER_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> JUNIPER_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("juniper_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.JUNIPER_TILES_BLOCK.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Banana------------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> BANANA_BLOCK_ITEM = FOODBLOCKITEM.register("banana_block_item",
     () -> new BlockItem(foodblockcompatregistry.BANANA_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> BANANA_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("banana_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.BANANA_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> BANANA_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("banana_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.BANANA_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> BANANA_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("banana_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.BANANA_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> STARFRUIT_BLOCK_ITEM = FOODBLOCKITEM.register("starfruit_block_item",
     () -> new BlockItem(foodblockcompatregistry.STARFRUIT_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> STARFRUIT_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("starfruit_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.STARFRUIT_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> STARFRUIT_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("starfruit_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.STARFRUIT_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> STARFRUIT_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("starfruit_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.STARFRUIT_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_BLOCK_ITEM = FOODBLOCKITEM.register("kiwifruit_block_item",
     () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("kiwifruit_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("kiwifruit_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("kiwifruit_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_BLOCK_ITEM = FOODBLOCKITEM.register("gooseberry_block_item",
     () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("gooseberry_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("gooseberry_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("gooseberry_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> BLACKBERRY_BLOCK_ITEM = FOODBLOCKITEM.register("blackberry_block_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> BLACKBERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("blackberry_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> BLACKBERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("blackberry_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> BLACKBERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("blackberry_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> RASPBERRY_BLOCK_ITEM = FOODBLOCKITEM.register("raspberry_block_item",
     () -> new BlockItem(foodblockcompatregistry.RASPBERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> RASPBERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("raspberry_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.RASPBERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> RASPBERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("raspberry_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.RASPBERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> RASPBERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("raspberry_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.RASPBERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> STRAWBERRY_BLOCK_ITEM = FOODBLOCKITEM.register("strawberry_block_item",
     () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> STRAWBERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("strawberry_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> STRAWBERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("strawberry_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> STRAWBERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("strawberry_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_BLOCK_ITEM = FOODBLOCKITEM.register("sugarapple_block_item",
     () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("sugarapple_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("sugarapple_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("sugarapple_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_TILES_BLOCK.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> CHERRY_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_block_item",
     () -> new BlockItem(foodblockcompatregistry.CHERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.CHERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> CHERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.CHERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> CHERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.CHERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //-------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_BLOCK_ITEM = FOODBLOCKITEM.register("blackcherry_block_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("blackcherry_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("blackcherry_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("blackcherry_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //-------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> PEACH_BLOCK_ITEM = FOODBLOCKITEM.register("peach_block_item",
     () -> new BlockItem(foodblockcompatregistry.PEACH_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> PEACH_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("peach_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.PEACH_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> PEACH_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("peach_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.PEACH_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> PEACH_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("peach_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.PEACH_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> COCONUT_BLOCK_ITEM = FOODBLOCKITEM.register("coconut_block_item",
     () -> new BlockItem(foodblockcompatregistry.COCONUT_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> COCONUT_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("coconut_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.COCONUT_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> COCONUT_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("coconut_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.COCONUT_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> COCONUT_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("coconut_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.COCONUT_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> ORANGE_BLOCK_ITEM = FOODBLOCKITEM.register("orange_block_item",
     () -> new BlockItem(foodblockcompatregistry.ORANGE_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> ORANGE_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("orange_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.ORANGE_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> ORANGE_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("orange_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.ORANGE_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> ORANGE_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("orange_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.ORANGE_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> TANGERINE_BLOCK_ITEM = FOODBLOCKITEM.register("tangerine_block_item",
     () -> new BlockItem(foodblockcompatregistry.TANGERINE_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> TANGERINE_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("tangerine_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.TANGERINE_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> TANGERINE_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("tangerine_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.TANGERINE_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> TANGERINE_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("tangerine_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.TANGERINE_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> KUMQUAT_BLOCK_ITEM = FOODBLOCKITEM.register("kumquat_block_item",
     () -> new BlockItem(foodblockcompatregistry.KUMQUAT_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> KUMQUAT_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("kumquat_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.KUMQUAT_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> KUMQUAT_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("kumquat_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.KUMQUAT_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> KUMQUAT_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("kumquat_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.KUMQUAT_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> PERSIMMON_BLOCK_ITEM = FOODBLOCKITEM.register("persimmon_block_item",
     () -> new BlockItem(foodblockcompatregistry.PERSIMMON_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> PERSIMMON_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("persimmon_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.PERSIMMON_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> PERSIMMON_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("persimmon_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.PERSIMMON_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> PERSIMMON_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("persimmon_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.PERSIMMON_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> SATSUMA_BLOCK_ITEM = FOODBLOCKITEM.register("satsuma_block_item",
     () -> new BlockItem(foodblockcompatregistry.SATSUMA_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> SATSUMA_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("satsuma_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.SATSUMA_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> SATSUMA_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("satsuma_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.SATSUMA_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> SATSUMA_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("satsuma_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.SATSUMA_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> MANDARIN_BLOCK_ITEM = FOODBLOCKITEM.register("mandarin_block_item",
     () -> new BlockItem(foodblockcompatregistry.MANDARIN_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> MANDARIN_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("mandarin_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.MANDARIN_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> MANDARIN_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("mandarin_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.MANDARIN_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> MANDARIN_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("mandarin_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.MANDARIN_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> LEMON_BLOCK_ITEM = FOODBLOCKITEM.register("lemon_block_item",
     () -> new BlockItem(foodblockcompatregistry.LEMON_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> LEMON_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("lemon_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.LEMON_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> LEMON_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("lemon_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.LEMON_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> LEMON_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("lemon_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.LEMON_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> CITRON_BLOCK_ITEM = FOODBLOCKITEM.register("citron_block_item",
     () -> new BlockItem(foodblockcompatregistry.CITRON_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> CITRON_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("citron_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.CITRON_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> CITRON_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("citron_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.CITRON_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> CITRON_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("citron_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.CITRON_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_BLOCK_ITEM = FOODBLOCKITEM.register("buddhashand_block_item",
     () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("buddhashand_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("buddhashand_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("buddhashand_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> LIME_BLOCK_ITEM = FOODBLOCKITEM.register("lime_block_item",
     () -> new BlockItem(foodblockcompatregistry.LIME_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> LIME_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("lime_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.LIME_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> LIME_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("lime_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.LIME_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> LIME_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("lime_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.LIME_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> KEYLIME_BLOCK_ITEM = FOODBLOCKITEM.register("keylime_block_item",
     () -> new BlockItem(foodblockcompatregistry.KEYLIME_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> KEYLIME_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("keylime_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.KEYLIME_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> KEYLIME_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("keylime_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.KEYLIME_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> KEYLIME_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("keylime_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.KEYLIME_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> FINGERLIME_BLOCK_ITEM = FOODBLOCKITEM.register("fingerlime_block_item",
     () -> new BlockItem(foodblockcompatregistry.FINGERLIME_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> FINGERLIME_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("fingerlime_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.FINGERLIME_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> FINGERLIME_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("fingerlime_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.FINGERLIME_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> FINGERLIME_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("fingerlime_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.FINGERLIME_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_BLOCK_ITEM = FOODBLOCKITEM.register("grapefruit_block_item",
     () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("grapefruit_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("grapefruit_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("grapefruit_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> POMELO_BLOCK_ITEM = FOODBLOCKITEM.register("pomelo_block_item",
     () -> new BlockItem(foodblockcompatregistry.POMELO_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> POMELO_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("pomelo_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.POMELO_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> POMELO_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("pomelo_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.POMELO_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> POMELO_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("pomelo_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.POMELO_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> CORN_BLOCK_ITEM = FOODBLOCKITEM.register("corn_block_item",
     () -> new BlockItem(foodblockcompatregistry.CORN_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> CORN_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("corn_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.CORN_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> CORN_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("corn_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.CORN_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> CORN_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("corn_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.CORN_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> ONION_BLOCK_ITEM = FOODBLOCKITEM.register("onion_block_item",
     () -> new BlockItem(foodblockcompatregistry.ONION_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> ONION_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("onion_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.ONION_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> ONION_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("onion_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.ONION_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> ONION_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("onion_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.ONION_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> TOMATO_BLOCK_ITEM = FOODBLOCKITEM.register("tomato_block_item",
     () -> new BlockItem(foodblockcompatregistry.TOMATO_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> TOMATO_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("tomato_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.TOMATO_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> TOMATO_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("tomato_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.TOMATO_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> TOMATO_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("tomato_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.TOMATO_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> PECAN_BLOCK_ITEM = FOODBLOCKITEM.register("pecan_block_item",
     () -> new BlockItem(foodblockcompatregistry.PECAN_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> PECAN_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("pecan_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.PECAN_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> PECAN_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("pecan_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.PECAN_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> PECAN_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("pecan_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.PECAN_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> ALMOND_BLOCK_ITEM = FOODBLOCKITEM.register("almond_block_item",
     () -> new BlockItem(foodblockcompatregistry.ALMOND_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> ALMOND_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("almond_bricks_block_item",
     () -> new BlockItem(foodblockcompatregistry.ALMOND_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> ALMOND_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("almond_chiseled_block_item",
     () -> new BlockItem(foodblockcompatregistry.ALMOND_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> ALMOND_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("almond_tiles_block_item",
     () -> new BlockItem(foodblockcompatregistry.ALMOND_TILES_BLOCK.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Slabs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_SLAB_ITEM = FOODBLOCKITEM.register("elderberry_slab_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("elderberry_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> JUNIPER_SLAB_ITEM = FOODBLOCKITEM.register("juniper_slab_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("juniper_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Banana------------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> BANANA_SLAB_ITEM = FOODBLOCKITEM.register("banana_slab_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> BANANA_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("banana_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_SLAB_ITEM = FOODBLOCKITEM.register("starfruit_slab_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("starfruit_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_SLAB_ITEM = FOODBLOCKITEM.register("kiwifruit_slab_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("kiwifruit_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_SLAB_ITEM = FOODBLOCKITEM.register("gooseberry_slab_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("gooseberry_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Blackberry-----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_SLAB_ITEM = FOODBLOCKITEM.register("blackberry_slab_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("blackberry_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Raspberry-----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_SLAB_ITEM = FOODBLOCKITEM.register("raspberry_slab_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("raspberry_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Strawberry-----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_SLAB_ITEM = FOODBLOCKITEM.register("strawberry_slab_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("strawberry_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Sugarapple-----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_SLAB_ITEM = FOODBLOCKITEM.register("sugarapple_slab_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("sugarapple_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CHERRY_SLAB_ITEM = FOODBLOCKITEM.register("cherry_slab_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("cherry_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //-------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_SLAB_ITEM = FOODBLOCKITEM.register("blackcherry_slab_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("blackcherry_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //-------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> PEACH_SLAB_ITEM = FOODBLOCKITEM.register("peach_slab_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> PEACH_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("peach_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> COCONUT_SLAB_ITEM = FOODBLOCKITEM.register("coconut_slab_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> COCONUT_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("coconut_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ORANGE_SLAB_ITEM = FOODBLOCKITEM.register("orange_slab_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ORANGE_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("orange_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> TANGERINE_SLAB_ITEM = FOODBLOCKITEM.register("tangerine_slab_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> TANGERINE_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("tangerine_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_SLAB_ITEM = FOODBLOCKITEM.register("kumquat_slab_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("kumquat_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_SLAB_ITEM = FOODBLOCKITEM.register("persimmon_slab_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("persimmon_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> SATSUMA_SLAB_ITEM = FOODBLOCKITEM.register("satsuma_slab_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> SATSUMA_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("satsuma_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> MANDARIN_SLAB_ITEM = FOODBLOCKITEM.register("mandarin_slab_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> MANDARIN_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("mandarin_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> LEMON_SLAB_ITEM = FOODBLOCKITEM.register("lemon_slab_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> LEMON_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("lemon_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CITRON_SLAB_ITEM = FOODBLOCKITEM.register("citron_slab_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CITRON_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("citron_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_SLAB_ITEM = FOODBLOCKITEM.register("buddhashand_slab_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("buddhashand_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> LIME_SLAB_ITEM = FOODBLOCKITEM.register("lime_slab_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> LIME_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("lime_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> KEYLIME_SLAB_ITEM = FOODBLOCKITEM.register("keylime_slab_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> KEYLIME_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("keylime_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_SLAB_ITEM = FOODBLOCKITEM.register("fingerlime_slab_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("fingerlime_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_SLAB_ITEM = FOODBLOCKITEM.register("grapefruit_slab_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("grapefruit_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> POMELO_SLAB_ITEM = FOODBLOCKITEM.register("pomelo_slab_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> POMELO_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("pomelo_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CORN_SLAB_ITEM = FOODBLOCKITEM.register("corn_slab_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CORN_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("corn_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ONION_SLAB_ITEM = FOODBLOCKITEM.register("onion_slab_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ONION_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("onion_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> TOMATO_SLAB_ITEM = FOODBLOCKITEM.register("tomato_slab_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> TOMATO_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("tomato_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> PECAN_SLAB_ITEM = FOODBLOCKITEM.register("pecan_slab_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> PECAN_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("pecan_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ALMOND_SLAB_ITEM = FOODBLOCKITEM.register("almond_slab_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ALMOND_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("almond_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_BRICKS_SLAB.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Stairs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_STAIRS_ITEM = FOODBLOCKITEM.register("elderberry_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("elderberry_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> JUNIPER_STAIRS_ITEM = FOODBLOCKITEM.register("juniper_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("juniper_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> BANANA_STAIRS_ITEM = FOODBLOCKITEM.register("banana_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> BANANA_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("banana_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_STAIRS_ITEM = FOODBLOCKITEM.register("starfruit_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("starfruit_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_STAIRS_ITEM = FOODBLOCKITEM.register("kiwifruit_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("kiwifruit_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_STAIRS_ITEM = FOODBLOCKITEM.register("gooseberry_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("gooseberry_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_STAIRS_ITEM = FOODBLOCKITEM.register("blackberry_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("blackberry_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_STAIRS_ITEM = FOODBLOCKITEM.register("raspberry_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("raspberry_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_STAIRS_ITEM = FOODBLOCKITEM.register("strawberry_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("strawberry_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_STAIRS_ITEM = FOODBLOCKITEM.register("sugarapple_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("sugarapple_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CHERRY_STAIRS_ITEM = FOODBLOCKITEM.register("cherry_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("cherry_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_STAIRS_ITEM = FOODBLOCKITEM.register("blackcherry_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("blackcherry_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> PEACH_STAIRS_ITEM = FOODBLOCKITEM.register("peach_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> PEACH_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("peach_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> COCONUT_STAIRS_ITEM = FOODBLOCKITEM.register("coconut_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> COCONUT_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("coconut_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ORANGE_STAIRS_ITEM = FOODBLOCKITEM.register("orange_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ORANGE_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("orange_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> TANGERINE_STAIRS_ITEM = FOODBLOCKITEM.register("tangerine_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> TANGERINE_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("tangerine_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_STAIRS_ITEM = FOODBLOCKITEM.register("kumquat_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("kumquat_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_STAIRS_ITEM = FOODBLOCKITEM.register("persimmon_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("persimmon_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> SATSUMA_STAIRS_ITEM = FOODBLOCKITEM.register("satsuma_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> SATSUMA_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("satsuma_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> MANDARIN_STAIRS_ITEM = FOODBLOCKITEM.register("mandarin_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> MANDARIN_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("mandarin_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> LEMON_STAIRS_ITEM = FOODBLOCKITEM.register("lemon_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> LEMON_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("lemon_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CITRON_STAIRS_ITEM = FOODBLOCKITEM.register("citron_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CITRON_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("citron_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_STAIRS_ITEM = FOODBLOCKITEM.register("buddhashand_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("buddhashand_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> LIME_STAIRS_ITEM = FOODBLOCKITEM.register("lime_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> LIME_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("lime_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> KEYLIME_STAIRS_ITEM = FOODBLOCKITEM.register("keylime_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> KEYLIME_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("keylime_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_STAIRS_ITEM = FOODBLOCKITEM.register("fingerlime_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("fingerlime_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_STAIRS_ITEM = FOODBLOCKITEM.register("grapefruit_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("grapefruit_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> POMELO_STAIRS_ITEM = FOODBLOCKITEM.register("pomelo_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> POMELO_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("pomelo_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CORN_STAIRS_ITEM = FOODBLOCKITEM.register("corn_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CORN_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("corn_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ONION_STAIRS_ITEM = FOODBLOCKITEM.register("onion_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ONION_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("onion_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> TOMATO_STAIRS_ITEM = FOODBLOCKITEM.register("tomato_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> TOMATO_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("tomato_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> PECAN_STAIRS_ITEM = FOODBLOCKITEM.register("pecan_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> PECAN_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("pecan_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ALMOND_STAIRS_ITEM = FOODBLOCKITEM.register("almond_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ALMOND_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("almond_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_BRICKS_STAIRS.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Bars
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BARS_ITEM = FOODBLOCKITEM.register("elderberry_bars_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BARS.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BARS_ITEM = FOODBLOCKITEM.register("juniper_bars_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_BARS.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BANANA_BARS_ITEM = FOODBLOCKITEM.register("banana_bars_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_BARS_ITEM = FOODBLOCKITEM.register("starfruit_bars_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_BARS_ITEM = FOODBLOCKITEM.register("kiwifruit_bars_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_BARS_ITEM = FOODBLOCKITEM.register("gooseberry_bars_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_BARS_ITEM = FOODBLOCKITEM.register("blackberry_bars_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_BARS_ITEM = FOODBLOCKITEM.register("raspberry_bars_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_BARS_ITEM = FOODBLOCKITEM.register("strawberry_bars_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_BARS_ITEM = FOODBLOCKITEM.register("sugarapple_bars_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_BARS_ITEM = FOODBLOCKITEM.register("cherry_bars_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_BARS_ITEM = FOODBLOCKITEM.register("blackcherry_bars_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PEACH_BARS_ITEM = FOODBLOCKITEM.register("peach_bars_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_BARS_ITEM = FOODBLOCKITEM.register("coconut_bars_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_BARS_ITEM = FOODBLOCKITEM.register("orange_bars_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TANGERINE_BARS_ITEM = FOODBLOCKITEM.register("tangerine_bars_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_BARS_ITEM = FOODBLOCKITEM.register("kumquat_bars_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_BARS_ITEM = FOODBLOCKITEM.register("persimmon_bars_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SATSUMA_BARS_ITEM = FOODBLOCKITEM.register("satsuma_bars_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> MANDARIN_BARS_ITEM = FOODBLOCKITEM.register("mandarin_bars_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_BARS_ITEM = FOODBLOCKITEM.register("lemon_bars_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CITRON_BARS_ITEM = FOODBLOCKITEM.register("citron_bars_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_BARS_ITEM = FOODBLOCKITEM.register("buddhashand_bars_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LIME_BARS_ITEM = FOODBLOCKITEM.register("lime_bars_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KEYLIME_BARS_ITEM = FOODBLOCKITEM.register("keylime_bars_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_BARS_ITEM = FOODBLOCKITEM.register("fingerlime_bars_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_BARS_ITEM = FOODBLOCKITEM.register("grapefruit_bars_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> POMELO_BARS_ITEM = FOODBLOCKITEM.register("pomelo_bars_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_BARS_ITEM = FOODBLOCKITEM.register("corn_bars_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_BARS_ITEM = FOODBLOCKITEM.register("onion_bars_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TOMATO_BARS_ITEM = FOODBLOCKITEM.register("tomato_bars_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_BARS_ITEM = FOODBLOCKITEM.register("pecan_bars_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ALMOND_BARS_ITEM = FOODBLOCKITEM.register("almond_bars_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_BARS.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_DOOR_ITEM = FOODBLOCKITEM.register("elderberry_door_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_DOOR.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_DOOR_ITEM = FOODBLOCKITEM.register("juniper_door_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_DOOR.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BANANA_DOOR_ITEM = FOODBLOCKITEM.register("banana_door_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_DOOR_ITEM = FOODBLOCKITEM.register("starfruit_door_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_DOOR_ITEM = FOODBLOCKITEM.register("kiwifruit_door_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_DOOR_ITEM = FOODBLOCKITEM.register("gooseberry_door_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_DOOR_ITEM = FOODBLOCKITEM.register("blackberry_door_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_DOOR_ITEM = FOODBLOCKITEM.register("raspberry_door_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_DOOR_ITEM = FOODBLOCKITEM.register("strawberry_door_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_DOOR_ITEM = FOODBLOCKITEM.register("sugarapple_door_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_DOOR_ITEM = FOODBLOCKITEM.register("cherry_door_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_DOOR_ITEM = FOODBLOCKITEM.register("blackcherry_door_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PEACH_DOOR_ITEM = FOODBLOCKITEM.register("peach_door_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_DOOR_ITEM = FOODBLOCKITEM.register("coconut_door_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_DOOR_ITEM = FOODBLOCKITEM.register("orange_door_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TANGERINE_DOOR_ITEM = FOODBLOCKITEM.register("tangerine_door_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_DOOR_ITEM = FOODBLOCKITEM.register("kumquat_door_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_DOOR_ITEM = FOODBLOCKITEM.register("persimmon_door_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SATSUMA_DOOR_ITEM = FOODBLOCKITEM.register("satsuma_door_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> MANDARIN_DOOR_ITEM = FOODBLOCKITEM.register("mandarin_door_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_DOOR_ITEM = FOODBLOCKITEM.register("lemon_door_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CITRON_DOOR_ITEM = FOODBLOCKITEM.register("citron_door_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_DOOR_ITEM = FOODBLOCKITEM.register("buddhashand_door_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LIME_DOOR_ITEM = FOODBLOCKITEM.register("lime_door_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KEYLIME_DOOR_ITEM = FOODBLOCKITEM.register("keylime_door_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_DOOR_ITEM = FOODBLOCKITEM.register("fingerlime_door_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_DOOR_ITEM = FOODBLOCKITEM.register("grapefruit_door_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> POMELO_DOOR_ITEM = FOODBLOCKITEM.register("pomelo_door_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_DOOR_ITEM = FOODBLOCKITEM.register("corn_door_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_DOOR_ITEM = FOODBLOCKITEM.register("onion_door_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TOMATO_DOOR_ITEM = FOODBLOCKITEM.register("tomato_door_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_DOOR_ITEM = FOODBLOCKITEM.register("pecan_door_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ALMOND_DOOR_ITEM = FOODBLOCKITEM.register("almond_door_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_DOOR.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Buttons
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BUTTON_ITEM = FOODBLOCKITEM.register("elderberry_button_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BUTTON.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BUTTON_ITEM = FOODBLOCKITEM.register("juniper_button_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_BUTTON.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BANANA_BUTTON_ITEM = FOODBLOCKITEM.register("banana_button_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_BUTTON_ITEM = FOODBLOCKITEM.register("starfruit_button_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_BUTTON_ITEM = FOODBLOCKITEM.register("kiwifruit_button_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_BUTTON_ITEM = FOODBLOCKITEM.register("gooseberry_button_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_BUTTON_ITEM = FOODBLOCKITEM.register("blackberry_button_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_BUTTON_ITEM = FOODBLOCKITEM.register("raspberry_button_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_BUTTON_ITEM = FOODBLOCKITEM.register("strawberry_button_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_BUTTON_ITEM = FOODBLOCKITEM.register("sugarapple_button_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_BUTTON_ITEM = FOODBLOCKITEM.register("cherry_button_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_BUTTON_ITEM = FOODBLOCKITEM.register("blackcherry_button_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PEACH_BUTTON_ITEM = FOODBLOCKITEM.register("peach_button_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_BUTTON_ITEM = FOODBLOCKITEM.register("coconut_button_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_BUTTON_ITEM = FOODBLOCKITEM.register("orange_button_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TANGERINE_BUTTON_ITEM = FOODBLOCKITEM.register("tangerine_button_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_BUTTON_ITEM = FOODBLOCKITEM.register("kumquat_button_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_BUTTON_ITEM = FOODBLOCKITEM.register("persimmon_button_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SATSUMA_BUTTON_ITEM = FOODBLOCKITEM.register("satsuma_button_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> MANDARIN_BUTTON_ITEM = FOODBLOCKITEM.register("mandarin_button_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_BUTTON_ITEM = FOODBLOCKITEM.register("lemon_button_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CITRON_BUTTON_ITEM = FOODBLOCKITEM.register("citron_button_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_BUTTON_ITEM = FOODBLOCKITEM.register("buddhashand_button_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LIME_BUTTON_ITEM = FOODBLOCKITEM.register("lime_button_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KEYLIME_BUTTON_ITEM = FOODBLOCKITEM.register("keylime_button_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_BUTTON_ITEM = FOODBLOCKITEM.register("fingerlime_button_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_BUTTON_ITEM = FOODBLOCKITEM.register("grapefruit_button_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> POMELO_BUTTON_ITEM = FOODBLOCKITEM.register("pomelo_button_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_BUTTON_ITEM = FOODBLOCKITEM.register("corn_button_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_BUTTON_ITEM = FOODBLOCKITEM.register("onion_button_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TOMATO_BUTTON_ITEM = FOODBLOCKITEM.register("tomato_button_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_BUTTON_ITEM = FOODBLOCKITEM.register("pecan_button_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ALMOND_BUTTON_ITEM = FOODBLOCKITEM.register("almond_button_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_BUTTON.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Fences
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_FENCE_ITEM = FOODBLOCKITEM.register("elderberry_fence_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_FENCE.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_FENCE_ITEM = FOODBLOCKITEM.register("juniper_fence_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_FENCE.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BANANA_FENCE_ITEM = FOODBLOCKITEM.register("banana_fence_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_FENCE_ITEM = FOODBLOCKITEM.register("starfruit_fence_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_FENCE_ITEM = FOODBLOCKITEM.register("kiwifruit_fence_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_FENCE_ITEM = FOODBLOCKITEM.register("gooseberry_fence_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_FENCE_ITEM = FOODBLOCKITEM.register("blackberry_fence_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_FENCE_ITEM = FOODBLOCKITEM.register("raspberry_fence_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_FENCE_ITEM = FOODBLOCKITEM.register("strawberry_fence_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_FENCE_ITEM = FOODBLOCKITEM.register("sugarapple_fence_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_FENCE_ITEM = FOODBLOCKITEM.register("cherry_fence_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_FENCE_ITEM = FOODBLOCKITEM.register("blackcherry_fence_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PEACH_FENCE_ITEM = FOODBLOCKITEM.register("peach_fence_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_FENCE_ITEM = FOODBLOCKITEM.register("coconut_fence_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_FENCE_ITEM = FOODBLOCKITEM.register("orange_fence_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TANGERINE_FENCE_ITEM = FOODBLOCKITEM.register("tangerine_fence_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_FENCE_ITEM = FOODBLOCKITEM.register("kumquat_fence_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_FENCE_ITEM = FOODBLOCKITEM.register("persimmon_fence_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SATSUMA_FENCE_ITEM = FOODBLOCKITEM.register("satsuma_fence_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> MANDARIN_FENCE_ITEM = FOODBLOCKITEM.register("mandarin_fence_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_FENCE_ITEM = FOODBLOCKITEM.register("lemon_fence_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CITRON_FENCE_ITEM = FOODBLOCKITEM.register("citron_fence_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_FENCE_ITEM = FOODBLOCKITEM.register("buddhashand_fence_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LIME_FENCE_ITEM = FOODBLOCKITEM.register("lime_fence_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KEYLIME_FENCE_ITEM = FOODBLOCKITEM.register("keylime_fence_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_FENCE_ITEM = FOODBLOCKITEM.register("fingerlime_fence_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_FENCE_ITEM = FOODBLOCKITEM.register("grapefruit_fence_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> POMELO_FENCE_ITEM = FOODBLOCKITEM.register("pomelo_fence_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_FENCE_ITEM = FOODBLOCKITEM.register("corn_fence_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_FENCE_ITEM = FOODBLOCKITEM.register("onion_fence_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TOMATO_FENCE_ITEM = FOODBLOCKITEM.register("tomato_fence_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_FENCE_ITEM = FOODBLOCKITEM.register("pecan_fence_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ALMOND_FENCE_ITEM = FOODBLOCKITEM.register("almond_fence_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_FENCE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Gates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_GATE_ITEM = FOODBLOCKITEM.register("elderberry_gate_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_GATE.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_GATE_ITEM = FOODBLOCKITEM.register("juniper_gate_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_GATE.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BANANA_GATE_ITEM = FOODBLOCKITEM.register("banana_gate_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_GATE_ITEM = FOODBLOCKITEM.register("starfruit_gate_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_GATE_ITEM = FOODBLOCKITEM.register("kiwifruit_gate_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_GATE_ITEM = FOODBLOCKITEM.register("gooseberry_gate_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_GATE_ITEM = FOODBLOCKITEM.register("blackberry_gate_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_GATE_ITEM = FOODBLOCKITEM.register("raspberry_gate_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_GATE_ITEM = FOODBLOCKITEM.register("strawberry_gate_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_GATE_ITEM = FOODBLOCKITEM.register("sugarapple_gate_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_GATE_ITEM = FOODBLOCKITEM.register("cherry_gate_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_GATE_ITEM = FOODBLOCKITEM.register("blackcherry_gate_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PEACH_GATE_ITEM = FOODBLOCKITEM.register("peach_gate_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_GATE_ITEM = FOODBLOCKITEM.register("coconut_gate_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_GATE_ITEM = FOODBLOCKITEM.register("orange_gate_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TANGERINE_GATE_ITEM = FOODBLOCKITEM.register("tangerine_gate_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_GATE_ITEM = FOODBLOCKITEM.register("kumquat_gate_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_GATE_ITEM = FOODBLOCKITEM.register("persimmon_gate_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SATSUMA_GATE_ITEM = FOODBLOCKITEM.register("satsuma_gate_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> MANDARIN_GATE_ITEM = FOODBLOCKITEM.register("mandarin_gate_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_GATE_ITEM = FOODBLOCKITEM.register("lemon_gate_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CITRON_GATE_ITEM = FOODBLOCKITEM.register("citron_gate_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_GATE_ITEM = FOODBLOCKITEM.register("buddhashand_gate_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LIME_GATE_ITEM = FOODBLOCKITEM.register("lime_gate_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KEYLIME_GATE_ITEM = FOODBLOCKITEM.register("keylime_gate_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_GATE_ITEM = FOODBLOCKITEM.register("fingerlime_gate_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_GATE_ITEM = FOODBLOCKITEM.register("grapefruit_gate_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> POMELO_GATE_ITEM = FOODBLOCKITEM.register("pomelo_gate_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_GATE_ITEM = FOODBLOCKITEM.register("corn_gate_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_GATE_ITEM = FOODBLOCKITEM.register("onion_gate_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TOMATO_GATE_ITEM = FOODBLOCKITEM.register("tomato_gate_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_GATE_ITEM = FOODBLOCKITEM.register("pecan_gate_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ALMOND_GATE_ITEM = FOODBLOCKITEM.register("almond_gate_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_GATE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                     Pressure Plates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("elderberry_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("juniper_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BANANA_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("banana_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.BANANA_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STARFRUIT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("starfruit_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.STARFRUIT_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("kiwifruit_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("gooseberry_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKBERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("blackberry_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> RASPBERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("raspberry_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.RASPBERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> STRAWBERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("strawberry_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("sugarapple_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("cherry_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("blackcherry_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PEACH_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("peach_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.PEACH_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("coconut_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("orange_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TANGERINE_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("tangerine_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.TANGERINE_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KUMQUAT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("kumquat_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.KUMQUAT_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PERSIMMON_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("persimmon_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.PERSIMMON_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> SATSUMA_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("satsuma_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.SATSUMA_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> MANDARIN_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("mandarin_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.MANDARIN_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("lemon_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CITRON_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("citron_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.CITRON_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("buddhashand_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LIME_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("lime_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> KEYLIME_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("keylime_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.KEYLIME_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> FINGERLIME_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("fingerlime_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.FINGERLIME_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("grapefruit_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> POMELO_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("pomelo_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.POMELO_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("corn_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("onion_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> TOMATO_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("tomato_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.TOMATO_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("pecan_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ALMOND_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("almond_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.ALMOND_PRESSURE_PLATE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                          Signs
//==============================================================================================================================================================================================0
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> ELDERBERRY_SIGN_ITEM = FOODBLOCKITEM.register("elderberry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.ELDERBERRY_STANDING_SIGN.get(), foodblockcompatregistry.ELDERBERRY_WALL_SIGN.get()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> JUNIPER_SIGN_ITEM = FOODBLOCKITEM.register("juniper_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.JUNIPER_STANDING_SIGN.get(), foodblockcompatregistry.JUNIPER_WALL_SIGN.get()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> BANANA_SIGN_ITEM = FOODBLOCKITEM.register("banana_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.BANANA_STANDING_SIGN.get(), foodblockcompatregistry.BANANA_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> STARFRUIT_SIGN_ITEM = FOODBLOCKITEM.register("starfruit_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.STARFRUIT_STANDING_SIGN.get(), foodblockcompatregistry.STARFRUIT_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> KIWIFRUIT_SIGN_ITEM = FOODBLOCKITEM.register("kiwifruit_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.KIWIFRUIT_STANDING_SIGN.get(), foodblockcompatregistry.KIWIFRUIT_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> GOOSEBERRY_SIGN_ITEM = FOODBLOCKITEM.register("gooseberry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.GOOSEBERRY_STANDING_SIGN.get(), foodblockcompatregistry.GOOSEBERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> BLACKBERRY_SIGN_ITEM = FOODBLOCKITEM.register("blackberry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.BLACKBERRY_STANDING_SIGN.get(), foodblockcompatregistry.BLACKBERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> RASPBERRY_SIGN_ITEM = FOODBLOCKITEM.register("raspberry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.RASPBERRY_STANDING_SIGN.get(), foodblockcompatregistry.RASPBERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> STRAWBERRY_SIGN_ITEM = FOODBLOCKITEM.register("strawberry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.STRAWBERRY_STANDING_SIGN.get(), foodblockcompatregistry.STRAWBERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> SUGARAPPLE_SIGN_ITEM = FOODBLOCKITEM.register("sugarapple_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.SUGARAPPLE_STANDING_SIGN.get(), foodblockcompatregistry.SUGARAPPLE_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> CHERRY_SIGN_ITEM = FOODBLOCKITEM.register("cherry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.CHERRY_STANDING_SIGN.get(), foodblockcompatregistry.CHERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> BLACKCHERRY_SIGN_ITEM = FOODBLOCKITEM.register("blackcherry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.BLACKCHERRY_STANDING_SIGN.get(), foodblockcompatregistry.BLACKCHERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> PEACH_SIGN_ITEM = FOODBLOCKITEM.register("peach_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.PEACH_STANDING_SIGN.get(), foodblockcompatregistry.PEACH_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> COCONUT_SIGN_ITEM = FOODBLOCKITEM.register("coconut_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.COCONUT_STANDING_SIGN.get(), foodblockcompatregistry.COCONUT_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> ORANGE_SIGN_ITEM = FOODBLOCKITEM.register("orange_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.ORANGE_STANDING_SIGN.get(), foodblockcompatregistry.ORANGE_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> TANGERINE_SIGN_ITEM = FOODBLOCKITEM.register("tangerine_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.TANGERINE_STANDING_SIGN.get(), foodblockcompatregistry.TANGERINE_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> KUMQUAT_SIGN_ITEM = FOODBLOCKITEM.register("kumquat_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.KUMQUAT_STANDING_SIGN.get(), foodblockcompatregistry.KUMQUAT_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> PERSIMMON_SIGN_ITEM = FOODBLOCKITEM.register("persimmon_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.PERSIMMON_STANDING_SIGN.get(), foodblockcompatregistry.PERSIMMON_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> SATSUMA_SIGN_ITEM = FOODBLOCKITEM.register("satsuma_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.SATSUMA_STANDING_SIGN.get(), foodblockcompatregistry.SATSUMA_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> MANDARIN_SIGN_ITEM = FOODBLOCKITEM.register("mandarin_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.MANDARIN_STANDING_SIGN.get(), foodblockcompatregistry.MANDARIN_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> LEMON_SIGN_ITEM = FOODBLOCKITEM.register("lemon_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.LEMON_STANDING_SIGN.get(), foodblockcompatregistry.LEMON_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> CITRON_SIGN_ITEM = FOODBLOCKITEM.register("citron_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.CITRON_STANDING_SIGN.get(), foodblockcompatregistry.CITRON_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> BUDDHASHAND_SIGN_ITEM = FOODBLOCKITEM.register("buddhashand_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.BUDDHASHAND_STANDING_SIGN.get(), foodblockcompatregistry.BUDDHASHAND_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> LIME_SIGN_ITEM = FOODBLOCKITEM.register("lime_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.LIME_STANDING_SIGN.get(), foodblockcompatregistry.LIME_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> KEYLIME_SIGN_ITEM = FOODBLOCKITEM.register("keylime_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.KEYLIME_STANDING_SIGN.get(), foodblockcompatregistry.KEYLIME_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> FINGERLIME_SIGN_ITEM = FOODBLOCKITEM.register("fingerlime_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.FINGERLIME_STANDING_SIGN.get(), foodblockcompatregistry.FINGERLIME_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> GRAPEFRUIT_SIGN_ITEM = FOODBLOCKITEM.register("grapefruit_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.GRAPEFRUIT_STANDING_SIGN.get(), foodblockcompatregistry.GRAPEFRUIT_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> POMELO_SIGN_ITEM = FOODBLOCKITEM.register("pomelo_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.POMELO_STANDING_SIGN.get(), foodblockcompatregistry.POMELO_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> CORN_SIGN_ITEM = FOODBLOCKITEM.register("corn_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.CORN_STANDING_SIGN.get(), foodblockcompatregistry.CORN_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> ONION_SIGN_ITEM = FOODBLOCKITEM.register("onion_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.ONION_STANDING_SIGN.get(), foodblockcompatregistry.ONION_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> TOMATO_SIGN_ITEM = FOODBLOCKITEM.register("tomato_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.TOMATO_STANDING_SIGN.get(), foodblockcompatregistry.TOMATO_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> PECAN_SIGN_ITEM = FOODBLOCKITEM.register("pecan_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.PECAN_STANDING_SIGN.get(), foodblockcompatregistry.PECAN_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> ALMOND_SIGN_ITEM = FOODBLOCKITEM.register("almond_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.ALMOND_STANDING_SIGN.get(), foodblockcompatregistry.ALMOND_WALL_SIGN.get()));
//==============================================================================================================================================================================================
//                                                                                       Trap Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("elderberry_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> JUNIPER_TRAPDOOR_ITEM = FOODBLOCKITEM.register("juniper_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.JUNIPER_TRAPDOOR.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> BANANA_TRAPDOOR_ITEM = FOODBLOCKITEM.register("banana_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.BANANA_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> STARFRUIT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("starfruit_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.STARFRUIT_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("kiwifruit_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("gooseberry_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> BLACKBERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("blackberry_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> RASPBERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("raspberry_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.RASPBERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> STRAWBERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("strawberry_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_TRAPDOOR_ITEM = FOODBLOCKITEM.register("sugarapple_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> CHERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("cherry_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.CHERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("blackcherry_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> PEACH_TRAPDOOR_ITEM = FOODBLOCKITEM.register("peach_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.PEACH_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> COCONUT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("coconut_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.COCONUT_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> ORANGE_TRAPDOOR_ITEM = FOODBLOCKITEM.register("orange_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.ORANGE_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> TANGERINE_TRAPDOOR_ITEM = FOODBLOCKITEM.register("tangerine_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.TANGERINE_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> KUMQUAT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("kumquat_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.KUMQUAT_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> PERSIMMON_TRAPDOOR_ITEM = FOODBLOCKITEM.register("persimmon_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.PERSIMMON_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> SATSUMA_TRAPDOOR_ITEM = FOODBLOCKITEM.register("satsuma_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.SATSUMA_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> MANDARIN_TRAPDOOR_ITEM = FOODBLOCKITEM.register("mandarin_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.MANDARIN_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> LEMON_TRAPDOOR_ITEM = FOODBLOCKITEM.register("lemon_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.LEMON_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> CITRON_TRAPDOOR_ITEM = FOODBLOCKITEM.register("citron_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.CITRON_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_TRAPDOOR_ITEM = FOODBLOCKITEM.register("buddhashand_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> LIME_TRAPDOOR_ITEM = FOODBLOCKITEM.register("lime_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.LIME_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> KEYLIME_TRAPDOOR_ITEM = FOODBLOCKITEM.register("keylime_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.KEYLIME_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> FINGERLIME_TRAPDOOR_ITEM = FOODBLOCKITEM.register("fingerlime_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.FINGERLIME_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("grapefruit_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> POMELO_TRAPDOOR_ITEM = FOODBLOCKITEM.register("pomelo_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.POMELO_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> CORN_TRAPDOOR_ITEM = FOODBLOCKITEM.register("corn_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.CORN_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> ONION_TRAPDOOR_ITEM = FOODBLOCKITEM.register("onion_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.ONION_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> TOMATO_TRAPDOOR_ITEM = FOODBLOCKITEM.register("tomato_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.TOMATO_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> PECAN_TRAPDOOR_ITEM = FOODBLOCKITEM.register("pecan_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.PECAN_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> ALMOND_TRAPDOOR_ITEM = FOODBLOCKITEM.register("almond_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.ALMOND_TRAPDOOR.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Lamps
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LAMP_ITEM = FOODBLOCKITEM.register("elderberry_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_LAMP.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_LAMP_ITEM = FOODBLOCKITEM.register("juniper_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_LAMP.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_LAMP_ITEM = FOODBLOCKITEM.register("banana_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.BANANA_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_LAMP_ITEM = FOODBLOCKITEM.register("starfruit_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.STARFRUIT_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_LAMP_ITEM = FOODBLOCKITEM.register("kiwifruit_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_LAMP_ITEM = FOODBLOCKITEM.register("gooseberry_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_LAMP_ITEM = FOODBLOCKITEM.register("blackberry_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_LAMP_ITEM = FOODBLOCKITEM.register("raspberry_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.RASPBERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_LAMP_ITEM = FOODBLOCKITEM.register("strawberry_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_LAMP_ITEM = FOODBLOCKITEM.register("sugarapple_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_LAMP_ITEM = FOODBLOCKITEM.register("cherry_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_LAMP_ITEM = FOODBLOCKITEM.register("blackcherry_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_LAMP_ITEM = FOODBLOCKITEM.register("peach_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.PEACH_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_LAMP_ITEM = FOODBLOCKITEM.register("coconut_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_LAMP_ITEM = FOODBLOCKITEM.register("orange_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_LAMP_ITEM = FOODBLOCKITEM.register("tangerine_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.TANGERINE_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_LAMP_ITEM = FOODBLOCKITEM.register("kumquat_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.KUMQUAT_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_LAMP_ITEM = FOODBLOCKITEM.register("persimmon_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.PERSIMMON_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_LAMP_ITEM = FOODBLOCKITEM.register("satsuma_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.SATSUMA_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_LAMP_ITEM = FOODBLOCKITEM.register("mandarin_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.MANDARIN_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_LAMP_ITEM = FOODBLOCKITEM.register("lemon_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_LAMP_ITEM = FOODBLOCKITEM.register("citron_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.CITRON_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_LAMP_ITEM = FOODBLOCKITEM.register("buddhashand_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_LAMP_ITEM = FOODBLOCKITEM.register("lime_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.LIME_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_LAMP_ITEM = FOODBLOCKITEM.register("keylime_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.KEYLIME_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_LAMP_ITEM = FOODBLOCKITEM.register("fingerlime_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.FINGERLIME_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_LAMP_ITEM = FOODBLOCKITEM.register("grapefruit_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_LAMP_ITEM = FOODBLOCKITEM.register("pomelo_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.POMELO_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_LAMP_ITEM = FOODBLOCKITEM.register("corn_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_LAMP_ITEM = FOODBLOCKITEM.register("onion_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_LAMP_ITEM = FOODBLOCKITEM.register("tomato_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.TOMATO_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_LAMP_ITEM = FOODBLOCKITEM.register("pecan_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_LAMP_ITEM = FOODBLOCKITEM.register("almond_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.ALMOND_LAMP.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Carpets
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CARPET_ITEM = FOODBLOCKITEM.register("elderberry_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_CARPET.get(), new BlockItem.Properties())); 
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_CARPET_ITEM = FOODBLOCKITEM.register("juniper_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_CARPET.get(), new BlockItem.Properties())); 
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_CARPET_ITEM = FOODBLOCKITEM.register("banana_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.BANANA_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_CARPET_ITEM = FOODBLOCKITEM.register("starfruit_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.STARFRUIT_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_CARPET_ITEM = FOODBLOCKITEM.register("kiwifruit_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_CARPET_ITEM = FOODBLOCKITEM.register("gooseberry_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_CARPET_ITEM = FOODBLOCKITEM.register("blackberry_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_CARPET_ITEM = FOODBLOCKITEM.register("raspberry_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.RASPBERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_CARPET_ITEM = FOODBLOCKITEM.register("strawberry_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_CARPET_ITEM = FOODBLOCKITEM.register("sugarapple_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CARPET_ITEM = FOODBLOCKITEM.register("cherry_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_CARPET_ITEM = FOODBLOCKITEM.register("blackcherry_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_CARPET_ITEM = FOODBLOCKITEM.register("peach_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.PEACH_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_CARPET_ITEM = FOODBLOCKITEM.register("coconut_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_CARPET_ITEM = FOODBLOCKITEM.register("orange_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_CARPET_ITEM = FOODBLOCKITEM.register("tangerine_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.TANGERINE_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_CARPET_ITEM = FOODBLOCKITEM.register("kumquat_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.KUMQUAT_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_CARPET_ITEM = FOODBLOCKITEM.register("persimmon_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.PERSIMMON_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_CARPET_ITEM = FOODBLOCKITEM.register("satsuma_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.SATSUMA_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_CARPET_ITEM = FOODBLOCKITEM.register("mandarin_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.MANDARIN_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_CARPET_ITEM = FOODBLOCKITEM.register("lemon_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_CARPET_ITEM = FOODBLOCKITEM.register("citron_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.CITRON_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_CARPET_ITEM = FOODBLOCKITEM.register("buddhashand_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_CARPET_ITEM = FOODBLOCKITEM.register("lime_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.LIME_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_CARPET_ITEM = FOODBLOCKITEM.register("keylime_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.KEYLIME_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_CARPET_ITEM = FOODBLOCKITEM.register("fingerlime_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.FINGERLIME_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_CARPET_ITEM = FOODBLOCKITEM.register("grapefruit_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_CARPET_ITEM = FOODBLOCKITEM.register("pomelo_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.POMELO_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_CARPET_ITEM = FOODBLOCKITEM.register("corn_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_CARPET_ITEM = FOODBLOCKITEM.register("onion_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_CARPET_ITEM = FOODBLOCKITEM.register("tomato_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.TOMATO_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_CARPET_ITEM = FOODBLOCKITEM.register("pecan_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_CARPET_ITEM = FOODBLOCKITEM.register("almond_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.ALMOND_CARPET.get(), new BlockItem.Properties())); 
//==============================================================================================================================================================================================
//                                                                                        Lanterns
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LANTERN_ITEM = FOODBLOCKITEM.register("elderberry_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> ELDERBERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("elderberry_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> JUNIPER_LANTERN_ITEM = FOODBLOCKITEM.register("juniper_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.JUNIPER_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> JUNIPER_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("juniper_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.JUNIPER_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> BANANA_LANTERN_ITEM = FOODBLOCKITEM.register("banana_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.BANANA_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> BANANA_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("banana_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.BANANA_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> STARFRUIT_LANTERN_ITEM = FOODBLOCKITEM.register("starfruit_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.STARFRUIT_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> STARFRUIT_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("starfruit_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.STARFRUIT_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_LANTERN_ITEM = FOODBLOCKITEM.register("kiwifruit_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("kiwifruit_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_LANTERN_ITEM = FOODBLOCKITEM.register("gooseberry_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("gooseberry_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> BLACKBERRY_LANTERN_ITEM = FOODBLOCKITEM.register("blackberry_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> BLACKBERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("blackberry_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> RASPBERRY_LANTERN_ITEM = FOODBLOCKITEM.register("raspberry_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.RASPBERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> RASPBERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("raspberry_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.RASPBERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> STRAWBERRY_LANTERN_ITEM = FOODBLOCKITEM.register("strawberry_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> STRAWBERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("strawberry_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_LANTERN_ITEM = FOODBLOCKITEM.register("sugarapple_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("sugarapple_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> CHERRY_LANTERN_ITEM = FOODBLOCKITEM.register("cherry_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.CHERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> CHERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("cherry_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.CHERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_LANTERN_ITEM = FOODBLOCKITEM.register("blackcherry_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("blackcherry_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> PEACH_LANTERN_ITEM = FOODBLOCKITEM.register("peach_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.PEACH_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> PEACH_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("peach_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.PEACH_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> COCONUT_LANTERN_ITEM = FOODBLOCKITEM.register("coconut_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.COCONUT_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> COCONUT_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("coconut_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.COCONUT_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> ORANGE_LANTERN_ITEM = FOODBLOCKITEM.register("orange_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.ORANGE_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> ORANGE_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("orange_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.ORANGE_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> TANGERINE_LANTERN_ITEM = FOODBLOCKITEM.register("tangerine_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.TANGERINE_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> TANGERINE_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("tangerine_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.TANGERINE_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> KUMQUAT_LANTERN_ITEM = FOODBLOCKITEM.register("kumquat_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.KUMQUAT_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> KUMQUAT_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("kumquat_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.KUMQUAT_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> PERSIMMON_LANTERN_ITEM = FOODBLOCKITEM.register("persimmon_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.PERSIMMON_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> PERSIMMON_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("persimmon_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.PERSIMMON_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> SATSUMA_LANTERN_ITEM = FOODBLOCKITEM.register("satsuma_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.SATSUMA_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> SATSUMA_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("satsuma_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.SATSUMA_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> MANDARIN_LANTERN_ITEM = FOODBLOCKITEM.register("mandarin_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.MANDARIN_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> MANDARIN_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("mandarin_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.MANDARIN_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> LEMON_LANTERN_ITEM = FOODBLOCKITEM.register("lemon_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.LEMON_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> LEMON_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("lemon_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.LEMON_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> CITRON_LANTERN_ITEM = FOODBLOCKITEM.register("citron_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.CITRON_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> CITRON_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("citron_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.CITRON_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_LANTERN_ITEM = FOODBLOCKITEM.register("buddhashand_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("buddhashand_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> LIME_LANTERN_ITEM = FOODBLOCKITEM.register("lime_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.LIME_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> LIME_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("lime_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.LIME_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> KEYLIME_LANTERN_ITEM = FOODBLOCKITEM.register("keylime_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.KEYLIME_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> KEYLIME_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("keylime_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.KEYLIME_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> FINGERLIME_LANTERN_ITEM = FOODBLOCKITEM.register("fingerlime_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.FINGERLIME_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> FINGERLIME_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("fingerlime_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.FINGERLIME_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_LANTERN_ITEM = FOODBLOCKITEM.register("grapefruit_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("grapefruit_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> POMELO_LANTERN_ITEM = FOODBLOCKITEM.register("pomelo_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.POMELO_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> POMELO_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("pomelo_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.POMELO_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> CORN_LANTERN_ITEM = FOODBLOCKITEM.register("corn_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.CORN_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> CORN_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("corn_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.CORN_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> ONION_LANTERN_ITEM = FOODBLOCKITEM.register("onion_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.ONION_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> ONION_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("onion_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.ONION_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> TOMATO_LANTERN_ITEM = FOODBLOCKITEM.register("tomato_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.TOMATO_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> TOMATO_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("tomato_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.TOMATO_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> PECAN_LANTERN_ITEM = FOODBLOCKITEM.register("pecan_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.PECAN_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> PECAN_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("pecan_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.PECAN_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> ALMOND_LANTERN_ITEM = FOODBLOCKITEM.register("almond_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.ALMOND_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> ALMOND_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("almond_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.ALMOND_SOUL_LANTERN.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Chains
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHAIN_ITEM = FOODBLOCKITEM.register("elderberry_chain_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_CHAIN.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_CHAIN_ITEM = FOODBLOCKITEM.register("juniper_chain_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_CHAIN.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_CHAIN_ITEM = FOODBLOCKITEM.register("banana_chain_item",
    () -> new BlockItem(foodblockcompatregistry.BANANA_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_CHAIN_ITEM = FOODBLOCKITEM.register("starfruit_chain_item",
    () -> new BlockItem(foodblockcompatregistry.STARFRUIT_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_CHAIN_ITEM = FOODBLOCKITEM.register("kiwifruit_chain_item",
    () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_CHAIN_ITEM = FOODBLOCKITEM.register("gooseberry_chain_item",
    () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_CHAIN_ITEM = FOODBLOCKITEM.register("blackberry_chain_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_CHAIN_ITEM = FOODBLOCKITEM.register("raspberry_chain_item",
    () -> new BlockItem(foodblockcompatregistry.RASPBERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_CHAIN_ITEM = FOODBLOCKITEM.register("strawberry_chain_item",
    () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_CHAIN_ITEM = FOODBLOCKITEM.register("sugarapple_chain_item",
    () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CHAIN_ITEM = FOODBLOCKITEM.register("cherry_chain_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_CHAIN_ITEM = FOODBLOCKITEM.register("blackcherry_chain_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_CHAIN_ITEM = FOODBLOCKITEM.register("peach_chain_item",
    () -> new BlockItem(foodblockcompatregistry.PEACH_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_CHAIN_ITEM = FOODBLOCKITEM.register("coconut_chain_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_CHAIN_ITEM = FOODBLOCKITEM.register("orange_chain_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_CHAIN_ITEM = FOODBLOCKITEM.register("tangerine_chain_item",
    () -> new BlockItem(foodblockcompatregistry.TANGERINE_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_CHAIN_ITEM = FOODBLOCKITEM.register("kumquat_chain_item",
    () -> new BlockItem(foodblockcompatregistry.KUMQUAT_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_CHAIN_ITEM = FOODBLOCKITEM.register("persimmon_chain_item",
    () -> new BlockItem(foodblockcompatregistry.PERSIMMON_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_CHAIN_ITEM = FOODBLOCKITEM.register("satsuma_chain_item",
    () -> new BlockItem(foodblockcompatregistry.SATSUMA_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_CHAIN_ITEM = FOODBLOCKITEM.register("mandarin_chain_item",
    () -> new BlockItem(foodblockcompatregistry.MANDARIN_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_CHAIN_ITEM = FOODBLOCKITEM.register("lemon_chain_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_CHAIN_ITEM = FOODBLOCKITEM.register("citron_chain_item",
    () -> new BlockItem(foodblockcompatregistry.CITRON_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_CHAIN_ITEM = FOODBLOCKITEM.register("buddhashand_chain_item",
    () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_CHAIN_ITEM = FOODBLOCKITEM.register("lime_chain_item",
    () -> new BlockItem(foodblockcompatregistry.LIME_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_CHAIN_ITEM = FOODBLOCKITEM.register("keylime_chain_item",
    () -> new BlockItem(foodblockcompatregistry.KEYLIME_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_CHAIN_ITEM = FOODBLOCKITEM.register("fingerlime_chain_item",
    () -> new BlockItem(foodblockcompatregistry.FINGERLIME_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_CHAIN_ITEM = FOODBLOCKITEM.register("grapefruit_chain_item",
    () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_CHAIN_ITEM = FOODBLOCKITEM.register("pomelo_chain_item",
    () -> new BlockItem(foodblockcompatregistry.POMELO_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_CHAIN_ITEM = FOODBLOCKITEM.register("corn_chain_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_CHAIN_ITEM = FOODBLOCKITEM.register("onion_chain_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_CHAIN_ITEM = FOODBLOCKITEM.register("tomato_chain_item",
    () -> new BlockItem(foodblockcompatregistry.TOMATO_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_CHAIN_ITEM = FOODBLOCKITEM.register("pecan_chain_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_CHAIN_ITEM = FOODBLOCKITEM.register("almond_chain_item",
    () -> new BlockItem(foodblockcompatregistry.ALMOND_CHAIN.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Ladders
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LADDER_ITEM =  FOODBLOCKITEM.register("elderberry_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_LADDER.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_LADDER_ITEM =  FOODBLOCKITEM.register("juniper_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_LADDER.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_LADDER_ITEM =  FOODBLOCKITEM.register("banana_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.BANANA_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_LADDER_ITEM =  FOODBLOCKITEM.register("starfruit_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.STARFRUIT_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_LADDER_ITEM =  FOODBLOCKITEM.register("kiwifruit_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_LADDER_ITEM =  FOODBLOCKITEM.register("gooseberry_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_LADDER_ITEM =  FOODBLOCKITEM.register("blackberry_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_LADDER_ITEM =  FOODBLOCKITEM.register("raspberry_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.RASPBERRY_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_LADDER_ITEM =  FOODBLOCKITEM.register("strawberry_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_LADDER_ITEM =  FOODBLOCKITEM.register("sugarapple_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_LADDER_ITEM =  FOODBLOCKITEM.register("cherry_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_LADDER_ITEM =  FOODBLOCKITEM.register("blackcherry_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_LADDER_ITEM =  FOODBLOCKITEM.register("peach_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.PEACH_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_LADDER_ITEM =  FOODBLOCKITEM.register("coconut_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_LADDER_ITEM =  FOODBLOCKITEM.register("orange_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_LADDER_ITEM =  FOODBLOCKITEM.register("tangerine_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.TANGERINE_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_LADDER_ITEM =  FOODBLOCKITEM.register("kumquat_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.KUMQUAT_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_LADDER_ITEM =  FOODBLOCKITEM.register("persimmon_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.PERSIMMON_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_LADDER_ITEM =  FOODBLOCKITEM.register("satsuma_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.SATSUMA_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_LADDER_ITEM =  FOODBLOCKITEM.register("mandarin_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.MANDARIN_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_LADDER_ITEM =  FOODBLOCKITEM.register("lemon_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_LADDER_ITEM =  FOODBLOCKITEM.register("citron_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.CITRON_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_LADDER_ITEM =  FOODBLOCKITEM.register("buddhashand_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_LADDER_ITEM =  FOODBLOCKITEM.register("lime_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.LIME_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_LADDER_ITEM =  FOODBLOCKITEM.register("keylime_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.KEYLIME_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_LADDER_ITEM =  FOODBLOCKITEM.register("fingerlime_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.FINGERLIME_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_LADDER_ITEM =  FOODBLOCKITEM.register("grapefruit_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_LADDER_ITEM =  FOODBLOCKITEM.register("pomelo_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.POMELO_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_LADDER_ITEM =  FOODBLOCKITEM.register("corn_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_LADDER_ITEM =  FOODBLOCKITEM.register("onion_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_LADDER_ITEM =  FOODBLOCKITEM.register("tomato_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.TOMATO_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_LADDER_ITEM =  FOODBLOCKITEM.register("pecan_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_LADDER_ITEM =  FOODBLOCKITEM.register("almond_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.ALMOND_LADDER.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Tables
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TABLE_ITEM =  FOODBLOCKITEM.register("elderberry_table_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_TABLE.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_TABLE_ITEM =  FOODBLOCKITEM.register("juniper_table_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_TABLE.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_TABLE_ITEM =  FOODBLOCKITEM.register("banana_table_item",
    () -> new BlockItem(foodblockcompatregistry.BANANA_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_TABLE_ITEM =  FOODBLOCKITEM.register("starfruit_table_item",
    () -> new BlockItem(foodblockcompatregistry.STARFRUIT_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_TABLE_ITEM =  FOODBLOCKITEM.register("kiwifruit_table_item",
    () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_TABLE_ITEM =  FOODBLOCKITEM.register("gooseberry_table_item",
    () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_TABLE_ITEM =  FOODBLOCKITEM.register("blackberry_table_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_TABLE_ITEM =  FOODBLOCKITEM.register("raspberry_table_item",
    () -> new BlockItem(foodblockcompatregistry.RASPBERRY_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_TABLE_ITEM =  FOODBLOCKITEM.register("strawberry_table_item",
    () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_TABLE_ITEM =  FOODBLOCKITEM.register("sugarapple_table_item",
    () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_TABLE_ITEM =  FOODBLOCKITEM.register("cherry_table_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_TABLE_ITEM =  FOODBLOCKITEM.register("blackcherry_table_item",
    () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_TABLE_ITEM =  FOODBLOCKITEM.register("peach_table_item",
    () -> new BlockItem(foodblockcompatregistry.PEACH_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_TABLE_ITEM =  FOODBLOCKITEM.register("coconut_table_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_TABLE_ITEM =  FOODBLOCKITEM.register("orange_table_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_TABLE_ITEM =  FOODBLOCKITEM.register("tangerine_table_item",
    () -> new BlockItem(foodblockcompatregistry.TANGERINE_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_TABLE_ITEM =  FOODBLOCKITEM.register("kumquat_table_item",
    () -> new BlockItem(foodblockcompatregistry.KUMQUAT_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_TABLE_ITEM =  FOODBLOCKITEM.register("persimmon_table_item",
    () -> new BlockItem(foodblockcompatregistry.PERSIMMON_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_TABLE_ITEM =  FOODBLOCKITEM.register("satsuma_table_item",
    () -> new BlockItem(foodblockcompatregistry.SATSUMA_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_TABLE_ITEM =  FOODBLOCKITEM.register("mandarin_table_item",
    () -> new BlockItem(foodblockcompatregistry.MANDARIN_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_TABLE_ITEM =  FOODBLOCKITEM.register("lemon_table_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_TABLE_ITEM =  FOODBLOCKITEM.register("citron_table_item",
    () -> new BlockItem(foodblockcompatregistry.CITRON_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_TABLE_ITEM =  FOODBLOCKITEM.register("buddhashand_table_item",
    () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_TABLE_ITEM =  FOODBLOCKITEM.register("lime_table_item",
    () -> new BlockItem(foodblockcompatregistry.LIME_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_TABLE_ITEM =  FOODBLOCKITEM.register("keylime_table_item",
    () -> new BlockItem(foodblockcompatregistry.KEYLIME_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_TABLE_ITEM =  FOODBLOCKITEM.register("fingerlime_table_item",
    () -> new BlockItem(foodblockcompatregistry.FINGERLIME_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_TABLE_ITEM =  FOODBLOCKITEM.register("grapefruit_table_item",
    () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_TABLE_ITEM =  FOODBLOCKITEM.register("pomelo_table_item",
    () -> new BlockItem(foodblockcompatregistry.POMELO_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_TABLE_ITEM =  FOODBLOCKITEM.register("corn_table_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_TABLE_ITEM =  FOODBLOCKITEM.register("onion_table_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_TABLE_ITEM =  FOODBLOCKITEM.register("tomato_table_item",
    () -> new BlockItem(foodblockcompatregistry.TOMATO_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_TABLE_ITEM =  FOODBLOCKITEM.register("pecan_table_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_TABLE_ITEM =  FOODBLOCKITEM.register("almond_table_item",
    () -> new BlockItem(foodblockcompatregistry.ALMOND_TABLE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Torches
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ELDERBERRY_TORCH_ITEM = FOODBLOCKITEM.register("elderberry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ELDERBERRY_TORCH.get(), foodblockcompatregistry.ELDERBERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ELDERBERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("elderberry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ELDERBERRY_REDSTONE_TORCH.get(), foodblockcompatregistry.ELDERBERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ELDERBERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("elderberry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ELDERBERRY_SOUL_TORCH.get(), foodblockcompatregistry.ELDERBERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> JUNIPER_TORCH_ITEM = FOODBLOCKITEM.register("juniper_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.JUNIPER_TORCH.get(), foodblockcompatregistry.JUNIPER_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> JUNIPER_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("juniper_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.JUNIPER_REDSTONE_TORCH.get(), foodblockcompatregistry.JUNIPER_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> JUNIPER_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("juniper_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.JUNIPER_SOUL_TORCH.get(), foodblockcompatregistry.JUNIPER_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BANANA_TORCH_ITEM = FOODBLOCKITEM.register("banana_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BANANA_TORCH.get(), foodblockcompatregistry.BANANA_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BANANA_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("banana_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BANANA_REDSTONE_TORCH.get(), foodblockcompatregistry.BANANA_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BANANA_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("banana_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BANANA_SOUL_TORCH.get(), foodblockcompatregistry.BANANA_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> STARFRUIT_TORCH_ITEM = FOODBLOCKITEM.register("starfruit_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.STARFRUIT_TORCH.get(), foodblockcompatregistry.STARFRUIT_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> STARFRUIT_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("starfruit_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.STARFRUIT_REDSTONE_TORCH.get(), foodblockcompatregistry.STARFRUIT_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> STARFRUIT_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("starfruit_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.STARFRUIT_SOUL_TORCH.get(), foodblockcompatregistry.STARFRUIT_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> KIWIFRUIT_TORCH_ITEM = FOODBLOCKITEM.register("kiwifruit_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.KIWIFRUIT_TORCH.get(), foodblockcompatregistry.KIWIFRUIT_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> KIWIFRUIT_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("kiwifruit_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.KIWIFRUIT_REDSTONE_TORCH.get(), foodblockcompatregistry.KIWIFRUIT_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> KIWIFRUIT_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("kiwifruit_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.KIWIFRUIT_SOUL_TORCH.get(), foodblockcompatregistry.KIWIFRUIT_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> GOOSEBERRY_TORCH_ITEM = FOODBLOCKITEM.register("gooseberry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.GOOSEBERRY_TORCH.get(), foodblockcompatregistry.GOOSEBERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> GOOSEBERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("gooseberry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.GOOSEBERRY_REDSTONE_TORCH.get(), foodblockcompatregistry.GOOSEBERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> GOOSEBERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("gooseberry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.GOOSEBERRY_SOUL_TORCH.get(), foodblockcompatregistry.GOOSEBERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BLACKBERRY_TORCH_ITEM = FOODBLOCKITEM.register("blackberry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BLACKBERRY_TORCH.get(), foodblockcompatregistry.BLACKBERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BLACKBERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("blackberry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BLACKBERRY_REDSTONE_TORCH.get(), foodblockcompatregistry.BLACKBERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BLACKBERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("blackberry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BLACKBERRY_SOUL_TORCH.get(), foodblockcompatregistry.BLACKBERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> RASPBERRY_TORCH_ITEM = FOODBLOCKITEM.register("raspberry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.RASPBERRY_TORCH.get(), foodblockcompatregistry.RASPBERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> RASPBERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("raspberry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.RASPBERRY_REDSTONE_TORCH.get(), foodblockcompatregistry.RASPBERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> RASPBERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("raspberry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.RASPBERRY_SOUL_TORCH.get(), foodblockcompatregistry.RASPBERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> STRAWBERRY_TORCH_ITEM = FOODBLOCKITEM.register("strawberry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.STRAWBERRY_TORCH.get(), foodblockcompatregistry.STRAWBERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> STRAWBERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("strawberry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.STRAWBERRY_REDSTONE_TORCH.get(), foodblockcompatregistry.STRAWBERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> STRAWBERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("strawberry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.STRAWBERRY_SOUL_TORCH.get(), foodblockcompatregistry.STRAWBERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SUGARAPPLE_TORCH_ITEM = FOODBLOCKITEM.register("sugarapple_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.SUGARAPPLE_TORCH.get(), foodblockcompatregistry.SUGARAPPLE_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SUGARAPPLE_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("sugarapple_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.SUGARAPPLE_REDSTONE_TORCH.get(), foodblockcompatregistry.SUGARAPPLE_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SUGARAPPLE_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("sugarapple_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.SUGARAPPLE_SOUL_TORCH.get(), foodblockcompatregistry.SUGARAPPLE_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHERRY_TORCH_ITEM = FOODBLOCKITEM.register("cherry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.CHERRY_TORCH.get(), foodblockcompatregistry.CHERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("cherry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.CHERRY_REDSTONE_TORCH.get(), foodblockcompatregistry.CHERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("cherry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.CHERRY_SOUL_TORCH.get(), foodblockcompatregistry.CHERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BLACKCHERRY_TORCH_ITEM = FOODBLOCKITEM.register("blackcherry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BLACKCHERRY_TORCH.get(), foodblockcompatregistry.BLACKCHERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BLACKCHERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("blackcherry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BLACKCHERRY_REDSTONE_TORCH.get(), foodblockcompatregistry.BLACKCHERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BLACKCHERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("blackcherry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BLACKCHERRY_SOUL_TORCH.get(), foodblockcompatregistry.BLACKCHERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PEACH_TORCH_ITEM = FOODBLOCKITEM.register("peach_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.PEACH_TORCH.get(), foodblockcompatregistry.PEACH_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PEACH_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("peach_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.PEACH_REDSTONE_TORCH.get(), foodblockcompatregistry.PEACH_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PEACH_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("peach_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.PEACH_SOUL_TORCH.get(), foodblockcompatregistry.PEACH_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> COCONUT_TORCH_ITEM = FOODBLOCKITEM.register("coconut_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.COCONUT_TORCH.get(), foodblockcompatregistry.COCONUT_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> COCONUT_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("coconut_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.COCONUT_REDSTONE_TORCH.get(), foodblockcompatregistry.COCONUT_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> COCONUT_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("coconut_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.COCONUT_SOUL_TORCH.get(), foodblockcompatregistry.COCONUT_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ORANGE_TORCH_ITEM = FOODBLOCKITEM.register("orange_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ORANGE_TORCH.get(), foodblockcompatregistry.ORANGE_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ORANGE_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("orange_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ORANGE_REDSTONE_TORCH.get(), foodblockcompatregistry.ORANGE_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ORANGE_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("orange_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ORANGE_SOUL_TORCH.get(), foodblockcompatregistry.ORANGE_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> TANGERINE_TORCH_ITEM = FOODBLOCKITEM.register("tangerine_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.TANGERINE_TORCH.get(), foodblockcompatregistry.TANGERINE_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> TANGERINE_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("tangerine_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.TANGERINE_REDSTONE_TORCH.get(), foodblockcompatregistry.TANGERINE_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> TANGERINE_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("tangerine_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.TANGERINE_SOUL_TORCH.get(), foodblockcompatregistry.TANGERINE_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> KUMQUAT_TORCH_ITEM = FOODBLOCKITEM.register("kumquat_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.KUMQUAT_TORCH.get(), foodblockcompatregistry.KUMQUAT_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> KUMQUAT_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("kumquat_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.KUMQUAT_REDSTONE_TORCH.get(), foodblockcompatregistry.KUMQUAT_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> KUMQUAT_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("kumquat_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.KUMQUAT_SOUL_TORCH.get(), foodblockcompatregistry.KUMQUAT_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PERSIMMON_TORCH_ITEM = FOODBLOCKITEM.register("persimmon_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.PERSIMMON_TORCH.get(), foodblockcompatregistry.PERSIMMON_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PERSIMMON_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("persimmon_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.PERSIMMON_REDSTONE_TORCH.get(), foodblockcompatregistry.PERSIMMON_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PERSIMMON_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("persimmon_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.PERSIMMON_SOUL_TORCH.get(), foodblockcompatregistry.PERSIMMON_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SATSUMA_TORCH_ITEM = FOODBLOCKITEM.register("satsuma_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.SATSUMA_TORCH.get(), foodblockcompatregistry.SATSUMA_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SATSUMA_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("satsuma_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.SATSUMA_REDSTONE_TORCH.get(), foodblockcompatregistry.SATSUMA_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> SATSUMA_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("satsuma_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.SATSUMA_SOUL_TORCH.get(), foodblockcompatregistry.SATSUMA_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> MANDARIN_TORCH_ITEM = FOODBLOCKITEM.register("mandarin_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.MANDARIN_TORCH.get(), foodblockcompatregistry.MANDARIN_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> MANDARIN_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("mandarin_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.MANDARIN_REDSTONE_TORCH.get(), foodblockcompatregistry.MANDARIN_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> MANDARIN_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("mandarin_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.MANDARIN_SOUL_TORCH.get(), foodblockcompatregistry.MANDARIN_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> LEMON_TORCH_ITEM = FOODBLOCKITEM.register("lemon_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.LEMON_TORCH.get(), foodblockcompatregistry.LEMON_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> LEMON_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("lemon_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.LEMON_REDSTONE_TORCH.get(), foodblockcompatregistry.LEMON_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> LEMON_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("lemon_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.LEMON_SOUL_TORCH.get(), foodblockcompatregistry.LEMON_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CITRON_TORCH_ITEM = FOODBLOCKITEM.register("citron_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.CITRON_TORCH.get(), foodblockcompatregistry.CITRON_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CITRON_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("citron_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.CITRON_REDSTONE_TORCH.get(), foodblockcompatregistry.CITRON_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CITRON_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("citron_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.CITRON_SOUL_TORCH.get(), foodblockcompatregistry.CITRON_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BUDDHASHAND_TORCH_ITEM = FOODBLOCKITEM.register("buddhashand_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BUDDHASHAND_TORCH.get(), foodblockcompatregistry.BUDDHASHAND_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BUDDHASHAND_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("buddhashand_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BUDDHASHAND_REDSTONE_TORCH.get(), foodblockcompatregistry.BUDDHASHAND_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> BUDDHASHAND_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("buddhashand_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.BUDDHASHAND_SOUL_TORCH.get(), foodblockcompatregistry.BUDDHASHAND_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> LIME_TORCH_ITEM = FOODBLOCKITEM.register("lime_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.LIME_TORCH.get(), foodblockcompatregistry.LIME_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> LIME_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("lime_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.LIME_REDSTONE_TORCH.get(), foodblockcompatregistry.LIME_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> LIME_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("lime_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.LIME_SOUL_TORCH.get(), foodblockcompatregistry.LIME_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> KEYLIME_TORCH_ITEM = FOODBLOCKITEM.register("keylime_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.KEYLIME_TORCH.get(), foodblockcompatregistry.KEYLIME_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> KEYLIME_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("keylime_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.KEYLIME_REDSTONE_TORCH.get(), foodblockcompatregistry.KEYLIME_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> KEYLIME_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("keylime_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.KEYLIME_SOUL_TORCH.get(), foodblockcompatregistry.KEYLIME_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> FINGERLIME_TORCH_ITEM = FOODBLOCKITEM.register("fingerlime_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.FINGERLIME_TORCH.get(), foodblockcompatregistry.FINGERLIME_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> FINGERLIME_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("fingerlime_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.FINGERLIME_REDSTONE_TORCH.get(), foodblockcompatregistry.FINGERLIME_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> FINGERLIME_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("fingerlime_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.FINGERLIME_SOUL_TORCH.get(), foodblockcompatregistry.FINGERLIME_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> GRAPEFRUIT_TORCH_ITEM = FOODBLOCKITEM.register("grapefruit_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.GRAPEFRUIT_TORCH.get(), foodblockcompatregistry.GRAPEFRUIT_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> GRAPEFRUIT_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("grapefruit_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.GRAPEFRUIT_REDSTONE_TORCH.get(), foodblockcompatregistry.GRAPEFRUIT_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> GRAPEFRUIT_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("grapefruit_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.GRAPEFRUIT_SOUL_TORCH.get(), foodblockcompatregistry.GRAPEFRUIT_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> POMELO_TORCH_ITEM = FOODBLOCKITEM.register("pomelo_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.POMELO_TORCH.get(), foodblockcompatregistry.POMELO_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> POMELO_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("pomelo_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.POMELO_REDSTONE_TORCH.get(), foodblockcompatregistry.POMELO_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> POMELO_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("pomelo_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.POMELO_SOUL_TORCH.get(), foodblockcompatregistry.POMELO_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CORN_TORCH_ITEM = FOODBLOCKITEM.register("corn_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.CORN_TORCH.get(), foodblockcompatregistry.CORN_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CORN_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("corn_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.CORN_REDSTONE_TORCH.get(), foodblockcompatregistry.CORN_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CORN_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("corn_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.CORN_SOUL_TORCH.get(), foodblockcompatregistry.CORN_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ONION_TORCH_ITEM = FOODBLOCKITEM.register("onion_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ONION_TORCH.get(), foodblockcompatregistry.ONION_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ONION_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("onion_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ONION_REDSTONE_TORCH.get(), foodblockcompatregistry.ONION_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ONION_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("onion_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ONION_SOUL_TORCH.get(), foodblockcompatregistry.ONION_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> TOMATO_TORCH_ITEM = FOODBLOCKITEM.register("tomato_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.TOMATO_TORCH.get(), foodblockcompatregistry.TOMATO_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> TOMATO_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("tomato_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.TOMATO_REDSTONE_TORCH.get(), foodblockcompatregistry.TOMATO_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> TOMATO_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("tomato_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.TOMATO_SOUL_TORCH.get(), foodblockcompatregistry.TOMATO_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PECAN_TORCH_ITEM = FOODBLOCKITEM.register("pecan_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.PECAN_TORCH.get(), foodblockcompatregistry.PECAN_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PECAN_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("pecan_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.PECAN_REDSTONE_TORCH.get(), foodblockcompatregistry.PECAN_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> PECAN_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("pecan_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.PECAN_SOUL_TORCH.get(), foodblockcompatregistry.PECAN_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ALMOND_TORCH_ITEM = FOODBLOCKITEM.register("almond_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ALMOND_TORCH.get(), foodblockcompatregistry.ALMOND_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ALMOND_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("almond_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ALMOND_REDSTONE_TORCH.get(), foodblockcompatregistry.ALMOND_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ALMOND_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("almond_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.ALMOND_SOUL_TORCH.get(), foodblockcompatregistry.ALMOND_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
//==============================================================================================================================================================================================
//                                                                                        Furnaces
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_FURNACE_ITEM = FOODBLOCKITEM.register("elderberry_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_FURNACE.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_FURNACE_ITEM = FOODBLOCKITEM.register("juniper_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_FURNACE.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_FURNACE_ITEM = FOODBLOCKITEM.register("banana_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.BANANA_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_FURNACE_ITEM = FOODBLOCKITEM.register("starfruit_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.STARFRUIT_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_FURNACE_ITEM = FOODBLOCKITEM.register("kiwifruit_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_FURNACE_ITEM = FOODBLOCKITEM.register("gooseberry_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_FURNACE_ITEM = FOODBLOCKITEM.register("blackberry_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_FURNACE_ITEM = FOODBLOCKITEM.register("raspberry_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.RASPBERRY_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_FURNACE_ITEM = FOODBLOCKITEM.register("strawberry_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_FURNACE_ITEM = FOODBLOCKITEM.register("sugarapple_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_FURNACE_ITEM = FOODBLOCKITEM.register("cherry_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.CHERRY_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_FURNACE_ITEM = FOODBLOCKITEM.register("blackcherry_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_FURNACE_ITEM = FOODBLOCKITEM.register("peach_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.PEACH_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_FURNACE_ITEM = FOODBLOCKITEM.register("coconut_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.COCONUT_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_FURNACE_ITEM = FOODBLOCKITEM.register("orange_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.ORANGE_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_FURNACE_ITEM = FOODBLOCKITEM.register("tangerine_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.TANGERINE_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_FURNACE_ITEM = FOODBLOCKITEM.register("kumquat_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.KUMQUAT_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_FURNACE_ITEM = FOODBLOCKITEM.register("persimmon_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.PERSIMMON_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_FURNACE_ITEM = FOODBLOCKITEM.register("satsuma_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.SATSUMA_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_FURNACE_ITEM = FOODBLOCKITEM.register("mandarin_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.MANDARIN_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_FURNACE_ITEM = FOODBLOCKITEM.register("lemon_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.LEMON_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_FURNACE_ITEM = FOODBLOCKITEM.register("citron_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.CITRON_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_FURNACE_ITEM = FOODBLOCKITEM.register("buddhashand_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_FURNACE_ITEM = FOODBLOCKITEM.register("lime_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.LIME_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_FURNACE_ITEM = FOODBLOCKITEM.register("keylime_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.KEYLIME_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_FURNACE_ITEM = FOODBLOCKITEM.register("fingerlime_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.FINGERLIME_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_FURNACE_ITEM = FOODBLOCKITEM.register("grapefruit_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_FURNACE_ITEM = FOODBLOCKITEM.register("pomelo_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.POMELO_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_FURNACE_ITEM = FOODBLOCKITEM.register("corn_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.CORN_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_FURNACE_ITEM = FOODBLOCKITEM.register("onion_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.ONION_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_FURNACE_ITEM = FOODBLOCKITEM.register("tomato_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.TOMATO_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_FURNACE_ITEM = FOODBLOCKITEM.register("pecan_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.PECAN_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_FURNACE_ITEM = FOODBLOCKITEM.register("almond_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.ALMOND_FURNACE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Paths
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("elderberry_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_STONE_PATH_ITEM = FOODBLOCKITEM.register("juniper_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_STONE_PATH.get(), new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_STONE_PATH_ITEM = FOODBLOCKITEM.register("banana_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.BANANA_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_STONE_PATH_ITEM = FOODBLOCKITEM.register("starfruit_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.STARFRUIT_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_STONE_PATH_ITEM = FOODBLOCKITEM.register("kiwifruit_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("gooseberry_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("blackberry_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("raspberry_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.RASPBERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("strawberry_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_STONE_PATH_ITEM = FOODBLOCKITEM.register("sugarapple_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("cherry_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.CHERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("blackcherry_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_STONE_PATH_ITEM = FOODBLOCKITEM.register("peach_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.PEACH_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_STONE_PATH_ITEM = FOODBLOCKITEM.register("coconut_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.COCONUT_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_STONE_PATH_ITEM = FOODBLOCKITEM.register("orange_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.ORANGE_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_STONE_PATH_ITEM = FOODBLOCKITEM.register("tangerine_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.TANGERINE_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_STONE_PATH_ITEM = FOODBLOCKITEM.register("kumquat_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.KUMQUAT_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_STONE_PATH_ITEM = FOODBLOCKITEM.register("persimmon_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.PERSIMMON_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_STONE_PATH_ITEM = FOODBLOCKITEM.register("satsuma_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.SATSUMA_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_STONE_PATH_ITEM = FOODBLOCKITEM.register("mandarin_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.MANDARIN_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_STONE_PATH_ITEM = FOODBLOCKITEM.register("lemon_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.LEMON_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_STONE_PATH_ITEM = FOODBLOCKITEM.register("citron_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.CITRON_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_STONE_PATH_ITEM = FOODBLOCKITEM.register("buddhashand_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_STONE_PATH_ITEM = FOODBLOCKITEM.register("lime_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.LIME_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_STONE_PATH_ITEM = FOODBLOCKITEM.register("keylime_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.KEYLIME_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_STONE_PATH_ITEM = FOODBLOCKITEM.register("fingerlime_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.FINGERLIME_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_STONE_PATH_ITEM = FOODBLOCKITEM.register("grapefruit_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_STONE_PATH_ITEM = FOODBLOCKITEM.register("pomelo_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.POMELO_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_STONE_PATH_ITEM = FOODBLOCKITEM.register("corn_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.CORN_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_STONE_PATH_ITEM = FOODBLOCKITEM.register("onion_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.ONION_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_STONE_PATH_ITEM = FOODBLOCKITEM.register("tomato_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.TOMATO_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_STONE_PATH_ITEM = FOODBLOCKITEM.register("pecan_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.PECAN_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_STONE_PATH_ITEM = FOODBLOCKITEM.register("almond_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.ALMOND_STONE_PATH.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Barrels
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BARREL_ITEM = FOODBLOCKITEM.register("elderberry_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BARREL.get(),
    new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_BARREL_ITEM = FOODBLOCKITEM.register("juniper_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_BARREL.get(),
    new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_BARREL_ITEM = FOODBLOCKITEM.register("banana_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.BANANA_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_BARREL_ITEM = FOODBLOCKITEM.register("starfruit_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.STARFRUIT_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_BARREL_ITEM = FOODBLOCKITEM.register("kiwifruit_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_BARREL_ITEM = FOODBLOCKITEM.register("gooseberry_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_BARREL_ITEM = FOODBLOCKITEM.register("blackberry_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_BARREL.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_BARREL_ITEM = FOODBLOCKITEM.register("raspberry_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.RASPBERRY_BARREL.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_BARREL_ITEM = FOODBLOCKITEM.register("strawberry_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_BARREL.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_BARREL_ITEM = FOODBLOCKITEM.register("sugarapple_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_BARREL.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_BARREL_ITEM = FOODBLOCKITEM.register("cherry_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.CHERRY_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_BARREL_ITEM = FOODBLOCKITEM.register("blackcherry_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_BARREL_ITEM = FOODBLOCKITEM.register("peach_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.PEACH_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_BARREL_ITEM = FOODBLOCKITEM.register("coconut_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.COCONUT_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_BARREL_ITEM = FOODBLOCKITEM.register("orange_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.ORANGE_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_BARREL_ITEM = FOODBLOCKITEM.register("tangerine_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.TANGERINE_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_BARREL_ITEM = FOODBLOCKITEM.register("kumquat_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.KUMQUAT_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_BARREL_ITEM = FOODBLOCKITEM.register("persimmon_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.PERSIMMON_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_BARREL_ITEM = FOODBLOCKITEM.register("satsuma_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.SATSUMA_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_BARREL_ITEM = FOODBLOCKITEM.register("mandarin_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.MANDARIN_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_BARREL_ITEM = FOODBLOCKITEM.register("lemon_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.LEMON_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_BARREL_ITEM = FOODBLOCKITEM.register("citron_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.CITRON_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_BARREL_ITEM = FOODBLOCKITEM.register("buddhashand_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_BARREL_ITEM = FOODBLOCKITEM.register("lime_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.LIME_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_BARREL_ITEM = FOODBLOCKITEM.register("keylime_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.KEYLIME_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_BARREL_ITEM = FOODBLOCKITEM.register("fingerlime_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.FINGERLIME_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_BARREL_ITEM = FOODBLOCKITEM.register("grapefruit_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_BARREL_ITEM = FOODBLOCKITEM.register("pomelo_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.POMELO_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_BARREL_ITEM = FOODBLOCKITEM.register("corn_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.CORN_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_BARREL_ITEM = FOODBLOCKITEM.register("onion_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.ONION_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_BARREL_ITEM = FOODBLOCKITEM.register("tomato_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.TOMATO_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_BARREL_ITEM = FOODBLOCKITEM.register("pecan_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.PECAN_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_BARREL_ITEM = FOODBLOCKITEM.register("almond_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.ALMOND_BARREL.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Chairs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHAIR_ITEM = FOODBLOCKITEM.register("elderberry_chair_item", () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_CHAIR_ITEM = FOODBLOCKITEM.register("juniper_chair_item", () -> new BlockItem(foodblockcompatregistry.JUNIPER_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_CHAIR_ITEM = FOODBLOCKITEM.register("banana_chair_item", () -> new BlockItem(foodblockcompatregistry.BANANA_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_CHAIR_ITEM = FOODBLOCKITEM.register("starfruit_chair_item", () -> new BlockItem(foodblockcompatregistry.STARFRUIT_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_CHAIR_ITEM = FOODBLOCKITEM.register("kiwifruit_chair_item", () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_CHAIR_ITEM = FOODBLOCKITEM.register("gooseberry_chair_item", () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_CHAIR_ITEM = FOODBLOCKITEM.register("blackberry_chair_item", () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_CHAIR_ITEM = FOODBLOCKITEM.register("raspberry_chair_item", () -> new BlockItem(foodblockcompatregistry.RASPBERRY_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_CHAIR_ITEM = FOODBLOCKITEM.register("strawberry_chair_item", () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_CHAIR_ITEM = FOODBLOCKITEM.register("sugarapple_chair_item", () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CHAIR_ITEM = FOODBLOCKITEM.register("cherry_chair_item", () -> new BlockItem(foodblockcompatregistry.CHERRY_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_CHAIR_ITEM = FOODBLOCKITEM.register("blackcherry_chair_item", () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_CHAIR_ITEM = FOODBLOCKITEM.register("peach_chair_item", () -> new BlockItem(foodblockcompatregistry.PEACH_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_CHAIR_ITEM = FOODBLOCKITEM.register("coconut_chair_item", () -> new BlockItem(foodblockcompatregistry.COCONUT_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_CHAIR_ITEM = FOODBLOCKITEM.register("orange_chair_item", () -> new BlockItem(foodblockcompatregistry.ORANGE_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_CHAIR_ITEM = FOODBLOCKITEM.register("tangerine_chair_item", () -> new BlockItem(foodblockcompatregistry.TANGERINE_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_CHAIR_ITEM = FOODBLOCKITEM.register("kumquat_chair_item", () -> new BlockItem(foodblockcompatregistry.KUMQUAT_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_CHAIR_ITEM = FOODBLOCKITEM.register("persimmon_chair_item", () -> new BlockItem(foodblockcompatregistry.PERSIMMON_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_CHAIR_ITEM = FOODBLOCKITEM.register("satsuma_chair_item", () -> new BlockItem(foodblockcompatregistry.SATSUMA_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_CHAIR_ITEM = FOODBLOCKITEM.register("mandarin_chair_item", () -> new BlockItem(foodblockcompatregistry.MANDARIN_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_CHAIR_ITEM = FOODBLOCKITEM.register("lemon_chair_item", () -> new BlockItem(foodblockcompatregistry.LEMON_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_CHAIR_ITEM = FOODBLOCKITEM.register("citron_chair_item", () -> new BlockItem(foodblockcompatregistry.CITRON_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_CHAIR_ITEM = FOODBLOCKITEM.register("buddhashand_chair_item", () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_CHAIR_ITEM = FOODBLOCKITEM.register("lime_chair_item", () -> new BlockItem(foodblockcompatregistry.LIME_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_CHAIR_ITEM = FOODBLOCKITEM.register("keylime_chair_item", () -> new BlockItem(foodblockcompatregistry.KEYLIME_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_CHAIR_ITEM = FOODBLOCKITEM.register("fingerlime_chair_item", () -> new BlockItem(foodblockcompatregistry.FINGERLIME_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_CHAIR_ITEM = FOODBLOCKITEM.register("grapefruit_chair_item", () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_CHAIR_ITEM = FOODBLOCKITEM.register("pomelo_chair_item", () -> new BlockItem(foodblockcompatregistry.POMELO_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_CHAIR_ITEM = FOODBLOCKITEM.register("corn_chair_item", () -> new BlockItem(foodblockcompatregistry.CORN_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_CHAIR_ITEM = FOODBLOCKITEM.register("onion_chair_item", () -> new BlockItem(foodblockcompatregistry.ONION_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_CHAIR_ITEM = FOODBLOCKITEM.register("tomato_chair_item", () -> new BlockItem(foodblockcompatregistry.TOMATO_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_CHAIR_ITEM = FOODBLOCKITEM.register("pecan_chair_item", () -> new BlockItem(foodblockcompatregistry.PECAN_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_CHAIR_ITEM = FOODBLOCKITEM.register("almond_chair_item", () -> new BlockItem(foodblockcompatregistry.ALMOND_CHAIR.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Beds
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BED_ITEM = FOODBLOCKITEM.register("elderberry_bed_item", () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_BED_ITEM = FOODBLOCKITEM.register("juniper_bed_item", () -> new BlockItem(foodblockcompatregistry.JUNIPER_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_BED_ITEM = FOODBLOCKITEM.register("banana_bed_item", () -> new BlockItem(foodblockcompatregistry.BANANA_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_BED_ITEM = FOODBLOCKITEM.register("starfruit_bed_item", () -> new BlockItem(foodblockcompatregistry.STARFRUIT_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_BED_ITEM = FOODBLOCKITEM.register("kiwifruit_bed_item", () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_BED_ITEM = FOODBLOCKITEM.register("gooseberry_bed_item", () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_BED_ITEM = FOODBLOCKITEM.register("blackberry_bed_item", () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_BED_ITEM = FOODBLOCKITEM.register("raspberry_bed_item", () -> new BlockItem(foodblockcompatregistry.RASPBERRY_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_BED_ITEM = FOODBLOCKITEM.register("strawberry_bed_item", () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_BED_ITEM = FOODBLOCKITEM.register("sugarapple_bed_item", () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_BED_ITEM = FOODBLOCKITEM.register("cherry_bed_item", () -> new BlockItem(foodblockcompatregistry.CHERRY_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_BED_ITEM = FOODBLOCKITEM.register("blackcherry_bed_item", () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_BED_ITEM = FOODBLOCKITEM.register("peach_bed_item", () -> new BlockItem(foodblockcompatregistry.PEACH_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_BED_ITEM = FOODBLOCKITEM.register("coconut_bed_item", () -> new BlockItem(foodblockcompatregistry.COCONUT_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_BED_ITEM = FOODBLOCKITEM.register("orange_bed_item", () -> new BlockItem(foodblockcompatregistry.ORANGE_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_BED_ITEM = FOODBLOCKITEM.register("tangerine_bed_item", () -> new BlockItem(foodblockcompatregistry.TANGERINE_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_BED_ITEM = FOODBLOCKITEM.register("kumquat_bed_item", () -> new BlockItem(foodblockcompatregistry.KUMQUAT_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PERSIMMON_BED_ITEM = FOODBLOCKITEM.register("persimmon_bed_item", () -> new BlockItem(foodblockcompatregistry.PERSIMMON_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SATSUMA_BED_ITEM = FOODBLOCKITEM.register("satsuma_bed_item", () -> new BlockItem(foodblockcompatregistry.SATSUMA_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> MANDARIN_BED_ITEM = FOODBLOCKITEM.register("mandarin_bed_item", () -> new BlockItem(foodblockcompatregistry.MANDARIN_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_BED_ITEM = FOODBLOCKITEM.register("lemon_bed_item", () -> new BlockItem(foodblockcompatregistry.LEMON_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CITRON_BED_ITEM = FOODBLOCKITEM.register("citron_bed_item", () -> new BlockItem(foodblockcompatregistry.CITRON_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BUDDHASHAND_BED_ITEM = FOODBLOCKITEM.register("buddhashand_bed_item", () -> new BlockItem(foodblockcompatregistry.BUDDHASHAND_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LIME_BED_ITEM = FOODBLOCKITEM.register("lime_bed_item", () -> new BlockItem(foodblockcompatregistry.LIME_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KEYLIME_BED_ITEM = FOODBLOCKITEM.register("keylime_bed_item", () -> new BlockItem(foodblockcompatregistry.KEYLIME_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> FINGERLIME_BED_ITEM = FOODBLOCKITEM.register("fingerlime_bed_item", () -> new BlockItem(foodblockcompatregistry.FINGERLIME_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GRAPEFRUIT_BED_ITEM = FOODBLOCKITEM.register("grapefruit_bed_item", () -> new BlockItem(foodblockcompatregistry.GRAPEFRUIT_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> POMELO_BED_ITEM = FOODBLOCKITEM.register("pomelo_bed_item", () -> new BlockItem(foodblockcompatregistry.POMELO_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_BED_ITEM = FOODBLOCKITEM.register("corn_bed_item", () -> new BlockItem(foodblockcompatregistry.CORN_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_BED_ITEM = FOODBLOCKITEM.register("onion_bed_item", () -> new BlockItem(foodblockcompatregistry.ONION_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TOMATO_BED_ITEM = FOODBLOCKITEM.register("tomato_bed_item", () -> new BlockItem(foodblockcompatregistry.TOMATO_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_BED_ITEM = FOODBLOCKITEM.register("pecan_bed_item", () -> new BlockItem(foodblockcompatregistry.PECAN_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ALMOND_BED_ITEM = FOODBLOCKITEM.register("almond_bed_item", () -> new BlockItem(foodblockcompatregistry.ALMOND_BED.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Cabinets
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_ELDERBERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_elderberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_ELDERBERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_ELDERBERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_elderberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_ELDERBERRY_CABINET.get(),
      new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_JUNIPER_CABINET_ITEM = FOODBLOCKITEM.register("small_juniper_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_JUNIPER_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_JUNIPER_CABINET_ITEM = FOODBLOCKITEM.register("medium_juniper_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_JUNIPER_CABINET.get(),
      new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Banana------------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_BANANA_CABINET_ITEM = FOODBLOCKITEM.register("small_banana_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_BANANA_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_BANANA_CABINET_ITEM = FOODBLOCKITEM.register("medium_banana_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_BANANA_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_STARFRUIT_CABINET_ITEM = FOODBLOCKITEM.register("small_starfruit_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_STARFRUIT_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_STARFRUIT_CABINET_ITEM = FOODBLOCKITEM.register("medium_starfruit_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_STARFRUIT_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_KIWIFRUIT_CABINET_ITEM = FOODBLOCKITEM.register("small_kiwifruit_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_KIWIFRUIT_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_KIWIFRUIT_CABINET_ITEM = FOODBLOCKITEM.register("medium_kiwifruit_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_KIWIFRUIT_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_GOOSEBERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_gooseberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_GOOSEBERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_GOOSEBERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_gooseberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_GOOSEBERRY_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_BLACKBERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_blackberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_BLACKBERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_BLACKBERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_blackberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_BLACKBERRY_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_RASPBERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_raspberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_RASPBERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_RASPBERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_raspberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_RASPBERRY_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_STRAWBERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_strawberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_STRAWBERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_STRAWBERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_strawberry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_STRAWBERRY_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_SUGARAPPLE_CABINET_ITEM = FOODBLOCKITEM.register("small_sugarapple_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_SUGARAPPLE_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_SUGARAPPLE_CABINET_ITEM = FOODBLOCKITEM.register("medium_sugarapple_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_SUGARAPPLE_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_CHERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_cherry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_CHERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_CHERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_cherry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_CHERRY_CABINET.get(),
      new BlockItem.Properties()));
 //-------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_BLACKCHERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_blackcherry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_BLACKCHERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_BLACKCHERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_blackcherry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_BLACKCHERRY_CABINET.get(),
      new BlockItem.Properties()));
 //-------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_PEACH_CABINET_ITEM = FOODBLOCKITEM.register("small_peach_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_PEACH_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_PEACH_CABINET_ITEM = FOODBLOCKITEM.register("medium_peach_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_PEACH_CABINET.get(),
      new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_COCONUT_CABINET_ITEM = FOODBLOCKITEM.register("small_coconut_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_COCONUT_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_COCONUT_CABINET_ITEM = FOODBLOCKITEM.register("medium_coconut_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_COCONUT_CABINET.get(),
      new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Orange------------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_ORANGE_CABINET_ITEM = FOODBLOCKITEM.register("small_orange_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_ORANGE_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_ORANGE_CABINET_ITEM = FOODBLOCKITEM.register("medium_orange_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_ORANGE_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_TANGERINE_CABINET_ITEM = FOODBLOCKITEM.register("small_tangerine_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_TANGERINE_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_TANGERINE_CABINET_ITEM = FOODBLOCKITEM.register("medium_tangerine_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_TANGERINE_CABINET.get(),
      new BlockItem.Properties()));
 //---------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_KUMQUAT_CABINET_ITEM = FOODBLOCKITEM.register("small_kumquat_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_KUMQUAT_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_KUMQUAT_CABINET_ITEM = FOODBLOCKITEM.register("medium_kumquat_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_KUMQUAT_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_PERSIMMON_CABINET_ITEM = FOODBLOCKITEM.register("small_persimmon_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_PERSIMMON_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_PERSIMMON_CABINET_ITEM = FOODBLOCKITEM.register("medium_persimmon_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_PERSIMMON_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_SATSUMA_CABINET_ITEM = FOODBLOCKITEM.register("small_satsuma_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_SATSUMA_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_SATSUMA_CABINET_ITEM = FOODBLOCKITEM.register("medium_satsuma_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_SATSUMA_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_MANDARIN_CABINET_ITEM = FOODBLOCKITEM.register("small_mandarin_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_MANDARIN_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_MANDARIN_CABINET_ITEM = FOODBLOCKITEM.register("medium_mandarin_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_MANDARIN_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_LEMON_CABINET_ITEM = FOODBLOCKITEM.register("small_lemon_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_LEMON_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_LEMON_CABINET_ITEM = FOODBLOCKITEM.register("medium_lemon_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_LEMON_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Citron-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_CITRON_CABINET_ITEM = FOODBLOCKITEM.register("small_citron_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_CITRON_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_CITRON_CABINET_ITEM = FOODBLOCKITEM.register("medium_citron_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_CITRON_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Buddhashand-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_BUDDHASHAND_CABINET_ITEM = FOODBLOCKITEM.register("small_buddhashand_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_BUDDHASHAND_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_BUDDHASHAND_CABINET_ITEM = FOODBLOCKITEM.register("medium_buddhashand_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_BUDDHASHAND_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Lime-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_LIME_CABINET_ITEM = FOODBLOCKITEM.register("small_lime_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_LIME_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_LIME_CABINET_ITEM = FOODBLOCKITEM.register("medium_lime_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_LIME_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Keylime-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_KEYLIME_CABINET_ITEM = FOODBLOCKITEM.register("small_keylime_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_KEYLIME_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_KEYLIME_CABINET_ITEM = FOODBLOCKITEM.register("medium_keylime_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_KEYLIME_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Fingerlime-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_FINGERLIME_CABINET_ITEM = FOODBLOCKITEM.register("small_fingerlime_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_FINGERLIME_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_FINGERLIME_CABINET_ITEM = FOODBLOCKITEM.register("medium_fingerlime_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_FINGERLIME_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Grapefruit-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_GRAPEFRUIT_CABINET_ITEM = FOODBLOCKITEM.register("small_grapefruit_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_GRAPEFRUIT_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_GRAPEFRUIT_CABINET_ITEM = FOODBLOCKITEM.register("medium_grapefruit_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_GRAPEFRUIT_CABINET.get(),
      new BlockItem.Properties()));
 //----------------------------------------------------------------------------------------Pomelo-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_POMELO_CABINET_ITEM = FOODBLOCKITEM.register("small_pomelo_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_POMELO_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_POMELO_CABINET_ITEM = FOODBLOCKITEM.register("medium_pomelo_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_POMELO_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_CORN_CABINET_ITEM = FOODBLOCKITEM.register("small_corn_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_CORN_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_CORN_CABINET_ITEM = FOODBLOCKITEM.register("medium_corn_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_CORN_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_ONION_CABINET_ITEM = FOODBLOCKITEM.register("small_onion_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_ONION_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_ONION_CABINET_ITEM = FOODBLOCKITEM.register("medium_onion_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_ONION_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_TOMATO_CABINET_ITEM = FOODBLOCKITEM.register("small_tomato_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_TOMATO_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_TOMATO_CABINET_ITEM = FOODBLOCKITEM.register("medium_tomato_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_TOMATO_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_PECAN_CABINET_ITEM = FOODBLOCKITEM.register("small_pecan_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_PECAN_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_PECAN_CABINET_ITEM = FOODBLOCKITEM.register("medium_pecan_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_PECAN_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_ALMOND_CABINET_ITEM = FOODBLOCKITEM.register("small_almond_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_ALMOND_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_ALMOND_CABINET_ITEM = FOODBLOCKITEM.register("medium_almond_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_ALMOND_CABINET.get(),
      new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Desks
//==============================================================================================================================================================================================

 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_DESK_ITEM = FOODBLOCKITEM.register("elderberry_desk_item", () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_DESK_ITEM = FOODBLOCKITEM.register("juniper_desk_item", () -> new BlockItem(foodblockcompatregistry.JUNIPER_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BANANA_DESK_ITEM = FOODBLOCKITEM.register("banana_desk_item", () -> new BlockItem(foodblockcompatregistry.BANANA_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STARFRUIT_DESK_ITEM = FOODBLOCKITEM.register("starfruit_desk_item", () -> new BlockItem(foodblockcompatregistry.STARFRUIT_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KIWIFRUIT_DESK_ITEM = FOODBLOCKITEM.register("kiwifruit_desk_item", () -> new BlockItem(foodblockcompatregistry.KIWIFRUIT_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> GOOSEBERRY_DESK_ITEM = FOODBLOCKITEM.register("gooseberry_desk_item", () -> new BlockItem(foodblockcompatregistry.GOOSEBERRY_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKBERRY_DESK_ITEM = FOODBLOCKITEM.register("blackberry_desk_item", () -> new BlockItem(foodblockcompatregistry.BLACKBERRY_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> RASPBERRY_DESK_ITEM = FOODBLOCKITEM.register("raspberry_desk_item", () -> new BlockItem(foodblockcompatregistry.RASPBERRY_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> STRAWBERRY_DESK_ITEM = FOODBLOCKITEM.register("strawberry_desk_item", () -> new BlockItem(foodblockcompatregistry.STRAWBERRY_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> SUGARAPPLE_DESK_ITEM = FOODBLOCKITEM.register("sugarapple_desk_item", () -> new BlockItem(foodblockcompatregistry.SUGARAPPLE_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_DESK_ITEM = FOODBLOCKITEM.register("cherry_desk_item", () -> new BlockItem(foodblockcompatregistry.CHERRY_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> BLACKCHERRY_DESK_ITEM = FOODBLOCKITEM.register("blackcherry_desk_item", () -> new BlockItem(foodblockcompatregistry.BLACKCHERRY_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PEACH_DESK_ITEM = FOODBLOCKITEM.register("peach_desk_item", () -> new BlockItem(foodblockcompatregistry.PEACH_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_DESK_ITEM = FOODBLOCKITEM.register("coconut_desk_item", () -> new BlockItem(foodblockcompatregistry.COCONUT_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_DESK_ITEM = FOODBLOCKITEM.register("orange_desk_item", () -> new BlockItem(foodblockcompatregistry.ORANGE_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> TANGERINE_DESK_ITEM = FOODBLOCKITEM.register("tangerine_desk_item", () -> new BlockItem(foodblockcompatregistry.TANGERINE_DESK.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> KUMQUAT_DESK_ITEM = FOODBLOCKITEM.register("kumquat_desk_item", () -> new BlockItem(foodblockcompatregistry.KUMQUAT_DESK.get(),
    new BlockItem.Properties()));
}
