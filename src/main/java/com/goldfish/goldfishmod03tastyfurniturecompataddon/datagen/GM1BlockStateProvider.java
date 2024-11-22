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
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockregistry;

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
          net.minecraft.world.level.block.Block elderberry_block = foodblockregistry.ELDERBERRY_BLOCK.get();
          simpleBlock(elderberry_block);
      //.........bricks
          net.minecraft.world.level.block.Block elderberry_bricks_block = foodblockregistry.ELDERBERRY_BRICKS_BLOCK.get();
          simpleBlock(elderberry_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block elderberry_chiseled_block = foodblockregistry.ELDERBERRY_CHISELED_BLOCK.get();
          simpleBlock(elderberry_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block elderberry_tiles_block = foodblockregistry.ELDERBERRY_TILES_BLOCK.get();
          simpleBlock(elderberry_tiles_block);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block juniper_block = foodblockregistry.JUNIPER_BLOCK.get();
          simpleBlock(juniper_block);
      //.........bricks
          net.minecraft.world.level.block.Block juniper_bricks_block = foodblockregistry.JUNIPER_BRICKS_BLOCK.get();
          simpleBlock(juniper_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block juniper_chiseled_block = foodblockregistry.JUNIPER_CHISELED_BLOCK.get();
          simpleBlock(juniper_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block juniper_tiles_block = foodblockregistry.JUNIPER_TILES_BLOCK.get();
          simpleBlock(juniper_tiles_block);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
      //.........plain
          net.minecraft.world.level.block.Block cherry_block = foodblockregistry.CHERRY_BLOCK.get();
          simpleBlock(cherry_block);
      //.........bricks
          net.minecraft.world.level.block.Block cherry_bricks_block = foodblockregistry.CHERRY_BRICKS_BLOCK.get();
          simpleBlock(cherry_bricks_block);
      //.........chiseled
          net.minecraft.world.level.block.Block cherry_chiseled_block = foodblockregistry.CHERRY_CHISELED_BLOCK.get();
          simpleBlock(cherry_chiseled_block);
      //.........tiles
          net.minecraft.world.level.block.Block cherry_tiles_block = foodblockregistry.CHERRY_TILES_BLOCK.get();
          simpleBlock(cherry_tiles_block);
    //==============================================================================================================================================
    //|                                                              Slabs                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
      //.........plain
          SlabBlock elderberry_slab = foodblockregistry.ELDERBERRY_SLAB.get();
          ResourceLocation elderberry_block_texture = modLoc("block/elderberry_block");
          slabBlock(elderberry_slab, elderberry_block_texture, elderberry_block_texture);
      //.........bricks
          SlabBlock elderberry_bricks_slab = foodblockregistry.ELDERBERRY_BRICKS_SLAB.get();
          ResourceLocation elderberry_bricks_block_texture = modLoc("block/elderberry_bricks_block");
          slabBlock(elderberry_bricks_slab, elderberry_bricks_block_texture, elderberry_bricks_block_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
      //.........plain
          SlabBlock juniper_slab = foodblockregistry.JUNIPER_SLAB.get();
          ResourceLocation juniper_block_texture = modLoc("block/juniper_block");
          slabBlock(juniper_slab, juniper_block_texture, juniper_block_texture);
      //.........bricks
          SlabBlock juniper_bricks_slab = foodblockregistry.JUNIPER_BRICKS_SLAB.get();
          ResourceLocation juniper_bricks_block_texture = modLoc("block/juniper_bricks_block");
          slabBlock(juniper_bricks_slab, juniper_bricks_block_texture, juniper_bricks_block_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
      //.........plain
          SlabBlock cherry_slab = foodblockregistry.CHERRY_SLAB.get();
          ResourceLocation cherry_block_texture = modLoc("block/cherry_block");
          slabBlock(cherry_slab, cherry_block_texture, cherry_block_texture);
      //.........bricks
          SlabBlock cherry_bricks_slab = foodblockregistry.CHERRY_BRICKS_SLAB.get();
          ResourceLocation cherry_bricks_block_texture = modLoc("block/cherry_bricks_block");
          slabBlock(cherry_bricks_slab, cherry_bricks_block_texture, cherry_bricks_block_texture);
    //==============================================================================================================================================
    //|                                                              Stairs                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
      //.........plain
          StairBlock elderberry_stairs = foodblockregistry.ELDERBERRY_STAIRS.get();
          stairsBlock(elderberry_stairs, elderberry_block_texture);
      //.........bricks
          StairBlock elderberry_bricks_stairs = foodblockregistry.ELDERBERRY_BRICKS_STAIRS.get();
          stairsBlock(elderberry_bricks_stairs, elderberry_bricks_block_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
      //.........plain
          StairBlock juniper_stairs = foodblockregistry.JUNIPER_STAIRS.get();
          stairsBlock(juniper_stairs, juniper_block_texture);
      //.........bricks
          StairBlock juniper_bricks_stairs = foodblockregistry.JUNIPER_BRICKS_STAIRS.get();
          stairsBlock(juniper_bricks_stairs, juniper_bricks_block_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
      //.........plain
          StairBlock cherry_stairs = foodblockregistry.CHERRY_STAIRS.get();
          stairsBlock(cherry_stairs, cherry_block_texture);
      //.........bricks
          StairBlock cherry_bricks_stairs = foodblockregistry.CHERRY_BRICKS_STAIRS.get();
          stairsBlock(cherry_bricks_stairs, cherry_bricks_block_texture);
    //==============================================================================================================================================
    //|                                                               Bars                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          IronBarsBlock elderberry_bars = foodblockregistry.ELDERBERRY_BARS.get(); 
          ResourceLocation elderberry_bars_texture = modLoc("block/elderberry_bars");
          ResourceLocation elderberry_bars_rim_texture = modLoc("block/elderberry_block");
          paneBlockWithRenderType(elderberry_bars, "elderberry_bars", elderberry_bars_texture, elderberry_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          IronBarsBlock juniper_bars = foodblockregistry.JUNIPER_BARS.get(); 
          ResourceLocation juniper_bars_texture = modLoc("block/juniper_bars");
          ResourceLocation juniper_bars_rim_texture = modLoc("block/juniper_block");
          paneBlockWithRenderType(juniper_bars, "juniper_bars", juniper_bars_texture, juniper_bars_rim_texture, "cutout_mipped_all"); 
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          IronBarsBlock cherry_bars = foodblockregistry.CHERRY_BARS.get(); 
          ResourceLocation cherry_bars_texture = modLoc("block/cherry_bars");
          ResourceLocation cherry_bars_rim_texture = modLoc("block/cherry_block");
          paneBlockWithRenderType(cherry_bars, "cherry_bars", cherry_bars_texture, cherry_bars_rim_texture, "cutout_mipped_all"); 
    //==============================================================================================================================================
    //|                                                               Door                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          DoorBlock elderberry_door = foodblockregistry.ELDERBERRY_DOOR.get(); 
          ResourceLocation elderberry_door_top_texture = modLoc("block/elderberry_door_top");
          ResourceLocation elderberry_door_bottom_texture = modLoc("block/elderberry_door_bottom");
          doorBlockWithRenderType(elderberry_door, "elderberry_door", elderberry_door_bottom_texture, elderberry_door_top_texture, "translucent"); 
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          DoorBlock juniper_door = foodblockregistry.JUNIPER_DOOR.get(); 
          ResourceLocation juniper_door_top_texture = modLoc("block/juniper_door_top");
          ResourceLocation juniper_door_bottom_texture = modLoc("block/juniper_door_bottom");
          doorBlockWithRenderType(juniper_door, "juniper_door", juniper_door_bottom_texture, juniper_door_top_texture, "translucent"); 
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          DoorBlock cherry_door = foodblockregistry.CHERRY_DOOR.get(); 
          ResourceLocation cherry_door_top_texture = modLoc("block/cherry_door_top");
          ResourceLocation cherry_door_bottom_texture = modLoc("block/cherry_door_bottom");
          doorBlockWithRenderType(cherry_door, "cherry_door", cherry_door_top_texture, cherry_door_bottom_texture, "cutout_mipped_all"); 
    //==============================================================================================================================================
    //|                                                              Button                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          ButtonBlock elderberry_button = foodblockregistry.ELDERBERRY_BUTTON.get();
          ResourceLocation elderberry_button_texture = modLoc("block/elderberry_block");
          buttonBlock(elderberry_button, elderberry_button_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          ButtonBlock juniper_button = foodblockregistry.JUNIPER_BUTTON.get();
          ResourceLocation juniper_button_texture = modLoc("block/juniper_block");
          buttonBlock(juniper_button, juniper_button_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          ButtonBlock cherry_button = foodblockregistry.CHERRY_BUTTON.get();
          ResourceLocation cherry_button_texture = modLoc("block/cherry_block");
          buttonBlock(cherry_button, cherry_button_texture);
    //==============================================================================================================================================
    //|                                                              Fences                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
       //fence
          FenceBlock elderberry_fence = foodblockregistry.ELDERBERRY_FENCE.get();
          ResourceLocation elderberry_fence_texture = modLoc("block/elderberry_block");
          fenceBlock(elderberry_fence, elderberry_fence_texture);
       //gate
          FenceGateBlock elderberry_gate = foodblockregistry.ELDERBERRY_GATE.get();
          ResourceLocation elderberry_gate_texture = modLoc("block/elderberry_block");
          fenceGateBlock(elderberry_gate, elderberry_gate_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
       //fence
          FenceBlock juniper_fence = foodblockregistry.JUNIPER_FENCE.get();
          ResourceLocation juniper_fence_texture = modLoc("block/juniper_block");
          fenceBlock(juniper_fence, juniper_fence_texture);
       //gate
          FenceGateBlock juniper_gate = foodblockregistry.JUNIPER_GATE.get();
          ResourceLocation juniper_gate_texture = modLoc("block/juniper_block");
          fenceGateBlock(juniper_gate, juniper_gate_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
       //fence
          FenceBlock cherry_fence = foodblockregistry.CHERRY_FENCE.get();
          ResourceLocation cherry_fence_texture = modLoc("block/cherry_block");
          fenceBlock(cherry_fence, cherry_fence_texture);
       //gate
          FenceGateBlock cherry_gate = foodblockregistry.CHERRY_GATE.get();
          ResourceLocation cherry_gate_texture = modLoc("block/cherry_block");
          fenceGateBlock(cherry_gate, cherry_gate_texture);
    //==============================================================================================================================================
    //|                                                          Pressure Plates                                                                   |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          PressurePlateBlock elderberry_pressure_plate = foodblockregistry.ELDERBERRY_PRESSURE_PLATE.get();
          ResourceLocation elderberry_pressure_plate_texture = modLoc("block/elderberry_block");
          pressurePlateBlock(elderberry_pressure_plate, elderberry_pressure_plate_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          PressurePlateBlock juniper_pressure_plate = foodblockregistry.JUNIPER_PRESSURE_PLATE.get();
          ResourceLocation juniper_pressure_plate_texture = modLoc("block/juniper_block");
          pressurePlateBlock(juniper_pressure_plate, juniper_pressure_plate_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          PressurePlateBlock cherry_pressure_plate = foodblockregistry.CHERRY_PRESSURE_PLATE.get();
          ResourceLocation cherry_pressure_plate_texture = modLoc("block/cherry_block");
          pressurePlateBlock(cherry_pressure_plate, cherry_pressure_plate_texture);
    //==============================================================================================================================================
    //|                                                               Signs                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
           StandingSignBlock elderberry_sign = foodblockregistry.ELDERBERRY_STANDING_SIGN.get();
           WallSignBlock elderberry_wall_sign = foodblockregistry.ELDERBERRY_WALL_SIGN.get();
           ResourceLocation elderberry_sign_texture = modLoc("block/elderberry_block");
           signBlock(elderberry_sign, elderberry_wall_sign, elderberry_sign_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
           StandingSignBlock juniper_sign = foodblockregistry.JUNIPER_STANDING_SIGN.get();
           WallSignBlock juniper_wall_sign = foodblockregistry.JUNIPER_WALL_SIGN.get();
           ResourceLocation juniper_sign_texture = modLoc("block/juniper_block");
           signBlock(juniper_sign, juniper_wall_sign, juniper_sign_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
           StandingSignBlock cherry_sign = foodblockregistry.CHERRY_STANDING_SIGN.get();
           WallSignBlock cherry_wall_sign = foodblockregistry.CHERRY_WALL_SIGN.get();
           ResourceLocation cherry_sign_texture = modLoc("block/cherry_block");
           signBlock(cherry_sign, cherry_wall_sign, cherry_sign_texture);
    //==============================================================================================================================================
    //|                                                            Trap Doors                                                                      |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          TrapDoorBlock elderberry_trapdoor = foodblockregistry.ELDERBERRY_TRAPDOOR.get(); 
          ResourceLocation elderberry_trapdoor_texture = modLoc("block/elderberry_block");
          trapdoorBlockWithRenderType(elderberry_trapdoor, "elderberry_trapdoor", elderberry_trapdoor_texture, false, elderberry_trapdoor_texture);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          TrapDoorBlock juniper_trapdoor = foodblockregistry.JUNIPER_TRAPDOOR.get(); 
          ResourceLocation juniper_trapdoor_texture = modLoc("block/juniper_block");
          trapdoorBlockWithRenderType(juniper_trapdoor, "juniper_trapdoor", juniper_trapdoor_texture, false, juniper_trapdoor_texture);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          TrapDoorBlock cherry_trapdoor = foodblockregistry.CHERRY_TRAPDOOR.get(); 
          ResourceLocation cherry_trapdoor_texture = modLoc("block/cherry_block");
          trapdoorBlockWithRenderType(cherry_trapdoor, "cherry_trapdoor", cherry_trapdoor_texture, false, cherry_trapdoor_texture);
    //==============================================================================================================================================
    //|                                                               Lamps                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          Block elderberry_lamp = foodblockregistry.ELDERBERRY_LAMP.get();
          simpleBlock(elderberry_lamp);
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          Block juniper_lamp = foodblockregistry.JUNIPER_LAMP.get();
          simpleBlock(juniper_lamp);
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          Block cherry_lamp = foodblockregistry.CHERRY_LAMP.get();
          simpleBlock(cherry_lamp);
    //==============================================================================================================================================
    //|                                                              Carpets                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          CarpetBlock elderberry_carpet = foodblockregistry.ELDERBERRY_CARPET.get();
          ResourceLocation elderberry_carpet_texture = modLoc("block/elderberry_carpet");
          BlockModelBuilder elderberry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(elderberry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", elderberry_carpet_texture);
          simpleBlock(elderberry_carpet, new ModelFile.UncheckedModelFile(elderberry_carpet_model.getLocation()));
     //------------------------------------------------------------juniper-----------------------------------------------------------------------
          CarpetBlock juniper_carpet = foodblockregistry.JUNIPER_CARPET.get();
          ResourceLocation juniper_carpet_texture = modLoc("block/juniper_carpet");
          BlockModelBuilder juniper_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(juniper_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", juniper_carpet_texture);
          simpleBlock(juniper_carpet, new ModelFile.UncheckedModelFile(juniper_carpet_model.getLocation()));
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          CarpetBlock cherry_carpet = foodblockregistry.CHERRY_CARPET.get();
          ResourceLocation cherry_carpet_texture = modLoc("block/cherry_carpet");
          BlockModelBuilder cherry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(cherry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", cherry_carpet_texture);
          simpleBlock(cherry_carpet, new ModelFile.UncheckedModelFile(cherry_carpet_model.getLocation()));
    //==============================================================================================================================================
    //|                                                             Lanterns                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
         //regular
          LanternBlock elderberry_lantern = foodblockregistry.ELDERBERRY_LANTERN.get();
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
         LanternBlock elderberry_soul_lantern = foodblockregistry.ELDERBERRY_SOUL_LANTERN.get();
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
          LanternBlock juniper_lantern = foodblockregistry.JUNIPER_LANTERN.get();
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
         LanternBlock juniper_soul_lantern = foodblockregistry.JUNIPER_SOUL_LANTERN.get();
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
          LanternBlock cherry_lantern = foodblockregistry.CHERRY_LANTERN.get();
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
         LanternBlock cherry_soul_lantern = foodblockregistry.CHERRY_SOUL_LANTERN.get();
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
    //==============================================================================================================================================
    //|                                                              Chains                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
         ChainBlock elderberry_chain = foodblockregistry.ELDERBERRY_CHAIN.get();
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
         ChainBlock juniper_chain = foodblockregistry.JUNIPER_CHAIN.get();
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
         ChainBlock cherry_chain = foodblockregistry.CHERRY_CHAIN.get();
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
    //==============================================================================================================================================
    //|                                                             Ladders                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          LadderBlock elderberryladder = foodblockregistry.ELDERBERRY_LADDER.get();

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
          LadderBlock juniperladder = foodblockregistry.JUNIPER_LADDER.get();

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
          LadderBlock cherryladder = foodblockregistry.CHERRY_LADDER.get();

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
    //==============================================================================================================================================
    //|                                                              Tables                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          HorizontalDirectionalBlock elderberrytable = foodblockregistry.ELDERBERRY_TABLE.get();

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
          HorizontalDirectionalBlock junipertable = foodblockregistry.JUNIPER_TABLE.get();

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
          HorizontalDirectionalBlock cherrytable = foodblockregistry.CHERRY_TABLE.get();

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
    //==============================================================================================================================================
    //|                                                              Torches                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
       //regular
        TorchBlock elderberry_torch = foodblockregistry.ELDERBERRY_TORCH.get();
        ResourceLocation elderberry_torch_texture = modLoc("block/elderberry_torch");
        BlockModelBuilder elderberry_torch_model = models()
        .withExistingParent("elderberry_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_torch_texture)
        .texture("particle", elderberry_torch_texture);

        simpleBlock(elderberry_torch, elderberry_torch_model);

        TorchBlock elderberry_wall_torch = foodblockregistry.ELDERBERRY_WALL_TORCH.get();
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
        RedstoneTorchBlock elderberry_redstone_torch = foodblockregistry.ELDERBERRY_REDSTONE_TORCH.get();
        ResourceLocation elderberry_redstone_torch_texture = modLoc("block/elderberry_redstone_torch");
        BlockModelBuilder elderberry_redstone_torch_model = models()
        .withExistingParent("elderberry_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_redstone_torch_texture)
        .texture("particle", elderberry_redstone_torch_texture);
        

        simpleBlock(elderberry_redstone_torch, elderberry_redstone_torch_model);

        ResourceLocation elderberry_redstone_wall_torch_texture = modLoc("block/elderberry_redstone_torch");

        RedstoneTorchBlock elderberry_redstone_wall_torch = foodblockregistry.ELDERBERRY_REDSTONE_WALL_TORCH.get();
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
        TorchBlock elderberry_soul_torch = foodblockregistry.ELDERBERRY_SOUL_TORCH.get();
        ResourceLocation elderberry_soul_torch_texture = modLoc("block/elderberry_soul_torch");
        BlockModelBuilder elderberry_soul_torch_model = models()
        .withExistingParent("elderberry_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", elderberry_soul_torch_texture)
        .texture("particle", elderberry_soul_torch_texture);
        

        simpleBlock(elderberry_soul_torch, elderberry_soul_torch_model);

        ResourceLocation elderberry_soul_wall_torch_texture = modLoc("block/elderberry_soul_torch");
        TorchBlock elderberry_soul_wall_torch = foodblockregistry.ELDERBERRY_SOUL_WALL_TORCH.get();
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
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
       //regular
        TorchBlock cherry_torch = foodblockregistry.CHERRY_TORCH.get();
        ResourceLocation cherry_torch_texture = modLoc("block/cherry_torch");
        BlockModelBuilder cherry_torch_model = models()
        .withExistingParent("cherry_torch", mcLoc("block/torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_torch_texture)
        .texture("particle", cherry_torch_texture);

        simpleBlock(cherry_torch, cherry_torch_model);

        TorchBlock cherry_wall_torch = foodblockregistry.CHERRY_WALL_TORCH.get();
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
        RedstoneTorchBlock cherry_redstone_torch = foodblockregistry.CHERRY_REDSTONE_TORCH.get();
        ResourceLocation cherry_redstone_torch_texture = modLoc("block/cherry_redstone_torch");
        BlockModelBuilder cherry_redstone_torch_model = models()
        .withExistingParent("cherry_redstone_torch", mcLoc("block/redstone_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_redstone_torch_texture)
        .texture("particle", cherry_redstone_torch_texture);
        

        simpleBlock(cherry_redstone_torch, cherry_redstone_torch_model);

        ResourceLocation cherry_redstone_wall_torch_texture = modLoc("block/cherry_redstone_torch");

        RedstoneTorchBlock cherry_redstone_wall_torch = foodblockregistry.CHERRY_REDSTONE_WALL_TORCH.get();
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
        TorchBlock cherry_soul_torch = foodblockregistry.CHERRY_SOUL_TORCH.get();
        ResourceLocation cherry_soul_torch_texture = modLoc("block/cherry_soul_torch");
        BlockModelBuilder cherry_soul_torch_model = models()
        .withExistingParent("cherry_soul_torch", mcLoc("block/soul_torch"))
        .renderType("cutout_mipped_all")
        .texture("torch", cherry_soul_torch_texture)
        .texture("particle", cherry_soul_torch_texture);
        

        simpleBlock(cherry_soul_torch, cherry_soul_torch_model);

        ResourceLocation cherry_soul_wall_torch_texture = modLoc("block/cherry_soul_torch");
        TorchBlock cherry_soul_wall_torch = foodblockregistry.CHERRY_SOUL_WALL_TORCH.get();
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
    //==============================================================================================================================================
    //|                                                             Furnaces                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          FurnaceBlock elderberry_furnace = foodblockregistry.ELDERBERRY_FURNACE.get();
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
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          FurnaceBlock cherry_furnace = foodblockregistry.CHERRY_FURNACE.get();
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
    //==============================================================================================================================================
    //|                                                               Paths                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodpathtypeminislab elderberry_stone_path = foodblockregistry.ELDERBERRY_STONE_PATH.get();

          getVariantBuilder(elderberry_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/elderberry_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodpathtypeminislab cherry_stone_path = foodblockregistry.CHERRY_STONE_PATH.get();

          getVariantBuilder(cherry_stone_path)
          .forAllStates(state -> {

              ResourceLocation modelLocation = modLoc("block/cherry_stone_path");
          
              return ConfiguredModel.builder()
                  .modelFile(models().getExistingFile(modelLocation))
                  .build();
          });
    //==============================================================================================================================================
    //|                                                              Barrels                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodBarrel elderberry_barrel = foodblockregistry.ELDERBERRY_BARREL.get();
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
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodBarrel cherry_barrel = foodblockregistry.CHERRY_BARREL.get();
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
    //==============================================================================================================================================
    //|                                                              Chairs                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodChairBlock elderberryChair = foodblockregistry.ELDERBERRY_CHAIR.get();

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
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodChairBlock cherryChair = foodblockregistry.CHERRY_CHAIR.get();

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
    //==============================================================================================================================================
    //|                                                               Beds                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          foodBed elderberryBed = foodblockregistry.ELDERBERRY_BED.get();

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
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
          foodBed cherryBed = foodblockregistry.CHERRY_BED.get();

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
    //==============================================================================================================================================
    //|                                                             Cabinet                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
         //small
          smallFoodCabinet elderberryCabinet = foodblockregistry.SMALL_ELDERBERRY_CABINET.get();

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
          mediumFoodCabinet elderberryMediumCabinet = foodblockregistry.MEDIUM_ELDERBERRY_CABINET.get();

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
     //------------------------------------------------------------cherry-----------------------------------------------------------------------
         //small
          smallFoodCabinet cherryCabinet = foodblockregistry.SMALL_CHERRY_CABINET.get();

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
          mediumFoodCabinet cherryMediumCabinet = foodblockregistry.MEDIUM_CHERRY_CABINET.get();

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
   };

}
    
