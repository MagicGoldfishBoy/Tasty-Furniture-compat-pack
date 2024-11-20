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
    //==============================================================================================================================================
    //|                                                               Bars                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          IronBarsBlock elderberry_bars = foodblockregistry.ELDERBERRY_BARS.get(); 
          ResourceLocation elderberry_bars_texture = modLoc("block/elderberry_bars");
          ResourceLocation elderberry_bars_rim_texture = modLoc("block/elderberry_block");
          paneBlockWithRenderType(elderberry_bars, "elderberry_bars", elderberry_bars_texture, elderberry_bars_rim_texture, "cutout_mipped_all"); 
    //==============================================================================================================================================
    //|                                                               Door                                                                         |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          DoorBlock elderberry_door = foodblockregistry.ELDERBERRY_DOOR.get(); 
          ResourceLocation elderberry_door_top_texture = modLoc("block/elderberry_door_top");
          ResourceLocation elderberry_door_bottom_texture = modLoc("block/elderberry_door_bottom");
          doorBlockWithRenderType(elderberry_door, "elderberry_door", elderberry_door_bottom_texture, elderberry_door_top_texture, "translucent"); 
    //==============================================================================================================================================
    //|                                                              Button                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          ButtonBlock elderberry_button = foodblockregistry.ELDERBERRY_BUTTON.get();
          ResourceLocation elderberry_button_texture = modLoc("block/elderberry_block");
          buttonBlock(elderberry_button, elderberry_button_texture);
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
    //==============================================================================================================================================
    //|                                                          Pressure Plates                                                                   |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          PressurePlateBlock elderberry_pressure_plate = foodblockregistry.ELDERBERRY_PRESSURE_PLATE.get();
          ResourceLocation elderberry_pressure_plate_texture = modLoc("block/elderberry_block");
          pressurePlateBlock(elderberry_pressure_plate, elderberry_pressure_plate_texture);
    //==============================================================================================================================================
    //|                                                          Pressure Plates                                                                   |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
           StandingSignBlock elderberry_sign = foodblockregistry.ELDERBERRY_STANDING_SIGN.get();
           WallSignBlock elderberry_wall_sign = foodblockregistry.ELDERBERRY_WALL_SIGN.get();
           ResourceLocation elderberry_sign_texture = modLoc("block/elderberry_block");
           signBlock(elderberry_sign, elderberry_wall_sign, elderberry_sign_texture);
    //==============================================================================================================================================
    //|                                                            Trap Doors                                                                      |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          TrapDoorBlock elderberry_trapdoor = foodblockregistry.ELDERBERRY_TRAPDOOR.get(); 
          ResourceLocation elderberry_trapdoor_texture = modLoc("block/elderberry_block");
          trapdoorBlockWithRenderType(elderberry_trapdoor, "elderberry_trapdoor", elderberry_trapdoor_texture, false, elderberry_trapdoor_texture);
    //==============================================================================================================================================
    //|                                                               Lamps                                                                        |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          Block elderberry_lamp = foodblockregistry.ELDERBERRY_LAMP.get();
          simpleBlock(elderberry_lamp);
    //==============================================================================================================================================
    //|                                                              Carpets                                                                       |
    //==============================================================================================================================================
     //------------------------------------------------------------elderberry-----------------------------------------------------------------------
          CarpetBlock elderberry_carpet = foodblockregistry.ELDERBERRY_CARPET.get();
          ResourceLocation elderberry_carpet_texture = modLoc("block/elderberry_carpet");
          BlockModelBuilder elderberry_carpet_model = models().withExistingParent(BuiltInRegistries.BLOCK.getKey(elderberry_carpet).getPath(), mcLoc("block/carpet"))
          .texture("wool", elderberry_carpet_texture);
          simpleBlock(elderberry_carpet, new ModelFile.UncheckedModelFile(elderberry_carpet_model.getLocation()));
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
    //==============================================================================================================================================
    //|                                                             Ladders                                                                        |
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
   };

}
    
