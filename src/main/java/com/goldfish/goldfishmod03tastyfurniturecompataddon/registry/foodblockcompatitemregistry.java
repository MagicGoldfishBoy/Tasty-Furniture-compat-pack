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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
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
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> JUNIPER_SLAB_ITEM = FOODBLOCKITEM.register("juniper_slab_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("juniper_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CHERRY_SLAB_ITEM = FOODBLOCKITEM.register("cherry_slab_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("cherry_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> LEMON_SLAB_ITEM = FOODBLOCKITEM.register("lemon_slab_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> LEMON_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("lemon_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> LIME_SLAB_ITEM = FOODBLOCKITEM.register("lime_slab_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> LIME_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("lime_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_BRICKS_SLAB.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> PECAN_SLAB_ITEM = FOODBLOCKITEM.register("pecan_slab_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> PECAN_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("pecan_bricks_slab_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_BRICKS_SLAB.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> JUNIPER_STAIRS_ITEM = FOODBLOCKITEM.register("juniper_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("juniper_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CHERRY_STAIRS_ITEM = FOODBLOCKITEM.register("cherry_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("cherry_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> LEMON_STAIRS_ITEM = FOODBLOCKITEM.register("lemon_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> LEMON_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("lemon_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> LIME_STAIRS_ITEM = FOODBLOCKITEM.register("lime_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> LIME_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("lime_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.LIME_BRICKS_STAIRS.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> PECAN_STAIRS_ITEM = FOODBLOCKITEM.register("pecan_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> PECAN_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("pecan_bricks_stairs_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_BRICKS_STAIRS.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Bars
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BARS_ITEM = FOODBLOCKITEM.register("elderberry_bars_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BARS_ITEM = FOODBLOCKITEM.register("juniper_bars_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_BARS_ITEM = FOODBLOCKITEM.register("cherry_bars_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_BARS_ITEM = FOODBLOCKITEM.register("coconut_bars_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_BARS_ITEM = FOODBLOCKITEM.register("orange_bars_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_BARS_ITEM = FOODBLOCKITEM.register("lemon_bars_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_BARS_ITEM = FOODBLOCKITEM.register("corn_bars_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_BARS_ITEM = FOODBLOCKITEM.register("onion_bars_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_BARS_ITEM = FOODBLOCKITEM.register("pecan_bars_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_BARS.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_DOOR_ITEM = FOODBLOCKITEM.register("elderberry_door_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_DOOR_ITEM = FOODBLOCKITEM.register("juniper_door_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_DOOR_ITEM = FOODBLOCKITEM.register("cherry_door_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_DOOR_ITEM = FOODBLOCKITEM.register("coconut_door_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_DOOR_ITEM = FOODBLOCKITEM.register("orange_door_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_DOOR_ITEM = FOODBLOCKITEM.register("lemon_door_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_DOOR_ITEM = FOODBLOCKITEM.register("corn_door_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_DOOR_ITEM = FOODBLOCKITEM.register("onion_door_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_DOOR_ITEM = FOODBLOCKITEM.register("pecan_door_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_DOOR.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Buttons
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BUTTON_ITEM = FOODBLOCKITEM.register("elderberry_button_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BUTTON_ITEM = FOODBLOCKITEM.register("juniper_button_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_BUTTON_ITEM = FOODBLOCKITEM.register("cherry_button_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_BUTTON_ITEM = FOODBLOCKITEM.register("coconut_button_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_BUTTON_ITEM = FOODBLOCKITEM.register("orange_button_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_BUTTON_ITEM = FOODBLOCKITEM.register("lemon_button_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_BUTTON_ITEM = FOODBLOCKITEM.register("corn_button_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_BUTTON_ITEM = FOODBLOCKITEM.register("onion_button_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_BUTTON_ITEM = FOODBLOCKITEM.register("pecan_button_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_BUTTON.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Fences
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_FENCE_ITEM = FOODBLOCKITEM.register("elderberry_fence_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_FENCE_ITEM = FOODBLOCKITEM.register("juniper_fence_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_FENCE_ITEM = FOODBLOCKITEM.register("cherry_fence_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_FENCE_ITEM = FOODBLOCKITEM.register("coconut_fence_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_FENCE_ITEM = FOODBLOCKITEM.register("orange_fence_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_FENCE_ITEM = FOODBLOCKITEM.register("lemon_fence_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_FENCE_ITEM = FOODBLOCKITEM.register("corn_fence_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_FENCE_ITEM = FOODBLOCKITEM.register("onion_fence_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_FENCE_ITEM = FOODBLOCKITEM.register("pecan_fence_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_FENCE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Gates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_GATE_ITEM = FOODBLOCKITEM.register("elderberry_gate_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_GATE_ITEM = FOODBLOCKITEM.register("juniper_gate_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_GATE_ITEM = FOODBLOCKITEM.register("cherry_gate_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_GATE_ITEM = FOODBLOCKITEM.register("coconut_gate_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_GATE_ITEM = FOODBLOCKITEM.register("orange_gate_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_GATE_ITEM = FOODBLOCKITEM.register("lemon_gate_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_GATE_ITEM = FOODBLOCKITEM.register("corn_gate_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_GATE_ITEM = FOODBLOCKITEM.register("onion_gate_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_GATE_ITEM = FOODBLOCKITEM.register("pecan_gate_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_GATE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                     Pressure Plates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("elderberry_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("juniper_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.JUNIPER_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("cherry_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.CHERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("coconut_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.COCONUT_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ORANGE_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("orange_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.ORANGE_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> LEMON_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("lemon_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.LEMON_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("corn_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("onion_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> PECAN_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("pecan_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.PECAN_PRESSURE_PLATE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                          Signs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> ELDERBERRY_SIGN_ITEM = FOODBLOCKITEM.register("elderberry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.ELDERBERRY_STANDING_SIGN.get(), foodblockcompatregistry.ELDERBERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> JUNIPER_SIGN_ITEM = FOODBLOCKITEM.register("juniper_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.JUNIPER_STANDING_SIGN.get(), foodblockcompatregistry.JUNIPER_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> CHERRY_SIGN_ITEM = FOODBLOCKITEM.register("cherry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.CHERRY_STANDING_SIGN.get(), foodblockcompatregistry.CHERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> COCONUT_SIGN_ITEM = FOODBLOCKITEM.register("coconut_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.COCONUT_STANDING_SIGN.get(), foodblockcompatregistry.COCONUT_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> ORANGE_SIGN_ITEM = FOODBLOCKITEM.register("orange_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.ORANGE_STANDING_SIGN.get(), foodblockcompatregistry.ORANGE_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> LEMON_SIGN_ITEM = FOODBLOCKITEM.register("lemon_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.LEMON_STANDING_SIGN.get(), foodblockcompatregistry.LEMON_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> CORN_SIGN_ITEM = FOODBLOCKITEM.register("corn_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.CORN_STANDING_SIGN.get(), foodblockcompatregistry.CORN_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> ONION_SIGN_ITEM = FOODBLOCKITEM.register("onion_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.ONION_STANDING_SIGN.get(), foodblockcompatregistry.ONION_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> PECAN_SIGN_ITEM = FOODBLOCKITEM.register("pecan_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.PECAN_STANDING_SIGN.get(), foodblockcompatregistry.PECAN_WALL_SIGN.get()));
//==============================================================================================================================================================================================
//                                                                                       Trap Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("elderberry_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> JUNIPER_TRAPDOOR_ITEM = FOODBLOCKITEM.register("juniper_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.JUNIPER_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> CHERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("cherry_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.CHERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> COCONUT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("coconut_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.COCONUT_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> ORANGE_TRAPDOOR_ITEM = FOODBLOCKITEM.register("orange_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.ORANGE_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> LEMON_TRAPDOOR_ITEM = FOODBLOCKITEM.register("lemon_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.LEMON_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> CORN_TRAPDOOR_ITEM = FOODBLOCKITEM.register("corn_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.CORN_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> ONION_TRAPDOOR_ITEM = FOODBLOCKITEM.register("onion_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.ONION_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> PECAN_TRAPDOOR_ITEM = FOODBLOCKITEM.register("pecan_trapdoor_item",
     () -> new BlockItem(foodblockcompatregistry.PECAN_TRAPDOOR.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Lamps
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LAMP_ITEM = FOODBLOCKITEM.register("elderberry_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_LAMP_ITEM = FOODBLOCKITEM.register("juniper_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_LAMP_ITEM = FOODBLOCKITEM.register("cherry_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_LAMP_ITEM = FOODBLOCKITEM.register("coconut_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_LAMP_ITEM = FOODBLOCKITEM.register("orange_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_LAMP_ITEM = FOODBLOCKITEM.register("lemon_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_LAMP_ITEM = FOODBLOCKITEM.register("corn_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_LAMP_ITEM = FOODBLOCKITEM.register("onion_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_LAMP_ITEM = FOODBLOCKITEM.register("pecan_lamp_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_LAMP.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Carpets
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CARPET_ITEM = FOODBLOCKITEM.register("elderberry_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_CARPET_ITEM = FOODBLOCKITEM.register("juniper_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CARPET_ITEM = FOODBLOCKITEM.register("cherry_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_CARPET_ITEM = FOODBLOCKITEM.register("coconut_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_CARPET_ITEM = FOODBLOCKITEM.register("orange_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_CARPET_ITEM = FOODBLOCKITEM.register("lemon_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_CARPET_ITEM = FOODBLOCKITEM.register("corn_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_CARPET_ITEM = FOODBLOCKITEM.register("onion_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_CARPET_ITEM = FOODBLOCKITEM.register("pecan_carpet_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_CARPET.get(), new BlockItem.Properties())); 
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> JUNIPER_LANTERN_ITEM = FOODBLOCKITEM.register("juniper_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.JUNIPER_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> JUNIPER_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("juniper_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.JUNIPER_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> CHERRY_LANTERN_ITEM = FOODBLOCKITEM.register("cherry_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.CHERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> CHERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("cherry_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.CHERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> LEMON_LANTERN_ITEM = FOODBLOCKITEM.register("lemon_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.LEMON_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> LEMON_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("lemon_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.LEMON_SOUL_LANTERN.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> PECAN_LANTERN_ITEM = FOODBLOCKITEM.register("pecan_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.PECAN_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> PECAN_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("pecan_soul_lantern_item",
      () -> new BlockItem(foodblockcompatregistry.PECAN_SOUL_LANTERN.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Chains
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHAIN_ITEM = FOODBLOCKITEM.register("elderberry_chain_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_CHAIN_ITEM = FOODBLOCKITEM.register("juniper_chain_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CHAIN_ITEM = FOODBLOCKITEM.register("cherry_chain_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_CHAIN_ITEM = FOODBLOCKITEM.register("coconut_chain_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_CHAIN_ITEM = FOODBLOCKITEM.register("orange_chain_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_CHAIN_ITEM = FOODBLOCKITEM.register("lemon_chain_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_CHAIN_ITEM = FOODBLOCKITEM.register("corn_chain_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_CHAIN_ITEM = FOODBLOCKITEM.register("onion_chain_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_CHAIN_ITEM = FOODBLOCKITEM.register("pecan_chain_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_CHAIN.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Ladders
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LADDER_ITEM =  FOODBLOCKITEM.register("elderberry_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_LADDER_ITEM =  FOODBLOCKITEM.register("juniper_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_LADDER_ITEM =  FOODBLOCKITEM.register("cherry_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_LADDER_ITEM =  FOODBLOCKITEM.register("coconut_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_LADDER_ITEM =  FOODBLOCKITEM.register("orange_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_LADDER_ITEM =  FOODBLOCKITEM.register("lemon_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_LADDER_ITEM =  FOODBLOCKITEM.register("corn_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_LADDER_ITEM =  FOODBLOCKITEM.register("onion_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_LADDER_ITEM =  FOODBLOCKITEM.register("pecan_ladder_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_LADDER.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Tables
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TABLE_ITEM =  FOODBLOCKITEM.register("elderberry_table_item",
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_TABLE_ITEM =  FOODBLOCKITEM.register("juniper_table_item",
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_TABLE_ITEM =  FOODBLOCKITEM.register("cherry_table_item",
    () -> new BlockItem(foodblockcompatregistry.CHERRY_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_TABLE_ITEM =  FOODBLOCKITEM.register("coconut_table_item",
    () -> new BlockItem(foodblockcompatregistry.COCONUT_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_TABLE_ITEM =  FOODBLOCKITEM.register("orange_table_item",
    () -> new BlockItem(foodblockcompatregistry.ORANGE_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_TABLE_ITEM =  FOODBLOCKITEM.register("lemon_table_item",
    () -> new BlockItem(foodblockcompatregistry.LEMON_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_TABLE_ITEM =  FOODBLOCKITEM.register("corn_table_item",
    () -> new BlockItem(foodblockcompatregistry.CORN_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_TABLE_ITEM =  FOODBLOCKITEM.register("onion_table_item",
    () -> new BlockItem(foodblockcompatregistry.ONION_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_TABLE_ITEM =  FOODBLOCKITEM.register("pecan_table_item",
    () -> new BlockItem(foodblockcompatregistry.PECAN_TABLE.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> JUNIPER_TORCH_ITEM = FOODBLOCKITEM.register("juniper_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.JUNIPER_TORCH.get(), foodblockcompatregistry.JUNIPER_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> JUNIPER_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("juniper_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.JUNIPER_REDSTONE_TORCH.get(), foodblockcompatregistry.JUNIPER_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> JUNIPER_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("juniper_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockcompatregistry.JUNIPER_SOUL_TORCH.get(), foodblockcompatregistry.JUNIPER_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
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
//==============================================================================================================================================================================================
//                                                                                        Furnaces
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_FURNACE_ITEM = FOODBLOCKITEM.register("elderberry_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_FURNACE_ITEM = FOODBLOCKITEM.register("juniper_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_FURNACE_ITEM = FOODBLOCKITEM.register("cherry_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.CHERRY_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_FURNACE_ITEM = FOODBLOCKITEM.register("coconut_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.COCONUT_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_FURNACE_ITEM = FOODBLOCKITEM.register("orange_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.ORANGE_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_FURNACE_ITEM = FOODBLOCKITEM.register("lemon_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.LEMON_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_FURNACE_ITEM = FOODBLOCKITEM.register("corn_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.CORN_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_FURNACE_ITEM = FOODBLOCKITEM.register("onion_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.ONION_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_FURNACE_ITEM = FOODBLOCKITEM.register("pecan_furnace_item", 
    () -> new BlockItem(foodblockcompatregistry.PECAN_FURNACE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Paths
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("elderberry_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_STONE_PATH_ITEM = FOODBLOCKITEM.register("juniper_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("cherry_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.CHERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_STONE_PATH_ITEM = FOODBLOCKITEM.register("coconut_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.COCONUT_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_STONE_PATH_ITEM = FOODBLOCKITEM.register("orange_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.ORANGE_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_STONE_PATH_ITEM = FOODBLOCKITEM.register("lemon_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.LEMON_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_STONE_PATH_ITEM = FOODBLOCKITEM.register("corn_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.CORN_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_STONE_PATH_ITEM = FOODBLOCKITEM.register("onion_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.ONION_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_STONE_PATH_ITEM = FOODBLOCKITEM.register("pecan_stone_path_item", 
    () -> new BlockItem(foodblockcompatregistry.PECAN_STONE_PATH.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Barrels
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BARREL_ITEM = FOODBLOCKITEM.register("elderberry_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.ELDERBERRY_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_BARREL_ITEM = FOODBLOCKITEM.register("juniper_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.JUNIPER_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_BARREL_ITEM = FOODBLOCKITEM.register("cherry_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.CHERRY_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_BARREL_ITEM = FOODBLOCKITEM.register("coconut_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.COCONUT_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_BARREL_ITEM = FOODBLOCKITEM.register("orange_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.ORANGE_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_BARREL_ITEM = FOODBLOCKITEM.register("lemon_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.LEMON_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_BARREL_ITEM = FOODBLOCKITEM.register("corn_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.CORN_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_BARREL_ITEM = FOODBLOCKITEM.register("onion_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.ONION_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_BARREL_ITEM = FOODBLOCKITEM.register("pecan_barrel_item", 
    () -> new BlockItem(foodblockcompatregistry.PECAN_BARREL.get(),
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
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CHAIR_ITEM = FOODBLOCKITEM.register("cherry_chair_item", () -> new BlockItem(foodblockcompatregistry.CHERRY_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_CHAIR_ITEM = FOODBLOCKITEM.register("coconut_chair_item", () -> new BlockItem(foodblockcompatregistry.COCONUT_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_CHAIR_ITEM = FOODBLOCKITEM.register("orange_chair_item", () -> new BlockItem(foodblockcompatregistry.ORANGE_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_CHAIR_ITEM = FOODBLOCKITEM.register("lemon_chair_item", () -> new BlockItem(foodblockcompatregistry.LEMON_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_CHAIR_ITEM = FOODBLOCKITEM.register("corn_chair_item", () -> new BlockItem(foodblockcompatregistry.CORN_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_CHAIR_ITEM = FOODBLOCKITEM.register("onion_chair_item", () -> new BlockItem(foodblockcompatregistry.ONION_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_CHAIR_ITEM = FOODBLOCKITEM.register("pecan_chair_item", () -> new BlockItem(foodblockcompatregistry.PECAN_CHAIR.get(),
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
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_BED_ITEM = FOODBLOCKITEM.register("cherry_bed_item", () -> new BlockItem(foodblockcompatregistry.CHERRY_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_BED_ITEM = FOODBLOCKITEM.register("coconut_bed_item", () -> new BlockItem(foodblockcompatregistry.COCONUT_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ORANGE_BED_ITEM = FOODBLOCKITEM.register("orange_bed_item", () -> new BlockItem(foodblockcompatregistry.ORANGE_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> LEMON_BED_ITEM = FOODBLOCKITEM.register("lemon_bed_item", () -> new BlockItem(foodblockcompatregistry.LEMON_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CORN_BED_ITEM = FOODBLOCKITEM.register("corn_bed_item", () -> new BlockItem(foodblockcompatregistry.CORN_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ONION_BED_ITEM = FOODBLOCKITEM.register("onion_bed_item", () -> new BlockItem(foodblockcompatregistry.ONION_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> PECAN_BED_ITEM = FOODBLOCKITEM.register("pecan_bed_item", () -> new BlockItem(foodblockcompatregistry.PECAN_BED.get(),
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
 //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_CHERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_cherry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_CHERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_CHERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_cherry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_CHERRY_CABINET.get(),
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
 //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_ORANGE_CABINET_ITEM = FOODBLOCKITEM.register("small_orange_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_ORANGE_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_ORANGE_CABINET_ITEM = FOODBLOCKITEM.register("medium_orange_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_ORANGE_CABINET.get(),
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
 //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_PECAN_CABINET_ITEM = FOODBLOCKITEM.register("small_pecan_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_PECAN_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_PECAN_CABINET_ITEM = FOODBLOCKITEM.register("medium_pecan_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_PECAN_CABINET.get(),
      new BlockItem.Properties()));
}
