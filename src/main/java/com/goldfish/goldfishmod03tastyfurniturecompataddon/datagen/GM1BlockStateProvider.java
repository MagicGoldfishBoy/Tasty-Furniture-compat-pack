package com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import com.goldfish.goldfishmod02tastyfurniture.block.foodBarrel;
import com.goldfish.goldfishmod02tastyfurniture.block.foodBed;
import com.goldfish.goldfishmod02tastyfurniture.block.foodChairBlock;
import com.goldfish.goldfishmod02tastyfurniture.block.foodpathtypeminislab;
import com.goldfish.goldfishmod02tastyfurniture.block.mediumFoodCabinet;
import com.goldfish.goldfishmod02tastyfurniture.block.smallFoodCabinet;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatregistry;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;

public class GM1BlockStateProvider extends BlockStateProvider 
{

     private final PackOutput output;
     private final ExistingFileHelper existingFileHelper;

     public GM1BlockStateProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
         super(output, "goldfishmod03tastyfurniturecompataddon", existingFileHelper);
         this.output = output;
         this.existingFileHelper = existingFileHelper;
     }

     public PackOutput getOutput() {
      return output;
    }

     @Override
     public void registerStatesAndModels() {

    //==============================================================================================================================================
    //|                                                              Blocks                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block elderberry_block = foodblockcompatregistry.ELDERBERRY_BLOCK.get();
          simpleBlock(elderberry_block);
      //.........bricks
          net.minecraft.world.level.block.Block elderberry_bricks_block = foodblockcompatregistry.ELDERBERRY_BRICKS_BLOCK.get();
          simpleBlock(elderberry_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block elderberry_chiseled_block = foodblockcompatregistry.ELDERBERRY_CHISELED_BLOCK.get();
          simpleBlock(elderberry_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block elderberry_tiles_block = foodblockcompatregistry.ELDERBERRY_TILES_BLOCK.get();
          simpleBlock(elderberry_tiles_block);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block juniper_block = foodblockcompatregistry.JUNIPER_BLOCK.get();
          simpleBlock(juniper_block);
      //.........bricks
          net.minecraft.world.level.block.Block juniper_bricks_block = foodblockcompatregistry.JUNIPER_BRICKS_BLOCK.get();
          simpleBlock(juniper_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block juniper_chiseled_block = foodblockcompatregistry.JUNIPER_CHISELED_BLOCK.get();
          simpleBlock(juniper_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block juniper_tiles_block = foodblockcompatregistry.JUNIPER_TILES_BLOCK.get();
          simpleBlock(juniper_tiles_block);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block cherry_block = foodblockcompatregistry.CHERRY_BLOCK.get();
          simpleBlock(cherry_block);
      //.........bricks
          net.minecraft.world.level.block.Block cherry_bricks_block = foodblockcompatregistry.CHERRY_BRICKS_BLOCK.get();
          simpleBlock(cherry_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block cherry_chiseled_block = foodblockcompatregistry.CHERRY_CHISELED_BLOCK.get();
          simpleBlock(cherry_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block cherry_tiles_block = foodblockcompatregistry.CHERRY_TILES_BLOCK.get();
          simpleBlock(cherry_tiles_block);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block coconut_block = foodblockcompatregistry.COCONUT_BLOCK.get();
          simpleBlock(coconut_block);
      //.........bricks
          net.minecraft.world.level.block.Block coconut_bricks_block = foodblockcompatregistry.COCONUT_BRICKS_BLOCK.get();
          simpleBlock(coconut_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block coconut_chiseled_block = foodblockcompatregistry.COCONUT_CHISELED_BLOCK.get();
          simpleBlock(coconut_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block coconut_tiles_block = foodblockcompatregistry.COCONUT_TILES_BLOCK.get();
          simpleBlock(coconut_tiles_block);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block orange_block = foodblockcompatregistry.ORANGE_BLOCK.get();
          simpleBlock(orange_block);
      //.........bricks
          net.minecraft.world.level.block.Block orange_bricks_block = foodblockcompatregistry.ORANGE_BRICKS_BLOCK.get();
          simpleBlock(orange_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block orange_chiseled_block = foodblockcompatregistry.ORANGE_CHISELED_BLOCK.get();
          simpleBlock(orange_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block orange_tiles_block = foodblockcompatregistry.ORANGE_TILES_BLOCK.get();
          simpleBlock(orange_tiles_block);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block corn_block = foodblockcompatregistry.CORN_BLOCK.get();
          simpleBlock(corn_block);
      //.........bricks
          net.minecraft.world.level.block.Block corn_bricks_block = foodblockcompatregistry.CORN_BRICKS_BLOCK.get();
          simpleBlock(corn_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block corn_chiseled_block = foodblockcompatregistry.CORN_CHISELED_BLOCK.get();
          simpleBlock(corn_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block corn_tiles_block = foodblockcompatregistry.CORN_TILES_BLOCK.get();
          simpleBlock(corn_tiles_block);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block onion_block = foodblockcompatregistry.ONION_BLOCK.get();
          simpleBlock(onion_block);
      //.........bricks
          net.minecraft.world.level.block.Block onion_bricks_block = foodblockcompatregistry.ONION_BRICKS_BLOCK.get();
          simpleBlock(onion_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block onion_chiseled_block = foodblockcompatregistry.ONION_CHISELED_BLOCK.get();
          simpleBlock(onion_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block onion_tiles_block = foodblockcompatregistry.ONION_TILES_BLOCK.get();
          simpleBlock(onion_tiles_block);
    //==============================================================================================================================================
    //|                                                              Slabs                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
      //.........plain
          SlabBlock elderberry_slab = foodblockcompatregistry.ELDERBERRY_SLAB.get();
          ResourceLocation elderberry_block_texture = modLoc("block/elderberry_block");
          slabBlock(elderberry_slab, elderberry_block_texture, elderberry_block_texture);
      //.........bricks
          SlabBlock elderberry_bricks_slab = foodblockcompatregistry.ELDERBERRY_BRICKS_SLAB.get();
          ResourceLocation elderberry_bricks_block_texture = modLoc("block/elderberry_bricks_block");
          slabBlock(elderberry_bricks_slab, elderberry_bricks_block_texture, elderberry_bricks_block_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
      //.........plain
          SlabBlock juniper_slab = foodblockcompatregistry.JUNIPER_SLAB.get();
          ResourceLocation juniper_block_texture = modLoc("block/juniper_block");
          slabBlock(juniper_slab, juniper_block_texture, juniper_block_texture);
      //.........bricks
          SlabBlock juniper_bricks_slab = foodblockcompatregistry.JUNIPER_BRICKS_SLAB.get();
          ResourceLocation juniper_bricks_block_texture = modLoc("block/juniper_bricks_block");
          slabBlock(juniper_bricks_slab, juniper_bricks_block_texture, juniper_bricks_block_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
      //.........plain
          SlabBlock cherry_slab = foodblockcompatregistry.CHERRY_SLAB.get();
          ResourceLocation cherry_block_texture = modLoc("block/cherry_block");
          slabBlock(cherry_slab, cherry_block_texture, cherry_block_texture);
      //.........bricks
          SlabBlock cherry_bricks_slab = foodblockcompatregistry.CHERRY_BRICKS_SLAB.get();
          ResourceLocation cherry_bricks_block_texture = modLoc("block/cherry_bricks_block");
          slabBlock(cherry_bricks_slab, cherry_bricks_block_texture, cherry_bricks_block_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
      //.........plain
          SlabBlock coconut_slab = foodblockcompatregistry.COCONUT_SLAB.get();
          ResourceLocation coconut_block_texture = modLoc("block/coconut_block");
          slabBlock(coconut_slab, coconut_block_texture, coconut_block_texture);
      //.........bricks
          SlabBlock coconut_bricks_slab = foodblockcompatregistry.COCONUT_BRICKS_SLAB.get();
          ResourceLocation coconut_bricks_block_texture = modLoc("block/coconut_bricks_block");
          slabBlock(coconut_bricks_slab, coconut_bricks_block_texture, coconut_bricks_block_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
      //.........plain
          SlabBlock orange_slab = foodblockcompatregistry.ORANGE_SLAB.get();
          ResourceLocation orange_block_texture = modLoc("block/orange_block");
          slabBlock(orange_slab, orange_block_texture, orange_block_texture);
      //.........bricks
          SlabBlock orange_bricks_slab = foodblockcompatregistry.ORANGE_BRICKS_SLAB.get();
          ResourceLocation orange_bricks_block_texture = modLoc("block/orange_bricks_block");
          slabBlock(orange_bricks_slab, orange_bricks_block_texture, orange_bricks_block_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
      //.........plain
          SlabBlock corn_slab = foodblockcompatregistry.CORN_SLAB.get();
          ResourceLocation corn_block_texture = modLoc("block/corn_block");
          slabBlock(corn_slab, corn_block_texture, corn_block_texture);
      //.........bricks
          SlabBlock corn_bricks_slab = foodblockcompatregistry.CORN_BRICKS_SLAB.get();
          ResourceLocation corn_bricks_block_texture = modLoc("block/corn_bricks_block");
          slabBlock(corn_bricks_slab, corn_bricks_block_texture, corn_bricks_block_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
      //.........plain
          SlabBlock onion_slab = foodblockcompatregistry.ONION_SLAB.get();
          ResourceLocation onion_block_texture = modLoc("block/onion_block");
          slabBlock(onion_slab, onion_block_texture, onion_block_texture);
      //.........bricks
          SlabBlock onion_bricks_slab = foodblockcompatregistry.ONION_BRICKS_SLAB.get();
          ResourceLocation onion_bricks_block_texture = modLoc("block/onion_bricks_block");
          slabBlock(onion_bricks_slab, onion_bricks_block_texture, onion_bricks_block_texture);
    //==============================================================================================================================================
    //|                                                              Stairs                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
      //.........plain
          StairBlock elderberry_stairs = foodblockcompatregistry.ELDERBERRY_STAIRS.get();
          stairsBlock(elderberry_stairs, elderberry_block_texture);
      //.........bricks
          StairBlock elderberry_bricks_stairs = foodblockcompatregistry.ELDERBERRY_BRICKS_STAIRS.get();
          stairsBlock(elderberry_bricks_stairs, elderberry_bricks_block_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
      //.........plain
          StairBlock juniper_stairs = foodblockcompatregistry.JUNIPER_STAIRS.get();
          stairsBlock(juniper_stairs, juniper_block_texture);
      //.........bricks
          StairBlock juniper_bricks_stairs = foodblockcompatregistry.JUNIPER_BRICKS_STAIRS.get();
          stairsBlock(juniper_bricks_stairs, juniper_bricks_block_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
      //.........plain
          StairBlock cherry_stairs = foodblockcompatregistry.CHERRY_STAIRS.get();
          stairsBlock(cherry_stairs, cherry_block_texture);
      //.........bricks
          StairBlock cherry_bricks_stairs = foodblockcompatregistry.CHERRY_BRICKS_STAIRS.get();
          stairsBlock(cherry_bricks_stairs, cherry_bricks_block_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
      //.........plain
          StairBlock coconut_stairs = foodblockcompatregistry.COCONUT_STAIRS.get();
          stairsBlock(coconut_stairs, coconut_block_texture);
      //.........bricks
          StairBlock coconut_bricks_stairs = foodblockcompatregistry.COCONUT_BRICKS_STAIRS.get();
          stairsBlock(coconut_bricks_stairs, coconut_bricks_block_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
      //.........plain
          StairBlock orange_stairs = foodblockcompatregistry.ORANGE_STAIRS.get();
          stairsBlock(orange_stairs, orange_block_texture);
      //.........bricks
          StairBlock orange_bricks_stairs = foodblockcompatregistry.ORANGE_BRICKS_STAIRS.get();
          stairsBlock(orange_bricks_stairs, orange_bricks_block_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
      //.........plain
          StairBlock corn_stairs = foodblockcompatregistry.CORN_STAIRS.get();
          stairsBlock(corn_stairs, corn_block_texture);
      //.........bricks
          StairBlock corn_bricks_stairs = foodblockcompatregistry.CORN_BRICKS_STAIRS.get();
          stairsBlock(corn_bricks_stairs, corn_bricks_block_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
      //.........plain
          StairBlock onion_stairs = foodblockcompatregistry.ONION_STAIRS.get();
          stairsBlock(onion_stairs, onion_block_texture);
      //.........bricks
          StairBlock onion_bricks_stairs = foodblockcompatregistry.ONION_BRICKS_STAIRS.get();
          stairsBlock(onion_bricks_stairs, onion_bricks_block_texture);
    //==============================================================================================================================================
    //|                                                               Bars                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          IronBarsBlock elderberry_bars = foodblockcompatregistry.ELDERBERRY_BARS.get(); 
          ResourceLocation elderberry_bars_texture = modLoc("block/elderberry_bars");
          ResourceLocation elderberry_bars_rim_texture = modLoc("block/elderberry_block");
          paneBlockWithRenderType(elderberry_bars, "elderberry_bars", elderberry_bars_texture, elderberry_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          IronBarsBlock juniper_bars = foodblockcompatregistry.JUNIPER_BARS.get(); 
          ResourceLocation juniper_bars_texture = modLoc("block/juniper_bars");
          ResourceLocation juniper_bars_rim_texture = modLoc("block/juniper_block");
          paneBlockWithRenderType(juniper_bars, "juniper_bars", juniper_bars_texture, juniper_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          IronBarsBlock cherry_bars = foodblockcompatregistry.CHERRY_BARS.get(); 
          ResourceLocation cherry_bars_texture = modLoc("block/cherry_bars");
          ResourceLocation cherry_bars_rim_texture = modLoc("block/cherry_block");
          paneBlockWithRenderType(cherry_bars, "cherry_bars", cherry_bars_texture, cherry_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          IronBarsBlock coconut_bars = foodblockcompatregistry.COCONUT_BARS.get(); 
          ResourceLocation coconut_bars_texture = modLoc("block/coconut_bars");
          ResourceLocation coconut_bars_rim_texture = modLoc("block/coconut_block");
          paneBlockWithRenderType(coconut_bars, "coconut_bars", coconut_bars_texture, coconut_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          IronBarsBlock orange_bars = foodblockcompatregistry.ORANGE_BARS.get(); 
          ResourceLocation orange_bars_texture = modLoc("block/orange_bars");
          ResourceLocation orange_bars_rim_texture = modLoc("block/orange_block");
          paneBlockWithRenderType(orange_bars, "orange_bars", orange_bars_texture, orange_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          IronBarsBlock corn_bars = foodblockcompatregistry.CORN_BARS.get(); 
          ResourceLocation corn_bars_texture = modLoc("block/corn_bars");
          ResourceLocation corn_bars_rim_texture = modLoc("block/corn_block");
          paneBlockWithRenderType(corn_bars, "corn_bars", corn_bars_texture, corn_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          IronBarsBlock onion_bars = foodblockcompatregistry.ONION_BARS.get(); 
          ResourceLocation onion_bars_texture = modLoc("block/onion_bars");
          ResourceLocation onion_bars_rim_texture = modLoc("block/onion_block");
          paneBlockWithRenderType(onion_bars, "onion_bars", onion_bars_texture, onion_bars_rim_texture, "cutout_mipped_all"); 
    //==============================================================================================================================================
    //|                                                               Door                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          DoorBlock elderberry_door = foodblockcompatregistry.ELDERBERRY_DOOR.get(); 
          ResourceLocation elderberry_door_top_texture = modLoc("block/elderberry_door_top");
          ResourceLocation elderberry_door_bottom_texture = modLoc("block/elderberry_door_bottom");
          doorBlockWithRenderType(elderberry_door, "elderberry_door", elderberry_door_bottom_texture, elderberry_door_top_texture, "translucent"); 
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          DoorBlock juniper_door = foodblockcompatregistry.JUNIPER_DOOR.get(); 
          ResourceLocation juniper_door_top_texture = modLoc("block/juniper_door_top");
          ResourceLocation juniper_door_bottom_texture = modLoc("block/juniper_door_bottom");
          doorBlockWithRenderType(juniper_door, "juniper_door", juniper_door_bottom_texture, juniper_door_top_texture, "translucent"); 
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          DoorBlock cherry_door = foodblockcompatregistry.CHERRY_DOOR.get(); 
          ResourceLocation cherry_door_top_texture = modLoc("block/cherry_door_top");
          ResourceLocation cherry_door_bottom_texture = modLoc("block/cherry_door_bottom");
          doorBlockWithRenderType(cherry_door, "cherry_door", cherry_door_top_texture, cherry_door_bottom_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          DoorBlock coconut_door = foodblockcompatregistry.COCONUT_DOOR.get(); 
          ResourceLocation coconut_door_top_texture = modLoc("block/coconut_door_top");
          ResourceLocation coconut_door_bottom_texture = modLoc("block/coconut_door_bottom");
          doorBlockWithRenderType(coconut_door, "coconut_door", coconut_door_bottom_texture, coconut_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          DoorBlock orange_door = foodblockcompatregistry.ORANGE_DOOR.get(); 
          ResourceLocation orange_door_top_texture = modLoc("block/orange_door_top");
          ResourceLocation orange_door_bottom_texture = modLoc("block/orange_door_bottom");
          doorBlockWithRenderType(orange_door, "orange_door", orange_door_bottom_texture, orange_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          DoorBlock corn_door = foodblockcompatregistry.CORN_DOOR.get(); 
          ResourceLocation corn_door_top_texture = modLoc("block/corn_door_top");
          ResourceLocation corn_door_bottom_texture = modLoc("block/corn_door_bottom");
          doorBlockWithRenderType(corn_door, "corn_door", corn_door_bottom_texture, corn_door_top_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          DoorBlock onion_door = foodblockcompatregistry.ONION_DOOR.get(); 
          ResourceLocation onion_door_top_texture = modLoc("block/onion_door_top");
          ResourceLocation onion_door_bottom_texture = modLoc("block/onion_door_bottom");
          doorBlockWithRenderType(onion_door, "onion_door", onion_door_bottom_texture, onion_door_top_texture, "translucent"); 
    //==============================================================================================================================================
    //|                                                              Button                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          ButtonBlock elderberry_button = foodblockcompatregistry.ELDERBERRY_BUTTON.get();
          ResourceLocation elderberry_button_texture = modLoc("block/elderberry_block");
          buttonBlock(elderberry_button, elderberry_button_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          ButtonBlock juniper_button = foodblockcompatregistry.JUNIPER_BUTTON.get();
          ResourceLocation juniper_button_texture = modLoc("block/juniper_block");
          buttonBlock(juniper_button, juniper_button_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          ButtonBlock cherry_button = foodblockcompatregistry.CHERRY_BUTTON.get();
          ResourceLocation cherry_button_texture = modLoc("block/cherry_block");
          buttonBlock(cherry_button, cherry_button_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          ButtonBlock coconut_button = foodblockcompatregistry.COCONUT_BUTTON.get();
          ResourceLocation coconut_button_texture = modLoc("block/coconut_block");
          buttonBlock(coconut_button, coconut_button_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          ButtonBlock orange_button = foodblockcompatregistry.ORANGE_BUTTON.get();
          ResourceLocation orange_button_texture = modLoc("block/orange_block");
          buttonBlock(orange_button, orange_button_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          ButtonBlock corn_button = foodblockcompatregistry.CORN_BUTTON.get();
          ResourceLocation corn_button_texture = modLoc("block/corn_block");
          buttonBlock(corn_button, corn_button_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          ButtonBlock onion_button = foodblockcompatregistry.ONION_BUTTON.get();
          ResourceLocation onion_button_texture = modLoc("block/onion_block");
          buttonBlock(onion_button, onion_button_texture);
    //==============================================================================================================================================
    //|                                                              Fences                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
       //fence
          FenceBlock elderberry_fence = foodblockcompatregistry.ELDERBERRY_FENCE.get();
          ResourceLocation elderberry_fence_texture = modLoc("block/elderberry_block");
          fenceBlock(elderberry_fence, elderberry_fence_texture);
       //gate
          FenceGateBlock elderberry_gate = foodblockcompatregistry.ELDERBERRY_GATE.get();
          ResourceLocation elderberry_gate_texture = modLoc("block/elderberry_block");
          fenceGateBlock(elderberry_gate, elderberry_gate_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
       //fence
          FenceBlock juniper_fence = foodblockcompatregistry.JUNIPER_FENCE.get();
          ResourceLocation juniper_fence_texture = modLoc("block/juniper_block");
          fenceBlock(juniper_fence, juniper_fence_texture);
       //gate
          FenceGateBlock juniper_gate = foodblockcompatregistry.JUNIPER_GATE.get();
          ResourceLocation juniper_gate_texture = modLoc("block/juniper_block");
          fenceGateBlock(juniper_gate, juniper_gate_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
       //fence
          FenceBlock cherry_fence = foodblockcompatregistry.CHERRY_FENCE.get();
          ResourceLocation cherry_fence_texture = modLoc("block/cherry_block");
          fenceBlock(cherry_fence, cherry_fence_texture);
       //gate
          FenceGateBlock cherry_gate = foodblockcompatregistry.CHERRY_GATE.get();
          ResourceLocation cherry_gate_texture = modLoc("block/cherry_block");
          fenceGateBlock(cherry_gate, cherry_gate_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
       //fence
          FenceBlock coconut_fence = foodblockcompatregistry.COCONUT_FENCE.get();
          ResourceLocation coconut_fence_texture = modLoc("block/coconut_block");
          fenceBlock(coconut_fence, coconut_fence_texture);
       //gate
          FenceGateBlock coconut_gate = foodblockcompatregistry.COCONUT_GATE.get();
          ResourceLocation coconut_gate_texture = modLoc("block/coconut_block");
          fenceGateBlock(coconut_gate, coconut_gate_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
       //fence
          FenceBlock orange_fence = foodblockcompatregistry.ORANGE_FENCE.get();
          ResourceLocation orange_fence_texture = modLoc("block/orange_block");
          fenceBlock(orange_fence, orange_fence_texture);
       //gate
          FenceGateBlock orange_gate = foodblockcompatregistry.ORANGE_GATE.get();
          ResourceLocation orange_gate_texture = modLoc("block/orange_block");
          fenceGateBlock(orange_gate, orange_gate_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
       //fence
          FenceBlock corn_fence = foodblockcompatregistry.CORN_FENCE.get();
          ResourceLocation corn_fence_texture = modLoc("block/corn_block");
          fenceBlock(corn_fence, corn_fence_texture);
       //gate
          FenceGateBlock corn_gate = foodblockcompatregistry.CORN_GATE.get();
          ResourceLocation corn_gate_texture = modLoc("block/corn_block");
          fenceGateBlock(corn_gate, corn_gate_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
       //fence
          FenceBlock onion_fence = foodblockcompatregistry.ONION_FENCE.get();
          ResourceLocation onion_fence_texture = modLoc("block/onion_block");
          fenceBlock(onion_fence, onion_fence_texture);
       //gate
          FenceGateBlock onion_gate = foodblockcompatregistry.ONION_GATE.get();
          ResourceLocation onion_gate_texture = modLoc("block/onion_block");
          fenceGateBlock(onion_gate, onion_gate_texture);
    //==============================================================================================================================================
    //|                                                          Pressure Plates                                                                   |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          PressurePlateBlock elderberry_pressure_plate = foodblockcompatregistry.ELDERBERRY_PRESSURE_PLATE.get();
          ResourceLocation elderberry_pressure_plate_texture = modLoc("block/elderberry_block");
          pressurePlateBlock(elderberry_pressure_plate, elderberry_pressure_plate_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          PressurePlateBlock juniper_pressure_plate = foodblockcompatregistry.JUNIPER_PRESSURE_PLATE.get();
          ResourceLocation juniper_pressure_plate_texture = modLoc("block/juniper_block");
          pressurePlateBlock(juniper_pressure_plate, juniper_pressure_plate_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          PressurePlateBlock cherry_pressure_plate = foodblockcompatregistry.CHERRY_PRESSURE_PLATE.get();
          ResourceLocation cherry_pressure_plate_texture = modLoc("block/cherry_block");
          pressurePlateBlock(cherry_pressure_plate, cherry_pressure_plate_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          PressurePlateBlock coconut_pressure_plate = foodblockcompatregistry.COCONUT_PRESSURE_PLATE.get();
          ResourceLocation coconut_pressure_plate_texture = modLoc("block/coconut_block");
          pressurePlateBlock(coconut_pressure_plate, coconut_pressure_plate_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          PressurePlateBlock orange_pressure_plate = foodblockcompatregistry.ORANGE_PRESSURE_PLATE.get();
          ResourceLocation orange_pressure_plate_texture = modLoc("block/orange_block");
          pressurePlateBlock(orange_pressure_plate, orange_pressure_plate_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          PressurePlateBlock corn_pressure_plate = foodblockcompatregistry.CORN_PRESSURE_PLATE.get();
          ResourceLocation corn_pressure_plate_texture = modLoc("block/corn_block");
          pressurePlateBlock(corn_pressure_plate, corn_pressure_plate_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          PressurePlateBlock onion_pressure_plate = foodblockcompatregistry.ONION_PRESSURE_PLATE.get();
          ResourceLocation onion_pressure_plate_texture = modLoc("block/onion_block");
          pressurePlateBlock(onion_pressure_plate, onion_pressure_plate_texture);
    //==============================================================================================================================================
    //|                                                               Signs                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
           StandingSignBlock elderberry_sign = foodblockcompatregistry.ELDERBERRY_STANDING_SIGN.get();
           WallSignBlock elderberry_wall_sign = foodblockcompatregistry.ELDERBERRY_WALL_SIGN.get();
           ResourceLocation elderberry_sign_texture = modLoc("block/elderberry_block");
           signBlock(elderberry_sign, elderberry_wall_sign, elderberry_sign_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
           StandingSignBlock juniper_sign = foodblockcompatregistry.JUNIPER_STANDING_SIGN.get();
           WallSignBlock juniper_wall_sign = foodblockcompatregistry.JUNIPER_WALL_SIGN.get();
           ResourceLocation juniper_sign_texture = modLoc("block/juniper_block");
           signBlock(juniper_sign, juniper_wall_sign, juniper_sign_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
           StandingSignBlock cherry_sign = foodblockcompatregistry.CHERRY_STANDING_SIGN.get();
           WallSignBlock cherry_wall_sign = foodblockcompatregistry.CHERRY_WALL_SIGN.get();
           ResourceLocation cherry_sign_texture = modLoc("block/cherry_block");
           signBlock(cherry_sign, cherry_wall_sign, cherry_sign_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
           StandingSignBlock coconut_sign = foodblockcompatregistry.COCONUT_STANDING_SIGN.get();
           WallSignBlock coconut_wall_sign = foodblockcompatregistry.COCONUT_WALL_SIGN.get();
           ResourceLocation coconut_sign_texture = modLoc("block/coconut_block");
           signBlock(coconut_sign, coconut_wall_sign, coconut_sign_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
           StandingSignBlock orange_sign = foodblockcompatregistry.ORANGE_STANDING_SIGN.get();
           WallSignBlock orange_wall_sign = foodblockcompatregistry.ORANGE_WALL_SIGN.get();
           ResourceLocation orange_sign_texture = modLoc("block/orange_block");
           signBlock(orange_sign, orange_wall_sign, orange_sign_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
           StandingSignBlock corn_sign = foodblockcompatregistry.CORN_STANDING_SIGN.get();
           WallSignBlock corn_wall_sign = foodblockcompatregistry.CORN_WALL_SIGN.get();
           ResourceLocation corn_sign_texture = modLoc("block/corn_block");
           signBlock(corn_sign, corn_wall_sign, corn_sign_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
           StandingSignBlock onion_sign = foodblockcompatregistry.ONION_STANDING_SIGN.get();
           WallSignBlock onion_wall_sign = foodblockcompatregistry.ONION_WALL_SIGN.get();
           ResourceLocation onion_sign_texture = modLoc("block/onion_block");
           signBlock(onion_sign, onion_wall_sign, onion_sign_texture);
    //==============================================================================================================================================
    //|                                                            Trap Doors                                                                      |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          TrapDoorBlock elderberry_trapdoor = foodblockcompatregistry.ELDERBERRY_TRAPDOOR.get(); 
          ResourceLocation elderberry_trapdoor_texture = modLoc("block/elderberry_block");
          trapdoorBlockWithRenderType(elderberry_trapdoor, "elderberry_trapdoor", elderberry_trapdoor_texture, false, elderberry_trapdoor_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          TrapDoorBlock juniper_trapdoor = foodblockcompatregistry.JUNIPER_TRAPDOOR.get(); 
          ResourceLocation juniper_trapdoor_texture = modLoc("block/juniper_block");
          trapdoorBlockWithRenderType(juniper_trapdoor, "juniper_trapdoor", juniper_trapdoor_texture, false, juniper_trapdoor_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          TrapDoorBlock cherry_trapdoor = foodblockcompatregistry.CHERRY_TRAPDOOR.get(); 
          ResourceLocation cherry_trapdoor_texture = modLoc("block/cherry_block");
          trapdoorBlockWithRenderType(cherry_trapdoor, "cherry_trapdoor", cherry_trapdoor_texture, false, cherry_trapdoor_texture);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          TrapDoorBlock coconut_trapdoor = foodblockcompatregistry.COCONUT_TRAPDOOR.get(); 
          ResourceLocation coconut_trapdoor_texture = modLoc("block/coconut_block");
          trapdoorBlockWithRenderType(coconut_trapdoor, "coconut_trapdoor", coconut_trapdoor_texture, false, coconut_trapdoor_texture);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          TrapDoorBlock orange_trapdoor = foodblockcompatregistry.ORANGE_TRAPDOOR.get(); 
          ResourceLocation orange_trapdoor_texture = modLoc("block/orange_block");
          trapdoorBlockWithRenderType(orange_trapdoor, "orange_trapdoor", orange_trapdoor_texture, false, orange_trapdoor_texture);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          TrapDoorBlock corn_trapdoor = foodblockcompatregistry.CORN_TRAPDOOR.get(); 
          ResourceLocation corn_trapdoor_texture = modLoc("block/corn_block");
          trapdoorBlockWithRenderType(corn_trapdoor, "corn_trapdoor", corn_trapdoor_texture, false, corn_trapdoor_texture);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          TrapDoorBlock onion_trapdoor = foodblockcompatregistry.ONION_TRAPDOOR.get(); 
          ResourceLocation onion_trapdoor_texture = modLoc("block/onion_block");
          trapdoorBlockWithRenderType(onion_trapdoor, "onion_trapdoor", onion_trapdoor_texture, false, onion_trapdoor_texture);
    //==============================================================================================================================================
    //|                                                               Lamps                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          Block elderberry_lamp = foodblockcompatregistry.ELDERBERRY_LAMP.get();
          simpleBlock(elderberry_lamp);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          Block juniper_lamp = foodblockcompatregistry.JUNIPER_LAMP.get();
          simpleBlock(juniper_lamp);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          Block cherry_lamp = foodblockcompatregistry.CHERRY_LAMP.get();
          simpleBlock(cherry_lamp);
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          Block coconut_lamp = foodblockcompatregistry.COCONUT_LAMP.get();
          simpleBlock(coconut_lamp);
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          Block orange_lamp = foodblockcompatregistry.ORANGE_LAMP.get();
          simpleBlock(orange_lamp);
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          Block corn_lamp = foodblockcompatregistry.CORN_LAMP.get();
          simpleBlock(corn_lamp);
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          Block onion_lamp = foodblockcompatregistry.ONION_LAMP.get();
          simpleBlock(onion_lamp);
    //==============================================================================================================================================
    //|                                                              Carpets                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          CarpetBlock elderberry_carpet = foodblockcompatregistry.ELDERBERRY_CARPET.get();
          ResourceLocation elderberry_carpet_texture = modLoc("block/elderberry_carpet");
          BlockModelBuilder elderberry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(elderberry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", elderberry_carpet_texture);
          simpleBlock(elderberry_carpet, new ModelFile.UncheckedModelFile(elderberry_carpet_model.getLocation()));
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          CarpetBlock juniper_carpet = foodblockcompatregistry.JUNIPER_CARPET.get();
          ResourceLocation juniper_carpet_texture = modLoc("block/juniper_carpet");
          BlockModelBuilder juniper_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(juniper_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", juniper_carpet_texture);
          simpleBlock(juniper_carpet, new ModelFile.UncheckedModelFile(juniper_carpet_model.getLocation()));
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          CarpetBlock cherry_carpet = foodblockcompatregistry.CHERRY_CARPET.get();
          ResourceLocation cherry_carpet_texture = modLoc("block/cherry_carpet");
          BlockModelBuilder cherry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(cherry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", cherry_carpet_texture);
          simpleBlock(cherry_carpet, new ModelFile.UncheckedModelFile(cherry_carpet_model.getLocation()));
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          CarpetBlock coconut_carpet = foodblockcompatregistry.COCONUT_CARPET.get();
          ResourceLocation coconut_carpet_texture = modLoc("block/coconut_carpet");
          BlockModelBuilder coconut_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(coconut_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", coconut_carpet_texture);
          simpleBlock(coconut_carpet, new ModelFile.UncheckedModelFile(coconut_carpet_model.getLocation()));
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          CarpetBlock orange_carpet = foodblockcompatregistry.ORANGE_CARPET.get();
          ResourceLocation orange_carpet_texture = modLoc("block/orange_carpet");
          BlockModelBuilder orange_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(orange_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", orange_carpet_texture);
          simpleBlock(orange_carpet, new ModelFile.UncheckedModelFile(orange_carpet_model.getLocation()));
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          CarpetBlock corn_carpet = foodblockcompatregistry.CORN_CARPET.get();
          ResourceLocation corn_carpet_texture = modLoc("block/corn_carpet");
          BlockModelBuilder corn_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(corn_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", corn_carpet_texture);
          simpleBlock(corn_carpet, new ModelFile.UncheckedModelFile(corn_carpet_model.getLocation()));
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          CarpetBlock onion_carpet = foodblockcompatregistry.ONION_CARPET.get();
          ResourceLocation onion_carpet_texture = modLoc("block/onion_carpet");
          BlockModelBuilder onion_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(onion_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", onion_carpet_texture);
          simpleBlock(onion_carpet, new ModelFile.UncheckedModelFile(onion_carpet_model.getLocation()));
    //==============================================================================================================================================
    //|                                                             Lanterns                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
         //regular
          LanternBlock elderberry_lantern = foodblockcompatregistry.ELDERBERRY_LANTERN.get();
          ResourceLocation elderberry_lantern_texture = modLoc("block/elderberry_lantern");
  
          BlockModelBuilder elderberry_lantern_model = models()
              .withExistingParent("elderberry_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", elderberry_lantern_texture);
  
          BlockModelBuilder hanging_elderberry_lantern_model = models()
              .withExistingParent("elderberry_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", elderberry_lantern_texture);
  
          getVariantBuilder(elderberry_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_elderberry_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(elderberry_lantern_model).addModel();
         //soul
         LanternBlock elderberry_soul_lantern = foodblockcompatregistry.ELDERBERRY_SOUL_LANTERN.get();
         ResourceLocation elderberry_soul_lantern_texture = modLoc("block/elderberry_soul_lantern");
 
         BlockModelBuilder elderberry_soul_lantern_model = models()
             .withExistingParent("elderberry_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", elderberry_soul_lantern_texture);
 
         BlockModelBuilder hanging_elderberry_soul_lantern_model = models()
             .withExistingParent("elderberry_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", elderberry_soul_lantern_texture);
 
         getVariantBuilder(elderberry_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_elderberry_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(elderberry_soul_lantern_model).addModel();
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
         //regular
          LanternBlock juniper_lantern = foodblockcompatregistry.JUNIPER_LANTERN.get();
          ResourceLocation juniper_lantern_texture = modLoc("block/juniper_lantern");
  
          BlockModelBuilder juniper_lantern_model = models()
              .withExistingParent("juniper_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", juniper_lantern_texture);
  
          BlockModelBuilder hanging_juniper_lantern_model = models()
              .withExistingParent("juniper_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", juniper_lantern_texture);
  
          getVariantBuilder(juniper_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_juniper_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(juniper_lantern_model).addModel();
         //soul
         LanternBlock juniper_soul_lantern = foodblockcompatregistry.JUNIPER_SOUL_LANTERN.get();
         ResourceLocation juniper_soul_lantern_texture = modLoc("block/juniper_soul_lantern");
 
         BlockModelBuilder juniper_soul_lantern_model = models()
             .withExistingParent("juniper_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", juniper_soul_lantern_texture);
 
         BlockModelBuilder hanging_juniper_soul_lantern_model = models()
             .withExistingParent("juniper_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", juniper_soul_lantern_texture);
 
         getVariantBuilder(juniper_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_juniper_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(juniper_soul_lantern_model).addModel();
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
         //regular
          LanternBlock cherry_lantern = foodblockcompatregistry.CHERRY_LANTERN.get();
          ResourceLocation cherry_lantern_texture = modLoc("block/cherry_lantern");
  
          BlockModelBuilder cherry_lantern_model = models()
              .withExistingParent("cherry_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", cherry_lantern_texture);
  
          BlockModelBuilder hanging_cherry_lantern_model = models()
              .withExistingParent("cherry_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", cherry_lantern_texture);
  
          getVariantBuilder(cherry_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_cherry_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(cherry_lantern_model).addModel();
         //soul
         LanternBlock cherry_soul_lantern = foodblockcompatregistry.CHERRY_SOUL_LANTERN.get();
         ResourceLocation cherry_soul_lantern_texture = modLoc("block/cherry_soul_lantern");
 
         BlockModelBuilder cherry_soul_lantern_model = models()
             .withExistingParent("cherry_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", cherry_soul_lantern_texture);
 
         BlockModelBuilder hanging_cherry_soul_lantern_model = models()
             .withExistingParent("cherry_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", cherry_soul_lantern_texture);
 
         getVariantBuilder(cherry_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_cherry_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(cherry_soul_lantern_model).addModel();
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
         //regular
          LanternBlock coconut_lantern = foodblockcompatregistry.COCONUT_LANTERN.get();
          ResourceLocation coconut_lantern_texture = modLoc("block/coconut_lantern");
  
          BlockModelBuilder coconut_lantern_model = models()
              .withExistingParent("coconut_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", coconut_lantern_texture);
  
          BlockModelBuilder hanging_coconut_lantern_model = models()
              .withExistingParent("coconut_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", coconut_lantern_texture);
  
          getVariantBuilder(coconut_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_coconut_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(coconut_lantern_model).addModel();
         //soul
         LanternBlock coconut_soul_lantern = foodblockcompatregistry.COCONUT_SOUL_LANTERN.get();
         ResourceLocation coconut_soul_lantern_texture = modLoc("block/coconut_soul_lantern");
 
         BlockModelBuilder coconut_soul_lantern_model = models()
             .withExistingParent("coconut_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", coconut_soul_lantern_texture);
 
         BlockModelBuilder hanging_coconut_soul_lantern_model = models()
             .withExistingParent("coconut_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", coconut_soul_lantern_texture);
 
         getVariantBuilder(coconut_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_coconut_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(coconut_soul_lantern_model).addModel();
     //------------------------------------------------------------orange-----------------------------------------------------------------------
         //regular
          LanternBlock orange_lantern = foodblockcompatregistry.ORANGE_LANTERN.get();
          ResourceLocation orange_lantern_texture = modLoc("block/orange_lantern");
  
          BlockModelBuilder orange_lantern_model = models()
              .withExistingParent("orange_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", orange_lantern_texture);
  
          BlockModelBuilder hanging_orange_lantern_model = models()
              .withExistingParent("orange_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", orange_lantern_texture);
  
          getVariantBuilder(orange_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_orange_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(orange_lantern_model).addModel();
         //soul
         LanternBlock orange_soul_lantern = foodblockcompatregistry.ORANGE_SOUL_LANTERN.get();
         ResourceLocation orange_soul_lantern_texture = modLoc("block/orange_soul_lantern");
 
         BlockModelBuilder orange_soul_lantern_model = models()
             .withExistingParent("orange_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", orange_soul_lantern_texture);
 
         BlockModelBuilder hanging_orange_soul_lantern_model = models()
             .withExistingParent("orange_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", orange_soul_lantern_texture);
 
         getVariantBuilder(orange_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_orange_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(orange_soul_lantern_model).addModel();
     //------------------------------------------------------------corn-----------------------------------------------------------------------
         //regular
          LanternBlock corn_lantern = foodblockcompatregistry.CORN_LANTERN.get();
          ResourceLocation corn_lantern_texture = modLoc("block/corn_lantern");
  
          BlockModelBuilder corn_lantern_model = models()
              .withExistingParent("corn_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", corn_lantern_texture);
  
          BlockModelBuilder hanging_corn_lantern_model = models()
              .withExistingParent("corn_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", corn_lantern_texture);
  
          getVariantBuilder(corn_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_corn_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(corn_lantern_model).addModel();
         //soul
         LanternBlock corn_soul_lantern = foodblockcompatregistry.CORN_SOUL_LANTERN.get();
         ResourceLocation corn_soul_lantern_texture = modLoc("block/corn_soul_lantern");
 
         BlockModelBuilder corn_soul_lantern_model = models()
             .withExistingParent("corn_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", corn_soul_lantern_texture);
 
         BlockModelBuilder hanging_corn_soul_lantern_model = models()
             .withExistingParent("corn_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", corn_soul_lantern_texture);
 
         getVariantBuilder(corn_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_corn_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(corn_soul_lantern_model).addModel();
     //------------------------------------------------------------onion-----------------------------------------------------------------------
         //regular
          LanternBlock onion_lantern = foodblockcompatregistry.ONION_LANTERN.get();
          ResourceLocation onion_lantern_texture = modLoc("block/onion_lantern");
  
          BlockModelBuilder onion_lantern_model = models()
              .withExistingParent("onion_lantern", mcLoc("block/lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", onion_lantern_texture);
  
          BlockModelBuilder hanging_onion_lantern_model = models()
              .withExistingParent("onion_hanging_lantern", mcLoc("block/template_hanging_lantern"))
              .renderType("cutout_mipped_all")
              .texture("lantern", onion_lantern_texture);
  
          getVariantBuilder(onion_lantern)
              .partialState().with(LanternBlock.HANGING, true)
              .modelForState().modelFile(hanging_onion_lantern_model).addModel()
              .partialState().with(LanternBlock.HANGING, false)
              .modelForState().modelFile(onion_lantern_model).addModel();
         //soul
         LanternBlock onion_soul_lantern = foodblockcompatregistry.ONION_SOUL_LANTERN.get();
         ResourceLocation onion_soul_lantern_texture = modLoc("block/onion_soul_lantern");
 
         BlockModelBuilder onion_soul_lantern_model = models()
             .withExistingParent("onion_soul_lantern", mcLoc("block/lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", onion_soul_lantern_texture);
 
         BlockModelBuilder hanging_onion_soul_lantern_model = models()
             .withExistingParent("onion_soul_hanging_lantern", mcLoc("block/template_hanging_lantern"))
             .renderType("cutout_mipped_all")
             .texture("lantern", onion_soul_lantern_texture);
 
         getVariantBuilder(onion_soul_lantern)
             .partialState().with(LanternBlock.HANGING, true)
             .modelForState().modelFile(hanging_onion_soul_lantern_model).addModel()
             .partialState().with(LanternBlock.HANGING, false)
             .modelForState().modelFile(onion_soul_lantern_model).addModel();
    //==============================================================================================================================================
    //|                                                              Chains                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
         ChainBlock elderberry_chain = foodblockcompatregistry.ELDERBERRY_CHAIN.get();
         ResourceLocation elderberry_chain_texture = modLoc("block/elderberry_chain");
         BlockModelBuilder elderberry_chain_model = models()
          .withExistingParent("elderberry_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", elderberry_chain_texture)
          .texture("particle", elderberry_chain_texture);

          getVariantBuilder(elderberry_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(elderberry_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(elderberry_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(elderberry_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
         ChainBlock juniper_chain = foodblockcompatregistry.JUNIPER_CHAIN.get();
         ResourceLocation juniper_chain_texture = modLoc("block/juniper_chain");
         BlockModelBuilder juniper_chain_model = models()
          .withExistingParent("juniper_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", juniper_chain_texture)
          .texture("particle", juniper_chain_texture);

          getVariantBuilder(juniper_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(juniper_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(juniper_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(juniper_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
         ChainBlock cherry_chain = foodblockcompatregistry.CHERRY_CHAIN.get();
         ResourceLocation cherry_chain_texture = modLoc("block/cherry_chain");
         BlockModelBuilder cherry_chain_model = models()
          .withExistingParent("cherry_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", cherry_chain_texture)
          .texture("particle", cherry_chain_texture);

          getVariantBuilder(cherry_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(cherry_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(cherry_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(cherry_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
         ChainBlock coconut_chain = foodblockcompatregistry.COCONUT_CHAIN.get();
         ResourceLocation coconut_chain_texture = modLoc("block/coconut_chain");
         BlockModelBuilder coconut_chain_model = models()
          .withExistingParent("coconut_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", coconut_chain_texture)
          .texture("particle", coconut_chain_texture);

          getVariantBuilder(coconut_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(coconut_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(coconut_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(coconut_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------orange-----------------------------------------------------------------------
         ChainBlock orange_chain = foodblockcompatregistry.ORANGE_CHAIN.get();
         ResourceLocation orange_chain_texture = modLoc("block/orange_chain");
         BlockModelBuilder orange_chain_model = models()
          .withExistingParent("orange_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", orange_chain_texture)
          .texture("particle", orange_chain_texture);

          getVariantBuilder(orange_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(orange_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(orange_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(orange_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------corn-----------------------------------------------------------------------
         ChainBlock corn_chain = foodblockcompatregistry.CORN_CHAIN.get();
         ResourceLocation corn_chain_texture = modLoc("block/corn_chain");
         BlockModelBuilder corn_chain_model = models()
          .withExistingParent("corn_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", corn_chain_texture)
          .texture("particle", corn_chain_texture);

          getVariantBuilder(corn_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(corn_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(corn_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(corn_chain_model).rotationX(90).addModel(); 
     //------------------------------------------------------------onion-----------------------------------------------------------------------
         ChainBlock onion_chain = foodblockcompatregistry.ONION_CHAIN.get();
         ResourceLocation onion_chain_texture = modLoc("block/onion_chain");
         BlockModelBuilder onion_chain_model = models()
          .withExistingParent("onion_chain", mcLoc("block/chain"))
          .renderType("cutout_mipped_all")
          .texture("all", onion_chain_texture)
          .texture("particle", onion_chain_texture);

          getVariantBuilder(onion_chain)
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y)
          .modelForState().modelFile(onion_chain_model).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.X)
          .modelForState().modelFile(onion_chain_model).rotationX(90).rotationY(90).addModel()
          .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z)
          .modelForState().modelFile(onion_chain_model).rotationX(90).addModel(); 
    //==============================================================================================================================================
    //|                                                             Ladders                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          LadderBlock elderberryladder = foodblockcompatregistry.ELDERBERRY_LADDER.get();

          getVariantBuilder(elderberryladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/elderberry_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          LadderBlock juniperladder = foodblockcompatregistry.JUNIPER_LADDER.get();

          getVariantBuilder(juniperladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/juniper_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          LadderBlock cherryladder = foodblockcompatregistry.CHERRY_LADDER.get();

          getVariantBuilder(cherryladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/cherry_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          LadderBlock coconutladder = foodblockcompatregistry.COCONUT_LADDER.get();

          getVariantBuilder(coconutladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/coconut_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          LadderBlock orangeladder = foodblockcompatregistry.ORANGE_LADDER.get();

          getVariantBuilder(orangeladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/orange_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          LadderBlock cornladder = foodblockcompatregistry.CORN_LADDER.get();

          getVariantBuilder(cornladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/corn_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          LadderBlock onionladder = foodblockcompatregistry.ONION_LADDER.get();

          getVariantBuilder(onionladder)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/onion_ladder");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
    //==============================================================================================================================================
    //|                                                              Tables                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          HorizontalDirectionalBlock elderberrytable = foodblockcompatregistry.ELDERBERRY_TABLE.get();

          getVariantBuilder(elderberrytable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/elderberry_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          HorizontalDirectionalBlock junipertable = foodblockcompatregistry.JUNIPER_TABLE.get();

          getVariantBuilder(junipertable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/juniper_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          HorizontalDirectionalBlock cherrytable = foodblockcompatregistry.CHERRY_TABLE.get();

          getVariantBuilder(cherrytable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/cherry_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          HorizontalDirectionalBlock coconuttable = foodblockcompatregistry.COCONUT_TABLE.get();

          getVariantBuilder(coconuttable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/coconut_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          HorizontalDirectionalBlock orangetable = foodblockcompatregistry.ORANGE_TABLE.get();

          getVariantBuilder(orangetable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/orange_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          HorizontalDirectionalBlock corntable = foodblockcompatregistry.CORN_TABLE.get();

          getVariantBuilder(corntable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/corn_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          HorizontalDirectionalBlock oniontable = foodblockcompatregistry.ONION_TABLE.get();

          getVariantBuilder(oniontable)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/onion_table");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
    //==============================================================================================================================================
    //|                                                              Torches                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
       //regular
        TorchBlock elderberry_torch = foodblockcompatregistry.ELDERBERRY_TORCH.get();
        ResourceLocation elderberry_torch_texture = modLoc("block/elderberry_torch");
        BlockModelBuilder elderberry_torch_model = models()
        .withExistingParent("elderberry_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_torch_texture)
        .texture("particle", elderberry_torch_texture);

        simpleBlock(elderberry_torch, elderberry_torch_model);

        TorchBlock elderberry_wall_torch = foodblockcompatregistry.ELDERBERRY_WALL_TORCH.get();
        BlockModelBuilder elderberry_wall_torch_model = models()
        .withExistingParent("elderberry_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_torch_texture)
        .texture("particle", elderberry_torch_texture);
        getVariantBuilder(elderberry_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("elderberry_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", elderberry_torch_texture)
                    .texture("particle", elderberry_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock elderberry_redstone_torch = foodblockcompatregistry.ELDERBERRY_REDSTONE_TORCH.get();
        ResourceLocation elderberry_redstone_torch_texture = modLoc("block/elderberry_redstone_torch");
        BlockModelBuilder elderberry_redstone_torch_model = models()
        .withExistingParent("elderberry_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_redstone_torch_texture)
        .texture("particle", elderberry_redstone_torch_texture);
        

        simpleBlock(elderberry_redstone_torch, elderberry_redstone_torch_model);

        ResourceLocation elderberry_redstone_wall_torch_texture = modLoc("block/elderberry_redstone_torch");

        RedstoneTorchBlock elderberry_redstone_wall_torch = foodblockcompatregistry.ELDERBERRY_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder elderberry_redstone_wall_torch_model = models()
        .withExistingParent("elderberry_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_redstone_wall_torch_texture)
        .texture("particle", elderberry_redstone_wall_torch_texture);
        getVariantBuilder(elderberry_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("elderberry_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", elderberry_redstone_wall_torch_texture)
                    .texture("particle", elderberry_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock elderberry_soul_torch = foodblockcompatregistry.ELDERBERRY_SOUL_TORCH.get();
        ResourceLocation elderberry_soul_torch_texture = modLoc("block/elderberry_soul_torch");
        BlockModelBuilder elderberry_soul_torch_model = models()
        .withExistingParent("elderberry_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_soul_torch_texture)
        .texture("particle", elderberry_soul_torch_texture);
        

        simpleBlock(elderberry_soul_torch, elderberry_soul_torch_model);

        ResourceLocation elderberry_soul_wall_torch_texture = modLoc("block/elderberry_soul_torch");
        TorchBlock elderberry_soul_wall_torch = foodblockcompatregistry.ELDERBERRY_SOUL_WALL_TORCH.get();
        BlockModelBuilder elderberry_soul_wall_torch_model = models()
        .withExistingParent("elderberry_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_soul_wall_torch_texture)
        .texture("particle", elderberry_soul_wall_torch_texture);
        getVariantBuilder(elderberry_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("elderberry_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", elderberry_soul_wall_torch_texture)
                    .texture("particle", elderberry_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
       //regular
        TorchBlock juniper_torch = foodblockcompatregistry.JUNIPER_TORCH.get();
        ResourceLocation juniper_torch_texture = modLoc("block/juniper_torch");
        BlockModelBuilder juniper_torch_model = models()
        .withExistingParent("juniper_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_torch_texture)
        .texture("particle", juniper_torch_texture);

        simpleBlock(juniper_torch, juniper_torch_model);

        TorchBlock juniper_wall_torch = foodblockcompatregistry.JUNIPER_WALL_TORCH.get();
        BlockModelBuilder juniper_wall_torch_model = models()
        .withExistingParent("juniper_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_torch_texture)
        .texture("particle", juniper_torch_texture);
        getVariantBuilder(juniper_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("juniper_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", juniper_torch_texture)
                    .texture("particle", juniper_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock juniper_redstone_torch = foodblockcompatregistry.JUNIPER_REDSTONE_TORCH.get();
        ResourceLocation juniper_redstone_torch_texture = modLoc("block/juniper_redstone_torch");
        BlockModelBuilder juniper_redstone_torch_model = models()
        .withExistingParent("juniper_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_redstone_torch_texture)
        .texture("particle", juniper_redstone_torch_texture);
        

        simpleBlock(juniper_redstone_torch, juniper_redstone_torch_model);

        ResourceLocation juniper_redstone_wall_torch_texture = modLoc("block/juniper_redstone_torch");

        RedstoneTorchBlock juniper_redstone_wall_torch = foodblockcompatregistry.JUNIPER_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder juniper_redstone_wall_torch_model = models()
        .withExistingParent("juniper_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_redstone_wall_torch_texture)
        .texture("particle", juniper_redstone_wall_torch_texture);
        getVariantBuilder(juniper_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("juniper_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", juniper_redstone_wall_torch_texture)
                    .texture("particle", juniper_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock juniper_soul_torch = foodblockcompatregistry.JUNIPER_SOUL_TORCH.get();
        ResourceLocation juniper_soul_torch_texture = modLoc("block/juniper_soul_torch");
        BlockModelBuilder juniper_soul_torch_model = models()
        .withExistingParent("juniper_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_soul_torch_texture)
        .texture("particle", juniper_soul_torch_texture);
        

        simpleBlock(juniper_soul_torch, juniper_soul_torch_model);

        ResourceLocation juniper_soul_wall_torch_texture = modLoc("block/juniper_soul_torch");
        TorchBlock juniper_soul_wall_torch = foodblockcompatregistry.JUNIPER_SOUL_WALL_TORCH.get();
        BlockModelBuilder juniper_soul_wall_torch_model = models()
        .withExistingParent("juniper_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", juniper_soul_wall_torch_texture)
        .texture("particle", juniper_soul_wall_torch_texture);
        getVariantBuilder(juniper_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("juniper_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", juniper_soul_wall_torch_texture)
                    .texture("particle", juniper_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
       //regular
        TorchBlock cherry_torch = foodblockcompatregistry.CHERRY_TORCH.get();
        ResourceLocation cherry_torch_texture = modLoc("block/cherry_torch");
        BlockModelBuilder cherry_torch_model = models()
        .withExistingParent("cherry_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_torch_texture)
        .texture("particle", cherry_torch_texture);

        simpleBlock(cherry_torch, cherry_torch_model);

        TorchBlock cherry_wall_torch = foodblockcompatregistry.CHERRY_WALL_TORCH.get();
        BlockModelBuilder cherry_wall_torch_model = models()
        .withExistingParent("cherry_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_torch_texture)
        .texture("particle", cherry_torch_texture);
        getVariantBuilder(cherry_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("cherry_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", cherry_torch_texture)
                    .texture("particle", cherry_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock cherry_redstone_torch = foodblockcompatregistry.CHERRY_REDSTONE_TORCH.get();
        ResourceLocation cherry_redstone_torch_texture = modLoc("block/cherry_redstone_torch");
        BlockModelBuilder cherry_redstone_torch_model = models()
        .withExistingParent("cherry_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_redstone_torch_texture)
        .texture("particle", cherry_redstone_torch_texture);
        

        simpleBlock(cherry_redstone_torch, cherry_redstone_torch_model);

        ResourceLocation cherry_redstone_wall_torch_texture = modLoc("block/cherry_redstone_torch");

        RedstoneTorchBlock cherry_redstone_wall_torch = foodblockcompatregistry.CHERRY_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder cherry_redstone_wall_torch_model = models()
        .withExistingParent("cherry_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_redstone_wall_torch_texture)
        .texture("particle", cherry_redstone_wall_torch_texture);
        getVariantBuilder(cherry_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("cherry_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", cherry_redstone_wall_torch_texture)
                    .texture("particle", cherry_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock cherry_soul_torch = foodblockcompatregistry.CHERRY_SOUL_TORCH.get();
        ResourceLocation cherry_soul_torch_texture = modLoc("block/cherry_soul_torch");
        BlockModelBuilder cherry_soul_torch_model = models()
        .withExistingParent("cherry_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_soul_torch_texture)
        .texture("particle", cherry_soul_torch_texture);
        

        simpleBlock(cherry_soul_torch, cherry_soul_torch_model);

        ResourceLocation cherry_soul_wall_torch_texture = modLoc("block/cherry_soul_torch");
        TorchBlock cherry_soul_wall_torch = foodblockcompatregistry.CHERRY_SOUL_WALL_TORCH.get();
        BlockModelBuilder cherry_soul_wall_torch_model = models()
        .withExistingParent("cherry_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_soul_wall_torch_texture)
        .texture("particle", cherry_soul_wall_torch_texture);
        getVariantBuilder(cherry_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("cherry_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", cherry_soul_wall_torch_texture)
                    .texture("particle", cherry_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
       //regular
        TorchBlock coconut_torch = foodblockcompatregistry.COCONUT_TORCH.get();
        ResourceLocation coconut_torch_texture = modLoc("block/coconut_torch");
        BlockModelBuilder coconut_torch_model = models()
        .withExistingParent("coconut_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_torch_texture)
        .texture("particle", coconut_torch_texture);

        simpleBlock(coconut_torch, coconut_torch_model);

        TorchBlock coconut_wall_torch = foodblockcompatregistry.COCONUT_WALL_TORCH.get();
        BlockModelBuilder coconut_wall_torch_model = models()
        .withExistingParent("coconut_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_torch_texture)
        .texture("particle", coconut_torch_texture);
        getVariantBuilder(coconut_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("coconut_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", coconut_torch_texture)
                    .texture("particle", coconut_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock coconut_redstone_torch = foodblockcompatregistry.COCONUT_REDSTONE_TORCH.get();
        ResourceLocation coconut_redstone_torch_texture = modLoc("block/coconut_redstone_torch");
        BlockModelBuilder coconut_redstone_torch_model = models()
        .withExistingParent("coconut_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_redstone_torch_texture)
        .texture("particle", coconut_redstone_torch_texture);
        

        simpleBlock(coconut_redstone_torch, coconut_redstone_torch_model);

        ResourceLocation coconut_redstone_wall_torch_texture = modLoc("block/coconut_redstone_torch");

        RedstoneTorchBlock coconut_redstone_wall_torch = foodblockcompatregistry.COCONUT_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder coconut_redstone_wall_torch_model = models()
        .withExistingParent("coconut_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_redstone_wall_torch_texture)
        .texture("particle", coconut_redstone_wall_torch_texture);
        getVariantBuilder(coconut_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("coconut_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", coconut_redstone_wall_torch_texture)
                    .texture("particle", coconut_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock coconut_soul_torch = foodblockcompatregistry.COCONUT_SOUL_TORCH.get();
        ResourceLocation coconut_soul_torch_texture = modLoc("block/coconut_soul_torch");
        BlockModelBuilder coconut_soul_torch_model = models()
        .withExistingParent("coconut_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_soul_torch_texture)
        .texture("particle", coconut_soul_torch_texture);
        

        simpleBlock(coconut_soul_torch, coconut_soul_torch_model);

        ResourceLocation coconut_soul_wall_torch_texture = modLoc("block/coconut_soul_torch");
        TorchBlock coconut_soul_wall_torch = foodblockcompatregistry.COCONUT_SOUL_WALL_TORCH.get();
        BlockModelBuilder coconut_soul_wall_torch_model = models()
        .withExistingParent("coconut_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", coconut_soul_wall_torch_texture)
        .texture("particle", coconut_soul_wall_torch_texture);
        getVariantBuilder(coconut_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("coconut_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", coconut_soul_wall_torch_texture)
                    .texture("particle", coconut_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
       //regular
        TorchBlock orange_torch = foodblockcompatregistry.ORANGE_TORCH.get();
        ResourceLocation orange_torch_texture = modLoc("block/orange_torch");
        BlockModelBuilder orange_torch_model = models()
        .withExistingParent("orange_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_torch_texture)
        .texture("particle", orange_torch_texture);

        simpleBlock(orange_torch, orange_torch_model);

        TorchBlock orange_wall_torch = foodblockcompatregistry.ORANGE_WALL_TORCH.get();
        BlockModelBuilder orange_wall_torch_model = models()
        .withExistingParent("orange_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_torch_texture)
        .texture("particle", orange_torch_texture);
        getVariantBuilder(orange_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("orange_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", orange_torch_texture)
                    .texture("particle", orange_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock orange_redstone_torch = foodblockcompatregistry.ORANGE_REDSTONE_TORCH.get();
        ResourceLocation orange_redstone_torch_texture = modLoc("block/orange_redstone_torch");
        BlockModelBuilder orange_redstone_torch_model = models()
        .withExistingParent("orange_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_redstone_torch_texture)
        .texture("particle", orange_redstone_torch_texture);
        

        simpleBlock(orange_redstone_torch, orange_redstone_torch_model);

        ResourceLocation orange_redstone_wall_torch_texture = modLoc("block/orange_redstone_torch");

        RedstoneTorchBlock orange_redstone_wall_torch = foodblockcompatregistry.ORANGE_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder orange_redstone_wall_torch_model = models()
        .withExistingParent("orange_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_redstone_wall_torch_texture)
        .texture("particle", orange_redstone_wall_torch_texture);
        getVariantBuilder(orange_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("orange_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", orange_redstone_wall_torch_texture)
                    .texture("particle", orange_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock orange_soul_torch = foodblockcompatregistry.ORANGE_SOUL_TORCH.get();
        ResourceLocation orange_soul_torch_texture = modLoc("block/orange_soul_torch");
        BlockModelBuilder orange_soul_torch_model = models()
        .withExistingParent("orange_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_soul_torch_texture)
        .texture("particle", orange_soul_torch_texture);
        

        simpleBlock(orange_soul_torch, orange_soul_torch_model);

        ResourceLocation orange_soul_wall_torch_texture = modLoc("block/orange_soul_torch");
        TorchBlock orange_soul_wall_torch = foodblockcompatregistry.ORANGE_SOUL_WALL_TORCH.get();
        BlockModelBuilder orange_soul_wall_torch_model = models()
        .withExistingParent("orange_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", orange_soul_wall_torch_texture)
        .texture("particle", orange_soul_wall_torch_texture);
        getVariantBuilder(orange_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("orange_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", orange_soul_wall_torch_texture)
                    .texture("particle", orange_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
       //regular
        TorchBlock corn_torch = foodblockcompatregistry.CORN_TORCH.get();
        ResourceLocation corn_torch_texture = modLoc("block/corn_torch");
        BlockModelBuilder corn_torch_model = models()
        .withExistingParent("corn_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_torch_texture)
        .texture("particle", corn_torch_texture);

        simpleBlock(corn_torch, corn_torch_model);

        TorchBlock corn_wall_torch = foodblockcompatregistry.CORN_WALL_TORCH.get();
        BlockModelBuilder corn_wall_torch_model = models()
        .withExistingParent("corn_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_torch_texture)
        .texture("particle", corn_torch_texture);
        getVariantBuilder(corn_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("corn_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", corn_torch_texture)
                    .texture("particle", corn_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock corn_redstone_torch = foodblockcompatregistry.CORN_REDSTONE_TORCH.get();
        ResourceLocation corn_redstone_torch_texture = modLoc("block/corn_redstone_torch");
        BlockModelBuilder corn_redstone_torch_model = models()
        .withExistingParent("corn_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_redstone_torch_texture)
        .texture("particle", corn_redstone_torch_texture);
        

        simpleBlock(corn_redstone_torch, corn_redstone_torch_model);

        ResourceLocation corn_redstone_wall_torch_texture = modLoc("block/corn_redstone_torch");

        RedstoneTorchBlock corn_redstone_wall_torch = foodblockcompatregistry.CORN_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder corn_redstone_wall_torch_model = models()
        .withExistingParent("corn_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_redstone_wall_torch_texture)
        .texture("particle", corn_redstone_wall_torch_texture);
        getVariantBuilder(corn_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("corn_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", corn_redstone_wall_torch_texture)
                    .texture("particle", corn_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock corn_soul_torch = foodblockcompatregistry.CORN_SOUL_TORCH.get();
        ResourceLocation corn_soul_torch_texture = modLoc("block/corn_soul_torch");
        BlockModelBuilder corn_soul_torch_model = models()
        .withExistingParent("corn_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_soul_torch_texture)
        .texture("particle", corn_soul_torch_texture);
        

        simpleBlock(corn_soul_torch, corn_soul_torch_model);

        ResourceLocation corn_soul_wall_torch_texture = modLoc("block/corn_soul_torch");
        TorchBlock corn_soul_wall_torch = foodblockcompatregistry.CORN_SOUL_WALL_TORCH.get();
        BlockModelBuilder corn_soul_wall_torch_model = models()
        .withExistingParent("corn_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", corn_soul_wall_torch_texture)
        .texture("particle", corn_soul_wall_torch_texture);
        getVariantBuilder(corn_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("corn_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", corn_soul_wall_torch_texture)
                    .texture("particle", corn_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
       //regular
        TorchBlock onion_torch = foodblockcompatregistry.ONION_TORCH.get();
        ResourceLocation onion_torch_texture = modLoc("block/onion_torch");
        BlockModelBuilder onion_torch_model = models()
        .withExistingParent("onion_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_torch_texture)
        .texture("particle", onion_torch_texture);

        simpleBlock(onion_torch, onion_torch_model);

        TorchBlock onion_wall_torch = foodblockcompatregistry.ONION_WALL_TORCH.get();
        BlockModelBuilder onion_wall_torch_model = models()
        .withExistingParent("onion_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_torch_texture)
        .texture("particle", onion_torch_texture);
        getVariantBuilder(onion_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("onion_wall_torch", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", onion_torch_texture)
                    .texture("particle", onion_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //redstone
        RedstoneTorchBlock onion_redstone_torch = foodblockcompatregistry.ONION_REDSTONE_TORCH.get();
        ResourceLocation onion_redstone_torch_texture = modLoc("block/onion_redstone_torch");
        BlockModelBuilder onion_redstone_torch_model = models()
        .withExistingParent("onion_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_redstone_torch_texture)
        .texture("particle", onion_redstone_torch_texture);
        

        simpleBlock(onion_redstone_torch, onion_redstone_torch_model);

        ResourceLocation onion_redstone_wall_torch_texture = modLoc("block/onion_redstone_torch");

        RedstoneTorchBlock onion_redstone_wall_torch = foodblockcompatregistry.ONION_REDSTONE_WALL_TORCH.get();
        BlockModelBuilder onion_redstone_wall_torch_model = models()
        .withExistingParent("onion_redstone_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_redstone_wall_torch_texture)
        .texture("particle", onion_redstone_wall_torch_texture);
        getVariantBuilder(onion_redstone_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("onion_redstone_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", onion_redstone_wall_torch_texture)
                    .texture("particle", onion_redstone_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });

       //soul
        TorchBlock onion_soul_torch = foodblockcompatregistry.ONION_SOUL_TORCH.get();
        ResourceLocation onion_soul_torch_texture = modLoc("block/onion_soul_torch");
        BlockModelBuilder onion_soul_torch_model = models()
        .withExistingParent("onion_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_soul_torch_texture)
        .texture("particle", onion_soul_torch_texture);
        

        simpleBlock(onion_soul_torch, onion_soul_torch_model);

        ResourceLocation onion_soul_wall_torch_texture = modLoc("block/onion_soul_torch");
        TorchBlock onion_soul_wall_torch = foodblockcompatregistry.ONION_SOUL_WALL_TORCH.get();
        BlockModelBuilder onion_soul_wall_torch_model = models()
        .withExistingParent("onion_soul_wall_torch", mcLoc("block/wall_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", onion_soul_wall_torch_texture)
        .texture("particle", onion_soul_wall_torch_texture);
        getVariantBuilder(onion_soul_wall_torch)
        .forAllStates(state -> {
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int rotation = switch (facing) {
                case NORTH -> 270;
                case EAST -> 0;
                case SOUTH -> 90;
                case WEST -> 180;
                default -> 270;
            };

            return ConfiguredModel.builder()
                .modelFile(models().withExistingParent("onion_soul_wall_torch_model", mcLoc("block/wall_torch"))
                    .renderType("cutout_mipped_all")
                    .texture("torch", onion_soul_wall_torch_texture)
                    .texture("particle", onion_soul_wall_torch_texture))
                .rotationY(rotation)
                .build();
            });
    //==============================================================================================================================================
    //|                                                             Furnaces                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          FurnaceBlock elderberry_furnace = foodblockcompatregistry.ELDERBERRY_FURNACE.get();
          ResourceLocation elderberry_furnace_unlit_texture = modLoc("block/elderberry_furnace");
          ResourceLocation elderberry_furnace_lit_texture = modLoc("block/elderberry_furnace_lit");
          ResourceLocation elderberry_furnace_side = modLoc("block/elderberry_block");
          
          // Define the model for the unlit state
          BlockModelBuilder elderberry_furnace_model_unlit = models()
              .withExistingParent("elderberry_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", elderberry_furnace_side)
              .texture("top", elderberry_furnace_side)
              .texture("front", elderberry_furnace_unlit_texture)
              .texture("particle", elderberry_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder elderberry_furnace_model_lit = models()
              .withExistingParent("elderberry_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", elderberry_furnace_side)
              .texture("top", elderberry_furnace_side)
              .texture("front", elderberry_furnace_lit_texture)
              .texture("particle", elderberry_furnace_side);
          
          // Configure variants for the elderberry_furnace block
          getVariantBuilder(elderberry_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/elderberry_furnace_model_lit") : modLoc("block/elderberry_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          FurnaceBlock juniper_furnace = foodblockcompatregistry.JUNIPER_FURNACE.get();
          ResourceLocation juniper_furnace_unlit_texture = modLoc("block/juniper_furnace");
          ResourceLocation juniper_furnace_lit_texture = modLoc("block/juniper_furnace_lit");
          ResourceLocation juniper_furnace_side = modLoc("block/juniper_block");
          
          // Define the model for the unlit state
          BlockModelBuilder juniper_furnace_model_unlit = models()
              .withExistingParent("juniper_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", juniper_furnace_side)
              .texture("top", juniper_furnace_side)
              .texture("front", juniper_furnace_unlit_texture)
              .texture("particle", juniper_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder juniper_furnace_model_lit = models()
              .withExistingParent("juniper_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", juniper_furnace_side)
              .texture("top", juniper_furnace_side)
              .texture("front", juniper_furnace_lit_texture)
              .texture("particle", juniper_furnace_side);
          
          // Configure variants for the juniper_furnace block
          getVariantBuilder(juniper_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/juniper_furnace_model_lit") : modLoc("block/juniper_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          FurnaceBlock cherry_furnace = foodblockcompatregistry.CHERRY_FURNACE.get();
          ResourceLocation cherry_furnace_unlit_texture = modLoc("block/cherry_furnace");
          ResourceLocation cherry_furnace_lit_texture = modLoc("block/cherry_furnace_lit");
          ResourceLocation cherry_furnace_side = modLoc("block/cherry_block");
          
          // Define the model for the unlit state
          BlockModelBuilder cherry_furnace_model_unlit = models()
              .withExistingParent("cherry_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", cherry_furnace_side)
              .texture("top", cherry_furnace_side)
              .texture("front", cherry_furnace_unlit_texture)
              .texture("particle", cherry_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder cherry_furnace_model_lit = models()
              .withExistingParent("cherry_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", cherry_furnace_side)
              .texture("top", cherry_furnace_side)
              .texture("front", cherry_furnace_lit_texture)
              .texture("particle", cherry_furnace_side);
          
          // Configure variants for the cherry_furnace block
          getVariantBuilder(cherry_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/cherry_furnace_model_lit") : modLoc("block/cherry_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          FurnaceBlock coconut_furnace = foodblockcompatregistry.COCONUT_FURNACE.get();
          ResourceLocation coconut_furnace_unlit_texture = modLoc("block/coconut_furnace");
          ResourceLocation coconut_furnace_lit_texture = modLoc("block/coconut_furnace_lit");
          ResourceLocation coconut_furnace_side = modLoc("block/coconut_block");
          
          // Define the model for the unlit state
          BlockModelBuilder coconut_furnace_model_unlit = models()
              .withExistingParent("coconut_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", coconut_furnace_side)
              .texture("top", coconut_furnace_side)
              .texture("front", coconut_furnace_unlit_texture)
              .texture("particle", coconut_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder coconut_furnace_model_lit = models()
              .withExistingParent("coconut_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", coconut_furnace_side)
              .texture("top", coconut_furnace_side)
              .texture("front", coconut_furnace_lit_texture)
              .texture("particle", coconut_furnace_side);
          
          // Configure variants for the coconut_furnace block
          getVariantBuilder(coconut_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/coconut_furnace_model_lit") : modLoc("block/coconut_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          FurnaceBlock orange_furnace = foodblockcompatregistry.ORANGE_FURNACE.get();
          ResourceLocation orange_furnace_unlit_texture = modLoc("block/orange_furnace");
          ResourceLocation orange_furnace_lit_texture = modLoc("block/orange_furnace_lit");
          ResourceLocation orange_furnace_side = modLoc("block/orange_block");
          
          // Define the model for the unlit state
          BlockModelBuilder orange_furnace_model_unlit = models()
              .withExistingParent("orange_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", orange_furnace_side)
              .texture("top", orange_furnace_side)
              .texture("front", orange_furnace_unlit_texture)
              .texture("particle", orange_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder orange_furnace_model_lit = models()
              .withExistingParent("orange_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", orange_furnace_side)
              .texture("top", orange_furnace_side)
              .texture("front", orange_furnace_lit_texture)
              .texture("particle", orange_furnace_side);
          
          // Configure variants for the orange_furnace block
          getVariantBuilder(orange_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/orange_furnace_model_lit") : modLoc("block/orange_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          FurnaceBlock corn_furnace = foodblockcompatregistry.CORN_FURNACE.get();
          ResourceLocation corn_furnace_unlit_texture = modLoc("block/corn_furnace");
          ResourceLocation corn_furnace_lit_texture = modLoc("block/corn_furnace_lit");
          ResourceLocation corn_furnace_side = modLoc("block/corn_block");
          
          BlockModelBuilder corn_furnace_model_unlit = models()
              .withExistingParent("corn_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", corn_furnace_side)
              .texture("top", corn_furnace_side)
              .texture("front", corn_furnace_unlit_texture)
              .texture("particle", corn_furnace_side);
          
          BlockModelBuilder corn_furnace_model_lit = models()
              .withExistingParent("corn_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", corn_furnace_side)
              .texture("top", corn_furnace_side)
              .texture("front", corn_furnace_lit_texture)
              .texture("particle", corn_furnace_side);
          
          // Configure variants for the corn_furnace block
          getVariantBuilder(corn_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/corn_furnace_model_lit") : modLoc("block/corn_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          FurnaceBlock onion_furnace = foodblockcompatregistry.ONION_FURNACE.get();
          ResourceLocation onion_furnace_unlit_texture = modLoc("block/onion_furnace");
          ResourceLocation onion_furnace_lit_texture = modLoc("block/onion_furnace_lit");
          ResourceLocation onion_furnace_side = modLoc("block/onion_block");
          
          // Define the model for the unlit state
          BlockModelBuilder onion_furnace_model_unlit = models()
              .withExistingParent("onion_furnace_model_unlit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", onion_furnace_side)
              .texture("top", onion_furnace_side)
              .texture("front", onion_furnace_unlit_texture)
              .texture("particle", onion_furnace_side);
          
          // Define the model for the lit state
          BlockModelBuilder onion_furnace_model_lit = models()
              .withExistingParent("onion_furnace_model_lit", mcLoc("block/furnace"))
              .renderType("cutout_mipped_all")
              .texture("side", onion_furnace_side)
              .texture("top", onion_furnace_side)
              .texture("front", onion_furnace_lit_texture)
              .texture("particle", onion_furnace_side);
          
          // Configure variants for the onion_furnace block
          getVariantBuilder(onion_furnace)
              .forAllStates(state -> {
                  Boolean lit = state.getValue(BlockStateProperties.LIT);
                  Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                  int rotation = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };

                  ResourceLocation modelLocation = lit ? modLoc("block/onion_furnace_model_lit") : modLoc("block/onion_furnace_model_unlit");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotation)
                      .build();
              });
    //==============================================================================================================================================
    //|                                                               Paths                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodpathtypeminislab elderberry_stone_path = foodblockcompatregistry.ELDERBERRY_STONE_PATH.get();

          getVariantBuilder(elderberry_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/elderberry_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          foodpathtypeminislab juniper_stone_path = foodblockcompatregistry.JUNIPER_STONE_PATH.get();

          getVariantBuilder(juniper_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/juniper_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodpathtypeminislab cherry_stone_path = foodblockcompatregistry.CHERRY_STONE_PATH.get();

          getVariantBuilder(cherry_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/cherry_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          foodpathtypeminislab coconut_stone_path = foodblockcompatregistry.COCONUT_STONE_PATH.get();

          getVariantBuilder(coconut_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/coconut_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          foodpathtypeminislab orange_stone_path = foodblockcompatregistry.ORANGE_STONE_PATH.get();

          getVariantBuilder(orange_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/orange_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------corn-----------------------------------------------------------------------
          foodpathtypeminislab corn_stone_path = foodblockcompatregistry.CORN_STONE_PATH.get();

          getVariantBuilder(corn_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/corn_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------onion-----------------------------------------------------------------------
          foodpathtypeminislab onion_stone_path = foodblockcompatregistry.ONION_STONE_PATH.get();

          getVariantBuilder(onion_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/onion_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
    //==============================================================================================================================================
    //|                                                              Barrels                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodBarrel elderberry_barrel = foodblockcompatregistry.ELDERBERRY_BARREL.get();
          ResourceLocation elderberry_barrel_closed_texture = modLoc("block/elderberry_barrel_top_closed");
          ResourceLocation elderberry_barrel_open_texture = modLoc("block/elderberry_barrel_top_open");
          ResourceLocation elderberry_barrel_side = modLoc("block/elderberry_barrel_side");
          ResourceLocation elderberry_barrel_bottom = modLoc("block/elderberry_barrel_bottom");
          
          BlockModelBuilder elderberry_barrel_model_closed = models()
              .withExistingParent("elderberry_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", elderberry_barrel_side)
              .texture("bottom", elderberry_barrel_bottom)
              .texture("top", elderberry_barrel_closed_texture)
              .texture("particle", elderberry_barrel_side);
          
          BlockModelBuilder elderberry_barrel_model_open = models()
              .withExistingParent("elderberry_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", elderberry_barrel_side)
              .texture("bottom", elderberry_barrel_bottom)
              .texture("top", elderberry_barrel_open_texture)
              .texture("particle", elderberry_barrel_side);
          
          getVariantBuilder(elderberry_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/elderberry_barrel_model_open") : modLoc("block/elderberry_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          foodBarrel juniper_barrel = foodblockcompatregistry.JUNIPER_BARREL.get();
          ResourceLocation juniper_barrel_closed_texture = modLoc("block/juniper_barrel_top_closed");
          ResourceLocation juniper_barrel_open_texture = modLoc("block/juniper_barrel_top_open");
          ResourceLocation juniper_barrel_side = modLoc("block/juniper_barrel_side");
          ResourceLocation juniper_barrel_bottom = modLoc("block/juniper_barrel_bottom");
          
          BlockModelBuilder juniper_barrel_model_closed = models()
              .withExistingParent("juniper_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", juniper_barrel_side)
              .texture("bottom", juniper_barrel_bottom)
              .texture("top", juniper_barrel_closed_texture)
              .texture("particle", juniper_barrel_side);
          
          BlockModelBuilder juniper_barrel_model_open = models()
              .withExistingParent("juniper_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", juniper_barrel_side)
              .texture("bottom", juniper_barrel_bottom)
              .texture("top", juniper_barrel_open_texture)
              .texture("particle", juniper_barrel_side);
          
          getVariantBuilder(juniper_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/juniper_barrel_model_open") : modLoc("block/juniper_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodBarrel cherry_barrel = foodblockcompatregistry.CHERRY_BARREL.get();
          ResourceLocation cherry_barrel_closed_texture = modLoc("block/cherry_barrel_top_closed");
          ResourceLocation cherry_barrel_open_texture = modLoc("block/cherry_barrel_top_open");
          ResourceLocation cherry_barrel_side = modLoc("block/cherry_barrel_side");
          ResourceLocation cherry_barrel_bottom = modLoc("block/cherry_barrel_bottom");
          
          BlockModelBuilder cherry_barrel_model_closed = models()
              .withExistingParent("cherry_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", cherry_barrel_side)
              .texture("bottom", cherry_barrel_bottom)
              .texture("top", cherry_barrel_closed_texture)
              .texture("particle", cherry_barrel_side);
          
          BlockModelBuilder cherry_barrel_model_open = models()
              .withExistingParent("cherry_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", cherry_barrel_side)
              .texture("bottom", cherry_barrel_bottom)
              .texture("top", cherry_barrel_open_texture)
              .texture("particle", cherry_barrel_side);
          
          getVariantBuilder(cherry_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/cherry_barrel_model_open") : modLoc("block/cherry_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          foodBarrel coconut_barrel = foodblockcompatregistry.COCONUT_BARREL.get();
          ResourceLocation coconut_barrel_closed_texture = modLoc("block/coconut_barrel_top_closed");
          ResourceLocation coconut_barrel_open_texture = modLoc("block/coconut_barrel_top_open");
          ResourceLocation coconut_barrel_side = modLoc("block/coconut_barrel_side");
          ResourceLocation coconut_barrel_bottom = modLoc("block/coconut_barrel_bottom");
          
          BlockModelBuilder coconut_barrel_model_closed = models()
              .withExistingParent("coconut_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", coconut_barrel_side)
              .texture("bottom", coconut_barrel_bottom)
              .texture("top", coconut_barrel_closed_texture)
              .texture("particle", coconut_barrel_side);
          
          BlockModelBuilder coconut_barrel_model_open = models()
              .withExistingParent("coconut_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", coconut_barrel_side)
              .texture("bottom", coconut_barrel_bottom)
              .texture("top", coconut_barrel_open_texture)
              .texture("particle", coconut_barrel_side);
          
          getVariantBuilder(coconut_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/coconut_barrel_model_open") : modLoc("block/coconut_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          foodBarrel orange_barrel = foodblockcompatregistry.ORANGE_BARREL.get();
          ResourceLocation orange_barrel_closed_texture = modLoc("block/orange_barrel_top_closed");
          ResourceLocation orange_barrel_open_texture = modLoc("block/orange_barrel_top_open");
          ResourceLocation orange_barrel_side = modLoc("block/orange_barrel_side");
          ResourceLocation orange_barrel_bottom = modLoc("block/orange_barrel_bottom");
          
          BlockModelBuilder orange_barrel_model_closed = models()
              .withExistingParent("orange_barrel_model_closed", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", orange_barrel_side)
              .texture("bottom", orange_barrel_bottom)
              .texture("top", orange_barrel_closed_texture)
              .texture("particle", orange_barrel_side);
          
          BlockModelBuilder orange_barrel_model_open = models()
              .withExistingParent("orange_barrel_model_open", mcLoc("block/barrel"))
              .renderType("cutout_mipped_all")
              .texture("side", orange_barrel_side)
              .texture("bottom", orange_barrel_bottom)
              .texture("top", orange_barrel_open_texture)
              .texture("particle", orange_barrel_side);
          
          getVariantBuilder(orange_barrel)
              .forAllStates(state -> {
                  Boolean open = state.getValue(BlockStateProperties.OPEN);
                  Direction facing = state.getValue(BlockStateProperties.FACING);
                  int rotationY = switch (facing) {
                      case NORTH -> 0;
                      case EAST -> 90;
                      case SOUTH -> 180;
                      case WEST -> 270;
                      default -> 0;
                  };
                  int rotationX = switch (facing) {
                      case UP -> 0;
                      case DOWN -> 180;
                      default -> 90;
                  };

                  ResourceLocation modelLocation = open ? modLoc("block/orange_barrel_model_open") : modLoc("block/orange_barrel_model_closed");
              
                  return ConfiguredModel.builder()
                      .modelFile(models().getExistingFile(modelLocation))
                      .rotationY(rotationY)
                      .rotationX(rotationX)
                      .build();
              });
    //==============================================================================================================================================
    //|                                                              Chairs                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodChairBlock elderberryChair = foodblockcompatregistry.ELDERBERRY_CHAIR.get();

          getVariantBuilder(elderberryChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/elderberry_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          foodChairBlock juniperChair = foodblockcompatregistry.JUNIPER_CHAIR.get();

          getVariantBuilder(juniperChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/juniper_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodChairBlock cherryChair = foodblockcompatregistry.CHERRY_CHAIR.get();

          getVariantBuilder(cherryChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/cherry_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          foodChairBlock coconutChair = foodblockcompatregistry.COCONUT_CHAIR.get();

          getVariantBuilder(coconutChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/coconut_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          foodChairBlock orangeChair = foodblockcompatregistry.ORANGE_CHAIR.get();

          getVariantBuilder(orangeChair)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/orange_chair");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
    //==============================================================================================================================================
    //|                                                               Beds                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodBed elderberryBed = foodblockcompatregistry.ELDERBERRY_BED.get();

          getVariantBuilder(elderberryBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/elderberry_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          foodBed juniperBed = foodblockcompatregistry.JUNIPER_BED.get();

          getVariantBuilder(juniperBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/juniper_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodBed cherryBed = foodblockcompatregistry.CHERRY_BED.get();

          getVariantBuilder(cherryBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/cherry_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
          foodBed coconutBed = foodblockcompatregistry.COCONUT_BED.get();

          getVariantBuilder(coconutBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/coconut_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
          foodBed orangeBed = foodblockcompatregistry.ORANGE_BED.get();

          getVariantBuilder(orangeBed)
          .forAllStates(state -> {
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = modLoc("block/orange_bed");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
    //==============================================================================================================================================
    //|                                                             Cabinet                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
         //small
          smallFoodCabinet elderberryCabinet = foodblockcompatregistry.SMALL_ELDERBERRY_CABINET.get();

          getVariantBuilder(elderberryCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/elderberry_cabinet_open") : modLoc("block/elderberry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet elderberryMediumCabinet = foodblockcompatregistry.MEDIUM_ELDERBERRY_CABINET.get();

          getVariantBuilder(elderberryMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_elderberry_cabinet_open") : modLoc("block/medium_elderberry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
         //small
          smallFoodCabinet juniperCabinet = foodblockcompatregistry.SMALL_JUNIPER_CABINET.get();

          getVariantBuilder(juniperCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/juniper_cabinet_open") : modLoc("block/juniper_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet juniperMediumCabinet = foodblockcompatregistry.MEDIUM_JUNIPER_CABINET.get();

          getVariantBuilder(juniperMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_juniper_cabinet_open") : modLoc("block/medium_juniper_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
         //small
          smallFoodCabinet cherryCabinet = foodblockcompatregistry.SMALL_CHERRY_CABINET.get();

          getVariantBuilder(cherryCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/cherry_cabinet_open") : modLoc("block/cherry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet cherryMediumCabinet = foodblockcompatregistry.MEDIUM_CHERRY_CABINET.get();

          getVariantBuilder(cherryMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_cherry_cabinet_open") : modLoc("block/medium_cherry_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------coconut-----------------------------------------------------------------------
         //small
          smallFoodCabinet coconutCabinet = foodblockcompatregistry.SMALL_COCONUT_CABINET.get();

          getVariantBuilder(coconutCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/coconut_cabinet_open") : modLoc("block/coconut_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet coconutMediumCabinet = foodblockcompatregistry.MEDIUM_COCONUT_CABINET.get();

          getVariantBuilder(coconutMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_coconut_cabinet_open") : modLoc("block/medium_coconut_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
     //------------------------------------------------------------orange-----------------------------------------------------------------------
         //small
          smallFoodCabinet orangeCabinet = foodblockcompatregistry.SMALL_ORANGE_CABINET.get();

          getVariantBuilder(orangeCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/orange_cabinet_open") : modLoc("block/orange_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
         //medium
          mediumFoodCabinet orangeMediumCabinet = foodblockcompatregistry.MEDIUM_ORANGE_CABINET.get();

          getVariantBuilder(orangeMediumCabinet)
          .forAllStates(state -> {
              Boolean open = state.getValue(BlockStateProperties.OPEN);
              Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
              int rotationY = switch (facing) {
                  case NORTH -> 180;
                  case EAST -> 270;
                  case SOUTH -> 0;
                  case WEST -> 90;
                  default -> 180;
              };

              ResourceLocation modelLocation = open ? modLoc("block/medium_orange_cabinet_open") : modLoc("block/medium_orange_cabinet");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .rotationY(rotationY)
                  .build();
          });
   };

}
    
