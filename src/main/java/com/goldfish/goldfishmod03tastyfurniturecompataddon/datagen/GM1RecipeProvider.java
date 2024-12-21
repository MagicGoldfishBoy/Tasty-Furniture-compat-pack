package com.goldfish.goldfishmod03tastyfurniturecompataddon.datagen;

import java.util.concurrent.CompletableFuture;

import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.foodblockcompatitemregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.ingotcompatregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.mushcompatregistry;
import com.goldfish.goldfishmod03tastyfurniturecompataddon.registry.nuggetcompatregistry;

import com.goldfish.goldfishmod02tastyfurniture.registry.foodblockitemregistry;
import com.goldfish.goldfishmod02tastyfurniture.registry.mushregistry;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public abstract class GM1RecipeProvider extends RecipeProvider {

    private PackOutput output;
    private CompletableFuture<Provider> lookupProvider;

    public GM1RecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    public static class GM1RecipeProviderConcrete extends GM1RecipeProvider {

      //tags
       public static final TagKey<Item> ELDERBERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "elderberries")
        );
       public static final TagKey<Item> JUNIPER_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "juniper_berries")
        );
       public static final TagKey<Item> CHERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "cherries")
        );
       public static final TagKey<Item> BLACKCHERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "blackcherries")
        );
       public static final TagKey<Item> COCONUT_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "coconuts")
        );
       public static final TagKey<Item> ORANGE_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "oranges")
        );
       public static final TagKey<Item> LEMON_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "lemons")
        );
       public static final TagKey<Item> LIME_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "limes")
        );
       public static final TagKey<Item> CORN_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "corn")
        );
       public static final TagKey<Item> ONION_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "onions")
        );
       public static final TagKey<Item> TOMATO_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "tomatos")
        );
       public static final TagKey<Item> PECAN_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "pecans")
        );
       public static final TagKey<Item> ALMOND_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "almonds")
        );

      public GM1RecipeProviderConcrete(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected void buildRecipes(RecipeOutput output) {
          buildMushRecipes(output);
          buildIngotRecipes(output);
          buildNuggetRecipes(output);
          buildBlockRecipes(output);
          buildSlabRecipes(output);
          buildStairsRecipes(output);
          buildBarsRecipes(output);
          buildDoorRecipes(output);
          buildButtonRecipes(output);
          buildFenceRecipes(output);
          buildPressurePlateRecipes(output);
          buildSignRecipes(output);
          buildTrapDoorRecipes(output);
          buildLampRecipes(output);
          buildCarpetRecipes(output);
          buildLanternRecipes(output);
          buildChainRecipes(output);
          buildLadderRecipes(output);
          buildTableRecipes(output);
          buildTorchRecipes(output);
          buildFurnaceRecipes(output);
          buildPathRecipes(output);
          buildBarrelRecipes(output);
          buildChairRecipes(output);
          buildBedRecipes(output);
          buildCabinetRecipes(output);
        }

 protected void buildMushRecipes(RecipeOutput output) {
        LOGGER.info("building mush recipes");
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "elderberry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "elderberry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ELDERBERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', ELDERBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "elderberry_mush_from_most_advanced_mushhammer");
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.JUNIPER_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', JUNIPER_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.JUNIPER_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', JUNIPER_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "juniper_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.JUNIPER_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', JUNIPER_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "juniper_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.JUNIPER_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', JUNIPER_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "juniper_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CHERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', CHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CHERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', CHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "cherry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CHERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', CHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "cherry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CHERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', CHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "cherry_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Blackcherry-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BLACKCHERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', BLACKCHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BLACKCHERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', BLACKCHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "blackcherry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BLACKCHERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', BLACKCHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "blackcherry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BLACKCHERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', BLACKCHERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "blackcherry_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.COCONUT_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', COCONUT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.COCONUT_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', COCONUT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "coconut_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.COCONUT_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', COCONUT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "coconut_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.COCONUT_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', COCONUT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "coconut_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ORANGE_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', ORANGE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ORANGE_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', ORANGE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "orange_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ORANGE_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', ORANGE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "orange_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ORANGE_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', ORANGE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "orange_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.LEMON_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', LEMON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.LEMON_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', LEMON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "lemon_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.LEMON_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', LEMON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "lemon_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.LEMON_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', LEMON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "lemon_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Lime-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.LIME_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', LIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.LIME_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', LIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "lime_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.LIME_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', LIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "lime_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.LIME_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', LIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "lime_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Corn-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CORN_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', CORN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CORN_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', CORN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "corn_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CORN_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', CORN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "corn_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CORN_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', CORN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "corn_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Onion-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ONION_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', ONION_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ONION_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', ONION_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "onion_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ONION_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', ONION_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "onion_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ONION_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', ONION_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "onion_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Tomato-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.TOMATO_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', TOMATO_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.TOMATO_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', TOMATO_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "tomato_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.TOMATO_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', TOMATO_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "tomato_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.TOMATO_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', TOMATO_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "tomato_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Pecan-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PECAN_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', PECAN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PECAN_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', PECAN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "pecan_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PECAN_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', PECAN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "pecan_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PECAN_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', PECAN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "pecan_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Almond-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ALMOND_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', ALMOND_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ALMOND_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', ALMOND_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "almond_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ALMOND_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', ALMOND_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "almond_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.ALMOND_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', ALMOND_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "almond_mush_from_most_advanced_mushhammer");
      }
 protected void buildIngotRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.ELDERBERRY_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
            .unlockedBy("has_elderberry_nugget", has(nuggetcompatregistry.ELDERBERRY_NUGGET.get()))
            .save(output, "elderberry_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.ELDERBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.ELDERBERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_elderberry_mush", has(mushcompatregistry.ELDERBERRY_MUSH.get()))
            .save(output, "elderberry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.ELDERBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.ELDERBERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_elderberry_mush", has(mushcompatregistry.ELDERBERRY_MUSH.get()))
            .save(output, "elderberry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.ELDERBERRY_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
            .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
            .save(output, "elderberry_ingot_from_unpacking");
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.JUNIPER_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.JUNIPER_NUGGET.get())
            .unlockedBy("has_juniper_nugget", has(nuggetcompatregistry.JUNIPER_NUGGET.get()))
            .save(output, "juniper_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.JUNIPER_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.JUNIPER_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_juniper_mush", has(mushcompatregistry.JUNIPER_MUSH.get()))
            .save(output, "juniper_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.JUNIPER_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.JUNIPER_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_juniper_mush", has(mushcompatregistry.JUNIPER_MUSH.get()))
            .save(output, "juniper_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.JUNIPER_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
            .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
            .save(output, "juniper_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.CHERRY_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.CHERRY_NUGGET.get())
            .unlockedBy("has_cherry_nugget", has(nuggetcompatregistry.CHERRY_NUGGET.get()))
            .save(output, "cherry_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.CHERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.CHERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_cherry_mush", has(mushcompatregistry.CHERRY_MUSH.get()))
            .save(output, "cherry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.CHERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.CHERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_cherry_mush", has(mushcompatregistry.CHERRY_MUSH.get()))
            .save(output, "cherry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.CHERRY_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get())
            .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
            .save(output, "cherry_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Blackcherry-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.BLACKCHERRY_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
            .unlockedBy("has_blackcherry_nugget", has(nuggetcompatregistry.BLACKCHERRY_NUGGET.get()))
            .save(output, "blackcherry_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.BLACKCHERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.BLACKCHERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_blackcherry_mush", has(mushcompatregistry.BLACKCHERRY_MUSH.get()))
            .save(output, "blackcherry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.BLACKCHERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.BLACKCHERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_blackcherry_mush", has(mushcompatregistry.BLACKCHERRY_MUSH.get()))
            .save(output, "blackcherry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.BLACKCHERRY_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get())
            .unlockedBy("has_blackcherry_block", has(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()))
            .save(output, "blackcherry_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.COCONUT_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.COCONUT_NUGGET.get())
            .unlockedBy("has_coconut_nugget", has(nuggetcompatregistry.COCONUT_NUGGET.get()))
            .save(output, "coconut_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.COCONUT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.COCONUT_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_coconut_mush", has(mushcompatregistry.COCONUT_MUSH.get()))
            .save(output, "coconut_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.COCONUT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.COCONUT_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_coconut_mush", has(mushcompatregistry.COCONUT_MUSH.get()))
            .save(output, "coconut_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.COCONUT_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get())
            .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
            .save(output, "coconut_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.ORANGE_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ORANGE_NUGGET.get())
            .unlockedBy("has_orange_nugget", has(nuggetcompatregistry.ORANGE_NUGGET.get()))
            .save(output, "orange_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.ORANGE_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.ORANGE_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_orange_mush", has(mushcompatregistry.ORANGE_MUSH.get()))
            .save(output, "orange_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.ORANGE_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.ORANGE_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_orange_mush", has(mushcompatregistry.ORANGE_MUSH.get()))
            .save(output, "orange_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.ORANGE_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get())
            .unlockedBy("has_orange_block", has(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()))
            .save(output, "orange_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.LEMON_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.LEMON_NUGGET.get())
            .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
            .save(output, "lemon_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.LEMON_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.LEMON_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_lemon_mush", has(mushcompatregistry.LEMON_MUSH.get()))
            .save(output, "lemon_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.LEMON_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.LEMON_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_lemon_mush", has(mushcompatregistry.LEMON_MUSH.get()))
            .save(output, "lemon_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.LEMON_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get())
            .unlockedBy("has_lemon_block", has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
            .save(output, "lemon_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Lime-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.LIME_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.LIME_NUGGET.get())
            .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
            .save(output, "lime_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.LIME_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.LIME_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_lime_mush", has(mushcompatregistry.LIME_MUSH.get()))
            .save(output, "lime_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.LIME_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.LIME_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_lime_mush", has(mushcompatregistry.LIME_MUSH.get()))
            .save(output, "lime_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.LIME_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get())
            .unlockedBy("has_lime_block", has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
            .save(output, "lime_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Corn-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.CORN_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.CORN_NUGGET.get())
            .unlockedBy("has_corn_nugget", has(nuggetcompatregistry.CORN_NUGGET.get()))
            .save(output, "corn_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.CORN_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.CORN_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_corn_mush", has(mushcompatregistry.CORN_MUSH.get()))
            .save(output, "corn_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.CORN_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.CORN_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_corn_mush", has(mushcompatregistry.CORN_MUSH.get()))
            .save(output, "corn_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.CORN_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get())
            .unlockedBy("has_corn_block", has(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()))
            .save(output, "corn_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Onion-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.ONION_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ONION_NUGGET.get())
            .unlockedBy("has_onion_nugget", has(nuggetcompatregistry.ONION_NUGGET.get()))
            .save(output, "onion_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.ONION_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.ONION_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_onion_mush", has(mushcompatregistry.ONION_MUSH.get()))
            .save(output, "onion_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.ONION_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.ONION_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_onion_mush", has(mushcompatregistry.ONION_MUSH.get()))
            .save(output, "onion_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.ONION_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get())
            .unlockedBy("has_onion_block", has(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()))
            .save(output, "onion_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Tomato-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.TOMATO_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.TOMATO_NUGGET.get())
            .unlockedBy("has_tomato_nugget", has(nuggetcompatregistry.TOMATO_NUGGET.get()))
            .save(output, "tomato_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.TOMATO_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.TOMATO_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_tomato_mush", has(mushcompatregistry.TOMATO_MUSH.get()))
            .save(output, "tomato_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.TOMATO_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.TOMATO_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_tomato_mush", has(mushcompatregistry.TOMATO_MUSH.get()))
            .save(output, "tomato_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.TOMATO_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get())
            .unlockedBy("has_tomato_block", has(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()))
            .save(output, "tomato_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Pecan-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.PECAN_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.PECAN_NUGGET.get())
            .unlockedBy("has_pecan_nugget", has(nuggetcompatregistry.PECAN_NUGGET.get()))
            .save(output, "pecan_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.PECAN_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.PECAN_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_pecan_mush", has(mushcompatregistry.PECAN_MUSH.get()))
            .save(output, "pecan_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.PECAN_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.PECAN_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_pecan_mush", has(mushcompatregistry.PECAN_MUSH.get()))
            .save(output, "pecan_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.PECAN_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get())
            .unlockedBy("has_pecan_block", has(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()))
            .save(output, "pecan_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Almond-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.ALMOND_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ALMOND_NUGGET.get())
            .unlockedBy("has_almond_nugget", has(nuggetcompatregistry.ALMOND_NUGGET.get()))
            .save(output, "almond_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.ALMOND_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.ALMOND_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_almond_mush", has(mushcompatregistry.ALMOND_MUSH.get()))
            .save(output, "almond_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.ALMOND_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.ALMOND_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_almond_mush", has(mushcompatregistry.ALMOND_MUSH.get()))
            .save(output, "almond_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.ALMOND_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get())
            .unlockedBy("has_almond_block", has(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()))
            .save(output, "almond_ingot_from_unpacking");
      }
 protected void buildNuggetRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.ELDERBERRY_NUGGET.get(), 9)
        .requires(ingotcompatregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.JUNIPER_NUGGET.get(), 9)
        .requires(ingotcompatregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.CHERRY_NUGGET.get(), 9)
        .requires(ingotcompatregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Blackcherry-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.BLACKCHERRY_NUGGET.get(), 9)
        .requires(ingotcompatregistry.BLACKCHERRY_INGOT.get())
        .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.COCONUT_NUGGET.get(), 9)
        .requires(ingotcompatregistry.COCONUT_INGOT.get())
        .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.ORANGE_NUGGET.get(), 9)
        .requires(ingotcompatregistry.ORANGE_INGOT.get())
        .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.LEMON_NUGGET.get(), 9)
        .requires(ingotcompatregistry.LEMON_INGOT.get())
        .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Lime-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.LIME_NUGGET.get(), 9)
        .requires(ingotcompatregistry.LIME_INGOT.get())
        .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Corn-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.CORN_NUGGET.get(), 9)
        .requires(ingotcompatregistry.CORN_INGOT.get())
        .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Onion-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.ONION_NUGGET.get(), 9)
        .requires(ingotcompatregistry.ONION_INGOT.get())
        .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Tomato-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.TOMATO_NUGGET.get(), 9)
        .requires(ingotcompatregistry.TOMATO_INGOT.get())
        .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Pecan-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.PECAN_NUGGET.get(), 9)
        .requires(ingotcompatregistry.PECAN_INGOT.get())
        .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Almond-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.ALMOND_NUGGET.get(), 9)
        .requires(ingotcompatregistry.ALMOND_INGOT.get())
        .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
        .save(output);
      }
 protected void buildBlockRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
          .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
          .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
          .save(output, "elderberry_bricks_block_from_elderberry_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
          .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ELDERBERRY_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
          .save(output, "elderberry_chiseled_block_from_elderberry_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
          .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ELDERBERRY_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
          .save(output, "elderberry_tiles_block_from_elderberry_block_stonecutting");
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
          .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
          .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
          .save(output, "juniper_bricks_block_from_juniper_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
          .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.JUNIPER_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
          .save(output, "juniper_chiseled_block_from_juniper_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
          .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.JUNIPER_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
          .save(output, "juniper_tiles_block_from_juniper_block_stonecutting");
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.CHERRY_INGOT.get())
          .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get())
          .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
          .save(output, "cherry_bricks_block_from_cherry_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
          .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CHERRY_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
          .save(output, "cherry_chiseled_block_from_cherry_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
          .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CHERRY_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
          .save(output, "cherry_tiles_block_from_cherry_block_stonecutting");
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
          .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get())
          .unlockedBy("has_blackcherry_block", has(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BLACKCHERRY_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_blackcherry_block", has(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()))
          .save(output, "blackcherry_bricks_block_from_blackcherry_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
          .unlockedBy("has_blackcherry_slab", has(foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BLACKCHERRY_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_blackcherry_block", has(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()))
          .save(output, "blackcherry_chiseled_block_from_blackcherry_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
          .unlockedBy("has_blackcherry_slab", has(foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BLACKCHERRY_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_blackcherry_block", has(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()))
          .save(output, "blackcherry_tiles_block_from_blackcherry_block_stonecutting");
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.COCONUT_INGOT.get())
          .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get())
          .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
          .save(output, "coconut_bricks_block_from_coconut_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
          .unlockedBy("has_coconut_slab", has(foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.COCONUT_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
          .save(output, "coconut_chiseled_block_from_coconut_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
          .unlockedBy("has_coconut_slab", has(foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.COCONUT_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
          .save(output, "coconut_tiles_block_from_coconut_block_stonecutting");
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ORANGE_INGOT.get())
          .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get())
          .unlockedBy("has_orange_block", has(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ORANGE_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_orange_block", has(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()))
          .save(output, "orange_bricks_block_from_orange_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
          .unlockedBy("has_orange_slab", has(foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ORANGE_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_orange_block", has(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()))
          .save(output, "orange_chiseled_block_from_orange_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
          .unlockedBy("has_orange_slab", has(foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ORANGE_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_orange_block", has(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()))
          .save(output, "orange_tiles_block_from_orange_block_stonecutting");
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.LEMON_INGOT.get())
          .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get())
          .unlockedBy("has_lemon_block", has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.LEMON_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_lemon_block", has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
          .save(output, "lemon_bricks_block_from_lemon_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.LEMON_SLAB_ITEM.get())
          .unlockedBy("has_lemon_slab", has(foodblockcompatitemregistry.LEMON_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.LEMON_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_lemon_block", has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
          .save(output, "lemon_chiseled_block_from_lemon_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.LEMON_SLAB_ITEM.get())
          .unlockedBy("has_lemon_slab", has(foodblockcompatitemregistry.LEMON_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.LEMON_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_lemon_block", has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
          .save(output, "lemon_tiles_block_from_lemon_block_stonecutting");
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.LIME_INGOT.get())
          .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.LIME_BLOCK_ITEM.get())
          .unlockedBy("has_lime_block", has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.LIME_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_lime_block", has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
          .save(output, "lime_bricks_block_from_lime_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.LIME_SLAB_ITEM.get())
          .unlockedBy("has_lime_slab", has(foodblockcompatitemregistry.LIME_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.LIME_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_lime_block", has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
          .save(output, "lime_chiseled_block_from_lime_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.LIME_SLAB_ITEM.get())
          .unlockedBy("has_lime_slab", has(foodblockcompatitemregistry.LIME_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.LIME_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_lime_block", has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
          .save(output, "lime_tiles_block_from_lime_block_stonecutting");
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.CORN_INGOT.get())
          .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.CORN_BLOCK_ITEM.get())
          .unlockedBy("has_corn_block", has(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CORN_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_corn_block", has(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()))
          .save(output, "corn_bricks_block_from_corn_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.CORN_SLAB_ITEM.get())
          .unlockedBy("has_corn_slab", has(foodblockcompatitemregistry.CORN_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CORN_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_corn_block", has(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()))
          .save(output, "corn_chiseled_block_from_corn_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.CORN_SLAB_ITEM.get())
          .unlockedBy("has_corn_slab", has(foodblockcompatitemregistry.CORN_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CORN_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_corn_block", has(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()))
          .save(output, "corn_tiles_block_from_corn_block_stonecutting");
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ONION_INGOT.get())
          .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.ONION_BLOCK_ITEM.get())
          .unlockedBy("has_onion_block", has(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ONION_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_onion_block", has(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()))
          .save(output, "onion_bricks_block_from_onion_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.ONION_SLAB_ITEM.get())
          .unlockedBy("has_onion_slab", has(foodblockcompatitemregistry.ONION_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ONION_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_onion_block", has(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()))
          .save(output, "onion_chiseled_block_from_onion_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.ONION_SLAB_ITEM.get())
          .unlockedBy("has_onion_slab", has(foodblockcompatitemregistry.ONION_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ONION_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_onion_block", has(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()))
          .save(output, "onion_tiles_block_from_onion_block_stonecutting");
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.TOMATO_INGOT.get())
          .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get())
          .unlockedBy("has_tomato_block", has(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.TOMATO_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_tomato_block", has(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()))
          .save(output, "tomato_bricks_block_from_tomato_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get())
          .unlockedBy("has_tomato_slab", has(foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.TOMATO_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_tomato_block", has(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()))
          .save(output, "tomato_chiseled_block_from_tomato_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get())
          .unlockedBy("has_tomato_slab", has(foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.TOMATO_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_tomato_block", has(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()))
          .save(output, "tomato_tiles_block_from_tomato_block_stonecutting");
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.PECAN_INGOT.get())
          .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get())
          .unlockedBy("has_pecan_block", has(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.PECAN_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_pecan_block", has(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()))
          .save(output, "pecan_bricks_block_from_pecan_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.PECAN_SLAB_ITEM.get())
          .unlockedBy("has_pecan_slab", has(foodblockcompatitemregistry.PECAN_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.PECAN_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_pecan_block", has(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()))
          .save(output, "pecan_chiseled_block_from_pecan_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.PECAN_SLAB_ITEM.get())
          .unlockedBy("has_pecan_slab", has(foodblockcompatitemregistry.PECAN_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.PECAN_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_pecan_block", has(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()))
          .save(output, "pecan_tiles_block_from_pecan_block_stonecutting");
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ALMOND_INGOT.get())
          .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get())
          .unlockedBy("has_almond_block", has(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ALMOND_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_almond_block", has(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()))
          .save(output, "almond_bricks_block_from_almond_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get())
          .unlockedBy("has_almond_slab", has(foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ALMOND_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_almond_block", has(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()))
          .save(output, "almond_chiseled_block_from_almond_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get())
          .unlockedBy("has_almond_slab", has(foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.ALMOND_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_almond_block", has(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()))
          .save(output, "almond_tiles_block_from_almond_block_stonecutting");
      }
 protected void buildSlabRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
          .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ELDERBERRY_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_elderberry_bricks_block", has(foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "elderberry_bricks_slab_from_elderberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
          .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.JUNIPER_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_juniper_bricks_block", has(foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get()))
          .save(output, "juniper_bricks_slab_from_juniper_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Cherry-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.CHERRY_INGOT.get())
          .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.CHERRY_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_cherry_bricks_block", has(foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "cherry_bricks_slab_from_cherry_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Blackcherry-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
          .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKCHERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.BLACKCHERRY_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_blackcherry_bricks_block", has(foodblockcompatitemregistry.BLACKCHERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "blackcherry_bricks_slab_from_blackcherry_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Coconut-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.COCONUT_INGOT.get())
          .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.COCONUT_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_coconut_bricks_block", has(foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "coconut_bricks_slab_from_coconut_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Orange-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ORANGE_INGOT.get())
          .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ORANGE_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ORANGE_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_orange_bricks_block", has(foodblockcompatitemregistry.ORANGE_BRICKS_BLOCK_ITEM.get()))
          .save(output, "orange_bricks_slab_from_orange_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.LEMON_INGOT.get())
          .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LEMON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.LEMON_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_lemon_bricks_block", has(foodblockcompatitemregistry.LEMON_BRICKS_BLOCK_ITEM.get()))
          .save(output, "lemon_bricks_slab_from_lemon_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Lime-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.LIME_INGOT.get())
          .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LIME_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.LIME_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_lime_bricks_block", has(foodblockcompatitemregistry.LIME_BRICKS_BLOCK_ITEM.get()))
          .save(output, "lime_bricks_slab_from_lime_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Corn-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.CORN_INGOT.get())
          .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CORN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.CORN_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_corn_bricks_block", has(foodblockcompatitemregistry.CORN_BRICKS_BLOCK_ITEM.get()))
          .save(output, "corn_bricks_slab_from_corn_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Onion-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ONION_INGOT.get())
          .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ONION_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ONION_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_onion_bricks_block", has(foodblockcompatitemregistry.ONION_BRICKS_BLOCK_ITEM.get()))
          .save(output, "onion_bricks_slab_from_onion_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Tomato-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.TOMATO_INGOT.get())
          .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TOMATO_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.TOMATO_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_tomato_bricks_block", has(foodblockcompatitemregistry.TOMATO_BRICKS_BLOCK_ITEM.get()))
          .save(output, "tomato_bricks_slab_from_tomato_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Pecan-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.PECAN_INGOT.get())
          .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PECAN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.PECAN_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_pecan_bricks_block", has(foodblockcompatitemregistry.PECAN_BRICKS_BLOCK_ITEM.get()))
          .save(output, "pecan_bricks_slab_from_pecan_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Almond-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ALMOND_INGOT.get())
          .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ALMOND_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ALMOND_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_almond_bricks_block", has(foodblockcompatitemregistry.ALMOND_BRICKS_BLOCK_ITEM.get()))
          .save(output, "almond_bricks_slab_from_almond_bricks_block_stonecutting");
      }
 protected void buildStairsRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
          .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ELDERBERRY_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_elderberry_bricks_block", has(foodblockcompatitemregistry.ELDERBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "elderberry_bricks_stairs_from_elderberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
          .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.JUNIPER_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_juniper_bricks_block", has(foodblockcompatitemregistry.JUNIPER_BRICKS_BLOCK_ITEM.get()))
          .save(output, "juniper_bricks_stairs_from_juniper_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.CHERRY_INGOT.get())
          .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.CHERRY_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_cherry_bricks_block", has(foodblockcompatitemregistry.CHERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "cherry_bricks_stairs_from_cherry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
          .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKCHERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.BLACKCHERRY_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_blackcherry_bricks_block", has(foodblockcompatitemregistry.BLACKCHERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "blackcherry_bricks_stairs_from_blackcherry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.COCONUT_INGOT.get())
          .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.COCONUT_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_coconut_bricks_block", has(foodblockcompatitemregistry.COCONUT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "coconut_bricks_stairs_from_coconut_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ORANGE_INGOT.get())
          .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ORANGE_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ORANGE_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_orange_bricks_block", has(foodblockcompatitemregistry.ORANGE_BRICKS_BLOCK_ITEM.get()))
          .save(output, "orange_bricks_stairs_from_orange_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.LEMON_INGOT.get())
          .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LEMON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.LEMON_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_lemon_bricks_block", has(foodblockcompatitemregistry.LEMON_BRICKS_BLOCK_ITEM.get()))
          .save(output, "lemon_bricks_stairs_from_lemon_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.LIME_INGOT.get())
          .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.LIME_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.LIME_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_lime_bricks_block", has(foodblockcompatitemregistry.LIME_BRICKS_BLOCK_ITEM.get()))
          .save(output, "lime_bricks_stairs_from_lime_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.CORN_INGOT.get())
          .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CORN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.CORN_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_corn_bricks_block", has(foodblockcompatitemregistry.CORN_BRICKS_BLOCK_ITEM.get()))
          .save(output, "corn_bricks_stairs_from_corn_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ONION_INGOT.get())
          .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ONION_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ONION_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_onion_bricks_block", has(foodblockcompatitemregistry.ONION_BRICKS_BLOCK_ITEM.get()))
          .save(output, "onion_bricks_stairs_from_onion_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.TOMATO_INGOT.get())
          .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TOMATO_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.TOMATO_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_tomato_bricks_block", has(foodblockcompatitemregistry.TOMATO_BRICKS_BLOCK_ITEM.get()))
          .save(output, "tomato_bricks_stairs_from_tomato_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.PECAN_INGOT.get())
          .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PECAN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.PECAN_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_pecan_bricks_block", has(foodblockcompatitemregistry.PECAN_BRICKS_BLOCK_ITEM.get()))
          .save(output, "pecan_bricks_stairs_from_pecan_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.ALMOND_INGOT.get())
          .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.ALMOND_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.ALMOND_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_almond_bricks_block", has(foodblockcompatitemregistry.ALMOND_BRICKS_BLOCK_ITEM.get()))
          .save(output, "almond_bricks_stairs_from_almond_bricks_block_stonecutting");
      }
 protected void buildBarsRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
         .unlockedBy("has_elderberry_nugget", has(nuggetcompatregistry.ELDERBERRY_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.JUNIPER_NUGGET.get())
         .unlockedBy("has_juniper_nugget", has(nuggetcompatregistry.JUNIPER_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.CHERRY_NUGGET.get())
         .unlockedBy("has_cherry_nugget", has(nuggetcompatregistry.CHERRY_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
         .unlockedBy("has_blackcherry_nugget", has(nuggetcompatregistry.BLACKCHERRY_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.COCONUT_NUGGET.get())
         .unlockedBy("has_coconut_nugget", has(nuggetcompatregistry.COCONUT_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.ORANGE_NUGGET.get())
         .unlockedBy("has_orange_nugget", has(nuggetcompatregistry.ORANGE_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.LEMON_NUGGET.get())
         .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.LIME_NUGGET.get())
         .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.CORN_NUGGET.get())
         .unlockedBy("has_corn_nugget", has(nuggetcompatregistry.CORN_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.ONION_NUGGET.get())
         .unlockedBy("has_onion_nugget", has(nuggetcompatregistry.ONION_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.TOMATO_NUGGET.get())
         .unlockedBy("has_tomato_nugget", has(nuggetcompatregistry.TOMATO_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.PECAN_NUGGET.get())
         .unlockedBy("has_pecan_nugget", has(nuggetcompatregistry.PECAN_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.ALMOND_NUGGET.get())
         .unlockedBy("has_almond_nugget", has(nuggetcompatregistry.ALMOND_NUGGET.get()))
         .save(output);
      }
 protected void buildDoorRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
         .unlockedBy("has_elderberry_nugget", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
         .unlockedBy("has_juniper_nugget", has(ingotcompatregistry.JUNIPER_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.CHERRY_INGOT.get())
         .unlockedBy("has_cherry_nugget", has(ingotcompatregistry.CHERRY_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
         .unlockedBy("has_blackcherry_nugget", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.COCONUT_INGOT.get())
         .unlockedBy("has_coconut_nugget", has(ingotcompatregistry.COCONUT_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.ORANGE_INGOT.get())
         .unlockedBy("has_orange_nugget", has(ingotcompatregistry.ORANGE_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.LEMON_INGOT.get())
         .unlockedBy("has_lemon_nugget", has(ingotcompatregistry.LEMON_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.LIME_INGOT.get())
         .unlockedBy("has_lime_nugget", has(ingotcompatregistry.LIME_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.CORN_INGOT.get())
         .unlockedBy("has_corn_nugget", has(ingotcompatregistry.CORN_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.ONION_INGOT.get())
         .unlockedBy("has_onion_nugget", has(ingotcompatregistry.ONION_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.TOMATO_INGOT.get())
         .unlockedBy("has_tomato_nugget", has(ingotcompatregistry.TOMATO_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.PECAN_INGOT.get())
         .unlockedBy("has_pecan_nugget", has(ingotcompatregistry.PECAN_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.ALMOND_INGOT.get())
         .unlockedBy("has_almond_nugget", has(ingotcompatregistry.ALMOND_INGOT.get()))
         .save(output);
      }
 protected void buildButtonRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.ELDERBERRY_NUGGET.get())
       .unlockedBy("has_elderberry_nugget", has(nuggetcompatregistry.ELDERBERRY_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.JUNIPER_NUGGET.get())
       .unlockedBy("has_juniper_nugget", has(nuggetcompatregistry.JUNIPER_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.CHERRY_NUGGET.get())
       .unlockedBy("has_cherry_nugget", has(nuggetcompatregistry.CHERRY_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
       .unlockedBy("has_blackcherry_nugget", has(nuggetcompatregistry.BLACKCHERRY_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.COCONUT_NUGGET.get())
       .unlockedBy("has_coconut_nugget", has(nuggetcompatregistry.COCONUT_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.ORANGE_NUGGET.get())
       .unlockedBy("has_orange_nugget", has(nuggetcompatregistry.ORANGE_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.LEMON_NUGGET.get())
       .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.LIME_NUGGET.get())
       .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.CORN_NUGGET.get())
       .unlockedBy("has_corn_nugget", has(nuggetcompatregistry.CORN_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.ONION_NUGGET.get())
       .unlockedBy("has_onion_nugget", has(nuggetcompatregistry.ONION_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.TOMATO_NUGGET.get())
       .unlockedBy("has_tomato_nugget", has(nuggetcompatregistry.TOMATO_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.PECAN_NUGGET.get())
       .unlockedBy("has_pecan_nugget", has(nuggetcompatregistry.PECAN_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.ALMOND_NUGGET.get())
       .unlockedBy("has_almond_nugget", has(nuggetcompatregistry.ALMOND_NUGGET.get()))
       .save(output);
      }
 protected void buildFenceRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.CHERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.CHERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.COCONUT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.COCONUT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.ORANGE_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.ORANGE_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.LEMON_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.LEMON_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.LIME_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.LIME_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.CORN_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.CORN_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.ONION_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.ONION_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.TOMATO_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.TOMATO_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.PECAN_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.PECAN_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.ALMOND_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.ALMOND_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
          .save(output);        
      }
 protected void buildPressurePlateRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
        .unlockedBy("has_elderberry_block",  has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
        .unlockedBy("has_juniper_block",  has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get())
        .unlockedBy("has_cherry_block",  has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get())
        .unlockedBy("has_blackcherry_block",  has(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get())
        .unlockedBy("has_coconut_block",  has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get())
        .unlockedBy("has_orange_block",  has(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get())
        .unlockedBy("has_lemon_block",  has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.LIME_BLOCK_ITEM.get())
        .unlockedBy("has_lime_block",  has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.CORN_BLOCK_ITEM.get())
        .unlockedBy("has_corn_block",  has(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.ONION_BLOCK_ITEM.get())
        .unlockedBy("has_onion_block",  has(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get())
        .unlockedBy("has_tomato_block",  has(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get())
        .unlockedBy("has_pecan_block",  has(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get())
        .unlockedBy("has_almond_block",  has(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()))
        .save(output);
      }
 protected void buildSignRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_elderberry_ingot",  has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_juniper_ingot",  has(ingotcompatregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.CHERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_cherry_ingot",  has(ingotcompatregistry.CHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_blackcherry_ingot",  has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.COCONUT_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_coconut_ingot",  has(ingotcompatregistry.COCONUT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.ORANGE_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_orange_ingot",  has(ingotcompatregistry.ORANGE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.LEMON_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_lemon_ingot",  has(ingotcompatregistry.LEMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.LIME_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_lime_ingot",  has(ingotcompatregistry.LIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.CORN_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_corn_ingot",  has(ingotcompatregistry.CORN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.ONION_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_onion_ingot",  has(ingotcompatregistry.ONION_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.TOMATO_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_tomato_ingot",  has(ingotcompatregistry.TOMATO_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.PECAN_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_pecan_ingot",  has(ingotcompatregistry.PECAN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.ALMOND_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_almond_ingot",  has(ingotcompatregistry.ALMOND_INGOT.get()))
        .save(output);
      }
 protected void buildTrapDoorRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
        .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.COCONUT_INGOT.get())
        .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.ORANGE_INGOT.get())
        .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.LEMON_INGOT.get())
        .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.LIME_INGOT.get())
        .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.CORN_INGOT.get())
        .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.ONION_INGOT.get())
        .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.TOMATO_INGOT.get())
        .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.PECAN_INGOT.get())
        .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.ALMOND_INGOT.get())
        .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
        .save(output);
      }
 protected void buildLampRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.CHERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.COCONUT_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.ORANGE_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.LEMON_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.LIME_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.CORN_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.ONION_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.TOMATO_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.PECAN_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.ALMOND_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
      }
 protected void buildCarpetRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
        .unlockedBy("has_elderberry_nugget", has(nuggetcompatregistry.ELDERBERRY_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.JUNIPER_NUGGET.get())
        .unlockedBy("has_juniper_nugget", has(nuggetcompatregistry.JUNIPER_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.CHERRY_NUGGET.get())
        .unlockedBy("has_cherry_nugget", has(nuggetcompatregistry.CHERRY_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
        .unlockedBy("has_blackcherry_nugget", has(nuggetcompatregistry.BLACKCHERRY_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.COCONUT_NUGGET.get())
        .unlockedBy("has_coconut_nugget", has(nuggetcompatregistry.COCONUT_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.ORANGE_NUGGET.get())
        .unlockedBy("has_orange_nugget", has(nuggetcompatregistry.ORANGE_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.LEMON_NUGGET.get())
        .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.LIME_NUGGET.get())
        .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.CORN_NUGGET.get())
        .unlockedBy("has_corn_nugget", has(nuggetcompatregistry.CORN_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.ONION_NUGGET.get())
        .unlockedBy("has_onion_nugget", has(nuggetcompatregistry.ONION_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.TOMATO_NUGGET.get())
        .unlockedBy("has_tomato_nugget", has(nuggetcompatregistry.TOMATO_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.PECAN_NUGGET.get())
        .unlockedBy("has_pecan_nugget", has(nuggetcompatregistry.PECAN_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.ALMOND_NUGGET.get())
        .unlockedBy("has_almond_nugget", has(nuggetcompatregistry.ALMOND_NUGGET.get()))
        .save(output);
      }
 protected void buildLanternRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_elderberry_nugget", has(nuggetcompatregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_elderberry_nugget", has(nuggetcompatregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.JUNIPER_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_juniper_nugget", has(nuggetcompatregistry.JUNIPER_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.JUNIPER_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_juniper_nugget", has(nuggetcompatregistry.JUNIPER_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.CHERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_cherry_nugget", has(nuggetcompatregistry.CHERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.CHERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_cherry_nugget", has(nuggetcompatregistry.CHERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_blackcherry_nugget", has(nuggetcompatregistry.BLACKCHERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_blackcherry_nugget", has(nuggetcompatregistry.BLACKCHERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.COCONUT_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_coconut_nugget", has(nuggetcompatregistry.COCONUT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.COCONUT_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_coconut_nugget", has(nuggetcompatregistry.COCONUT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ORANGE_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_orange_nugget", has(nuggetcompatregistry.ORANGE_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ORANGE_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_orange_nugget", has(nuggetcompatregistry.ORANGE_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.LEMON_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.LEMON_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.LIME_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.LIME_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.CORN_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_corn_nugget", has(nuggetcompatregistry.CORN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.CORN_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_corn_nugget", has(nuggetcompatregistry.CORN_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ONION_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_onion_nugget", has(nuggetcompatregistry.ONION_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ONION_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_onion_nugget", has(nuggetcompatregistry.ONION_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.TOMATO_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_tomato_nugget", has(nuggetcompatregistry.TOMATO_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.TOMATO_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_tomato_nugget", has(nuggetcompatregistry.TOMATO_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.PECAN_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_pecan_nugget", has(nuggetcompatregistry.PECAN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.PECAN_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_pecan_nugget", has(nuggetcompatregistry.PECAN_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ALMOND_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_almond_nugget", has(nuggetcompatregistry.ALMOND_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.ALMOND_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_almond_nugget", has(nuggetcompatregistry.ALMOND_NUGGET.get()))
            .save(output);
      }
 protected void buildChainRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
        .define('B', ingotcompatregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.JUNIPER_NUGGET.get())
        .define('B', ingotcompatregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.CHERRY_NUGGET.get())
        .define('B', ingotcompatregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
        .define('B', ingotcompatregistry.BLACKCHERRY_INGOT.get())
        .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.COCONUT_NUGGET.get())
        .define('B', ingotcompatregistry.COCONUT_INGOT.get())
        .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.ORANGE_NUGGET.get())
        .define('B', ingotcompatregistry.ORANGE_INGOT.get())
        .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.LEMON_NUGGET.get())
        .define('B', ingotcompatregistry.LEMON_INGOT.get())
        .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.LIME_NUGGET.get())
        .define('B', ingotcompatregistry.LIME_INGOT.get())
        .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.CORN_NUGGET.get())
        .define('B', ingotcompatregistry.CORN_INGOT.get())
        .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.ONION_NUGGET.get())
        .define('B', ingotcompatregistry.ONION_INGOT.get())
        .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.TOMATO_NUGGET.get())
        .define('B', ingotcompatregistry.TOMATO_INGOT.get())
        .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.PECAN_NUGGET.get())
        .define('B', ingotcompatregistry.PECAN_INGOT.get())
        .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.ALMOND_NUGGET.get())
        .define('B', ingotcompatregistry.ALMOND_INGOT.get())
        .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
        .save(output);
      }
 protected void buildLadderRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.BLACKCHERRY_INGOT.get())
        .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.COCONUT_INGOT.get())
        .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.ORANGE_INGOT.get())
        .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.LEMON_INGOT.get())
        .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.LIME_INGOT.get())
        .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.CORN_INGOT.get())
        .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.ONION_INGOT.get())
        .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.TOMATO_INGOT.get())
        .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.PECAN_INGOT.get())
        .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.ALMOND_INGOT.get())
        .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
        .save(output);
      }
 protected void buildTableRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.ELDERBERRY_INGOT.get())
        .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.JUNIPER_INGOT.get())
        .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.CHERRY_INGOT.get())
        .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.BLACKCHERRY_INGOT.get())
        .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.COCONUT_INGOT.get())
        .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.ORANGE_INGOT.get())
        .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.LEMON_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.LEMON_INGOT.get())
        .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.LIME_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.LIME_INGOT.get())
        .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.CORN_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.CORN_INGOT.get())
        .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.ONION_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.ONION_INGOT.get())
        .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.TOMATO_INGOT.get())
        .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.PECAN_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.PECAN_INGOT.get())
        .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.ALMOND_INGOT.get())
        .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
        .save(output);
      }
 protected void buildTorchRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_elderberry_nugget", has(nuggetcompatregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_elderberry_nugget", has(nuggetcompatregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_elderberry_nugget", has(nuggetcompatregistry.ELDERBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.JUNIPER_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_juniper_nugget", has(nuggetcompatregistry.JUNIPER_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.JUNIPER_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_juniper_nugget", has(nuggetcompatregistry.JUNIPER_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.JUNIPER_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_juniper_nugget", has(nuggetcompatregistry.JUNIPER_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.CHERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_cherry_nugget", has(nuggetcompatregistry.CHERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.CHERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_cherry_nugget", has(nuggetcompatregistry.CHERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.CHERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_cherry_nugget", has(nuggetcompatregistry.CHERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_blackcherry_nugget", has(nuggetcompatregistry.BLACKCHERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_blackcherry_nugget", has(nuggetcompatregistry.BLACKCHERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_blackcherry_nugget", has(nuggetcompatregistry.BLACKCHERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.COCONUT_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_coconut_nugget", has(nuggetcompatregistry.COCONUT_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.COCONUT_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_coconut_nugget", has(nuggetcompatregistry.COCONUT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.COCONUT_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_coconut_nugget", has(nuggetcompatregistry.COCONUT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ORANGE_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_orange_nugget", has(nuggetcompatregistry.ORANGE_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ORANGE_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_orange_nugget", has(nuggetcompatregistry.ORANGE_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ORANGE_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_orange_nugget", has(nuggetcompatregistry.ORANGE_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.LEMON_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.LEMON_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.LEMON_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.LIME_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.LIME_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.LIME_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.CORN_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_corn_nugget", has(nuggetcompatregistry.CORN_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.CORN_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_corn_nugget", has(nuggetcompatregistry.CORN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.CORN_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_corn_nugget", has(nuggetcompatregistry.CORN_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ONION_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_onion_nugget", has(nuggetcompatregistry.ONION_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ONION_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_onion_nugget", has(nuggetcompatregistry.ONION_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ONION_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_onion_nugget", has(nuggetcompatregistry.ONION_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.TOMATO_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_tomato_nugget", has(nuggetcompatregistry.TOMATO_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.TOMATO_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_tomato_nugget", has(nuggetcompatregistry.TOMATO_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.TOMATO_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_tomato_nugget", has(nuggetcompatregistry.TOMATO_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.PECAN_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_pecan_nugget", has(nuggetcompatregistry.PECAN_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.PECAN_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_pecan_nugget", has(nuggetcompatregistry.PECAN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.PECAN_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_pecan_nugget", has(nuggetcompatregistry.PECAN_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ALMOND_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_almond_nugget", has(nuggetcompatregistry.ALMOND_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ALMOND_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_almond_nugget", has(nuggetcompatregistry.ALMOND_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.ALMOND_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_almond_nugget", has(nuggetcompatregistry.ALMOND_NUGGET.get()))
            .save(output);
      } 
 protected void buildFurnaceRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.CHERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.COCONUT_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.ORANGE_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.LEMON_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.LIME_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.CORN_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.ONION_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.TOMATO_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.PECAN_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.ALMOND_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
        .save(output);
      }
 protected void buildPathRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_blackcherry_block", has(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_orange_block", has(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_lemon_block", has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_lime_block", has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_corn_block", has(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_onion_block", has(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_tomato_block", has(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_pecan_block", has(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_almond_block", has(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()))
        .save(output);        
      }
 protected void buildBarrelRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
        .unlockedBy("has_elderberry_block", has(foodblockcompatitemregistry.ELDERBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
        .unlockedBy("has_juniper_block", has(foodblockcompatitemregistry.JUNIPER_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
        .unlockedBy("has_cherry_block", has(foodblockcompatitemregistry.CHERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
        .unlockedBy("has_blackcherry_block", has(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
        .unlockedBy("has_coconut_block", has(foodblockcompatitemregistry.COCONUT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
        .unlockedBy("has_orange_block", has(foodblockcompatitemregistry.ORANGE_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.LEMON_SLAB_ITEM.get())
        .unlockedBy("has_lemon_block", has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.LIME_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.LIME_SLAB_ITEM.get())
        .unlockedBy("has_lime_block", has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.CORN_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.CORN_SLAB_ITEM.get())
        .unlockedBy("has_corn_block", has(foodblockcompatitemregistry.CORN_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.ONION_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.ONION_SLAB_ITEM.get())
        .unlockedBy("has_onion_block", has(foodblockcompatitemregistry.ONION_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get())
        .unlockedBy("has_tomato_block", has(foodblockcompatitemregistry.TOMATO_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.PECAN_SLAB_ITEM.get())
        .unlockedBy("has_pecan_block", has(foodblockcompatitemregistry.PECAN_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get())
        .unlockedBy("has_almond_block", has(foodblockcompatitemregistry.ALMOND_BLOCK_ITEM.get()))
        .save(output);
      }
 protected void buildChairRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
        .define('B', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
        .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
        .define('B', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
        .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.CHERRY_INGOT.get())
        .define('B', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
        .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
        .define('B', foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
        .unlockedBy("has_blackcherry_slab", has(foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.COCONUT_INGOT.get())
        .define('B', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
        .unlockedBy("has_coconut_slab", has(foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.ORANGE_INGOT.get())
        .define('B', foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
        .unlockedBy("has_orange_slab", has(foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.LEMON_INGOT.get())
        .define('B', foodblockcompatitemregistry.LEMON_SLAB_ITEM.get())
        .unlockedBy("has_lemon_slab", has(foodblockcompatitemregistry.LEMON_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.LIME_INGOT.get())
        .define('B', foodblockcompatitemregistry.LIME_SLAB_ITEM.get())
        .unlockedBy("has_lime_slab", has(foodblockcompatitemregistry.LIME_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.CORN_INGOT.get())
        .define('B', foodblockcompatitemregistry.CORN_SLAB_ITEM.get())
        .unlockedBy("has_corn_slab", has(foodblockcompatitemregistry.CORN_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.ONION_INGOT.get())
        .define('B', foodblockcompatitemregistry.ONION_SLAB_ITEM.get())
        .unlockedBy("has_onion_slab", has(foodblockcompatitemregistry.ONION_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.TOMATO_INGOT.get())
        .define('B', foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get())
        .unlockedBy("has_tomato_slab", has(foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.PECAN_INGOT.get())
        .define('B', foodblockcompatitemregistry.PECAN_SLAB_ITEM.get())
        .unlockedBy("has_pecan_slab", has(foodblockcompatitemregistry.PECAN_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.ALMOND_INGOT.get())
        .define('B', foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get())
        .unlockedBy("has_almond_slab", has(foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get()))
        .save(output);
      } 
 protected void buildBedRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.ELDERBERRY_INGOT.get())
           .define('B', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.ELDERBERRY_CARPET_ITEM.get())
           .unlockedBy("has_elderberry_ingot", has(ingotcompatregistry.ELDERBERRY_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.JUNIPER_INGOT.get())
           .define('B', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.JUNIPER_CARPET_ITEM.get())
           .unlockedBy("has_juniper_ingot", has(ingotcompatregistry.JUNIPER_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.CHERRY_INGOT.get())
           .define('B', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.CHERRY_CARPET_ITEM.get())
           .unlockedBy("has_cherry_ingot", has(ingotcompatregistry.CHERRY_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.BLACKCHERRY_INGOT.get())
           .define('B', foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.BLACKCHERRY_CARPET_ITEM.get())
           .unlockedBy("has_blackcherry_ingot", has(ingotcompatregistry.BLACKCHERRY_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.COCONUT_INGOT.get())
           .define('B', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.COCONUT_CARPET_ITEM.get())
           .unlockedBy("has_coconut_ingot", has(ingotcompatregistry.COCONUT_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.ORANGE_INGOT.get())
           .define('B', foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.ORANGE_CARPET_ITEM.get())
           .unlockedBy("has_orange_ingot", has(ingotcompatregistry.ORANGE_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.LEMON_INGOT.get())
           .define('B', foodblockcompatitemregistry.LEMON_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.LEMON_CARPET_ITEM.get())
           .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.LIME_INGOT.get())
           .define('B', foodblockcompatitemregistry.LIME_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.LIME_CARPET_ITEM.get())
           .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CORN_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.CORN_INGOT.get())
           .define('B', foodblockcompatitemregistry.CORN_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.CORN_CARPET_ITEM.get())
           .unlockedBy("has_corn_ingot", has(ingotcompatregistry.CORN_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ONION_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.ONION_INGOT.get())
           .define('B', foodblockcompatitemregistry.ONION_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.ONION_CARPET_ITEM.get())
           .unlockedBy("has_onion_ingot", has(ingotcompatregistry.ONION_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TOMATO_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.TOMATO_INGOT.get())
           .define('B', foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.TOMATO_CARPET_ITEM.get())
           .unlockedBy("has_tomato_ingot", has(ingotcompatregistry.TOMATO_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PECAN_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.PECAN_INGOT.get())
           .define('B', foodblockcompatitemregistry.PECAN_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.PECAN_CARPET_ITEM.get())
           .unlockedBy("has_pecan_ingot", has(ingotcompatregistry.PECAN_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ALMOND_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.ALMOND_INGOT.get())
           .define('B', foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.ALMOND_CARPET_ITEM.get())
           .unlockedBy("has_almond_ingot", has(ingotcompatregistry.ALMOND_INGOT.get()))
           .save(output);
      }
 protected void buildCabinetRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_ELDERBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_ELDERBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_ELDERBERRY_CABINET_ITEM.get())
         .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Juniper---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_JUNIPER_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_JUNIPER_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_JUNIPER_CABINET_ITEM.get())
         .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_CHERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_CHERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_CHERRY_CABINET_ITEM.get())
         .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_BLACKCHERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_blackcherry_slab", has(foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_BLACKCHERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_BLACKCHERRY_CABINET_ITEM.get())
         .unlockedBy("has_blackcherry_slab", has(foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_COCONUT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_coconut_slab", has(foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_COCONUT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_COCONUT_CABINET_ITEM.get())
         .unlockedBy("has_coconut_slab", has(foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_ORANGE_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_orange_slab", has(foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_ORANGE_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_ORANGE_CABINET_ITEM.get())
         .unlockedBy("has_orange_slab", has(foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_LEMON_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.LEMON_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_lemon_slab", has(foodblockcompatitemregistry.LEMON_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_LEMON_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.LEMON_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_LEMON_CABINET_ITEM.get())
         .unlockedBy("has_lemon_slab", has(foodblockcompatitemregistry.LEMON_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_LIME_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.LIME_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_lime_slab", has(foodblockcompatitemregistry.LIME_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_LIME_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.LIME_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_LIME_CABINET_ITEM.get())
         .unlockedBy("has_lime_slab", has(foodblockcompatitemregistry.LIME_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Corn---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_CORN_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.CORN_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_corn_slab", has(foodblockcompatitemregistry.CORN_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_CORN_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.CORN_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_CORN_CABINET_ITEM.get())
         .unlockedBy("has_corn_slab", has(foodblockcompatitemregistry.CORN_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Onion---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_ONION_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ONION_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_onion_slab", has(foodblockcompatitemregistry.ONION_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_ONION_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ONION_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_ONION_CABINET_ITEM.get())
         .unlockedBy("has_onion_slab", has(foodblockcompatitemregistry.ONION_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Tomato---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_TOMATO_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_tomato_slab", has(foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_TOMATO_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_TOMATO_CABINET_ITEM.get())
         .unlockedBy("has_tomato_slab", has(foodblockcompatitemregistry.TOMATO_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Pecan---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_PECAN_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.PECAN_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_pecan_slab", has(foodblockcompatitemregistry.PECAN_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_PECAN_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.PECAN_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_PECAN_CABINET_ITEM.get())
         .unlockedBy("has_pecan_slab", has(foodblockcompatitemregistry.PECAN_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Almond---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_ALMOND_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_almond_slab", has(foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_ALMOND_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_ALMOND_CABINET_ITEM.get())
         .unlockedBy("has_almond_slab", has(foodblockcompatitemregistry.ALMOND_SLAB_ITEM.get()))
         .save(output);
      }
  }
}
