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
     () -> new BlockItem(foodblockregistry.ELDERBERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_bricks_block_item",
     () -> new BlockItem(foodblockregistry.ELDERBERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.ELDERBERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("elderberry_tiles_block_item",
     () -> new BlockItem(foodblockregistry.ELDERBERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> JUNIPER_BLOCK_ITEM = FOODBLOCKITEM.register("juniper_block_item",
     () -> new BlockItem(foodblockregistry.JUNIPER_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> JUNIPER_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("juniper_bricks_block_item",
     () -> new BlockItem(foodblockregistry.JUNIPER_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> JUNIPER_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("juniper_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.JUNIPER_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> JUNIPER_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("juniper_tiles_block_item",
     () -> new BlockItem(foodblockregistry.JUNIPER_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> CHERRY_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_block_item",
     () -> new BlockItem(foodblockregistry.CHERRY_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_bricks_block_item",
     () -> new BlockItem(foodblockregistry.CHERRY_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> CHERRY_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.CHERRY_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> CHERRY_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("cherry_tiles_block_item",
     () -> new BlockItem(foodblockregistry.CHERRY_TILES_BLOCK.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  //.........plain
     public static final DeferredHolder<Item, BlockItem> COCONUT_BLOCK_ITEM = FOODBLOCKITEM.register("coconut_block_item",
     () -> new BlockItem(foodblockregistry.COCONUT_BLOCK.get(), new BlockItem.Properties()));
  //.........bricks
     public static final DeferredHolder<Item, BlockItem> COCONUT_BRICKS_BLOCK_ITEM = FOODBLOCKITEM.register("coconut_bricks_block_item",
     () -> new BlockItem(foodblockregistry.COCONUT_BRICKS_BLOCK.get(), new BlockItem.Properties()));
  //.........chiseled
     public static final DeferredHolder<Item, BlockItem> COCONUT_CHISELED_BLOCK_ITEM = FOODBLOCKITEM.register("coconut_chiseled_block_item",
     () -> new BlockItem(foodblockregistry.COCONUT_CHISELED_BLOCK.get(), new BlockItem.Properties()));
  //.........tiles
     public static final DeferredHolder<Item, BlockItem> COCONUT_TILES_BLOCK_ITEM = FOODBLOCKITEM.register("coconut_tiles_block_item",
     () -> new BlockItem(foodblockregistry.COCONUT_TILES_BLOCK.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Slabs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_SLAB_ITEM = FOODBLOCKITEM.register("elderberry_slab_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("elderberry_bricks_slab_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> JUNIPER_SLAB_ITEM = FOODBLOCKITEM.register("juniper_slab_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("juniper_bricks_slab_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CHERRY_SLAB_ITEM = FOODBLOCKITEM.register("cherry_slab_item",
   () -> new BlockItem(foodblockregistry.CHERRY_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("cherry_bricks_slab_item",
   () -> new BlockItem(foodblockregistry.CHERRY_BRICKS_SLAB.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> COCONUT_SLAB_ITEM = FOODBLOCKITEM.register("coconut_slab_item",
   () -> new BlockItem(foodblockregistry.COCONUT_SLAB.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> COCONUT_BRICKS_SLAB_ITEM = FOODBLOCKITEM.register("coconut_bricks_slab_item",
   () -> new BlockItem(foodblockregistry.COCONUT_BRICKS_SLAB.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Stairs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_STAIRS_ITEM = FOODBLOCKITEM.register("elderberry_stairs_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("elderberry_bricks_stairs_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> JUNIPER_STAIRS_ITEM = FOODBLOCKITEM.register("juniper_stairs_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("juniper_bricks_stairs_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> CHERRY_STAIRS_ITEM = FOODBLOCKITEM.register("cherry_stairs_item",
   () -> new BlockItem(foodblockregistry.CHERRY_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> CHERRY_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("cherry_bricks_stairs_item",
   () -> new BlockItem(foodblockregistry.CHERRY_BRICKS_STAIRS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
  //.........plain
   public static final DeferredHolder<Item, BlockItem> COCONUT_STAIRS_ITEM = FOODBLOCKITEM.register("coconut_stairs_item",
   () -> new BlockItem(foodblockregistry.COCONUT_STAIRS.get(), new BlockItem.Properties()));
  //.........bricks
   public static final DeferredHolder<Item, BlockItem> COCONUT_BRICKS_STAIRS_ITEM = FOODBLOCKITEM.register("coconut_bricks_stairs_item",
   () -> new BlockItem(foodblockregistry.COCONUT_BRICKS_STAIRS.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Bars
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BARS_ITEM = FOODBLOCKITEM.register("elderberry_bars_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BARS_ITEM = FOODBLOCKITEM.register("juniper_bars_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_BARS_ITEM = FOODBLOCKITEM.register("cherry_bars_item",
   () -> new BlockItem(foodblockregistry.CHERRY_BARS.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_BARS_ITEM = FOODBLOCKITEM.register("coconut_bars_item",
   () -> new BlockItem(foodblockregistry.COCONUT_BARS.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_DOOR_ITEM = FOODBLOCKITEM.register("elderberry_door_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_DOOR_ITEM = FOODBLOCKITEM.register("juniper_door_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_DOOR_ITEM = FOODBLOCKITEM.register("cherry_door_item",
   () -> new BlockItem(foodblockregistry.CHERRY_DOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_DOOR_ITEM = FOODBLOCKITEM.register("coconut_door_item",
   () -> new BlockItem(foodblockregistry.COCONUT_DOOR.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Buttons
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BUTTON_ITEM = FOODBLOCKITEM.register("elderberry_button_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_BUTTON_ITEM = FOODBLOCKITEM.register("juniper_button_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_BUTTON_ITEM = FOODBLOCKITEM.register("cherry_button_item",
   () -> new BlockItem(foodblockregistry.CHERRY_BUTTON.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_BUTTON_ITEM = FOODBLOCKITEM.register("coconut_button_item",
   () -> new BlockItem(foodblockregistry.COCONUT_BUTTON.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Fences
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_FENCE_ITEM = FOODBLOCKITEM.register("elderberry_fence_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_FENCE_ITEM = FOODBLOCKITEM.register("juniper_fence_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_FENCE_ITEM = FOODBLOCKITEM.register("cherry_fence_item",
   () -> new BlockItem(foodblockregistry.CHERRY_FENCE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_FENCE_ITEM = FOODBLOCKITEM.register("coconut_fence_item",
   () -> new BlockItem(foodblockregistry.COCONUT_FENCE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Gates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_GATE_ITEM = FOODBLOCKITEM.register("elderberry_gate_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_GATE_ITEM = FOODBLOCKITEM.register("juniper_gate_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_GATE_ITEM = FOODBLOCKITEM.register("cherry_gate_item",
   () -> new BlockItem(foodblockregistry.CHERRY_GATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_GATE_ITEM = FOODBLOCKITEM.register("coconut_gate_item",
   () -> new BlockItem(foodblockregistry.COCONUT_GATE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                     Pressure Plates
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> ELDERBERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("elderberry_pressure_plate_item",
   () -> new BlockItem(foodblockregistry.ELDERBERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> JUNIPER_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("juniper_pressure_plate_item",
   () -> new BlockItem(foodblockregistry.JUNIPER_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> CHERRY_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("cherry_pressure_plate_item",
   () -> new BlockItem(foodblockregistry.CHERRY_PRESSURE_PLATE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, BlockItem> COCONUT_PRESSURE_PLATE_ITEM = FOODBLOCKITEM.register("coconut_pressure_plate_item",
   () -> new BlockItem(foodblockregistry.COCONUT_PRESSURE_PLATE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                          Signs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> ELDERBERRY_SIGN_ITEM = FOODBLOCKITEM.register("elderberry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockregistry.ELDERBERRY_STANDING_SIGN.get(), foodblockregistry.ELDERBERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> JUNIPER_SIGN_ITEM = FOODBLOCKITEM.register("juniper_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockregistry.JUNIPER_STANDING_SIGN.get(), foodblockregistry.JUNIPER_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> CHERRY_SIGN_ITEM = FOODBLOCKITEM.register("cherry_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockregistry.CHERRY_STANDING_SIGN.get(), foodblockregistry.CHERRY_WALL_SIGN.get()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
   public static final DeferredHolder<Item, SignItem> COCONUT_SIGN_ITEM = FOODBLOCKITEM.register("coconut_sign_item",
   () -> new SignItem(new SignItem.Properties(), foodblockregistry.COCONUT_STANDING_SIGN.get(), foodblockregistry.COCONUT_WALL_SIGN.get()));
//==============================================================================================================================================================================================
//                                                                                       Trap Doors
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("elderberry_trapdoor_item",
     () -> new BlockItem(foodblockregistry.ELDERBERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> JUNIPER_TRAPDOOR_ITEM = FOODBLOCKITEM.register("juniper_trapdoor_item",
     () -> new BlockItem(foodblockregistry.JUNIPER_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> CHERRY_TRAPDOOR_ITEM = FOODBLOCKITEM.register("cherry_trapdoor_item",
     () -> new BlockItem(foodblockregistry.CHERRY_TRAPDOOR.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
     public static final DeferredHolder<Item, BlockItem> COCONUT_TRAPDOOR_ITEM = FOODBLOCKITEM.register("coconut_trapdoor_item",
     () -> new BlockItem(foodblockregistry.COCONUT_TRAPDOOR.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Lamps
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LAMP_ITEM = FOODBLOCKITEM.register("elderberry_lamp_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_LAMP_ITEM = FOODBLOCKITEM.register("juniper_lamp_item",
    () -> new BlockItem(foodblockregistry.JUNIPER_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_LAMP_ITEM = FOODBLOCKITEM.register("cherry_lamp_item",
    () -> new BlockItem(foodblockregistry.CHERRY_LAMP.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_LAMP_ITEM = FOODBLOCKITEM.register("coconut_lamp_item",
    () -> new BlockItem(foodblockregistry.COCONUT_LAMP.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Carpets
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CARPET_ITEM = FOODBLOCKITEM.register("elderberry_carpet_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_CARPET_ITEM = FOODBLOCKITEM.register("juniper_carpet_item",
    () -> new BlockItem(foodblockregistry.JUNIPER_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CARPET_ITEM = FOODBLOCKITEM.register("cherry_carpet_item",
    () -> new BlockItem(foodblockregistry.CHERRY_CARPET.get(), new BlockItem.Properties())); 
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_CARPET_ITEM = FOODBLOCKITEM.register("coconut_carpet_item",
    () -> new BlockItem(foodblockregistry.COCONUT_CARPET.get(), new BlockItem.Properties())); 
//==============================================================================================================================================================================================
//                                                                                        Lanterns
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LANTERN_ITEM = FOODBLOCKITEM.register("elderberry_lantern_item",
      () -> new BlockItem(foodblockregistry.ELDERBERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> ELDERBERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("elderberry_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.ELDERBERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> JUNIPER_LANTERN_ITEM = FOODBLOCKITEM.register("juniper_lantern_item",
      () -> new BlockItem(foodblockregistry.JUNIPER_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> JUNIPER_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("juniper_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.JUNIPER_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> CHERRY_LANTERN_ITEM = FOODBLOCKITEM.register("cherry_lantern_item",
      () -> new BlockItem(foodblockregistry.CHERRY_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> CHERRY_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("cherry_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.CHERRY_SOUL_LANTERN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, BlockItem> COCONUT_LANTERN_ITEM = FOODBLOCKITEM.register("coconut_lantern_item",
      () -> new BlockItem(foodblockregistry.COCONUT_LANTERN.get(), new BlockItem.Properties()));
    //soul
      public static final DeferredHolder<Item, BlockItem> COCONUT_SOUL_LANTERN_ITEM = FOODBLOCKITEM.register("coconut_soul_lantern_item",
      () -> new BlockItem(foodblockregistry.COCONUT_SOUL_LANTERN.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Chains
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHAIN_ITEM = FOODBLOCKITEM.register("elderberry_chain_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_CHAIN_ITEM = FOODBLOCKITEM.register("juniper_chain_item",
    () -> new BlockItem(foodblockregistry.JUNIPER_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CHAIN_ITEM = FOODBLOCKITEM.register("cherry_chain_item",
    () -> new BlockItem(foodblockregistry.CHERRY_CHAIN.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> COCONUT_CHAIN_ITEM = FOODBLOCKITEM.register("coconut_chain_item",
    () -> new BlockItem(foodblockregistry.COCONUT_CHAIN.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Ladders
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_LADDER_ITEM =  FOODBLOCKITEM.register("elderberry_ladder_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_LADDER_ITEM =  FOODBLOCKITEM.register("juniper_ladder_item",
    () -> new BlockItem(foodblockregistry.JUNIPER_LADDER.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_LADDER_ITEM =  FOODBLOCKITEM.register("cherry_ladder_item",
    () -> new BlockItem(foodblockregistry.CHERRY_LADDER.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Tables
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_TABLE_ITEM =  FOODBLOCKITEM.register("elderberry_table_item",
    () -> new BlockItem(foodblockregistry.ELDERBERRY_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_TABLE_ITEM =  FOODBLOCKITEM.register("juniper_table_item",
    () -> new BlockItem(foodblockregistry.JUNIPER_TABLE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_TABLE_ITEM =  FOODBLOCKITEM.register("cherry_table_item",
    () -> new BlockItem(foodblockregistry.CHERRY_TABLE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Torches
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ELDERBERRY_TORCH_ITEM = FOODBLOCKITEM.register("elderberry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.ELDERBERRY_TORCH.get(), foodblockregistry.ELDERBERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ELDERBERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("elderberry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.ELDERBERRY_REDSTONE_TORCH.get(), foodblockregistry.ELDERBERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> ELDERBERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("elderberry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.ELDERBERRY_SOUL_TORCH.get(), foodblockregistry.ELDERBERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> JUNIPER_TORCH_ITEM = FOODBLOCKITEM.register("juniper_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.JUNIPER_TORCH.get(), foodblockregistry.JUNIPER_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> JUNIPER_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("juniper_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.JUNIPER_REDSTONE_TORCH.get(), foodblockregistry.JUNIPER_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> JUNIPER_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("juniper_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.JUNIPER_SOUL_TORCH.get(), foodblockregistry.JUNIPER_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //regular
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHERRY_TORCH_ITEM = FOODBLOCKITEM.register("cherry_torch_item", 
      () -> new StandingAndWallBlockItem(foodblockregistry.CHERRY_TORCH.get(), foodblockregistry.CHERRY_WALL_TORCH.get(), new Item.Properties(), Direction.NORTH));
    //redstone
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHERRY_REDSTONE_TORCH_ITEM =  FOODBLOCKITEM.register("cherry_redstone_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.CHERRY_REDSTONE_TORCH.get(), foodblockregistry.CHERRY_REDSTONE_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
    //soul
      public static final DeferredHolder<Item, StandingAndWallBlockItem> CHERRY_SOUL_TORCH_ITEM =  FOODBLOCKITEM.register("cherry_soul_torch_item",
      () -> new StandingAndWallBlockItem(foodblockregistry.CHERRY_SOUL_TORCH.get(), foodblockregistry.CHERRY_SOUL_WALL_TORCH.get(), new BlockItem.Properties(), Direction.NORTH));
//==============================================================================================================================================================================================
//                                                                                        Furnaces
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_FURNACE_ITEM = FOODBLOCKITEM.register("elderberry_furnace_item", 
    () -> new BlockItem(foodblockregistry.ELDERBERRY_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_FURNACE_ITEM = FOODBLOCKITEM.register("juniper_furnace_item", 
    () -> new BlockItem(foodblockregistry.JUNIPER_FURNACE.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_FURNACE_ITEM = FOODBLOCKITEM.register("cherry_furnace_item", 
    () -> new BlockItem(foodblockregistry.CHERRY_FURNACE.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Paths
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("elderberry_stone_path_item", 
    () -> new BlockItem(foodblockregistry.ELDERBERRY_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_STONE_PATH_ITEM = FOODBLOCKITEM.register("juniper_stone_path_item", 
    () -> new BlockItem(foodblockregistry.JUNIPER_STONE_PATH.get(), new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_STONE_PATH_ITEM = FOODBLOCKITEM.register("cherry_stone_path_item", 
    () -> new BlockItem(foodblockregistry.CHERRY_STONE_PATH.get(), new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Barrels
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BARREL_ITEM = FOODBLOCKITEM.register("elderberry_barrel_item", 
    () -> new BlockItem(foodblockregistry.ELDERBERRY_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_BARREL_ITEM = FOODBLOCKITEM.register("juniper_barrel_item", 
    () -> new BlockItem(foodblockregistry.JUNIPER_BARREL.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_BARREL_ITEM = FOODBLOCKITEM.register("cherry_barrel_item", 
    () -> new BlockItem(foodblockregistry.CHERRY_BARREL.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Chairs
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_CHAIR_ITEM = FOODBLOCKITEM.register("elderberry_chair_item", () -> new BlockItem(foodblockregistry.ELDERBERRY_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_CHAIR_ITEM = FOODBLOCKITEM.register("juniper_chair_item", () -> new BlockItem(foodblockregistry.JUNIPER_CHAIR.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_CHAIR_ITEM = FOODBLOCKITEM.register("cherry_chair_item", () -> new BlockItem(foodblockregistry.CHERRY_CHAIR.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                         Beds
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> ELDERBERRY_BED_ITEM = FOODBLOCKITEM.register("elderberry_bed_item", () -> new BlockItem(foodblockregistry.ELDERBERRY_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> JUNIPER_BED_ITEM = FOODBLOCKITEM.register("juniper_bed_item", () -> new BlockItem(foodblockregistry.JUNIPER_BED.get(),
    new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    public static final DeferredHolder<Item, BlockItem> CHERRY_BED_ITEM = FOODBLOCKITEM.register("cherry_bed_item", () -> new BlockItem(foodblockregistry.CHERRY_BED.get(),
    new BlockItem.Properties()));
//==============================================================================================================================================================================================
//                                                                                        Cabinets
//==============================================================================================================================================================================================
 //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_ELDERBERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_elderberry_cabinet_item", 
      () -> new BlockItem(foodblockregistry.SMALL_ELDERBERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_ELDERBERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_elderberry_cabinet_item", 
      () -> new BlockItem(foodblockregistry.MEDIUM_ELDERBERRY_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_JUNIPER_CABINET_ITEM = FOODBLOCKITEM.register("small_juniper_cabinet_item", 
      () -> new BlockItem(foodblockregistry.SMALL_JUNIPER_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_JUNIPER_CABINET_ITEM = FOODBLOCKITEM.register("medium_juniper_cabinet_item", 
      () -> new BlockItem(foodblockregistry.MEDIUM_JUNIPER_CABINET.get(),
      new BlockItem.Properties()));
 //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
    //small
      public static final DeferredHolder<Item, BlockItem> SMALL_CHERRY_CABINET_ITEM = FOODBLOCKITEM.register("small_cherry_cabinet_item", 
      () -> new BlockItem(foodblockregistry.SMALL_CHERRY_CABINET.get(),
      new BlockItem.Properties()));
    //medium
      public static final DeferredHolder<Item, BlockItem> MEDIUM_CHERRY_CABINET_ITEM = FOODBLOCKITEM.register("medium_cherry_cabinet_item", 
      () -> new BlockItem(foodblockregistry.MEDIUM_CHERRY_CABINET.get(),
      new BlockItem.Properties()));
}
