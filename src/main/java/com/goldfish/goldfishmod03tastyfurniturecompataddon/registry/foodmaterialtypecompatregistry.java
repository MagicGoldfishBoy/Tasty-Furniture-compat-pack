package com.goldfish.goldfishmod03tastyfurniturecompataddon.registry;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.TastyFurnitureCompatAddon;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.client.model.obj.ObjMaterialLibrary.Material;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class foodmaterialtypecompatregistry {

    public static final BlockSetType PLANT = BlockSetType.register(
     new BlockSetType(
     "plant", 
     true, 
     true, 
     true, 
     BlockSetType.PressurePlateSensitivity.EVERYTHING, 
     SoundType.ROOTS, 
     SoundEvents.ROOTED_DIRT_HIT, 
     SoundEvents.ROOTED_DIRT_HIT, 
     SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, 
     SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN, 
     SoundEvents.ROOTS_FALL, 
     SoundEvents.ROOTS_FALL, 
     SoundEvents.ROOTS_HIT, 
     SoundEvents.ROOTS_HIT
     )
    );
    public static final BlockSetType MEAT = BlockSetType.register(
     new BlockSetType(
     "meat", 
     true, 
     false, 
     false, 
     BlockSetType.PressurePlateSensitivity.EVERYTHING, 
     SoundType.MUD, 
     SoundEvents.MUD_HIT, 
     SoundEvents.MUD_HIT, 
     SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, 
     SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN, 
     SoundEvents.MAGMA_CUBE_SQUISH_SMALL, 
     SoundEvents.MAGMA_CUBE_SQUISH_SMALL, 
     SoundEvents.MAGMA_CUBE_SQUISH, 
     SoundEvents.MAGMA_CUBE_SQUISH
    )
    );
    public static final BlockSetType CRYSTAL = BlockSetType.register(
     new BlockSetType(
     "crystal", 
     true, 
     false, 
     false, 
     BlockSetType.PressurePlateSensitivity.EVERYTHING, 
     SoundType.BASALT, 
     SoundEvents.BASALT_HIT, 
     SoundEvents.BASALT_HIT, 
     SoundEvents.BASALT_HIT, 
     SoundEvents.BASALT_HIT, 
     SoundEvents.BASALT_PLACE, 
     SoundEvents.BASALT_PLACE, 
     SoundEvents.BASALT_FALL, 
     SoundEvents.BASALT_FALL
    )
    );
    public static final WoodType ELDERBERRYWOODMAT = WoodType.register(
     new WoodType(
        "elderberry_wood_mat", 
        PLANT) 
    );
    public static final WoodType JUNIPERWOODMAT = WoodType.register(
     new WoodType(
        "juniper_wood_mat", 
        PLANT) 
    );
    public static final WoodType CHERRYWOODMAT = WoodType.register(
     new WoodType(
        "cherry_wood_mat", 
        PLANT) 
    );
    public static final WoodType COCONUTWOODMAT = WoodType.register(
     new WoodType(
        "coconut_wood_mat", 
        PLANT) 
    );
    public static final WoodType ORANGEWOODMAT = WoodType.register(
     new WoodType(
        "orange_wood_mat", 
        PLANT) 
    );
    public static final WoodType CORNWOODMAT = WoodType.register(
     new WoodType(
        "corn_wood_mat", 
        PLANT) 
    );
    public static final WoodType ONIONWOODMAT = WoodType.register(
     new WoodType(
        "onion_wood_mat", 
        PLANT) 
    );
    public static final WoodType PECANWOODMAT = WoodType.register(
     new WoodType(
        "pecan_wood_mat", 
        PLANT) 
    );
    public static final WoodType LEMONWOODMAT = WoodType.register(
     new WoodType(
        "lemon_wood_mat", 
        PLANT) 
    );

}
