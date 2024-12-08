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
       //chair
       withExistingParent("orange_chair_item", modLoc("block/orange_chair"));
       //bed
       withExistingParent("orange_bed_item", modLoc("block/orange_bed"));
       //cabinet
       withExistingParent("small_orange_cabinet_item", modLoc("block/orange_cabinet"));
       withExistingParent("medium_orange_cabinet_item", modLoc("block/medium_orange_cabinet"));
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
  }
}

// .rootTransforms().scale(0.5f).translation(-0.25f, -0.25f, -0.25f)
//        .end();