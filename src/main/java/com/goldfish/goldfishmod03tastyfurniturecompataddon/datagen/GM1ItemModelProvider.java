package com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


public class GM1ItemModelProvider extends ItemModelProvider {

        public GM1ItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, "goldfishmod03tastyfurniturecompataddon", existingFileHelper);
    }

        @Override
        protected void registerModels() {
    //==============================================================================================================================================
    //|                                                            Elderberry                                                                      |
    //==============================================================================================================================================
       //mush
        withExistingParent("elderberry_mush", mcLoc("item/generated")).texture("layer0", "item/elderberry_mush");
       //ingot
        withExistingParent("elderberry_ingot", mcLoc("item/generated")).texture("layer0", "item/elderberry_ingot");
       //nugget
        withExistingParent("elderberry_nugget", mcLoc("item/generated")).texture("layer0", "item/elderberry_nugget");
       //block
        withExistingParent("elderberry_block_item", modLoc("block/elderberry_block"));
       //bricks block
        withExistingParent("elderberry_bricks_block_item", modLoc("block/elderberry_bricks_block"));
       //chiseled block
        withExistingParent("elderberry_chiseled_block_item", modLoc("block/elderberry_chiseled_block"));
       //tiles block
        withExistingParent("elderberry_tiles_block_item", modLoc("block/elderberry_tiles_block"));
       //slab
       slab("elderberry_slab_item", modLoc("block/elderberry_block"), modLoc("block/elderberry_block"), modLoc("block/elderberry_block"));
       //bricks slab
       slab("elderberry_bricks_slab_item", modLoc("block/elderberry_bricks_block"), modLoc("block/elderberry_bricks_block"), modLoc("block/elderberry_bricks_block"));
       //stairs
       stairs("elderberry_stairs_item", modLoc("block/elderberry_block"), modLoc("block/elderberry_block"), modLoc("block/elderberry_block"));
       //bricks stairs
       stairs("elderberry_bricks_stairs_item", modLoc("block/elderberry_bricks_block"), modLoc("block/elderberry_bricks_block"), modLoc("block/elderberry_bricks_block"));
       //bars
       withExistingParent("elderberry_bars_item", mcLoc("item/generated")).texture("layer0", "block/elderberry_bars");
       //doors
       withExistingParent("elderberry_door_item", mcLoc("item/generated")).texture("layer0", "item/elderberry_door_item");
       //button
       buttonInventory("elderberry_button_item", modLoc("block/elderberry_block"));
       //fence
       fenceInventory("elderberry_fence_item", modLoc("block/elderberry_block"));
       //gate
       withExistingParent("elderberry_gate_item", modLoc("block/elderberry_gate"));
       //pressure plate
       pressurePlate("elderberry_pressure_plate_item", modLoc("block/elderberry_block"));
       //sign
       withExistingParent("elderberry_sign_item", mcLoc("item/generated")).texture("layer0", "item/elderberry_sign");
       //trapdoor
       withExistingParent("elderberry_trapdoor_item", modLoc("block/elderberry_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("elderberry_lamp_item", modLoc("block/elderberry_lamp"));
       //carpet
       ResourceLocation elderberry_carpet_texture = modLoc("block/elderberry_carpet");
       carpet("elderberry_carpet_item", elderberry_carpet_texture);
       //lantern
        //regular
          withExistingParent("elderberry_lantern_item", modLoc("block/elderberry_lantern"));
        //soul
          withExistingParent("elderberry_soul_lantern_item", modLoc("block/elderberry_soul_lantern"));
       //chain
       withExistingParent("elderberry_chain_item", modLoc("block/elderberry_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("elderberry_ladder_item", modLoc("block/elderberry_ladder"));
       //table
       withExistingParent("elderberry_table_item", modLoc("block/elderberry_table"));
       //torches
        //regular
          withExistingParent("elderberry_torch_item", modLoc("block/elderberry_torch"));
        //redstone
          withExistingParent("elderberry_redstone_torch_item", modLoc("block/elderberry_redstone_torch"));
        //soul
          withExistingParent("elderberry_soul_torch_item", modLoc("block/elderberry_soul_torch"));
       //furnaces
       withExistingParent("elderberry_furnace_item", modLoc("block/elderberry_furnace_model_unlit"));
       //paths
       withExistingParent("elderberry_stone_path_item", modLoc("block/elderberry_stone_path"));
       //barrel
       withExistingParent("elderberry_barrel_item", modLoc("block/elderberry_barrel_model_closed"));
       //chair
       withExistingParent("elderberry_chair_item", modLoc("block/elderberry_chair"));
       //bed
       withExistingParent("elderberry_bed_item", modLoc("block/elderberry_bed"));
       //cabinet
       withExistingParent("small_elderberry_cabinet_item", modLoc("block/elderberry_cabinet"));
       withExistingParent("medium_elderberry_cabinet_item", modLoc("block/medium_elderberry_cabinet"));
    //==============================================================================================================================================
    //|                                                            Juniper                                                                      |
    //==============================================================================================================================================
       //mush
       withExistingParent("juniper_mush", mcLoc("item/generated")).texture("layer0", "item/juniper_mush");
       //ingot
        withExistingParent("juniper_ingot", mcLoc("item/generated")).texture("layer0", "item/juniper_ingot");
       //nugget
        withExistingParent("juniper_nugget", mcLoc("item/generated")).texture("layer0", "item/juniper_nugget");
       //block
        withExistingParent("juniper_block_item", modLoc("block/juniper_block"));
       //bricks block
        withExistingParent("juniper_bricks_block_item", modLoc("block/juniper_bricks_block"));
       //chiseled block
        withExistingParent("juniper_chiseled_block_item", modLoc("block/juniper_chiseled_block"));
       //tiles block
        withExistingParent("juniper_tiles_block_item", modLoc("block/juniper_tiles_block"));
       //slab
       slab("juniper_slab_item", modLoc("block/juniper_block"), modLoc("block/juniper_block"), modLoc("block/juniper_block"));
       //bricks slab
       slab("juniper_bricks_slab_item", modLoc("block/juniper_bricks_block"), modLoc("block/juniper_bricks_block"), modLoc("block/juniper_bricks_block"));
       //stairs
       stairs("juniper_stairs_item", modLoc("block/juniper_block"), modLoc("block/juniper_block"), modLoc("block/juniper_block"));
       //bricks stairs
       stairs("juniper_bricks_stairs_item", modLoc("block/juniper_bricks_block"), modLoc("block/juniper_bricks_block"), modLoc("block/juniper_bricks_block"));
       //bars
       withExistingParent("juniper_bars_item", mcLoc("item/generated")).texture("layer0", "block/juniper_bars");
       //doors
       withExistingParent("juniper_door_item", mcLoc("item/generated")).texture("layer0", "item/juniper_door_item");
       //button
       buttonInventory("juniper_button_item", modLoc("block/juniper_block"));
       //fence
       fenceInventory("juniper_fence_item", modLoc("block/juniper_block"));
       //gate
       withExistingParent("juniper_gate_item", modLoc("block/juniper_gate"));
       //pressure plate
       pressurePlate("juniper_pressure_plate_item", modLoc("block/juniper_block"));
       //sign
       withExistingParent("juniper_sign_item", mcLoc("item/generated")).texture("layer0", "item/juniper_sign");
       //trapdoor
       withExistingParent("juniper_trapdoor_item", modLoc("block/juniper_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("juniper_lamp_item", modLoc("block/juniper_lamp"));
       //carpet
       ResourceLocation juniper_carpet_texture = modLoc("block/juniper_carpet");
       carpet("juniper_carpet_item", juniper_carpet_texture);
       //lantern
        //regular
        withExistingParent("juniper_lantern_item", modLoc("block/juniper_lantern"));
        //soul
          withExistingParent("juniper_soul_lantern_item", modLoc("block/juniper_soul_lantern"));
       //chain
       withExistingParent("juniper_chain_item", modLoc("block/juniper_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("juniper_ladder_item", modLoc("block/juniper_ladder"));
       //table
       withExistingParent("juniper_table_item", modLoc("block/juniper_table"));
       //torches
        //regular
        withExistingParent("juniper_torch_item", modLoc("block/juniper_torch"));
        //redstone
          withExistingParent("juniper_redstone_torch_item", modLoc("block/juniper_redstone_torch"));
        //soul
          withExistingParent("juniper_soul_torch_item", modLoc("block/juniper_soul_torch"));
       //furnaces
       withExistingParent("juniper_furnace_item", modLoc("block/juniper_furnace_model_unlit"));
       //paths
       withExistingParent("juniper_stone_path_item", modLoc("block/juniper_stone_path"));
       //barrel
       withExistingParent("juniper_barrel_item", modLoc("block/juniper_barrel_model_closed"));
       //chair
       withExistingParent("juniper_chair_item", modLoc("block/juniper_chair"));
       //bed
       withExistingParent("juniper_bed_item", modLoc("block/juniper_bed"));
       //cabinet
       withExistingParent("small_juniper_cabinet_item", modLoc("block/juniper_cabinet"));
       withExistingParent("medium_juniper_cabinet_item", modLoc("block/medium_juniper_cabinet"));
    //==============================================================================================================================================
    //|                                                              Cherry                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("cherry_mush", mcLoc("item/generated")).texture("layer0", "item/cherry_mush");
       //ingot
        withExistingParent("cherry_ingot", mcLoc("item/generated")).texture("layer0", "item/cherry_ingot");
       //nugget
        withExistingParent("cherry_nugget", mcLoc("item/generated")).texture("layer0", "item/cherry_nugget");
       //block
        withExistingParent("cherry_block_item", modLoc("block/cherry_block"));
       //bricks block
        withExistingParent("cherry_bricks_block_item", modLoc("block/cherry_bricks_block"));
       //chiseled block
        withExistingParent("cherry_chiseled_block_item", modLoc("block/cherry_chiseled_block"));
       //tiles block
        withExistingParent("cherry_tiles_block_item", modLoc("block/cherry_tiles_block"));
       //slab
       slab("cherry_slab_item", modLoc("block/cherry_block"), modLoc("block/cherry_block"), modLoc("block/cherry_block"));
       //bricks slab
       slab("cherry_bricks_slab_item", modLoc("block/cherry_bricks_block"), modLoc("block/cherry_bricks_block"), modLoc("block/cherry_bricks_block"));
       //stairs
       stairs("cherry_stairs_item", modLoc("block/cherry_block"), modLoc("block/cherry_block"), modLoc("block/cherry_block"));
       //bricks stairs
       stairs("cherry_bricks_stairs_item", modLoc("block/cherry_bricks_block"), modLoc("block/cherry_bricks_block"), modLoc("block/cherry_bricks_block"));
       //bars
       withExistingParent("cherry_bars_item", mcLoc("item/generated")).texture("layer0", "block/cherry_bars");
       //doors
       withExistingParent("cherry_door_item", mcLoc("item/generated")).texture("layer0", "item/cherry_door_item");
       //button
       buttonInventory("cherry_button_item", modLoc("block/cherry_block"));
       //fence
       fenceInventory("cherry_fence_item", modLoc("block/cherry_block"));
       //gate
       withExistingParent("cherry_gate_item", modLoc("block/cherry_gate"));
       //pressure plate
       pressurePlate("cherry_pressure_plate_item", modLoc("block/cherry_block"));
       //sign
       withExistingParent("cherry_sign_item", mcLoc("item/generated")).texture("layer0", "item/cherry_sign");
       //trapdoor
       withExistingParent("cherry_trapdoor_item", modLoc("block/cherry_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("cherry_lamp_item", modLoc("block/cherry_lamp"));
       //carpet
       ResourceLocation cherry_carpet_texture = modLoc("block/cherry_carpet");
       carpet("cherry_carpet_item", cherry_carpet_texture);
       //lantern
        //regular
          withExistingParent("cherry_lantern_item", modLoc("block/cherry_lantern"));
        //soul
          withExistingParent("cherry_soul_lantern_item", modLoc("block/cherry_soul_lantern"));
       //chain
       withExistingParent("cherry_chain_item", modLoc("block/cherry_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("cherry_ladder_item", modLoc("block/cherry_ladder"));
       //table
       withExistingParent("cherry_table_item", modLoc("block/cherry_table"));
       //torches
        //regular
        withExistingParent("cherry_torch_item", modLoc("block/cherry_torch"));
        //redstone
          withExistingParent("cherry_redstone_torch_item", modLoc("block/cherry_redstone_torch"));
        //soul
          withExistingParent("cherry_soul_torch_item", modLoc("block/cherry_soul_torch"));
       //furnaces
       withExistingParent("cherry_furnace_item", modLoc("block/cherry_furnace_model_unlit"));
       //paths
       withExistingParent("cherry_stone_path_item", modLoc("block/cherry_stone_path"));
       //barrel
       withExistingParent("cherry_barrel_item", modLoc("block/cherry_barrel_model_closed"));
       //chair
       withExistingParent("cherry_chair_item", modLoc("block/cherry_chair"));
       //bed
       withExistingParent("cherry_bed_item", modLoc("block/cherry_bed"));
       //cabinet
       withExistingParent("small_cherry_cabinet_item", modLoc("block/cherry_cabinet"));
       withExistingParent("medium_cherry_cabinet_item", modLoc("block/medium_cherry_cabinet"));
    //==============================================================================================================================================
    //|                                                              Coconut                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("coconut_mush", mcLoc("item/generated")).texture("layer0", "item/coconut_mush");
       //ingot
        withExistingParent("coconut_ingot", mcLoc("item/generated")).texture("layer0", "item/coconut_ingot");
       //nugget
        withExistingParent("coconut_nugget", mcLoc("item/generated")).texture("layer0", "item/coconut_nugget");
       //block
        withExistingParent("coconut_block_item", modLoc("block/coconut_block"));
       //bricks block
        withExistingParent("coconut_bricks_block_item", modLoc("block/coconut_bricks_block"));
       //chiseled block
        withExistingParent("coconut_chiseled_block_item", modLoc("block/coconut_chiseled_block"));
       //tiles block
        withExistingParent("coconut_tiles_block_item", modLoc("block/coconut_tiles_block"));
       //slab
       slab("coconut_slab_item", modLoc("block/coconut_block"), modLoc("block/coconut_block"), modLoc("block/coconut_block"));
       //bricks slab
       slab("coconut_bricks_slab_item", modLoc("block/coconut_bricks_block"), modLoc("block/coconut_bricks_block"), modLoc("block/coconut_bricks_block"));
       //stairs
       stairs("coconut_stairs_item", modLoc("block/coconut_block"), modLoc("block/coconut_block"), modLoc("block/coconut_block"));
       //bricks stairs
       stairs("coconut_bricks_stairs_item", modLoc("block/coconut_bricks_block"), modLoc("block/coconut_bricks_block"), modLoc("block/coconut_bricks_block"));
       //bars
       withExistingParent("coconut_bars_item", mcLoc("item/generated")).texture("layer0", "block/coconut_bars");
       //doors
       withExistingParent("coconut_door_item", mcLoc("item/generated")).texture("layer0", "item/coconut_door_item");
       //button
       buttonInventory("coconut_button_item", modLoc("block/coconut_block"));
       //fence
       fenceInventory("coconut_fence_item", modLoc("block/coconut_block"));
       //gate
       withExistingParent("coconut_gate_item", modLoc("block/coconut_gate"));
       //pressure plate
       pressurePlate("coconut_pressure_plate_item", modLoc("block/coconut_block"));
       //sign
       withExistingParent("coconut_sign_item", mcLoc("item/generated")).texture("layer0", "item/coconut_sign");
       //trapdoor
       withExistingParent("coconut_trapdoor_item", modLoc("block/coconut_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("coconut_lamp_item", modLoc("block/coconut_lamp"));
       //carpet
       ResourceLocation coconut_carpet_texture = modLoc("block/coconut_carpet");
       carpet("coconut_carpet_item", coconut_carpet_texture);
       //lantern
        //regular
        withExistingParent("coconut_lantern_item", modLoc("block/coconut_lantern"));
        //soul
          withExistingParent("coconut_soul_lantern_item", modLoc("block/coconut_soul_lantern"));
       //chain
       withExistingParent("coconut_chain_item", modLoc("block/coconut_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("coconut_ladder_item", modLoc("block/coconut_ladder"));
       //table
       withExistingParent("coconut_table_item", modLoc("block/coconut_table"));
       //torches
        //regular
        withExistingParent("coconut_torch_item", modLoc("block/coconut_torch"));
        //redstone
          withExistingParent("coconut_redstone_torch_item", modLoc("block/coconut_redstone_torch"));
        //soul
          withExistingParent("coconut_soul_torch_item", modLoc("block/coconut_soul_torch"));
       //furnaces
       withExistingParent("coconut_furnace_item", modLoc("block/coconut_furnace_model_unlit"));
       //paths
       withExistingParent("coconut_stone_path_item", modLoc("block/coconut_stone_path"));
       //barrel
       withExistingParent("coconut_barrel_item", modLoc("block/coconut_barrel_model_closed"));
       //chair
       withExistingParent("coconut_chair_item", modLoc("block/coconut_chair"));
       //bed
       withExistingParent("coconut_bed_item", modLoc("block/coconut_bed"));
       //cabinet
       withExistingParent("small_coconut_cabinet_item", modLoc("block/coconut_cabinet"));
       withExistingParent("medium_coconut_cabinet_item", modLoc("block/medium_coconut_cabinet"));
    //==============================================================================================================================================
    //|                                                              Orange                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("orange_mush", mcLoc("item/generated")).texture("layer0", "item/orange_mush");
       //ingot
        withExistingParent("orange_ingot", mcLoc("item/generated")).texture("layer0", "item/orange_ingot");
       //nugget
        withExistingParent("orange_nugget", mcLoc("item/generated")).texture("layer0", "item/orange_nugget");
       //block
        withExistingParent("orange_block_item", modLoc("block/orange_block"));
       //bricks block
        withExistingParent("orange_bricks_block_item", modLoc("block/orange_bricks_block"));
       //chiseled block
        withExistingParent("orange_chiseled_block_item", modLoc("block/orange_chiseled_block"));
       //tiles block
        withExistingParent("orange_tiles_block_item", modLoc("block/orange_tiles_block"));
       //slab
        slab("orange_slab_item", modLoc("block/orange_block"), modLoc("block/orange_block"), modLoc("block/orange_block"));
       //bricks slab
        slab("orange_bricks_slab_item", modLoc("block/orange_bricks_block"), modLoc("block/orange_bricks_block"), modLoc("block/orange_bricks_block"));
       //stairs
        stairs("orange_stairs_item", modLoc("block/orange_block"), modLoc("block/orange_block"), modLoc("block/orange_block"));
       //bricks stairs
        stairs("orange_bricks_stairs_item", modLoc("block/orange_bricks_block"), modLoc("block/orange_bricks_block"), modLoc("block/orange_bricks_block"));
       //bars
        withExistingParent("orange_bars_item", mcLoc("item/generated")).texture("layer0", "block/orange_bars");
       //doors
        withExistingParent("orange_door_item", mcLoc("item/generated")).texture("layer0", "item/orange_door_item");
       //button
        buttonInventory("orange_button_item", modLoc("block/orange_block"));
       //fence
        fenceInventory("orange_fence_item", modLoc("block/orange_block"));
       //gate
        withExistingParent("orange_gate_item", modLoc("block/orange_gate"));
       //pressure plate
        pressurePlate("orange_pressure_plate_item", modLoc("block/orange_block"));
       //sign
       withExistingParent("orange_sign_item", mcLoc("item/generated")).texture("layer0", "item/orange_sign");
       //trapdoor
       withExistingParent("orange_trapdoor_item", modLoc("block/orange_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("orange_lamp_item", modLoc("block/orange_lamp"));
       //carpet
       ResourceLocation orange_carpet_texture = modLoc("block/orange_carpet");
       carpet("orange_carpet_item", orange_carpet_texture);
       //lantern
        //regular
        withExistingParent("orange_lantern_item", modLoc("block/orange_lantern"));
        //soul
          withExistingParent("orange_soul_lantern_item", modLoc("block/orange_soul_lantern"));
       //chain
       withExistingParent("orange_chain_item", modLoc("block/orange_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("orange_ladder_item", modLoc("block/orange_ladder"));
       //table
       withExistingParent("orange_table_item", modLoc("block/orange_table"));
       //torches
        //regular
        withExistingParent("orange_torch_item", modLoc("block/orange_torch"));
        //redstone
          withExistingParent("orange_redstone_torch_item", modLoc("block/orange_redstone_torch"));
        //soul
          withExistingParent("orange_soul_torch_item", modLoc("block/orange_soul_torch"));
       //furnaces
       withExistingParent("orange_furnace_item", modLoc("block/orange_furnace_model_unlit"));
       //paths
       withExistingParent("orange_stone_path_item", modLoc("block/orange_stone_path"));
       //barrel
       withExistingParent("orange_barrel_item", modLoc("block/orange_barrel_model_closed"));
  }
}

// .rootTransforms().scale(0.5f).translation(-0.25f, -0.25f, -0.25f)
//        .end();