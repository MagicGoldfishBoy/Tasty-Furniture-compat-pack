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

public class foodmaterialtyperegistry {

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
    public static final WoodType APPLEWOODMAT = WoodType.register(
     new WoodType(
        "apple_wood_mat", 
        PLANT) 
    );
    public static final WoodType POTATOWOODMAT = WoodType.register(
     new WoodType(
        "potato_wood_mat", 
        PLANT) 
    );
    public static final WoodType BEETROOTWOODMAT = WoodType.register(
     new WoodType(
        "beetroot_wood_mat", 
        PLANT) 
    );
    public static final WoodType CARROTWOODMAT = WoodType.register(
     new WoodType(
        "carrot_wood_mat", 
        PLANT) 
    );
    public static final WoodType CHORUSWOODMAT = WoodType.register(
     new WoodType(
        "chorus_wood_mat", 
        PLANT) 
    );
    public static final WoodType GLOWBERRYWOODMAT = WoodType.register(
     new WoodType(
        "glowberry_wood_mat", 
        PLANT) 
    );
    public static final WoodType MELONWOODMAT = WoodType.register(
     new WoodType(
        "melon_wood_mat", 
        PLANT) 
    );
    public static final WoodType SWEETBERRYWOODMAT = WoodType.register(
     new WoodType(
        "sweetberry_wood_mat", 
        PLANT) 
    );
    public static final WoodType BROWNMUSHROOMWOODMAT = WoodType.register(
     new WoodType(
        "brownmushroom_wood_mat", 
        PLANT) 
    );
    public static final WoodType REDMUSHROOMWOODMAT = WoodType.register(
     new WoodType(
        "redmushroom_wood_mat", 
        PLANT) 
    );
    public static final WoodType PUMPKINWOODMAT = WoodType.register(
     new WoodType(
        "pumpkin_wood_mat", 
        PLANT) 
    );
    public static final WoodType CHICKENWOODMAT = WoodType.register(
     new WoodType(
        "chicken_wood_mat", 
        MEAT) 
    );
    public static final WoodType CODWOODMAT = WoodType.register(
     new WoodType(
        "cod_wood_mat", 
        MEAT) 
    );
    public static final WoodType SALMONWOODMAT = WoodType.register(
     new WoodType(
        "salmon_wood_mat", 
        MEAT) 
    );
    public static final WoodType TROPICALFISHWOODMAT = WoodType.register(
     new WoodType(
        "tropicalfish_wood_mat", 
        MEAT) 
    );
    public static final WoodType MUTTONWOODMAT = WoodType.register(
     new WoodType(
        "mutton_wood_mat", 
        MEAT) 
    );
    public static final WoodType BEEFWOODMAT = WoodType.register(
     new WoodType(
        "beef_wood_mat", 
        MEAT) 
    );
    public static final WoodType PORKWOODMAT = WoodType.register(
     new WoodType(
        "pork_wood_mat", 
        MEAT) 
    );
    public static final WoodType RABBITWOODMAT = WoodType.register(
     new WoodType(
        "rabbit_wood_mat", 
        MEAT) 
    );
    public static final WoodType SUGARWOODMAT = WoodType.register(
     new WoodType(
        "sugar_wood_mat", 
        CRYSTAL) 
    );
    public static final WoodType HONEYCOMBWOODMAT = WoodType.register(
     new WoodType(
        "honeycomb_wood_mat", 
        MEAT) 
    );

}
