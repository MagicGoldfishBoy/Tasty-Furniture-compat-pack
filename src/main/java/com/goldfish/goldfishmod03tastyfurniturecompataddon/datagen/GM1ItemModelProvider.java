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
    //|                                                            Blackcherry                                                                     |
    //==============================================================================================================================================
       //mush
        withExistingParent("blackcherry_mush", mcLoc("item/generated")).texture("layer0", "item/blackcherry_mush");
       //ingot
        withExistingParent("blackcherry_ingot", mcLoc("item/generated")).texture("layer0", "item/blackcherry_ingot");
       //nugget
        withExistingParent("blackcherry_nugget", mcLoc("item/generated")).texture("layer0", "item/blackcherry_nugget");
       //block
        withExistingParent("blackcherry_block_item", modLoc("block/blackcherry_block"));
       //bricks block
        withExistingParent("blackcherry_bricks_block_item", modLoc("block/blackcherry_bricks_block"));
       //chiseled block
        withExistingParent("blackcherry_chiseled_block_item", modLoc("block/blackcherry_chiseled_block"));
       //tiles block
        withExistingParent("blackcherry_tiles_block_item", modLoc("block/blackcherry_tiles_block"));
       //slab
       slab("blackcherry_slab_item", modLoc("block/blackcherry_block"), modLoc("block/blackcherry_block"), 
       modLoc("block/blackcherry_block"));
       //bricks slab
       slab("blackcherry_bricks_slab_item", modLoc("block/blackcherry_bricks_block"), modLoc("block/blackcherry_bricks_block"), 
       modLoc("block/blackcherry_bricks_block"));
       //stairs
       stairs("blackcherry_stairs_item", modLoc("block/blackcherry_block"), modLoc("block/blackcherry_block"), 
       modLoc("block/blackcherry_block"));
       //bricks stairs
       stairs("blackcherry_bricks_stairs_item", modLoc("block/blackcherry_bricks_block"), modLoc("block/blackcherry_bricks_block"), 
       modLoc("block/blackcherry_bricks_block"));
       //bars
       withExistingParent("blackcherry_bars_item", mcLoc("item/generated")).texture("layer0", "block/blackcherry_bars");
       //doors
       withExistingParent("blackcherry_door_item", mcLoc("item/generated")).texture("layer0", "item/blackcherry_door_item");
       //button
       buttonInventory("blackcherry_button_item", modLoc("block/blackcherry_block"));
       //fence
       fenceInventory("blackcherry_fence_item", modLoc("block/blackcherry_block"));
       //gate
       withExistingParent("blackcherry_gate_item", modLoc("block/blackcherry_gate"));
       //pressure plate
       pressurePlate("blackcherry_pressure_plate_item", modLoc("block/blackcherry_block"));
       //sign
       withExistingParent("blackcherry_sign_item", mcLoc("item/generated")).texture("layer0", "item/blackcherry_sign");
       //trapdoor
       withExistingParent("blackcherry_trapdoor_item", modLoc("block/blackcherry_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("blackcherry_lamp_item", modLoc("block/blackcherry_lamp"));
       //carpet
       ResourceLocation blackcherry_carpet_texture = modLoc("block/blackcherry_carpet");
       carpet("blackcherry_carpet_item", blackcherry_carpet_texture);
       //lantern
        //regular
          withExistingParent("blackcherry_lantern_item", modLoc("block/blackcherry_lantern"));
        //soul
          withExistingParent("blackcherry_soul_lantern_item", modLoc("block/blackcherry_soul_lantern"));
       //chain
       withExistingParent("blackcherry_chain_item", modLoc("block/blackcherry_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("blackcherry_ladder_item", modLoc("block/blackcherry_ladder"));
       //table
       withExistingParent("blackcherry_table_item", modLoc("block/blackcherry_table"));
       //torches
        //regular
        withExistingParent("blackcherry_torch_item", modLoc("block/blackcherry_torch"));
        //redstone
          withExistingParent("blackcherry_redstone_torch_item", modLoc("block/blackcherry_redstone_torch"));
        //soul
          withExistingParent("blackcherry_soul_torch_item", modLoc("block/blackcherry_soul_torch"));
       //furnaces
       withExistingParent("blackcherry_furnace_item", modLoc("block/blackcherry_furnace_model_unlit"));
       //paths
       withExistingParent("blackcherry_stone_path_item", modLoc("block/blackcherry_stone_path"));
       //barrel
       withExistingParent("blackcherry_barrel_item", modLoc("block/blackcherry_barrel_model_closed"));
       //chair
       withExistingParent("blackcherry_chair_item", modLoc("block/blackcherry_chair"));
       //bed
       withExistingParent("blackcherry_bed_item", modLoc("block/blackcherry_bed"));
       //cabinet
       withExistingParent("small_blackcherry_cabinet_item", modLoc("block/blackcherry_cabinet"));
       withExistingParent("medium_blackcherry_cabinet_item", modLoc("block/medium_blackcherry_cabinet"));
    //==============================================================================================================================================
    //|                                                              Coconut                                                                       |
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
       //chair
       withExistingParent("orange_chair_item", modLoc("block/orange_chair"));
       //bed
       withExistingParent("orange_bed_item", modLoc("block/orange_bed"));
       //cabinet
       withExistingParent("small_orange_cabinet_item", modLoc("block/orange_cabinet"));
       withExistingParent("medium_orange_cabinet_item", modLoc("block/medium_orange_cabinet"));
    //==============================================================================================================================================
    //|                                                              Tangerine                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("tangerine_mush", mcLoc("item/generated")).texture("layer0", "item/tangerine_mush");
       //ingot
        withExistingParent("tangerine_ingot", mcLoc("item/generated")).texture("layer0", "item/tangerine_ingot");
       //nugget
        withExistingParent("tangerine_nugget", mcLoc("item/generated")).texture("layer0", "item/tangerine_nugget");
       //block
        withExistingParent("tangerine_block_item", modLoc("block/tangerine_block"));
       //bricks block
        withExistingParent("tangerine_bricks_block_item", modLoc("block/tangerine_bricks_block"));
       //chiseled block
        withExistingParent("tangerine_chiseled_block_item", modLoc("block/tangerine_chiseled_block"));
       //tiles block
        withExistingParent("tangerine_tiles_block_item", modLoc("block/tangerine_tiles_block"));
       //slab
        slab("tangerine_slab_item", modLoc("block/tangerine_block"), modLoc("block/tangerine_block"), modLoc("block/tangerine_block"));
       //bricks slab
        slab("tangerine_bricks_slab_item", modLoc("block/tangerine_bricks_block"), modLoc("block/tangerine_bricks_block"), modLoc("block/tangerine_bricks_block"));
       //stairs
        stairs("tangerine_stairs_item", modLoc("block/tangerine_block"), modLoc("block/tangerine_block"), modLoc("block/tangerine_block"));
       //bricks stairs
        stairs("tangerine_bricks_stairs_item", modLoc("block/tangerine_bricks_block"), modLoc("block/tangerine_bricks_block"), modLoc("block/tangerine_bricks_block"));
       //bars
        withExistingParent("tangerine_bars_item", mcLoc("item/generated")).texture("layer0", "block/tangerine_bars");
       //doors
        withExistingParent("tangerine_door_item", mcLoc("item/generated")).texture("layer0", "item/tangerine_door_item");
       //button
        buttonInventory("tangerine_button_item", modLoc("block/tangerine_block"));
       //fence
        fenceInventory("tangerine_fence_item", modLoc("block/tangerine_block"));
       //gate
        withExistingParent("tangerine_gate_item", modLoc("block/tangerine_gate"));
       //pressure plate
        pressurePlate("tangerine_pressure_plate_item", modLoc("block/tangerine_block"));
       //sign
       withExistingParent("tangerine_sign_item", mcLoc("item/generated")).texture("layer0", "item/tangerine_sign");
       //trapdoor
       withExistingParent("tangerine_trapdoor_item", modLoc("block/tangerine_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("tangerine_lamp_item", modLoc("block/tangerine_lamp"));
       //carpet
       ResourceLocation tangerine_carpet_texture = modLoc("block/tangerine_carpet");
       carpet("tangerine_carpet_item", tangerine_carpet_texture);
       //lantern
        //regular
        withExistingParent("tangerine_lantern_item", modLoc("block/tangerine_lantern"));
        //soul
          withExistingParent("tangerine_soul_lantern_item", modLoc("block/tangerine_soul_lantern"));
       //chain
       withExistingParent("tangerine_chain_item", modLoc("block/tangerine_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("tangerine_ladder_item", modLoc("block/tangerine_ladder"));
       //table
       withExistingParent("tangerine_table_item", modLoc("block/tangerine_table"));
       //torches
        //regular
        withExistingParent("tangerine_torch_item", modLoc("block/tangerine_torch"));
        //redstone
          withExistingParent("tangerine_redstone_torch_item", modLoc("block/tangerine_redstone_torch"));
        //soul
          withExistingParent("tangerine_soul_torch_item", modLoc("block/tangerine_soul_torch"));
       //furnaces
       withExistingParent("tangerine_furnace_item", modLoc("block/tangerine_furnace_model_unlit"));
       //paths
       withExistingParent("tangerine_stone_path_item", modLoc("block/tangerine_stone_path"));
       //barrel
       withExistingParent("tangerine_barrel_item", modLoc("block/tangerine_barrel_model_closed"));
       //chair
       withExistingParent("tangerine_chair_item", modLoc("block/tangerine_chair"));
       //bed
       withExistingParent("tangerine_bed_item", modLoc("block/tangerine_bed"));
       //cabinet
       withExistingParent("small_tangerine_cabinet_item", modLoc("block/tangerine_cabinet"));
       withExistingParent("medium_tangerine_cabinet_item", modLoc("block/medium_tangerine_cabinet"));
    //==============================================================================================================================================
    //|                                                              Persimmon                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("persimmon_mush", mcLoc("item/generated")).texture("layer0", "item/persimmon_mush");
       //ingot
        withExistingParent("persimmon_ingot", mcLoc("item/generated")).texture("layer0", "item/persimmon_ingot");
       //nugget
        withExistingParent("persimmon_nugget", mcLoc("item/generated")).texture("layer0", "item/persimmon_nugget");
       //block
        withExistingParent("persimmon_block_item", modLoc("block/persimmon_block"));
       //bricks block
        withExistingParent("persimmon_bricks_block_item", modLoc("block/persimmon_bricks_block"));
       //chiseled block
        withExistingParent("persimmon_chiseled_block_item", modLoc("block/persimmon_chiseled_block"));
       //tiles block
        withExistingParent("persimmon_tiles_block_item", modLoc("block/persimmon_tiles_block"));
       //slab
        slab("persimmon_slab_item", modLoc("block/persimmon_block"), modLoc("block/persimmon_block"), modLoc("block/persimmon_block"));
       //bricks slab
        slab("persimmon_bricks_slab_item", modLoc("block/persimmon_bricks_block"), modLoc("block/persimmon_bricks_block"), modLoc("block/persimmon_bricks_block"));
       //stairs
        stairs("persimmon_stairs_item", modLoc("block/persimmon_block"), modLoc("block/persimmon_block"), modLoc("block/persimmon_block"));
       //bricks stairs
        stairs("persimmon_bricks_stairs_item", modLoc("block/persimmon_bricks_block"), modLoc("block/persimmon_bricks_block"), modLoc("block/persimmon_bricks_block"));
       //bars
        withExistingParent("persimmon_bars_item", mcLoc("item/generated")).texture("layer0", "block/persimmon_bars");
       //doors
        withExistingParent("persimmon_door_item", mcLoc("item/generated")).texture("layer0", "item/persimmon_door_item");
       //button
        buttonInventory("persimmon_button_item", modLoc("block/persimmon_block"));
       //fence
        fenceInventory("persimmon_fence_item", modLoc("block/persimmon_block"));
       //gate
        withExistingParent("persimmon_gate_item", modLoc("block/persimmon_gate"));
       //pressure plate
        pressurePlate("persimmon_pressure_plate_item", modLoc("block/persimmon_block"));
       //sign
       withExistingParent("persimmon_sign_item", mcLoc("item/generated")).texture("layer0", "item/persimmon_sign");
       //trapdoor
       withExistingParent("persimmon_trapdoor_item", modLoc("block/persimmon_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("persimmon_lamp_item", modLoc("block/persimmon_lamp"));
       //carpet
       ResourceLocation persimmon_carpet_texture = modLoc("block/persimmon_carpet");
       carpet("persimmon_carpet_item", persimmon_carpet_texture);
       //lantern
        //regular
        withExistingParent("persimmon_lantern_item", modLoc("block/persimmon_lantern"));
        //soul
          withExistingParent("persimmon_soul_lantern_item", modLoc("block/persimmon_soul_lantern"));
       //chain
       withExistingParent("persimmon_chain_item", modLoc("block/persimmon_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("persimmon_ladder_item", modLoc("block/persimmon_ladder"));
       //table
       withExistingParent("persimmon_table_item", modLoc("block/persimmon_table"));
       //torches
        //regular
        withExistingParent("persimmon_torch_item", modLoc("block/persimmon_torch"));
        //redstone
          withExistingParent("persimmon_redstone_torch_item", modLoc("block/persimmon_redstone_torch"));
        //soul
          withExistingParent("persimmon_soul_torch_item", modLoc("block/persimmon_soul_torch"));
       //furnaces
       withExistingParent("persimmon_furnace_item", modLoc("block/persimmon_furnace_model_unlit"));
       //paths
       withExistingParent("persimmon_stone_path_item", modLoc("block/persimmon_stone_path"));
       //barrel
       withExistingParent("persimmon_barrel_item", modLoc("block/persimmon_barrel_model_closed"));
       //chair
       withExistingParent("persimmon_chair_item", modLoc("block/persimmon_chair"));
       //bed
       withExistingParent("persimmon_bed_item", modLoc("block/persimmon_bed"));
       //cabinet
       withExistingParent("small_persimmon_cabinet_item", modLoc("block/persimmon_cabinet"));
       withExistingParent("medium_persimmon_cabinet_item", modLoc("block/medium_persimmon_cabinet"));
    //==============================================================================================================================================
    //|                                                              Satsuma                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("satsuma_mush", mcLoc("item/generated")).texture("layer0", "item/satsuma_mush");
       //ingot
        withExistingParent("satsuma_ingot", mcLoc("item/generated")).texture("layer0", "item/satsuma_ingot");
       //nugget
        withExistingParent("satsuma_nugget", mcLoc("item/generated")).texture("layer0", "item/satsuma_nugget");
       //block
        withExistingParent("satsuma_block_item", modLoc("block/satsuma_block"));
       //bricks block
        withExistingParent("satsuma_bricks_block_item", modLoc("block/satsuma_bricks_block"));
       //chiseled block
        withExistingParent("satsuma_chiseled_block_item", modLoc("block/satsuma_chiseled_block"));
       //tiles block
        withExistingParent("satsuma_tiles_block_item", modLoc("block/satsuma_tiles_block"));
       //slab
        slab("satsuma_slab_item", modLoc("block/satsuma_block"), modLoc("block/satsuma_block"), modLoc("block/satsuma_block"));
       //bricks slab
        slab("satsuma_bricks_slab_item", modLoc("block/satsuma_bricks_block"), modLoc("block/satsuma_bricks_block"), modLoc("block/satsuma_bricks_block"));
       //stairs
        stairs("satsuma_stairs_item", modLoc("block/satsuma_block"), modLoc("block/satsuma_block"), modLoc("block/satsuma_block"));
       //bricks stairs
        stairs("satsuma_bricks_stairs_item", modLoc("block/satsuma_bricks_block"), modLoc("block/satsuma_bricks_block"), modLoc("block/satsuma_bricks_block"));
       //bars
        withExistingParent("satsuma_bars_item", mcLoc("item/generated")).texture("layer0", "block/satsuma_bars");
       //doors
        withExistingParent("satsuma_door_item", mcLoc("item/generated")).texture("layer0", "item/satsuma_door_item");
       //button
        buttonInventory("satsuma_button_item", modLoc("block/satsuma_block"));
       //fence
        fenceInventory("satsuma_fence_item", modLoc("block/satsuma_block"));
       //gate
        withExistingParent("satsuma_gate_item", modLoc("block/satsuma_gate"));
       //pressure plate
        pressurePlate("satsuma_pressure_plate_item", modLoc("block/satsuma_block"));
       //sign
       withExistingParent("satsuma_sign_item", mcLoc("item/generated")).texture("layer0", "item/satsuma_sign");
       //trapdoor
       withExistingParent("satsuma_trapdoor_item", modLoc("block/satsuma_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("satsuma_lamp_item", modLoc("block/satsuma_lamp"));
       //carpet
       ResourceLocation satsuma_carpet_texture = modLoc("block/satsuma_carpet");
       carpet("satsuma_carpet_item", satsuma_carpet_texture);
       //lantern
        //regular
        withExistingParent("satsuma_lantern_item", modLoc("block/satsuma_lantern"));
        //soul
          withExistingParent("satsuma_soul_lantern_item", modLoc("block/satsuma_soul_lantern"));
       //chain
       withExistingParent("satsuma_chain_item", modLoc("block/satsuma_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("satsuma_ladder_item", modLoc("block/satsuma_ladder"));
       //table
       withExistingParent("satsuma_table_item", modLoc("block/satsuma_table"));
       //torches
        //regular
        withExistingParent("satsuma_torch_item", modLoc("block/satsuma_torch"));
        //redstone
          withExistingParent("satsuma_redstone_torch_item", modLoc("block/satsuma_redstone_torch"));
        //soul
          withExistingParent("satsuma_soul_torch_item", modLoc("block/satsuma_soul_torch"));
       //furnaces
       withExistingParent("satsuma_furnace_item", modLoc("block/satsuma_furnace_model_unlit"));
       //paths
       withExistingParent("satsuma_stone_path_item", modLoc("block/satsuma_stone_path"));
       //barrel
       withExistingParent("satsuma_barrel_item", modLoc("block/satsuma_barrel_model_closed"));
       //chair
       withExistingParent("satsuma_chair_item", modLoc("block/satsuma_chair"));
       //bed
       withExistingParent("satsuma_bed_item", modLoc("block/satsuma_bed"));
       //cabinet
       withExistingParent("small_satsuma_cabinet_item", modLoc("block/satsuma_cabinet"));
       withExistingParent("medium_satsuma_cabinet_item", modLoc("block/medium_satsuma_cabinet"));
    //==============================================================================================================================================
    //|                                                              Mandarin                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("mandarin_mush", mcLoc("item/generated")).texture("layer0", "item/mandarin_mush");
       //ingot
        withExistingParent("mandarin_ingot", mcLoc("item/generated")).texture("layer0", "item/mandarin_ingot");
       //nugget
        withExistingParent("mandarin_nugget", mcLoc("item/generated")).texture("layer0", "item/mandarin_nugget");
       //block
        withExistingParent("mandarin_block_item", modLoc("block/mandarin_block"));
       //bricks block
        withExistingParent("mandarin_bricks_block_item", modLoc("block/mandarin_bricks_block"));
       //chiseled block
        withExistingParent("mandarin_chiseled_block_item", modLoc("block/mandarin_chiseled_block"));
       //tiles block
        withExistingParent("mandarin_tiles_block_item", modLoc("block/mandarin_tiles_block"));
       //slab
        slab("mandarin_slab_item", modLoc("block/mandarin_block"), modLoc("block/mandarin_block"), modLoc("block/mandarin_block"));
       //bricks slab
        slab("mandarin_bricks_slab_item", modLoc("block/mandarin_bricks_block"), modLoc("block/mandarin_bricks_block"), modLoc("block/mandarin_bricks_block"));
       //stairs
        stairs("mandarin_stairs_item", modLoc("block/mandarin_block"), modLoc("block/mandarin_block"), modLoc("block/mandarin_block"));
       //bricks stairs
        stairs("mandarin_bricks_stairs_item", modLoc("block/mandarin_bricks_block"), modLoc("block/mandarin_bricks_block"), modLoc("block/mandarin_bricks_block"));
       //bars
        withExistingParent("mandarin_bars_item", mcLoc("item/generated")).texture("layer0", "block/mandarin_bars");
       //doors
        withExistingParent("mandarin_door_item", mcLoc("item/generated")).texture("layer0", "item/mandarin_door_item");
       //button
        buttonInventory("mandarin_button_item", modLoc("block/mandarin_block"));
       //fence
        fenceInventory("mandarin_fence_item", modLoc("block/mandarin_block"));
       //gate
        withExistingParent("mandarin_gate_item", modLoc("block/mandarin_gate"));
       //pressure plate
        pressurePlate("mandarin_pressure_plate_item", modLoc("block/mandarin_block"));
       //sign
       withExistingParent("mandarin_sign_item", mcLoc("item/generated")).texture("layer0", "item/mandarin_sign");
       //trapdoor
       withExistingParent("mandarin_trapdoor_item", modLoc("block/mandarin_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("mandarin_lamp_item", modLoc("block/mandarin_lamp"));
       //carpet
       ResourceLocation mandarin_carpet_texture = modLoc("block/mandarin_carpet");
       carpet("mandarin_carpet_item", mandarin_carpet_texture);
       //lantern
        //regular
        withExistingParent("mandarin_lantern_item", modLoc("block/mandarin_lantern"));
        //soul
          withExistingParent("mandarin_soul_lantern_item", modLoc("block/mandarin_soul_lantern"));
       //chain
       withExistingParent("mandarin_chain_item", modLoc("block/mandarin_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("mandarin_ladder_item", modLoc("block/mandarin_ladder"));
       //table
       withExistingParent("mandarin_table_item", modLoc("block/mandarin_table"));
       //torches
        //regular
        withExistingParent("mandarin_torch_item", modLoc("block/mandarin_torch"));
        //redstone
          withExistingParent("mandarin_redstone_torch_item", modLoc("block/mandarin_redstone_torch"));
        //soul
          withExistingParent("mandarin_soul_torch_item", modLoc("block/mandarin_soul_torch"));
       //furnaces
       withExistingParent("mandarin_furnace_item", modLoc("block/mandarin_furnace_model_unlit"));
       //paths
       withExistingParent("mandarin_stone_path_item", modLoc("block/mandarin_stone_path"));
       //barrel
       withExistingParent("mandarin_barrel_item", modLoc("block/mandarin_barrel_model_closed"));
       //chair
       withExistingParent("mandarin_chair_item", modLoc("block/mandarin_chair"));
       //bed
       withExistingParent("mandarin_bed_item", modLoc("block/mandarin_bed"));
       //cabinet
       withExistingParent("small_mandarin_cabinet_item", modLoc("block/mandarin_cabinet"));
       withExistingParent("medium_mandarin_cabinet_item", modLoc("block/medium_mandarin_cabinet"));
    //==============================================================================================================================================
    //|                                                              Lemon                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("lemon_mush", mcLoc("item/generated")).texture("layer0", "item/lemon_mush");
       //ingot
        withExistingParent("lemon_ingot", mcLoc("item/generated")).texture("layer0", "item/lemon_ingot");
       //nugget
        withExistingParent("lemon_nugget", mcLoc("item/generated")).texture("layer0", "item/lemon_nugget");
       //block
        withExistingParent("lemon_block_item", modLoc("block/lemon_block"));
       //bricks block
        withExistingParent("lemon_bricks_block_item", modLoc("block/lemon_bricks_block"));
       //chiseled block
        withExistingParent("lemon_chiseled_block_item", modLoc("block/lemon_chiseled_block"));
       //tiles block
        withExistingParent("lemon_tiles_block_item", modLoc("block/lemon_tiles_block"));
       //slab
        slab("lemon_slab_item", modLoc("block/lemon_block"), modLoc("block/lemon_block"), modLoc("block/lemon_block"));
       //bricks slab
        slab("lemon_bricks_slab_item", modLoc("block/lemon_bricks_block"), modLoc("block/lemon_bricks_block"), modLoc("block/lemon_bricks_block"));
       //stairs
        stairs("lemon_stairs_item", modLoc("block/lemon_block"), modLoc("block/lemon_block"), modLoc("block/lemon_block"));
       //bricks stairs
        stairs("lemon_bricks_stairs_item", modLoc("block/lemon_bricks_block"), modLoc("block/lemon_bricks_block"), modLoc("block/lemon_bricks_block"));
       //bars
        withExistingParent("lemon_bars_item", mcLoc("item/generated")).texture("layer0", "block/lemon_bars");
       //doors
        withExistingParent("lemon_door_item", mcLoc("item/generated")).texture("layer0", "item/lemon_door_item");
       //button
        buttonInventory("lemon_button_item", modLoc("block/lemon_block"));
       //fence
        fenceInventory("lemon_fence_item", modLoc("block/lemon_block"));
       //gate
        withExistingParent("lemon_gate_item", modLoc("block/lemon_gate"));
       //pressure plate
        pressurePlate("lemon_pressure_plate_item", modLoc("block/lemon_block"));
       //sign
       withExistingParent("lemon_sign_item", mcLoc("item/generated")).texture("layer0", "item/lemon_sign");
       //trapdoor
       withExistingParent("lemon_trapdoor_item", modLoc("block/lemon_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("lemon_lamp_item", modLoc("block/lemon_lamp"));
       //carpet
       ResourceLocation lemon_carpet_texture = modLoc("block/lemon_carpet");
       carpet("lemon_carpet_item", lemon_carpet_texture);
       //lantern
        //regular
        withExistingParent("lemon_lantern_item", modLoc("block/lemon_lantern"));
        //soul
          withExistingParent("lemon_soul_lantern_item", modLoc("block/lemon_soul_lantern"));
       //chain
       withExistingParent("lemon_chain_item", modLoc("block/lemon_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("lemon_ladder_item", modLoc("block/lemon_ladder"));
       //table
       withExistingParent("lemon_table_item", modLoc("block/lemon_table"));
       //torches
        //regular
        withExistingParent("lemon_torch_item", modLoc("block/lemon_torch"));
        //redstone
          withExistingParent("lemon_redstone_torch_item", modLoc("block/lemon_redstone_torch"));
        //soul
          withExistingParent("lemon_soul_torch_item", modLoc("block/lemon_soul_torch"));
       //furnaces
       withExistingParent("lemon_furnace_item", modLoc("block/lemon_furnace_model_unlit"));
       //paths
       withExistingParent("lemon_stone_path_item", modLoc("block/lemon_stone_path"));
       //barrel
       withExistingParent("lemon_barrel_item", modLoc("block/lemon_barrel_model_closed"));
       //chair
       withExistingParent("lemon_chair_item", modLoc("block/lemon_chair"));
       //bed
       withExistingParent("lemon_bed_item", modLoc("block/lemon_bed"));
       //cabinet
       withExistingParent("small_lemon_cabinet_item", modLoc("block/lemon_cabinet"));
       withExistingParent("medium_lemon_cabinet_item", modLoc("block/medium_lemon_cabinet"));
    //==============================================================================================================================================
    //|                                                              Buddhashand                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("buddhashand_mush", mcLoc("item/generated")).texture("layer0", "item/buddhashand_mush");
       //ingot
        withExistingParent("buddhashand_ingot", mcLoc("item/generated")).texture("layer0", "item/buddhashand_ingot");
       //nugget
        withExistingParent("buddhashand_nugget", mcLoc("item/generated")).texture("layer0", "item/buddhashand_nugget");
       //block
        withExistingParent("buddhashand_block_item", modLoc("block/buddhashand_block"));
       //bricks block
        withExistingParent("buddhashand_bricks_block_item", modLoc("block/buddhashand_bricks_block"));
       //chiseled block
        withExistingParent("buddhashand_chiseled_block_item", modLoc("block/buddhashand_chiseled_block"));
       //tiles block
        withExistingParent("buddhashand_tiles_block_item", modLoc("block/buddhashand_tiles_block"));
       //slab
        slab("buddhashand_slab_item", modLoc("block/buddhashand_block"), modLoc("block/buddhashand_block"), modLoc("block/buddhashand_block"));
       //bricks slab
        slab("buddhashand_bricks_slab_item", modLoc("block/buddhashand_bricks_block"), modLoc("block/buddhashand_bricks_block"), modLoc("block/buddhashand_bricks_block"));
       //stairs
        stairs("buddhashand_stairs_item", modLoc("block/buddhashand_block"), modLoc("block/buddhashand_block"), modLoc("block/buddhashand_block"));
       //bricks stairs
        stairs("buddhashand_bricks_stairs_item", modLoc("block/buddhashand_bricks_block"), modLoc("block/buddhashand_bricks_block"), modLoc("block/buddhashand_bricks_block"));
       //bars
        withExistingParent("buddhashand_bars_item", mcLoc("item/generated")).texture("layer0", "block/buddhashand_bars");
       //doors
        withExistingParent("buddhashand_door_item", mcLoc("item/generated")).texture("layer0", "item/buddhashand_door_item");
       //button
        buttonInventory("buddhashand_button_item", modLoc("block/buddhashand_block"));
       //fence
        fenceInventory("buddhashand_fence_item", modLoc("block/buddhashand_block"));
       //gate
        withExistingParent("buddhashand_gate_item", modLoc("block/buddhashand_gate"));
       //pressure plate
        pressurePlate("buddhashand_pressure_plate_item", modLoc("block/buddhashand_block"));
       //sign
       withExistingParent("buddhashand_sign_item", mcLoc("item/generated")).texture("layer0", "item/buddhashand_sign");
       //trapdoor
       withExistingParent("buddhashand_trapdoor_item", modLoc("block/buddhashand_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("buddhashand_lamp_item", modLoc("block/buddhashand_lamp"));
       //carpet
       ResourceLocation buddhashand_carpet_texture = modLoc("block/buddhashand_carpet");
       carpet("buddhashand_carpet_item", buddhashand_carpet_texture);
       //lantern
        //regular
        withExistingParent("buddhashand_lantern_item", modLoc("block/buddhashand_lantern"));
        //soul
          withExistingParent("buddhashand_soul_lantern_item", modLoc("block/buddhashand_soul_lantern"));
       //chain
       withExistingParent("buddhashand_chain_item", modLoc("block/buddhashand_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("buddhashand_ladder_item", modLoc("block/buddhashand_ladder"));
       //table
       withExistingParent("buddhashand_table_item", modLoc("block/buddhashand_table"));
       //torches
        //regular
        withExistingParent("buddhashand_torch_item", modLoc("block/buddhashand_torch"));
        //redstone
          withExistingParent("buddhashand_redstone_torch_item", modLoc("block/buddhashand_redstone_torch"));
        //soul
          withExistingParent("buddhashand_soul_torch_item", modLoc("block/buddhashand_soul_torch"));
       //furnaces
       withExistingParent("buddhashand_furnace_item", modLoc("block/buddhashand_furnace_model_unlit"));
       //paths
       withExistingParent("buddhashand_stone_path_item", modLoc("block/buddhashand_stone_path"));
       //barrel
       withExistingParent("buddhashand_barrel_item", modLoc("block/buddhashand_barrel_model_closed"));
       //chair
       withExistingParent("buddhashand_chair_item", modLoc("block/buddhashand_chair"));
       //bed
       withExistingParent("buddhashand_bed_item", modLoc("block/buddhashand_bed"));
       //cabinet
       withExistingParent("small_buddhashand_cabinet_item", modLoc("block/buddhashand_cabinet"));
       withExistingParent("medium_buddhashand_cabinet_item", modLoc("block/medium_buddhashand_cabinet"));
    //==============================================================================================================================================
    //|                                                              Lime                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("lime_mush", mcLoc("item/generated")).texture("layer0", "item/lime_mush");
       //ingot
        withExistingParent("lime_ingot", mcLoc("item/generated")).texture("layer0", "item/lime_ingot");
       //nugget
        withExistingParent("lime_nugget", mcLoc("item/generated")).texture("layer0", "item/lime_nugget");
       //block
        withExistingParent("lime_block_item", modLoc("block/lime_block"));
       //bricks block
        withExistingParent("lime_bricks_block_item", modLoc("block/lime_bricks_block"));
       //chiseled block
        withExistingParent("lime_chiseled_block_item", modLoc("block/lime_chiseled_block"));
       //tiles block
        withExistingParent("lime_tiles_block_item", modLoc("block/lime_tiles_block"));
       //slab
        slab("lime_slab_item", modLoc("block/lime_block"), modLoc("block/lime_block"), modLoc("block/lime_block"));
       //bricks slab
        slab("lime_bricks_slab_item", modLoc("block/lime_bricks_block"), modLoc("block/lime_bricks_block"), modLoc("block/lime_bricks_block"));
       //stairs
        stairs("lime_stairs_item", modLoc("block/lime_block"), modLoc("block/lime_block"), modLoc("block/lime_block"));
       //bricks stairs
        stairs("lime_bricks_stairs_item", modLoc("block/lime_bricks_block"), modLoc("block/lime_bricks_block"), modLoc("block/lime_bricks_block"));
       //bars
        withExistingParent("lime_bars_item", mcLoc("item/generated")).texture("layer0", "block/lime_bars");
       //doors
        withExistingParent("lime_door_item", mcLoc("item/generated")).texture("layer0", "item/lime_door_item");
       //button
        buttonInventory("lime_button_item", modLoc("block/lime_block"));
       //fence
        fenceInventory("lime_fence_item", modLoc("block/lime_block"));
       //gate
        withExistingParent("lime_gate_item", modLoc("block/lime_gate"));
       //pressure plate
        pressurePlate("lime_pressure_plate_item", modLoc("block/lime_block"));
       //sign
        withExistingParent("lime_sign_item", mcLoc("item/generated")).texture("layer0", "item/lime_sign");
       //trapdoor
       withExistingParent("lime_trapdoor_item", modLoc("block/lime_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("lime_lamp_item", modLoc("block/lime_lamp"));
       //carpet
       ResourceLocation lime_carpet_texture = modLoc("block/lime_carpet");
       carpet("lime_carpet_item", lime_carpet_texture);
       //lantern
        //regular
        withExistingParent("lime_lantern_item", modLoc("block/lime_lantern"));
        //soul
          withExistingParent("lime_soul_lantern_item", modLoc("block/lime_soul_lantern"));
       //chain
       withExistingParent("lime_chain_item", modLoc("block/lime_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("lime_ladder_item", modLoc("block/lime_ladder"));
       //table
       withExistingParent("lime_table_item", modLoc("block/lime_table"));
       //torches
        //regular
        withExistingParent("lime_torch_item", modLoc("block/lime_torch"));
        //redstone
          withExistingParent("lime_redstone_torch_item", modLoc("block/lime_redstone_torch"));
        //soul
          withExistingParent("lime_soul_torch_item", modLoc("block/lime_soul_torch"));
       //furnaces
       withExistingParent("lime_furnace_item", modLoc("block/lime_furnace_model_unlit"));
       //paths
       withExistingParent("lime_stone_path_item", modLoc("block/lime_stone_path"));
       //barrel
       withExistingParent("lime_barrel_item", modLoc("block/lime_barrel_model_closed"));
       //chair
       withExistingParent("lime_chair_item", modLoc("block/lime_chair"));
       //bed
       withExistingParent("lime_bed_item", modLoc("block/lime_bed"));
       //cabinet
       withExistingParent("small_lime_cabinet_item", modLoc("block/lime_cabinet"));
       withExistingParent("medium_lime_cabinet_item", modLoc("block/medium_lime_cabinet"));
    //==============================================================================================================================================
    //|                                                              Keylime                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("keylime_mush", mcLoc("item/generated")).texture("layer0", "item/keylime_mush");
       //ingot
        withExistingParent("keylime_ingot", mcLoc("item/generated")).texture("layer0", "item/keylime_ingot");
       //nugget
        withExistingParent("keylime_nugget", mcLoc("item/generated")).texture("layer0", "item/keylime_nugget");
       //block
        withExistingParent("keylime_block_item", modLoc("block/keylime_block"));
       //bricks block
        withExistingParent("keylime_bricks_block_item", modLoc("block/keylime_bricks_block"));
       //chiseled block
        withExistingParent("keylime_chiseled_block_item", modLoc("block/keylime_chiseled_block"));
       //tiles block
        withExistingParent("keylime_tiles_block_item", modLoc("block/keylime_tiles_block"));
       //slab
        slab("keylime_slab_item", modLoc("block/keylime_block"), modLoc("block/keylime_block"), modLoc("block/keylime_block"));
       //bricks slab
        slab("keylime_bricks_slab_item", modLoc("block/keylime_bricks_block"), modLoc("block/keylime_bricks_block"), modLoc("block/keylime_bricks_block"));
       //stairs
        stairs("keylime_stairs_item", modLoc("block/keylime_block"), modLoc("block/keylime_block"), modLoc("block/keylime_block"));
       //bricks stairs
        stairs("keylime_bricks_stairs_item", modLoc("block/keylime_bricks_block"), modLoc("block/keylime_bricks_block"), modLoc("block/keylime_bricks_block"));
       //bars
        withExistingParent("keylime_bars_item", mcLoc("item/generated")).texture("layer0", "block/keylime_bars");
       //doors
        withExistingParent("keylime_door_item", mcLoc("item/generated")).texture("layer0", "item/keylime_door_item");
       //button
        buttonInventory("keylime_button_item", modLoc("block/keylime_block"));
       //fence
        fenceInventory("keylime_fence_item", modLoc("block/keylime_block"));
       //gate
        withExistingParent("keylime_gate_item", modLoc("block/keylime_gate"));
       //pressure plate
        pressurePlate("keylime_pressure_plate_item", modLoc("block/keylime_block"));
       //sign
        withExistingParent("keylime_sign_item", mcLoc("item/generated")).texture("layer0", "item/keylime_sign");
       //trapdoor
       withExistingParent("keylime_trapdoor_item", modLoc("block/keylime_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("keylime_lamp_item", modLoc("block/keylime_lamp"));
       //carpet
       ResourceLocation keylime_carpet_texture = modLoc("block/keylime_carpet");
       carpet("keylime_carpet_item", keylime_carpet_texture);
       //lantern
        //regular
        withExistingParent("keylime_lantern_item", modLoc("block/keylime_lantern"));
        //soul
          withExistingParent("keylime_soul_lantern_item", modLoc("block/keylime_soul_lantern"));
       //chain
       withExistingParent("keylime_chain_item", modLoc("block/keylime_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("keylime_ladder_item", modLoc("block/keylime_ladder"));
       //table
       withExistingParent("keylime_table_item", modLoc("block/keylime_table"));
       //torches
        //regular
        withExistingParent("keylime_torch_item", modLoc("block/keylime_torch"));
        //redstone
          withExistingParent("keylime_redstone_torch_item", modLoc("block/keylime_redstone_torch"));
        //soul
          withExistingParent("keylime_soul_torch_item", modLoc("block/keylime_soul_torch"));
       //furnaces
       withExistingParent("keylime_furnace_item", modLoc("block/keylime_furnace_model_unlit"));
       //paths
       withExistingParent("keylime_stone_path_item", modLoc("block/keylime_stone_path"));
       //barrel
       withExistingParent("keylime_barrel_item", modLoc("block/keylime_barrel_model_closed"));
       //chair
       withExistingParent("keylime_chair_item", modLoc("block/keylime_chair"));
       //bed
       withExistingParent("keylime_bed_item", modLoc("block/keylime_bed"));
       //cabinet
       withExistingParent("small_keylime_cabinet_item", modLoc("block/keylime_cabinet"));
       withExistingParent("medium_keylime_cabinet_item", modLoc("block/medium_keylime_cabinet"));
    //==============================================================================================================================================
    //|                                                              Fingerlime                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("fingerlime_mush", mcLoc("item/generated")).texture("layer0", "item/fingerlime_mush");
       //ingot
        withExistingParent("fingerlime_ingot", mcLoc("item/generated")).texture("layer0", "item/fingerlime_ingot");
       //nugget
        withExistingParent("fingerlime_nugget", mcLoc("item/generated")).texture("layer0", "item/fingerlime_nugget");
       //block
        withExistingParent("fingerlime_block_item", modLoc("block/fingerlime_block"));
       //bricks block
        withExistingParent("fingerlime_bricks_block_item", modLoc("block/fingerlime_bricks_block"));
       //chiseled block
        withExistingParent("fingerlime_chiseled_block_item", modLoc("block/fingerlime_chiseled_block"));
       //tiles block
        withExistingParent("fingerlime_tiles_block_item", modLoc("block/fingerlime_tiles_block"));
       //slab
        slab("fingerlime_slab_item", modLoc("block/fingerlime_block"), modLoc("block/fingerlime_block"), modLoc("block/fingerlime_block"));
       //bricks slab
        slab("fingerlime_bricks_slab_item", modLoc("block/fingerlime_bricks_block"), modLoc("block/fingerlime_bricks_block"), modLoc("block/fingerlime_bricks_block"));
       //stairs
        stairs("fingerlime_stairs_item", modLoc("block/fingerlime_block"), modLoc("block/fingerlime_block"), modLoc("block/fingerlime_block"));
       //bricks stairs
        stairs("fingerlime_bricks_stairs_item", modLoc("block/fingerlime_bricks_block"), modLoc("block/fingerlime_bricks_block"), modLoc("block/fingerlime_bricks_block"));
       //bars
        withExistingParent("fingerlime_bars_item", mcLoc("item/generated")).texture("layer0", "block/fingerlime_bars");
       //doors
        withExistingParent("fingerlime_door_item", mcLoc("item/generated")).texture("layer0", "item/fingerlime_door_item");
       //button
        buttonInventory("fingerlime_button_item", modLoc("block/fingerlime_block"));
       //fence
        fenceInventory("fingerlime_fence_item", modLoc("block/fingerlime_block"));
       //gate
        withExistingParent("fingerlime_gate_item", modLoc("block/fingerlime_gate"));
       //pressure plate
        pressurePlate("fingerlime_pressure_plate_item", modLoc("block/fingerlime_block"));
       //sign
        withExistingParent("fingerlime_sign_item", mcLoc("item/generated")).texture("layer0", "item/fingerlime_sign");
       //trapdoor
       withExistingParent("fingerlime_trapdoor_item", modLoc("block/fingerlime_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("fingerlime_lamp_item", modLoc("block/fingerlime_lamp"));
       //carpet
       ResourceLocation fingerlime_carpet_texture = modLoc("block/fingerlime_carpet");
       carpet("fingerlime_carpet_item", fingerlime_carpet_texture);
       //lantern
        //regular
        withExistingParent("fingerlime_lantern_item", modLoc("block/fingerlime_lantern"));
        //soul
          withExistingParent("fingerlime_soul_lantern_item", modLoc("block/fingerlime_soul_lantern"));
       //chain
       withExistingParent("fingerlime_chain_item", modLoc("block/fingerlime_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("fingerlime_ladder_item", modLoc("block/fingerlime_ladder"));
       //table
       withExistingParent("fingerlime_table_item", modLoc("block/fingerlime_table"));
       //torches
        //regular
        withExistingParent("fingerlime_torch_item", modLoc("block/fingerlime_torch"));
        //redstone
          withExistingParent("fingerlime_redstone_torch_item", modLoc("block/fingerlime_redstone_torch"));
        //soul
          withExistingParent("fingerlime_soul_torch_item", modLoc("block/fingerlime_soul_torch"));
       //furnaces
       withExistingParent("fingerlime_furnace_item", modLoc("block/fingerlime_furnace_model_unlit"));
       //paths
       withExistingParent("fingerlime_stone_path_item", modLoc("block/fingerlime_stone_path"));
       //barrel
       withExistingParent("fingerlime_barrel_item", modLoc("block/fingerlime_barrel_model_closed"));
       //chair
       withExistingParent("fingerlime_chair_item", modLoc("block/fingerlime_chair"));
       //bed
       withExistingParent("fingerlime_bed_item", modLoc("block/fingerlime_bed"));
       //cabinet
       withExistingParent("small_fingerlime_cabinet_item", modLoc("block/fingerlime_cabinet"));
       withExistingParent("medium_fingerlime_cabinet_item", modLoc("block/medium_fingerlime_cabinet"));
    //==============================================================================================================================================
    //|                                                            Grapefruit                                                                      |
    //==============================================================================================================================================
       //mush
        withExistingParent("grapefruit_mush", mcLoc("item/generated")).texture("layer0", "item/grapefruit_mush");
       //ingot
        withExistingParent("grapefruit_ingot", mcLoc("item/generated")).texture("layer0", "item/grapefruit_ingot");
       //nugget
        withExistingParent("grapefruit_nugget", mcLoc("item/generated")).texture("layer0", "item/grapefruit_nugget");
       //block
        withExistingParent("grapefruit_block_item", modLoc("block/grapefruit_block"));
       //bricks block
        withExistingParent("grapefruit_bricks_block_item", modLoc("block/grapefruit_bricks_block"));
       //chiseled block
        withExistingParent("grapefruit_chiseled_block_item", modLoc("block/grapefruit_chiseled_block"));
       //tiles block
        withExistingParent("grapefruit_tiles_block_item", modLoc("block/grapefruit_tiles_block"));
       //slab
        slab("grapefruit_slab_item", modLoc("block/grapefruit_block"), modLoc("block/grapefruit_block"), modLoc("block/grapefruit_block"));
       //bricks slab
        slab("grapefruit_bricks_slab_item", modLoc("block/grapefruit_bricks_block"), modLoc("block/grapefruit_bricks_block"), modLoc("block/grapefruit_bricks_block"));
       //stairs
        stairs("grapefruit_stairs_item", modLoc("block/grapefruit_block"), modLoc("block/grapefruit_block"), modLoc("block/grapefruit_block"));
       //bricks stairs
        stairs("grapefruit_bricks_stairs_item", modLoc("block/grapefruit_bricks_block"), modLoc("block/grapefruit_bricks_block"), modLoc("block/grapefruit_bricks_block"));
       //bars
        withExistingParent("grapefruit_bars_item", mcLoc("item/generated")).texture("layer0", "block/grapefruit_bars");
       //doors
        withExistingParent("grapefruit_door_item", mcLoc("item/generated")).texture("layer0", "item/grapefruit_door_item");
       //button
        buttonInventory("grapefruit_button_item", modLoc("block/grapefruit_block"));
       //fence
        fenceInventory("grapefruit_fence_item", modLoc("block/grapefruit_block"));
       //gate
        withExistingParent("grapefruit_gate_item", modLoc("block/grapefruit_gate"));
       //pressure plate
        pressurePlate("grapefruit_pressure_plate_item", modLoc("block/grapefruit_block"));
       //sign
        withExistingParent("grapefruit_sign_item", mcLoc("item/generated")).texture("layer0", "item/grapefruit_sign");
       //trapdoor
       withExistingParent("grapefruit_trapdoor_item", modLoc("block/grapefruit_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("grapefruit_lamp_item", modLoc("block/grapefruit_lamp"));
       //carpet
       ResourceLocation grapefruit_carpet_texture = modLoc("block/grapefruit_carpet");
       carpet("grapefruit_carpet_item", grapefruit_carpet_texture);
       //lantern
        //regular
        withExistingParent("grapefruit_lantern_item", modLoc("block/grapefruit_lantern"));
        //soul
          withExistingParent("grapefruit_soul_lantern_item", modLoc("block/grapefruit_soul_lantern"));
       //chain
       withExistingParent("grapefruit_chain_item", modLoc("block/grapefruit_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("grapefruit_ladder_item", modLoc("block/grapefruit_ladder"));
       //table
       withExistingParent("grapefruit_table_item", modLoc("block/grapefruit_table"));
       //torches
        //regular
        withExistingParent("grapefruit_torch_item", modLoc("block/grapefruit_torch"));
        //redstone
          withExistingParent("grapefruit_redstone_torch_item", modLoc("block/grapefruit_redstone_torch"));
        //soul
          withExistingParent("grapefruit_soul_torch_item", modLoc("block/grapefruit_soul_torch"));
       //furnaces
       withExistingParent("grapefruit_furnace_item", modLoc("block/grapefruit_furnace_model_unlit"));
       //paths
       withExistingParent("grapefruit_stone_path_item", modLoc("block/grapefruit_stone_path"));
       //barrel
       withExistingParent("grapefruit_barrel_item", modLoc("block/grapefruit_barrel_model_closed"));
       //chair
       withExistingParent("grapefruit_chair_item", modLoc("block/grapefruit_chair"));
       //bed
       withExistingParent("grapefruit_bed_item", modLoc("block/grapefruit_bed"));
       //cabinet
       withExistingParent("small_grapefruit_cabinet_item", modLoc("block/grapefruit_cabinet"));
       withExistingParent("medium_grapefruit_cabinet_item", modLoc("block/medium_grapefruit_cabinet"));
    //==============================================================================================================================================
    //|                                                            Pomelo                                                                      |
    //==============================================================================================================================================
       //mush
        withExistingParent("pomelo_mush", mcLoc("item/generated")).texture("layer0", "item/pomelo_mush");
       //ingot
        withExistingParent("pomelo_ingot", mcLoc("item/generated")).texture("layer0", "item/pomelo_ingot");
       //nugget
        withExistingParent("pomelo_nugget", mcLoc("item/generated")).texture("layer0", "item/pomelo_nugget");
       //block
        withExistingParent("pomelo_block_item", modLoc("block/pomelo_block"));
       //bricks block
        withExistingParent("pomelo_bricks_block_item", modLoc("block/pomelo_bricks_block"));
       //chiseled block
        withExistingParent("pomelo_chiseled_block_item", modLoc("block/pomelo_chiseled_block"));
       //tiles block
        withExistingParent("pomelo_tiles_block_item", modLoc("block/pomelo_tiles_block"));
       //slab
        slab("pomelo_slab_item", modLoc("block/pomelo_block"), modLoc("block/pomelo_block"), modLoc("block/pomelo_block"));
       //bricks slab
        slab("pomelo_bricks_slab_item", modLoc("block/pomelo_bricks_block"), modLoc("block/pomelo_bricks_block"), modLoc("block/pomelo_bricks_block"));
       //stairs
        stairs("pomelo_stairs_item", modLoc("block/pomelo_block"), modLoc("block/pomelo_block"), modLoc("block/pomelo_block"));
       //bricks stairs
        stairs("pomelo_bricks_stairs_item", modLoc("block/pomelo_bricks_block"), modLoc("block/pomelo_bricks_block"), modLoc("block/pomelo_bricks_block"));
       //bars
        withExistingParent("pomelo_bars_item", mcLoc("item/generated")).texture("layer0", "block/pomelo_bars");
       //doors
        withExistingParent("pomelo_door_item", mcLoc("item/generated")).texture("layer0", "item/pomelo_door_item");
       //button
        buttonInventory("pomelo_button_item", modLoc("block/pomelo_block"));
       //fence
        fenceInventory("pomelo_fence_item", modLoc("block/pomelo_block"));
       //gate
        withExistingParent("pomelo_gate_item", modLoc("block/pomelo_gate"));
       //pressure plate
        pressurePlate("pomelo_pressure_plate_item", modLoc("block/pomelo_block"));
       //sign
        withExistingParent("pomelo_sign_item", mcLoc("item/generated")).texture("layer0", "item/pomelo_sign");
       //trapdoor
       withExistingParent("pomelo_trapdoor_item", modLoc("block/pomelo_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("pomelo_lamp_item", modLoc("block/pomelo_lamp"));
       //carpet
       ResourceLocation pomelo_carpet_texture = modLoc("block/pomelo_carpet");
       carpet("pomelo_carpet_item", pomelo_carpet_texture);
       //lantern
        //regular
        withExistingParent("pomelo_lantern_item", modLoc("block/pomelo_lantern"));
        //soul
          withExistingParent("pomelo_soul_lantern_item", modLoc("block/pomelo_soul_lantern"));
       //chain
       withExistingParent("pomelo_chain_item", modLoc("block/pomelo_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("pomelo_ladder_item", modLoc("block/pomelo_ladder"));
       //table
       withExistingParent("pomelo_table_item", modLoc("block/pomelo_table"));
       //torches
        //regular
        withExistingParent("pomelo_torch_item", modLoc("block/pomelo_torch"));
        //redstone
          withExistingParent("pomelo_redstone_torch_item", modLoc("block/pomelo_redstone_torch"));
        //soul
          withExistingParent("pomelo_soul_torch_item", modLoc("block/pomelo_soul_torch"));
       //furnaces
       withExistingParent("pomelo_furnace_item", modLoc("block/pomelo_furnace_model_unlit"));
       //paths
       withExistingParent("pomelo_stone_path_item", modLoc("block/pomelo_stone_path"));
       //barrel
       withExistingParent("pomelo_barrel_item", modLoc("block/pomelo_barrel_model_closed"));
       //chair
       withExistingParent("pomelo_chair_item", modLoc("block/pomelo_chair"));
       //bed
       withExistingParent("pomelo_bed_item", modLoc("block/pomelo_bed"));
       //cabinet
       withExistingParent("small_pomelo_cabinet_item", modLoc("block/pomelo_cabinet"));
       withExistingParent("medium_pomelo_cabinet_item", modLoc("block/medium_pomelo_cabinet"));
    //==============================================================================================================================================
    //|                                                              Corn                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("corn_mush", mcLoc("item/generated")).texture("layer0", "item/corn_mush");
       //ingot
        withExistingParent("corn_ingot", mcLoc("item/generated")).texture("layer0", "item/corn_ingot");
       //nugget
        withExistingParent("corn_nugget", mcLoc("item/generated")).texture("layer0", "item/corn_nugget");
       //block
        withExistingParent("corn_block_item", modLoc("block/corn_block"));
       //bricks block
        withExistingParent("corn_bricks_block_item", modLoc("block/corn_bricks_block"));
       //chiseled block
        withExistingParent("corn_chiseled_block_item", modLoc("block/corn_chiseled_block"));
       //tiles block
        withExistingParent("corn_tiles_block_item", modLoc("block/corn_tiles_block"));
       //slab
        slab("corn_slab_item", modLoc("block/corn_block"), modLoc("block/corn_block"), modLoc("block/corn_block"));
       //bricks slab
        slab("corn_bricks_slab_item", modLoc("block/corn_bricks_block"), modLoc("block/corn_bricks_block"), modLoc("block/corn_bricks_block"));
       //stairs
        stairs("corn_stairs_item", modLoc("block/corn_block"), modLoc("block/corn_block"), modLoc("block/corn_block"));
       //bricks stairs
        stairs("corn_bricks_stairs_item", modLoc("block/corn_bricks_block"), modLoc("block/corn_bricks_block"), modLoc("block/corn_bricks_block"));
       //bars
        withExistingParent("corn_bars_item", mcLoc("item/generated")).texture("layer0", "block/corn_bars");
       //doors
        withExistingParent("corn_door_item", mcLoc("item/generated")).texture("layer0", "item/corn_door_item");
       //button
        buttonInventory("corn_button_item", modLoc("block/corn_block"));
       //fence
        fenceInventory("corn_fence_item", modLoc("block/corn_block"));
       //gate
        withExistingParent("corn_gate_item", modLoc("block/corn_gate"));
       //pressure plate
        pressurePlate("corn_pressure_plate_item", modLoc("block/corn_block"));
       //sign
        withExistingParent("corn_sign_item", mcLoc("item/generated")).texture("layer0", "item/corn_sign");
       //trapdoor
       withExistingParent("corn_trapdoor_item", modLoc("block/corn_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("corn_lamp_item", modLoc("block/corn_lamp"));
       //carpet
       ResourceLocation corn_carpet_texture = modLoc("block/corn_carpet");
       carpet("corn_carpet_item", corn_carpet_texture);
       //lantern
        //regular
        withExistingParent("corn_lantern_item", modLoc("block/corn_lantern"));
        //soul
          withExistingParent("corn_soul_lantern_item", modLoc("block/corn_soul_lantern"));
       //chain
       withExistingParent("corn_chain_item", modLoc("block/corn_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("corn_ladder_item", modLoc("block/corn_ladder"));
       //table
       withExistingParent("corn_table_item", modLoc("block/corn_table"));
       //torches
        //regular
        withExistingParent("corn_torch_item", modLoc("block/corn_torch"));
        //redstone
          withExistingParent("corn_redstone_torch_item", modLoc("block/corn_redstone_torch"));
        //soul
          withExistingParent("corn_soul_torch_item", modLoc("block/corn_soul_torch"));
       //furnaces
       withExistingParent("corn_furnace_item", modLoc("block/corn_furnace_model_unlit"));
       //paths
       withExistingParent("corn_stone_path_item", modLoc("block/corn_stone_path"));
       //barrel
       withExistingParent("corn_barrel_item", modLoc("block/corn_barrel_model_closed"));
       //chair
       withExistingParent("corn_chair_item", modLoc("block/corn_chair"));
       //bed
       withExistingParent("corn_bed_item", modLoc("block/corn_bed"));
       //cabinet
       withExistingParent("small_corn_cabinet_item", modLoc("block/corn_cabinet"));
       withExistingParent("medium_corn_cabinet_item", modLoc("block/medium_corn_cabinet"));
    //==============================================================================================================================================
    //|                                                              Onion                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("onion_mush", mcLoc("item/generated")).texture("layer0", "item/onion_mush");
       //ingot
        withExistingParent("onion_ingot", mcLoc("item/generated")).texture("layer0", "item/onion_ingot");
       //nugget
        withExistingParent("onion_nugget", mcLoc("item/generated")).texture("layer0", "item/onion_nugget");
       //block
        withExistingParent("onion_block_item", modLoc("block/onion_block"));
       //bricks block
        withExistingParent("onion_bricks_block_item", modLoc("block/onion_bricks_block"));
       //chiseled block
        withExistingParent("onion_chiseled_block_item", modLoc("block/onion_chiseled_block"));
       //tiles block
        withExistingParent("onion_tiles_block_item", modLoc("block/onion_tiles_block"));
       //slab
        slab("onion_slab_item", modLoc("block/onion_block"), modLoc("block/onion_block"), modLoc("block/onion_block"));
       //bricks slab
        slab("onion_bricks_slab_item", modLoc("block/onion_bricks_block"), modLoc("block/onion_bricks_block"), modLoc("block/onion_bricks_block"));
       //stairs
        stairs("onion_stairs_item", modLoc("block/onion_block"), modLoc("block/onion_block"), modLoc("block/onion_block"));
       //bricks stairs
        stairs("onion_bricks_stairs_item", modLoc("block/onion_bricks_block"), modLoc("block/onion_bricks_block"), modLoc("block/onion_bricks_block"));
       //bars
        withExistingParent("onion_bars_item", mcLoc("item/generated")).texture("layer0", "block/onion_bars");
       //doors
        withExistingParent("onion_door_item", mcLoc("item/generated")).texture("layer0", "item/onion_door_item");
       //button
        buttonInventory("onion_button_item", modLoc("block/onion_block"));
       //fence
        fenceInventory("onion_fence_item", modLoc("block/onion_block"));
       //gate
        withExistingParent("onion_gate_item", modLoc("block/onion_gate"));
       //pressure plate
        pressurePlate("onion_pressure_plate_item", modLoc("block/onion_block"));
       //sign
        withExistingParent("onion_sign_item", mcLoc("item/generated")).texture("layer0", "item/onion_sign");
       //trapdoor
       withExistingParent("onion_trapdoor_item", modLoc("block/onion_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("onion_lamp_item", modLoc("block/onion_lamp"));
       //carpet
       ResourceLocation onion_carpet_texture = modLoc("block/onion_carpet");
       carpet("onion_carpet_item", onion_carpet_texture);
       //lantern
        //regular
        withExistingParent("onion_lantern_item", modLoc("block/onion_lantern"));
        //soul
          withExistingParent("onion_soul_lantern_item", modLoc("block/onion_soul_lantern"));
       //chain
       withExistingParent("onion_chain_item", modLoc("block/onion_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("onion_ladder_item", modLoc("block/onion_ladder"));
       //table
       withExistingParent("onion_table_item", modLoc("block/onion_table"));
       //torches
        //regular
        withExistingParent("onion_torch_item", modLoc("block/onion_torch"));
        //redstone
          withExistingParent("onion_redstone_torch_item", modLoc("block/onion_redstone_torch"));
        //soul
          withExistingParent("onion_soul_torch_item", modLoc("block/onion_soul_torch"));
       //furnaces
       withExistingParent("onion_furnace_item", modLoc("block/onion_furnace_model_unlit"));
       //paths
       withExistingParent("onion_stone_path_item", modLoc("block/onion_stone_path"));
       //barrel
       withExistingParent("onion_barrel_item", modLoc("block/onion_barrel_model_closed"));
       //chair
       withExistingParent("onion_chair_item", modLoc("block/onion_chair"));
       //bed
       withExistingParent("onion_bed_item", modLoc("block/onion_bed"));
       //cabinet
       withExistingParent("small_onion_cabinet_item", modLoc("block/onion_cabinet"));
       withExistingParent("medium_onion_cabinet_item", modLoc("block/medium_onion_cabinet"));
    //==============================================================================================================================================
    //|                                                              Tomato                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("tomato_mush", mcLoc("item/generated")).texture("layer0", "item/tomato_mush");
       //ingot
        withExistingParent("tomato_ingot", mcLoc("item/generated")).texture("layer0", "item/tomato_ingot");
       //nugget
        withExistingParent("tomato_nugget", mcLoc("item/generated")).texture("layer0", "item/tomato_nugget");
       //block
        withExistingParent("tomato_block_item", modLoc("block/tomato_block"));
       //bricks block
        withExistingParent("tomato_bricks_block_item", modLoc("block/tomato_bricks_block"));
       //chiseled block
        withExistingParent("tomato_chiseled_block_item", modLoc("block/tomato_chiseled_block"));
       //tiles block
        withExistingParent("tomato_tiles_block_item", modLoc("block/tomato_tiles_block"));
       //slab
        slab("tomato_slab_item", modLoc("block/tomato_block"), modLoc("block/tomato_block"), modLoc("block/tomato_block"));
       //bricks slab
        slab("tomato_bricks_slab_item", modLoc("block/tomato_bricks_block"), modLoc("block/tomato_bricks_block"), modLoc("block/tomato_bricks_block"));
       //stairs
        stairs("tomato_stairs_item", modLoc("block/tomato_block"), modLoc("block/tomato_block"), modLoc("block/tomato_block"));
       //bricks stairs
        stairs("tomato_bricks_stairs_item", modLoc("block/tomato_bricks_block"), modLoc("block/tomato_bricks_block"), modLoc("block/tomato_bricks_block"));
       //bars
        withExistingParent("tomato_bars_item", mcLoc("item/generated")).texture("layer0", "block/tomato_bars");
       //doors
        withExistingParent("tomato_door_item", mcLoc("item/generated")).texture("layer0", "item/tomato_door_item");
       //button
        buttonInventory("tomato_button_item", modLoc("block/tomato_block"));
       //fence
        fenceInventory("tomato_fence_item", modLoc("block/tomato_block"));
       //gate
        withExistingParent("tomato_gate_item", modLoc("block/tomato_gate"));
       //pressure plate
        pressurePlate("tomato_pressure_plate_item", modLoc("block/tomato_block"));
       //sign
        withExistingParent("tomato_sign_item", mcLoc("item/generated")).texture("layer0", "item/tomato_sign");
       //trapdoor
       withExistingParent("tomato_trapdoor_item", modLoc("block/tomato_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("tomato_lamp_item", modLoc("block/tomato_lamp"));
       //carpet
       ResourceLocation tomato_carpet_texture = modLoc("block/tomato_carpet");
       carpet("tomato_carpet_item", tomato_carpet_texture);
       //lantern
        //regular
        withExistingParent("tomato_lantern_item", modLoc("block/tomato_lantern"));
        //soul
          withExistingParent("tomato_soul_lantern_item", modLoc("block/tomato_soul_lantern"));
       //chain
       withExistingParent("tomato_chain_item", modLoc("block/tomato_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("tomato_ladder_item", modLoc("block/tomato_ladder"));
       //table
       withExistingParent("tomato_table_item", modLoc("block/tomato_table"));
       //torches
        //regular
        withExistingParent("tomato_torch_item", modLoc("block/tomato_torch"));
        //redstone
          withExistingParent("tomato_redstone_torch_item", modLoc("block/tomato_redstone_torch"));
        //soul
          withExistingParent("tomato_soul_torch_item", modLoc("block/tomato_soul_torch"));
       //furnaces
       withExistingParent("tomato_furnace_item", modLoc("block/tomato_furnace_model_unlit"));
       //paths
       withExistingParent("tomato_stone_path_item", modLoc("block/tomato_stone_path"));
       //barrel
       withExistingParent("tomato_barrel_item", modLoc("block/tomato_barrel_model_closed"));
       //chair
       withExistingParent("tomato_chair_item", modLoc("block/tomato_chair"));
       //bed
       withExistingParent("tomato_bed_item", modLoc("block/tomato_bed"));
       //cabinet
       withExistingParent("small_tomato_cabinet_item", modLoc("block/tomato_cabinet"));
       withExistingParent("medium_tomato_cabinet_item", modLoc("block/medium_tomato_cabinet"));
    //==============================================================================================================================================
    //|                                                              Pecan                                                                        |
    //==============================================================================================================================================
       //mush
       withExistingParent("pecan_mush", mcLoc("item/generated")).texture("layer0", "item/pecan_mush");
       //ingot
        withExistingParent("pecan_ingot", mcLoc("item/generated")).texture("layer0", "item/pecan_ingot");
       //nugget
        withExistingParent("pecan_nugget", mcLoc("item/generated")).texture("layer0", "item/pecan_nugget");
       //block
        withExistingParent("pecan_block_item", modLoc("block/pecan_block"));
       //bricks block
        withExistingParent("pecan_bricks_block_item", modLoc("block/pecan_bricks_block"));
       //chiseled block
        withExistingParent("pecan_chiseled_block_item", modLoc("block/pecan_chiseled_block"));
       //tiles block
        withExistingParent("pecan_tiles_block_item", modLoc("block/pecan_tiles_block"));
       //slab
        slab("pecan_slab_item", modLoc("block/pecan_block"), modLoc("block/pecan_block"), modLoc("block/pecan_block"));
       //bricks slab
        slab("pecan_bricks_slab_item", modLoc("block/pecan_bricks_block"), modLoc("block/pecan_bricks_block"), modLoc("block/pecan_bricks_block"));
       //stairs
        stairs("pecan_stairs_item", modLoc("block/pecan_block"), modLoc("block/pecan_block"), modLoc("block/pecan_block"));
       //bricks stairs
        stairs("pecan_bricks_stairs_item", modLoc("block/pecan_bricks_block"), modLoc("block/pecan_bricks_block"), modLoc("block/pecan_bricks_block"));
       //bars
       withExistingParent("pecan_bars_item", mcLoc("item/generated")).texture("layer0", "block/pecan_bars");
       //doors
        withExistingParent("pecan_door_item", mcLoc("item/generated")).texture("layer0", "item/pecan_door_item");
       //button
        buttonInventory("pecan_button_item", modLoc("block/pecan_block"));
       //fence
        fenceInventory("pecan_fence_item", modLoc("block/pecan_block"));
       //gate
        withExistingParent("pecan_gate_item", modLoc("block/pecan_gate"));
       //pressure plate
        pressurePlate("pecan_pressure_plate_item", modLoc("block/pecan_block"));
       //sign
       withExistingParent("pecan_sign_item", mcLoc("item/generated")).texture("layer0", "item/pecan_sign");
       //trapdoor
       withExistingParent("pecan_trapdoor_item", modLoc("block/pecan_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("pecan_lamp_item", modLoc("block/pecan_lamp"));
       //carpet
       ResourceLocation pecan_carpet_texture = modLoc("block/pecan_carpet");
       carpet("pecan_carpet_item", pecan_carpet_texture);
       //lantern
        //regular
        withExistingParent("pecan_lantern_item", modLoc("block/pecan_lantern"));
        //soul
          withExistingParent("pecan_soul_lantern_item", modLoc("block/pecan_soul_lantern"));
       //chain
       withExistingParent("pecan_chain_item", modLoc("block/pecan_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
       //ladder
       withExistingParent("pecan_ladder_item", modLoc("block/pecan_ladder"));
       //table
       withExistingParent("pecan_table_item", modLoc("block/pecan_table"));
       //torches
        //regular
        withExistingParent("pecan_torch_item", modLoc("block/pecan_torch"));
        //redstone
          withExistingParent("pecan_redstone_torch_item", modLoc("block/pecan_redstone_torch"));
        //soul
          withExistingParent("pecan_soul_torch_item", modLoc("block/pecan_soul_torch"));
       //furnaces
       withExistingParent("pecan_furnace_item", modLoc("block/pecan_furnace_model_unlit"));
       //paths
       withExistingParent("pecan_stone_path_item", modLoc("block/pecan_stone_path"));
       //barrel
       withExistingParent("pecan_barrel_item", modLoc("block/pecan_barrel_model_closed"));
       //chair
       withExistingParent("pecan_chair_item", modLoc("block/pecan_chair"));
       //bed
       withExistingParent("pecan_bed_item", modLoc("block/pecan_bed"));
       //cabinet
       withExistingParent("small_pecan_cabinet_item", modLoc("block/pecan_cabinet"));
       withExistingParent("medium_pecan_cabinet_item", modLoc("block/medium_pecan_cabinet"));
    //==============================================================================================================================================
    //|                                                              Almond                                                                        |
    //==============================================================================================================================================
       //mush
        withExistingParent("almond_mush", mcLoc("item/generated")).texture("layer0", "item/almond_mush");
       //ingot
        withExistingParent("almond_ingot", mcLoc("item/generated")).texture("layer0", "item/almond_ingot");
       //nugget
        withExistingParent("almond_nugget", mcLoc("item/generated")).texture("layer0", "item/almond_nugget");
       //block
        withExistingParent("almond_block_item", modLoc("block/almond_block"));
       //bricks block
        withExistingParent("almond_bricks_block_item", modLoc("block/almond_bricks_block"));
       //chiseled block
        withExistingParent("almond_chiseled_block_item", modLoc("block/almond_chiseled_block"));
       //tiles block
        withExistingParent("almond_tiles_block_item", modLoc("block/almond_tiles_block"));
       //slab
        slab("almond_slab_item", modLoc("block/almond_block"), modLoc("block/almond_block"), modLoc("block/almond_block"));
       //bricks slab
        slab("almond_bricks_slab_item", modLoc("block/almond_bricks_block"), modLoc("block/almond_bricks_block"), modLoc("block/almond_bricks_block"));
       //stairs
        stairs("almond_stairs_item", modLoc("block/almond_block"), modLoc("block/almond_block"), modLoc("block/almond_block"));
       //bricks stairs
        stairs("almond_bricks_stairs_item", modLoc("block/almond_bricks_block"), modLoc("block/almond_bricks_block"), modLoc("block/almond_bricks_block"));
       //bars
       withExistingParent("almond_bars_item", mcLoc("item/generated")).texture("layer0", "block/almond_bars");
       //doors
        withExistingParent("almond_door_item", mcLoc("item/generated")).texture("layer0", "item/almond_door_item");
       //button
        buttonInventory("almond_button_item", modLoc("block/almond_block"));
       //fence
        fenceInventory("almond_fence_item", modLoc("block/almond_block"));
       //gate
        withExistingParent("almond_gate_item", modLoc("block/almond_gate"));
       //pressure plate
        pressurePlate("almond_pressure_plate_item", modLoc("block/almond_block"));
       //sign
       withExistingParent("almond_sign_item", mcLoc("item/generated")).texture("layer0", "item/almond_sign");
       //trapdoor
       withExistingParent("almond_trapdoor_item", modLoc("block/almond_trapdoor_trapdoor_bottom"));
       //lamp
       withExistingParent("almond_lamp_item", modLoc("block/almond_lamp"));
       //carpet
       ResourceLocation almond_carpet_texture = modLoc("block/almond_carpet");
       carpet("almond_carpet_item", almond_carpet_texture);
       //lantern
        //regular
        withExistingParent("almond_lantern_item", modLoc("block/almond_lantern"));
        //soul
          withExistingParent("almond_soul_lantern_item", modLoc("block/almond_soul_lantern"));
       //chain
       withExistingParent("almond_chain_item", modLoc("block/almond_chain")).rootTransforms().scale(1.5f).translation(0.25f, 0.25f, 0.25f)
       .end();
      //ladder
       withExistingParent("almond_ladder_item", modLoc("block/almond_ladder"));
       //table
       withExistingParent("almond_table_item", modLoc("block/almond_table"));
       //torches
        //regular
        withExistingParent("almond_torch_item", modLoc("block/almond_torch"));
        //redstone
          withExistingParent("almond_redstone_torch_item", modLoc("block/almond_redstone_torch"));
        //soul
          withExistingParent("almond_soul_torch_item", modLoc("block/almond_soul_torch"));
       //furnaces
       withExistingParent("almond_furnace_item", modLoc("block/almond_furnace_model_unlit"));
       //paths
       withExistingParent("almond_stone_path_item", modLoc("block/almond_stone_path"));
       //barrel
       withExistingParent("almond_barrel_item", modLoc("block/almond_barrel_model_closed"));
       //chair
       withExistingParent("almond_chair_item", modLoc("block/almond_chair"));
       //bed
       withExistingParent("almond_bed_item", modLoc("block/almond_bed"));
       //cabinet
       withExistingParent("small_almond_cabinet_item", modLoc("block/almond_cabinet"));
       withExistingParent("medium_almond_cabinet_item", modLoc("block/medium_almond_cabinet"));
  }
}

// .rootTransforms().scale(0.5f).translation(-0.25f, -0.25f, -0.25f)
//        .end();