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
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_BARS_ITEM = FOODBLOCKITEM.register("corn_bars_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_BARS_ITEM = FOODBLOCKITEM.register("onion_bars_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_BARS.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_DOOR_ITEM = FOODBLOCKITEM.register("corn_door_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_DOOR_ITEM = FOODBLOCKITEM.register("onion_door_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_DOOR.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_BUTTON_ITEM = FOODBLOCKITEM.register("corn_button_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_BUTTON_ITEM = FOODBLOCKITEM.register("onion_button_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_BUTTON.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_FENCE_ITEM = FOODBLOCKITEM.register("corn_fence_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_FENCE_ITEM = FOODBLOCKITEM.register("onion_fence_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_FENCE.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_GATE_ITEM = FOODBLOCKITEM.register("corn_gate_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_GATE_ITEM = FOODBLOCKITEM.register("onion_gate_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_GATE.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CORN_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("corn_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.CORN_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ONION_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("onion_pressure_plate_item",
   () -> new BlockItem(foodblockcompatregistry.ONION_PRESSURE_PLATE.get(), new BlockItem.Properties()));
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
 //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> CORN_SIGN_ITEM = FOODBLOCKITEM.register("corn_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockcompatregistry.CORN_STANDING_SIGN.get(), foodblockcompatregistry.CORN_WALL_SIGN.get()));
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
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_JUNIPER_CABINET_ITEM = FOODBLOCKITEM.register("small_juniper_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_JUNIPER_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_JUNIPER_CABINET_ITEM = FOODBLOCKITEM.register("medium_juniper_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_JUNIPER_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_CHERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_cherry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_CHERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_CHERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_cherry_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_CHERRY_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_COCONUT_CABINET_ITEM = FOODBLOCKITEM.register("small_coconut_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_COCONUT_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_COCONUT_CABINET_ITEM = FOODBLOCKITEM.register("medium_coconut_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_COCONUT_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_ORANGE_CABINET_ITEM = FOODBLOCKITEM.register("small_orange_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.SMALL_ORANGE_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_ORANGE_CABINET_ITEM = FOODBLOCKITEM.register("medium_orange_cabinet_item", 
      () -> new BlockItem(foodblockcompatregistry.MEDIUM_ORANGE_CABINET.get(),
      new BlockItem.Properties()));
}
