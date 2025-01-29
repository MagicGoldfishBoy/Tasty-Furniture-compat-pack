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

    @SuppressWarnings("unused")
    private PackOutput output;
    @SuppressWarnings("unused")
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
       public static final TagKey<Item> BANANA_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "bananas")
        );
       public static final TagKey<Item> STARFRUIT_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "starfruit")
        );
       public static final TagKey<Item> KIWIFRUIT_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "kiwifruit")
        );
       public static final TagKey<Item> GOOSEBERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "gooseberries")
        );
       public static final TagKey<Item> BLACKBERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "blackberries")
        );
       public static final TagKey<Item> RASPBERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "raspberries")
        );
       public static final TagKey<Item> STRAWBERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "strawberries")
        );
       public static final TagKey<Item> SUGARAPPLE_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "sugarapples")
        );
       public static final TagKey<Item> CHERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "cherries")
        );
       public static final TagKey<Item> BLACKCHERRY_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "blackcherries")
        );
       public static final TagKey<Item> PEACH_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "peaches")
        );
       public static final TagKey<Item> COCONUT_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "coconuts")
        );
       public static final TagKey<Item> ORANGE_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "oranges")
        );
       public static final TagKey<Item> TANGERINE_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "tangerines")
        );
       public static final TagKey<Item> KUMQUAT_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "kumquats")
        );
       public static final TagKey<Item> PERSIMMON_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "persimmons")
        );
       public static final TagKey<Item> SATSUMA_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "satsumas")
        );
       public static final TagKey<Item> MANDARIN_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "mandarins")
        );
       public static final TagKey<Item> LEMON_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "lemons")
        );
       public static final TagKey<Item> CITRON_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "citrons")
        );
       public static final TagKey<Item> BUDDHASHAND_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "buddhashands")
        );
       public static final TagKey<Item> LIME_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "limes")
        );
       public static final TagKey<Item> KEYLIME_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "keylimes")
        );
       public static final TagKey<Item> FINGERLIME_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "fingerlimes")
        );
       public static final TagKey<Item> GRAPEFRUIT_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "grapefruits")
        );
       public static final TagKey<Item> POMELO_TAG = TagKey.create(
        Registries.ITEM,
        ResourceLocation.fromNamespaceAndPath("goldfishmod03tastyfurniturecompataddon", "pomelos")
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

        @SuppressWarnings("null")
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
          buildDeskRecipes(output);
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
  //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
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
  //---------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BANANA_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', BANANA_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BANANA_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', BANANA_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "banana_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BANANA_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', BANANA_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "banana_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BANANA_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', BANANA_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "banana_mush_from_most_advanced_mushhammer");
  //---------------------------------------------------------------------------------------Starfruit-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.STARFRUIT_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', STARFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.STARFRUIT_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', STARFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "starfruit_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.STARFRUIT_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', STARFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "starfruit_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.STARFRUIT_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', STARFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "starfruit_mush_from_most_advanced_mushhammer");
  //---------------------------------------------------------------------------------------Kiwifruit-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KIWIFRUIT_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', KIWIFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KIWIFRUIT_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', KIWIFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "kiwifruit_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KIWIFRUIT_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', KIWIFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "kiwifruit_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KIWIFRUIT_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', KIWIFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "kiwifruit_mush_from_most_advanced_mushhammer");
  //---------------------------------------------------------------------------------------Gooseberry-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.GOOSEBERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', GOOSEBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.GOOSEBERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', GOOSEBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "gooseberry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.GOOSEBERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', GOOSEBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "gooseberry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.GOOSEBERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', GOOSEBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "gooseberry_mush_from_most_advanced_mushhammer");
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BLACKBERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', BLACKBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BLACKBERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', BLACKBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "blackberry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BLACKBERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', BLACKBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "blackberry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BLACKBERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', BLACKBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "blackberry_mush_from_most_advanced_mushhammer");
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.RASPBERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', RASPBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.RASPBERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', RASPBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "raspberry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.RASPBERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', RASPBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "raspberry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.RASPBERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', RASPBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "raspberry_mush_from_most_advanced_mushhammer");
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.STRAWBERRY_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', STRAWBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))             
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.STRAWBERRY_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', STRAWBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "strawberry_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.STRAWBERRY_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', STRAWBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "strawberry_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.STRAWBERRY_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', STRAWBERRY_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "strawberry_mush_from_most_advanced_mushhammer");
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.SUGARAPPLE_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', SUGARAPPLE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.SUGARAPPLE_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', SUGARAPPLE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "sugarapple_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.SUGARAPPLE_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', SUGARAPPLE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "sugarapple_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.SUGARAPPLE_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', SUGARAPPLE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "sugarapple_mush_from_most_advanced_mushhammer");
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
  //--------------------------------------------------------------------------------------Blackcherry--------------------------------------------------------------------------------------------
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
  //----------------------------------------------------------------------------------------Peach------------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PEACH_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', PEACH_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PEACH_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', PEACH_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "peach_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PEACH_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', PEACH_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "peach_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PEACH_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', PEACH_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "peach_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Coconut----------------------------------------------------------------------------------------------
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
  //---------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.TANGERINE_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', TANGERINE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.TANGERINE_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', TANGERINE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "tangerine_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.TANGERINE_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', TANGERINE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "tangerine_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.TANGERINE_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', TANGERINE_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "tangerine_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Kumquat----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KUMQUAT_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', KUMQUAT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KUMQUAT_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', KUMQUAT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "kumquat_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KUMQUAT_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', KUMQUAT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "kumquat_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KUMQUAT_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', KUMQUAT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "kumquat_mush_from_most_advanced_mushhammer");
  //---------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PERSIMMON_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', PERSIMMON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PERSIMMON_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', PERSIMMON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "persimmon_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PERSIMMON_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', PERSIMMON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "persimmon_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.PERSIMMON_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', PERSIMMON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "persimmon_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Satsuma----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.SATSUMA_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', SATSUMA_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.SATSUMA_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', SATSUMA_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "satsuma_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.SATSUMA_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', SATSUMA_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "satsuma_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.SATSUMA_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', SATSUMA_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "satsuma_mush_from_most_advanced_mushhammer");
  //---------------------------------------------------------------------------------------Mandarin----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.MANDARIN_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', MANDARIN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.MANDARIN_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', MANDARIN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "mandarin_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.MANDARIN_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', MANDARIN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "mandarin_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.MANDARIN_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', MANDARIN_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "mandarin_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Lemon------------------------------------------------------------------------------------------------
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
  //----------------------------------------------------------------------------------------Citron-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CITRON_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', CITRON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CITRON_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', CITRON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "citron_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CITRON_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', CITRON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "citron_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.CITRON_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', CITRON_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "citron_mush_from_most_advanced_mushhammer");
  //--------------------------------------------------------------------------------------Buddhashand--------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BUDDHASHAND_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', BUDDHASHAND_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BUDDHASHAND_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', BUDDHASHAND_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "buddhashand_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BUDDHASHAND_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', BUDDHASHAND_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "buddhashand_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.BUDDHASHAND_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', BUDDHASHAND_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "buddhashand_mush_from_most_advanced_mushhammer");
  //-----------------------------------------------------------------------------------------Lime------------------------------------------------------------------------------------------------
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
  //----------------------------------------------------------------------------------------Keylime----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KEYLIME_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', KEYLIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KEYLIME_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', KEYLIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "keylime_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KEYLIME_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', KEYLIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "keylime_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.KEYLIME_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', KEYLIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "keylime_mush_from_most_advanced_mushhammer");
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.FINGERLIME_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', FINGERLIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.FINGERLIME_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', FINGERLIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "fingerlime_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.FINGERLIME_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', FINGERLIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "fingerlime_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.FINGERLIME_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', FINGERLIME_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "fingerlime_mush_from_most_advanced_mushhammer");
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.GRAPEFRUIT_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', GRAPEFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.GRAPEFRUIT_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', GRAPEFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "grapefruit_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.GRAPEFRUIT_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', GRAPEFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "grapefruit_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.GRAPEFRUIT_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', GRAPEFRUIT_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "grapefruit_mush_from_most_advanced_mushhammer");
  //----------------------------------------------------------------------------------------Pomelo-----------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.POMELO_MUSH.get(), 1)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.mushhammer.get())
            .define('B', POMELO_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.mushhammer.get()))
            .save(output);
          //advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.POMELO_MUSH.get(), 2)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.advanced_mushhammer.get())
            .define('B', POMELO_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.advanced_mushhammer.get()))
            .save(output, "pomelo_mush_from_advanced_mushhammer");
          //more advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.POMELO_MUSH.get(), 4)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.more_advanced_mushhammer.get())
            .define('B', POMELO_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.more_advanced_mushhammer.get()))
            .save(output, "pomelo_mush_from_more_advanced_mushhammer");
          //most advanced
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, mushcompatregistry.POMELO_MUSH.get(), 8)
            .pattern("ABB")
            .pattern("BB ")
            .pattern("   ")
            .define('A', mushregistry.most_advanced_mushhammer.get())
            .define('B', POMELO_TAG)
            .unlockedBy("has_mush_hammer", has(mushregistry.most_advanced_mushhammer.get()))
            .save(output, "pomelo_mush_from_most_advanced_mushhammer");
  //-----------------------------------------------------------------------------------------Corn------------------------------------------------------------------------------------------------
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
  //----------------------------------------------------------------------------------------Onion------------------------------------------------------------------------------------------------
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
  //----------------------------------------------------------------------------------------Pecan------------------------------------------------------------------------------------------------
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
  //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
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
  //---------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.BANANA_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BANANA_NUGGET.get())
            .unlockedBy("has_banana_nugget", has(nuggetcompatregistry.BANANA_NUGGET.get()))
            .save(output, "banana_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.BANANA_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.BANANA_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_banana_mush", has(mushcompatregistry.BANANA_MUSH.get()))
            .save(output, "banana_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.BANANA_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.BANANA_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_banana_mush", has(mushcompatregistry.BANANA_MUSH.get()))
            .save(output, "banana_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.BANANA_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get())
            .unlockedBy("has_banana_block", has(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()))
            .save(output, "banana_ingot_from_unpacking");
  //---------------------------------------------------------------------------------------Starfruit-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.STARFRUIT_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.STARFRUIT_NUGGET.get())
            .unlockedBy("has_starfruit_nugget", has(nuggetcompatregistry.STARFRUIT_NUGGET.get()))
            .save(output, "starfruit_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.STARFRUIT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.STARFRUIT_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_starfruit_mush", has(mushcompatregistry.STARFRUIT_MUSH.get()))
            .save(output, "starfruit_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.STARFRUIT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.STARFRUIT_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_starfruit_mush", has(mushcompatregistry.STARFRUIT_MUSH.get()))
            .save(output, "starfruit_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.STARFRUIT_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get())
            .unlockedBy("has_starfruit_block", has(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()))
            .save(output, "starfruit_ingot_from_unpacking");
  //---------------------------------------------------------------------------------------Kiwifruit-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.KIWIFRUIT_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
            .unlockedBy("has_kiwifruit_nugget", has(nuggetcompatregistry.KIWIFRUIT_NUGGET.get()))
            .save(output, "kiwifruit_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.KIWIFRUIT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.KIWIFRUIT_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_kiwifruit_mush", has(mushcompatregistry.KIWIFRUIT_MUSH.get()))
            .save(output, "kiwifruit_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.KIWIFRUIT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.KIWIFRUIT_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_kiwifruit_mush", has(mushcompatregistry.KIWIFRUIT_MUSH.get()))
            .save(output, "kiwifruit_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.KIWIFRUIT_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get())
            .unlockedBy("has_kiwifruit_block", has(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()))
            .save(output, "kiwifruit_ingot_from_unpacking");
  //---------------------------------------------------------------------------------------Gooseberry-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.GOOSEBERRY_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
            .unlockedBy("has_gooseberry_nugget", has(nuggetcompatregistry.GOOSEBERRY_NUGGET.get()))
            .save(output, "gooseberry_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.GOOSEBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.GOOSEBERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_gooseberry_mush", has(mushcompatregistry.GOOSEBERRY_MUSH.get()))
            .save(output, "gooseberry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.GOOSEBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.GOOSEBERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_gooseberry_mush", has(mushcompatregistry.GOOSEBERRY_MUSH.get()))
            .save(output, "gooseberry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.GOOSEBERRY_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get())
            .unlockedBy("has_gooseberry_block", has(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()))
            .save(output, "gooseberry_ingot_from_unpacking");
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.BLACKBERRY_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
            .unlockedBy("has_blackberry_nugget", has(nuggetcompatregistry.BLACKBERRY_NUGGET.get()))
            .save(output, "blackberry_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.BLACKBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.BLACKBERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_blackberry_mush", has(mushcompatregistry.BLACKBERRY_MUSH.get()))
            .save(output, "blackberry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.BLACKBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.BLACKBERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_blackberry_mush", has(mushcompatregistry.BLACKBERRY_MUSH.get()))
            .save(output, "blackberry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.BLACKBERRY_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get())
            .unlockedBy("has_blackberry_block", has(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()))
            .save(output, "blackberry_ingot_from_unpacking");
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.RASPBERRY_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.RASPBERRY_NUGGET.get())
            .unlockedBy("has_raspberry_nugget", has(nuggetcompatregistry.RASPBERRY_NUGGET.get()))
            .save(output, "raspberry_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.RASPBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.RASPBERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_raspberry_mush", has(mushcompatregistry.RASPBERRY_MUSH.get()))
            .save(output, "raspberry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.RASPBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.RASPBERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_raspberry_mush", has(mushcompatregistry.RASPBERRY_MUSH.get()))
            .save(output, "raspberry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.RASPBERRY_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get())
            .unlockedBy("has_raspberry_block", has(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()))
            .save(output, "raspberry_ingot_from_unpacking");
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.STRAWBERRY_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
            .unlockedBy("has_strawberry_nugget", has(nuggetcompatregistry.STRAWBERRY_NUGGET.get()))
            .save(output, "strawberry_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.STRAWBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.STRAWBERRY_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_strawberry_mush", has(mushcompatregistry.STRAWBERRY_MUSH.get()))
            .save(output, "strawberry_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.STRAWBERRY_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.STRAWBERRY_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_strawberry_mush", has(mushcompatregistry.STRAWBERRY_MUSH.get()))
            .save(output, "strawberry_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.STRAWBERRY_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get())
            .unlockedBy("has_strawberry_block", has(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()))
            .save(output, "strawberry_ingot_from_unpacking");
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.SUGARAPPLE_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
            .unlockedBy("has_sugarapple_nugget", has(nuggetcompatregistry.SUGARAPPLE_NUGGET.get()))
            .save(output, "sugarapple_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.SUGARAPPLE_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.SUGARAPPLE_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_sugarapple_mush", has(mushcompatregistry.SUGARAPPLE_MUSH.get()))
            .save(output, "sugarapple_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.SUGARAPPLE_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.SUGARAPPLE_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_sugarapple_mush", has(mushcompatregistry.SUGARAPPLE_MUSH.get()))
            .save(output, "sugarapple_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.SUGARAPPLE_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get())
            .unlockedBy("has_sugarapple_block", has(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()))
            .save(output, "sugarapple_ingot_from_unpacking");
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
  //----------------------------------------------------------------------------------------Peach-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.PEACH_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.PEACH_NUGGET.get())
            .unlockedBy("has_peach_nugget", has(nuggetcompatregistry.PEACH_NUGGET.get()))
            .save(output, "peach_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.PEACH_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.PEACH_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_peach_mush", has(mushcompatregistry.PEACH_MUSH.get()))
            .save(output, "peach_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.PEACH_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.PEACH_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_peach_mush", has(mushcompatregistry.PEACH_MUSH.get()))
            .save(output, "peach_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.PEACH_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get())
            .unlockedBy("has_peach_block", has(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()))
            .save(output, "peach_ingot_from_unpacking");
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
  //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.TANGERINE_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.TANGERINE_NUGGET.get())
            .unlockedBy("has_tangerine_nugget", has(nuggetcompatregistry.TANGERINE_NUGGET.get()))
            .save(output, "tangerine_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.TANGERINE_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.TANGERINE_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_tangerine_mush", has(mushcompatregistry.TANGERINE_MUSH.get()))
            .save(output, "tangerine_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.TANGERINE_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.TANGERINE_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_tangerine_mush", has(mushcompatregistry.TANGERINE_MUSH.get()))
            .save(output, "tangerine_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.TANGERINE_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get())
            .unlockedBy("has_tangerine_block", has(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()))
            .save(output, "tangerine_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.KUMQUAT_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.KUMQUAT_NUGGET.get())
            .unlockedBy("has_kumquat_nugget", has(nuggetcompatregistry.KUMQUAT_NUGGET.get()))
            .save(output, "kumquat_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.KUMQUAT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.KUMQUAT_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_kumquat_mush", has(mushcompatregistry.KUMQUAT_MUSH.get()))
            .save(output, "kumquat_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.KUMQUAT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.KUMQUAT_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_kumquat_mush", has(mushcompatregistry.KUMQUAT_MUSH.get()))
            .save(output, "kumquat_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.KUMQUAT_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get())
            .unlockedBy("has_kumquat_block", has(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()))
            .save(output, "kumquat_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.PERSIMMON_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.PERSIMMON_NUGGET.get())
            .unlockedBy("has_persimmon_nugget", has(nuggetcompatregistry.PERSIMMON_NUGGET.get()))
            .save(output, "persimmon_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.PERSIMMON_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.PERSIMMON_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_persimmon_mush", has(mushcompatregistry.PERSIMMON_MUSH.get()))
            .save(output, "persimmon_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.PERSIMMON_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.PERSIMMON_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_persimmon_mush", has(mushcompatregistry.PERSIMMON_MUSH.get()))
            .save(output, "persimmon_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.PERSIMMON_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get())
            .unlockedBy("has_persimmon_block", has(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()))
            .save(output, "persimmon_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.SATSUMA_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.SATSUMA_NUGGET.get())
            .unlockedBy("has_satsuma_nugget", has(nuggetcompatregistry.SATSUMA_NUGGET.get()))
            .save(output, "satsuma_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.SATSUMA_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.SATSUMA_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_satsuma_mush", has(mushcompatregistry.SATSUMA_MUSH.get()))
            .save(output, "satsuma_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.SATSUMA_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.SATSUMA_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_satsuma_mush", has(mushcompatregistry.SATSUMA_MUSH.get()))
            .save(output, "satsuma_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.SATSUMA_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get())
            .unlockedBy("has_satsuma_block", has(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()))
            .save(output, "satsuma_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.MANDARIN_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.MANDARIN_NUGGET.get())
            .unlockedBy("has_mandarin_nugget", has(nuggetcompatregistry.MANDARIN_NUGGET.get()))
            .save(output, "mandarin_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.MANDARIN_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.MANDARIN_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_mandarin_mush", has(mushcompatregistry.MANDARIN_MUSH.get()))
            .save(output, "mandarin_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.MANDARIN_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.MANDARIN_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_mandarin_mush", has(mushcompatregistry.MANDARIN_MUSH.get()))
            .save(output, "mandarin_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.MANDARIN_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get())
            .unlockedBy("has_mandarin_block", has(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()))
            .save(output, "mandarin_ingot_from_unpacking");
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
  //----------------------------------------------------------------------------------------Citron-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.CITRON_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.CITRON_NUGGET.get())
            .unlockedBy("has_citron_nugget", has(nuggetcompatregistry.CITRON_NUGGET.get()))
            .save(output, "citron_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.CITRON_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.CITRON_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_citron_mush", has(mushcompatregistry.CITRON_MUSH.get()))
            .save(output, "citron_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.CITRON_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.CITRON_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_citron_mush", has(mushcompatregistry.CITRON_MUSH.get()))
            .save(output, "citron_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.CITRON_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get())
            .unlockedBy("has_citron_block", has(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()))
            .save(output, "citron_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Buddhashand-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.BUDDHASHAND_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
            .unlockedBy("has_buddhashand_nugget", has(nuggetcompatregistry.BUDDHASHAND_NUGGET.get()))
            .save(output, "buddhashand_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.BUDDHASHAND_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.BUDDHASHAND_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_buddhashand_mush", has(mushcompatregistry.BUDDHASHAND_MUSH.get()))
            .save(output, "buddhashand_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.BUDDHASHAND_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.BUDDHASHAND_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_buddhashand_mush", has(mushcompatregistry.BUDDHASHAND_MUSH.get()))
            .save(output, "buddhashand_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.BUDDHASHAND_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get())
            .unlockedBy("has_buddhashand_block", has(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()))
            .save(output, "buddhashand_ingot_from_unpacking");
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
  //----------------------------------------------------------------------------------------Keylime-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.KEYLIME_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.KEYLIME_NUGGET.get())
            .unlockedBy("has_keylime_nugget", has(nuggetcompatregistry.KEYLIME_NUGGET.get()))
            .save(output, "keylime_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.KEYLIME_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.KEYLIME_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_keylime_mush", has(mushcompatregistry.KEYLIME_MUSH.get()))
            .save(output, "keylime_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.KEYLIME_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.KEYLIME_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_keylime_mush", has(mushcompatregistry.KEYLIME_MUSH.get()))
            .save(output, "keylime_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.KEYLIME_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get())
            .unlockedBy("has_keylime_block", has(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()))
            .save(output, "keylime_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Fingerlime-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.FINGERLIME_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.FINGERLIME_NUGGET.get())
            .unlockedBy("has_fingerlime_nugget", has(nuggetcompatregistry.FINGERLIME_NUGGET.get()))
            .save(output, "fingerlime_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.FINGERLIME_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.FINGERLIME_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_fingerlime_mush", has(mushcompatregistry.FINGERLIME_MUSH.get()))
            .save(output, "fingerlime_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.FINGERLIME_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.FINGERLIME_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_fingerlime_mush", has(mushcompatregistry.FINGERLIME_MUSH.get()))
            .save(output, "fingerlime_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.FINGERLIME_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get())
            .unlockedBy("has_fingerlime_block", has(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()))
            .save(output, "fingerlime_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Grapefruit-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.GRAPEFRUIT_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
            .unlockedBy("has_grapefruit_nugget", has(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get()))
            .save(output, "grapefruit_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.GRAPEFRUIT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.GRAPEFRUIT_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_grapefruit_mush", has(mushcompatregistry.GRAPEFRUIT_MUSH.get()))
            .save(output, "grapefruit_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.GRAPEFRUIT_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.GRAPEFRUIT_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_grapefruit_mush", has(mushcompatregistry.GRAPEFRUIT_MUSH.get()))
            .save(output, "grapefruit_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.GRAPEFRUIT_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get())
            .unlockedBy("has_grapefruit_block", has(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()))
            .save(output, "grapefruit_ingot_from_unpacking");
  //----------------------------------------------------------------------------------------Pomelo-----------------------------------------------------------------------------------------------
          //crafting
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingotcompatregistry.POMELO_INGOT.get(), 1)
            .pattern("AAA")
            .pattern("AAA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.POMELO_NUGGET.get())
            .unlockedBy("has_pomelo_nugget", has(nuggetcompatregistry.POMELO_NUGGET.get()))
            .save(output, "pomelo_ingot_from_crafting");
          //smelting
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(mushcompatregistry.POMELO_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.POMELO_INGOT.get(),
            1.0f,
            200
            )
            .unlockedBy("has_pomelo_mush", has(mushcompatregistry.POMELO_MUSH.get()))
            .save(output, "pomelo_ingot_from_smelting");
          //blasting
            SimpleCookingRecipeBuilder.blasting(Ingredient.of(mushcompatregistry.POMELO_MUSH.get()),
            RecipeCategory.MISC,
            ingotcompatregistry.POMELO_INGOT.get(),
            1.0f,
            100
            )
            .unlockedBy("has_pomelo_mush", has(mushcompatregistry.POMELO_MUSH.get()))
            .save(output, "pomelo_ingot_from_blasting");
          //unpacking
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingotcompatregistry.POMELO_INGOT.get(), 9)
            .requires(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get())
            .unlockedBy("has_pomelo_block", has(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()))
            .save(output, "pomelo_ingot_from_unpacking");
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.BANANA_NUGGET.get(), 9)
        .requires(ingotcompatregistry.BANANA_INGOT.get())
        .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.STARFRUIT_NUGGET.get(), 9)
        .requires(ingotcompatregistry.STARFRUIT_INGOT.get())
        .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.KIWIFRUIT_NUGGET.get(), 9)
        .requires(ingotcompatregistry.KIWIFRUIT_INGOT.get())
        .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.GOOSEBERRY_NUGGET.get(), 9)
        .requires(ingotcompatregistry.GOOSEBERRY_INGOT.get())
        .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.BLACKBERRY_NUGGET.get(), 9)
        .requires(ingotcompatregistry.BLACKBERRY_INGOT.get())
        .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.RASPBERRY_NUGGET.get(), 9)
        .requires(ingotcompatregistry.RASPBERRY_INGOT.get())
        .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.STRAWBERRY_NUGGET.get(), 9)
        .requires(ingotcompatregistry.STRAWBERRY_INGOT.get())
        .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.SUGARAPPLE_NUGGET.get(), 9)
        .requires(ingotcompatregistry.SUGARAPPLE_INGOT.get())
        .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //----------------------------------------------------------------------------------------Peach-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.PEACH_NUGGET.get(), 9)
        .requires(ingotcompatregistry.PEACH_INGOT.get())
        .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.TANGERINE_NUGGET.get(), 9)
        .requires(ingotcompatregistry.TANGERINE_INGOT.get())
        .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.KUMQUAT_NUGGET.get(), 9)
        .requires(ingotcompatregistry.KUMQUAT_INGOT.get())
        .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.PERSIMMON_NUGGET.get(), 9)
        .requires(ingotcompatregistry.PERSIMMON_INGOT.get())
        .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.SATSUMA_NUGGET.get(), 9)
        .requires(ingotcompatregistry.SATSUMA_INGOT.get())
        .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.MANDARIN_NUGGET.get(), 9)
        .requires(ingotcompatregistry.MANDARIN_INGOT.get())
        .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Lemon-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.LEMON_NUGGET.get(), 9)
        .requires(ingotcompatregistry.LEMON_INGOT.get())
        .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Citron-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.CITRON_NUGGET.get(), 9)
        .requires(ingotcompatregistry.CITRON_INGOT.get())
        .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Buddhashand-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.BUDDHASHAND_NUGGET.get(), 9)
        .requires(ingotcompatregistry.BUDDHASHAND_INGOT.get())
        .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Lime-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.LIME_NUGGET.get(), 9)
        .requires(ingotcompatregistry.LIME_INGOT.get())
        .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Keylime-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.KEYLIME_NUGGET.get(), 9)
        .requires(ingotcompatregistry.KEYLIME_INGOT.get())
        .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Fingerlime-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.FINGERLIME_NUGGET.get(), 9)
        .requires(ingotcompatregistry.FINGERLIME_INGOT.get())
        .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Grapefruit-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.GRAPEFRUIT_NUGGET.get(), 9)
        .requires(ingotcompatregistry.GRAPEFRUIT_INGOT.get())
        .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
        .save(output);
  //----------------------------------------------------------------------------------------Pomelo-----------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nuggetcompatregistry.POMELO_NUGGET.get(), 9)
        .requires(ingotcompatregistry.POMELO_INGOT.get())
        .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BANANA_INGOT.get())
          .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get())
          .unlockedBy("has_banana_block", has(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BANANA_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_banana_block", has(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()))
          .save(output, "banana_bricks_block_from_banana_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
          .unlockedBy("has_banana_slab", has(foodblockcompatitemregistry.BANANA_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BANANA_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_banana_block", has(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()))
          .save(output, "banana_chiseled_block_from_banana_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
          .unlockedBy("has_banana_slab", has(foodblockcompatitemregistry.BANANA_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BANANA_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_banana_block", has(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()))
          .save(output, "banana_tiles_block_from_banana_block_stonecutting");
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
          .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get())
          .unlockedBy("has_starfruit_block", has(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.STARFRUIT_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_starfruit_block", has(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()))
          .save(output, "starfruit_bricks_block_from_starfruit_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
          .unlockedBy("has_starfruit_slab", has(foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.STARFRUIT_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_starfruit_block", has(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()))
          .save(output, "starfruit_chiseled_block_from_starfruit_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
          .unlockedBy("has_starfruit_slab", has(foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.STARFRUIT_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_starfruit_block", has(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()))
          .save(output, "starfruit_tiles_block_from_starfruit_block_stonecutting");
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
          .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get())
          .unlockedBy("has_kiwifruit_block", has(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.KIWIFRUIT_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_kiwifruit_block", has(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()))
          .save(output, "kiwifruit_bricks_block_from_kiwifruit_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
          .unlockedBy("has_kiwifruit_slab", has(foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.KIWIFRUIT_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_kiwifruit_block", has(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()))
          .save(output, "kiwifruit_chiseled_block_from_kiwifruit_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
          .unlockedBy("has_kiwifruit_slab", has(foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.KIWIFRUIT_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_kiwifruit_block", has(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()))
          .save(output, "kiwifruit_tiles_block_from_kiwifruit_block_stonecutting");
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
          .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get())
          .unlockedBy("has_gooseberry_block", has(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.GOOSEBERRY_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_gooseberry_block", has(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()))
          .save(output, "gooseberry_bricks_block_from_gooseberry_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
          .unlockedBy("has_gooseberry_slab", has(foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.GOOSEBERRY_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_gooseberry_block", has(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()))
          .save(output, "gooseberry_chiseled_block_from_gooseberry_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
          .unlockedBy("has_gooseberry_slab", has(foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.GOOSEBERRY_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_gooseberry_block", has(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()))
          .save(output, "gooseberry_tiles_block_from_gooseberry_block_stonecutting");
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
          .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get())
          .unlockedBy("has_blackberry_block", has(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BLACKBERRY_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_blackberry_block", has(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()))
          .save(output, "blackberry_bricks_block_from_blackberry_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
          .unlockedBy("has_blackberry_slab", has(foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BLACKBERRY_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_blackberry_block", has(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()))
          .save(output, "blackberry_chiseled_block_from_blackberry_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
          .unlockedBy("has_blackberry_slab", has(foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BLACKBERRY_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_blackberry_block", has(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()))
          .save(output, "blackberry_tiles_block_from_blackberry_block_stonecutting");
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
          .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get())
          .unlockedBy("has_raspberry_block", has(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.RASPBERRY_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_raspberry_block", has(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()))
          .save(output, "raspberry_bricks_block_from_raspberry_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
          .unlockedBy("has_raspberry_slab", has(foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.RASPBERRY_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_raspberry_block", has(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()))
          .save(output, "raspberry_chiseled_block_from_raspberry_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
          .unlockedBy("has_raspberry_slab", has(foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.RASPBERRY_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_raspberry_block", has(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()))
          .save(output, "raspberry_tiles_block_from_raspberry_block_stonecutting");
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
          .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get())
          .unlockedBy("has_strawberry_block", has(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.STRAWBERRY_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_strawberry_block", has(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()))
          .save(output, "strawberry_bricks_block_from_strawberry_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
          .unlockedBy("has_strawberry_slab", has(foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.STRAWBERRY_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_strawberry_block", has(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()))
          .save(output, "strawberry_chiseled_block_from_strawberry_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
          .unlockedBy("has_strawberry_slab", has(foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.STRAWBERRY_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_strawberry_block", has(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()))
          .save(output, "strawberry_tiles_block_from_strawberry_block_stonecutting");
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
          .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get())
          .unlockedBy("has_sugarapple_block", has(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.SUGARAPPLE_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_sugarapple_block", has(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()))
          .save(output, "sugarapple_bricks_block_from_sugarapple_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
          .unlockedBy("has_sugarapple_slab", has(foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.SUGARAPPLE_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_sugarapple_block", has(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()))
          .save(output, "sugarapple_chiseled_block_from_sugarapple_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
          .unlockedBy("has_sugarapple_slab", has(foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.SUGARAPPLE_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_sugarapple_block", has(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()))
          .save(output, "sugarapple_tiles_block_from_sugarapple_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.PEACH_INGOT.get())
          .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get())
          .unlockedBy("has_peach_block", has(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.PEACH_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_peach_block", has(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()))
          .save(output, "peach_bricks_block_from_peach_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
          .unlockedBy("has_peach_slab", has(foodblockcompatitemregistry.PEACH_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.PEACH_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_peach_block", has(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()))
          .save(output, "peach_chiseled_block_from_peach_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
          .unlockedBy("has_peach_slab", has(foodblockcompatitemregistry.PEACH_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.PEACH_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_peach_block", has(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()))
          .save(output, "peach_tiles_block_from_peach_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
          .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get())
          .unlockedBy("has_tangerine_block", has(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.TANGERINE_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_tangerine_block", has(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()))
          .save(output, "tangerine_bricks_block_from_tangerine_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
          .unlockedBy("has_tangerine_slab", has(foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.TANGERINE_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_tangerine_block", has(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()))
          .save(output, "tangerine_chiseled_block_from_tangerine_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
          .unlockedBy("has_tangerine_slab", has(foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.TANGERINE_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_tangerine_block", has(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()))
          .save(output, "tangerine_tiles_block_from_tangerine_block_stonecutting");
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
          .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get())
          .unlockedBy("has_kumquat_block", has(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.KUMQUAT_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_kumquat_block", has(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()))
          .save(output, "kumquat_bricks_block_from_kumquat_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
          .unlockedBy("has_kumquat_slab", has(foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.KUMQUAT_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_kumquat_block", has(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()))
          .save(output, "kumquat_chiseled_block_from_kumquat_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
          .unlockedBy("has_kumquat_slab", has(foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.KUMQUAT_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_kumquat_block", has(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()))
          .save(output, "kumquat_tiles_block_from_kumquat_block_stonecutting");
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
          .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get())
          .unlockedBy("has_persimmon_block", has(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.PERSIMMON_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_persimmon_block", has(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()))
          .save(output, "persimmon_bricks_block_from_persimmon_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
          .unlockedBy("has_persimmon_slab", has(foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.PERSIMMON_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_persimmon_block", has(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()))
          .save(output, "persimmon_chiseled_block_from_persimmon_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
          .unlockedBy("has_persimmon_slab", has(foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.PERSIMMON_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_persimmon_block", has(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()))
          .save(output, "persimmon_tiles_block_from_persimmon_block_stonecutting");
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
          .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get())
          .unlockedBy("has_satsuma_block", has(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.SATSUMA_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_satsuma_block", has(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()))
          .save(output, "satsuma_bricks_block_from_satsuma_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get())
          .unlockedBy("has_satsuma_slab", has(foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.SATSUMA_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_satsuma_block", has(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()))
          .save(output, "satsuma_chiseled_block_from_satsuma_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get())
          .unlockedBy("has_satsuma_slab", has(foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.SATSUMA_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_satsuma_block", has(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()))
          .save(output, "satsuma_tiles_block_from_satsuma_block_stonecutting");
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
          .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get())
          .unlockedBy("has_mandarin_block", has(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.MANDARIN_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_mandarin_block", has(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()))
          .save(output, "mandarin_bricks_block_from_mandarin_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get())
          .unlockedBy("has_mandarin_slab", has(foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.MANDARIN_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_mandarin_block", has(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()))
          .save(output, "mandarin_chiseled_block_from_mandarin_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get())
          .unlockedBy("has_mandarin_slab", has(foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.MANDARIN_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_mandarin_block", has(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()))
          .save(output, "mandarin_tiles_block_from_mandarin_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.CITRON_INGOT.get())
          .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get())
          .unlockedBy("has_citron_block", has(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CITRON_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_citron_block", has(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()))
          .save(output, "citron_bricks_block_from_citron_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.CITRON_SLAB_ITEM.get())
          .unlockedBy("has_citron_slab", has(foodblockcompatitemregistry.CITRON_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CITRON_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_citron_block", has(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()))
          .save(output, "citron_chiseled_block_from_citron_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.CITRON_SLAB_ITEM.get())
          .unlockedBy("has_citron_slab", has(foodblockcompatitemregistry.CITRON_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.CITRON_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_citron_block", has(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()))
          .save(output, "citron_tiles_block_from_citron_block_stonecutting");
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
          .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get())
          .unlockedBy("has_buddhashand_block", has(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BUDDHASHAND_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_buddhashand_block", has(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()))
          .save(output, "buddhashand_bricks_block_from_buddhashand_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get())
          .unlockedBy("has_buddhashand_slab", has(foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BUDDHASHAND_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_buddhashand_block", has(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()))
          .save(output, "buddhashand_chiseled_block_from_buddhashand_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get())
          .unlockedBy("has_buddhashand_slab", has(foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.BUDDHASHAND_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_buddhashand_block", has(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()))
          .save(output, "buddhashand_tiles_block_from_buddhashand_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
          .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get())
          .unlockedBy("has_keylime_block", has(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.KEYLIME_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_keylime_block", has(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()))
          .save(output, "keylime_bricks_block_from_keylime_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get())
          .unlockedBy("has_keylime_slab", has(foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.KEYLIME_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_keylime_block", has(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()))
          .save(output, "keylime_chiseled_block_from_keylime_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get())
          .unlockedBy("has_keylime_slab", has(foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.KEYLIME_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_keylime_block", has(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()))
          .save(output, "keylime_tiles_block_from_keylime_block_stonecutting");
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
          .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get())
          .unlockedBy("has_fingerlime_block", has(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.FINGERLIME_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_fingerlime_block", has(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()))
          .save(output, "fingerlime_bricks_block_from_fingerlime_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get())
          .unlockedBy("has_fingerlime_slab", has(foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.FINGERLIME_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_fingerlime_block", has(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()))
          .save(output, "fingerlime_chiseled_block_from_fingerlime_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get())
          .unlockedBy("has_fingerlime_slab", has(foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.FINGERLIME_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_fingerlime_block", has(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()))
          .save(output, "fingerlime_tiles_block_from_fingerlime_block_stonecutting");
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
          .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get())
          .unlockedBy("has_grapefruit_block", has(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.GRAPEFRUIT_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_grapefruit_block", has(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()))
          .save(output, "grapefruit_bricks_block_from_grapefruit_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get())
          .unlockedBy("has_grapefruit_slab", has(foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.GRAPEFRUIT_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_grapefruit_block", has(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()))
          .save(output, "grapefruit_chiseled_block_from_grapefruit_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get())
          .unlockedBy("has_grapefruit_slab", has(foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.GRAPEFRUIT_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_grapefruit_block", has(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()))
          .save(output, "grapefruit_tiles_block_from_grapefruit_block_stonecutting");
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get(), 1)
          .pattern("AAA")
          .pattern("AAA")
          .pattern("AAA")
          .define('A', ingotcompatregistry.POMELO_INGOT.get())
          .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
          .save(output); 
        //bricks
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_BRICKS_BLOCK_ITEM.get(), 4)
          .pattern("AA ")
          .pattern("AA ")
          .pattern("   ")
          .define('A', foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get())
          .unlockedBy("has_pomelo_block", has(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()))
          .save(output); 
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.POMELO_BRICKS_BLOCK_ITEM.get())
          .unlockedBy("has_pomelo_block", has(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()))
          .save(output, "pomelo_bricks_block_from_pomelo_block_stonecutting");

        //chiseled
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_CHISELED_BLOCK_ITEM.get())
          .pattern("   ")
          .pattern(" A ")
          .pattern(" A ")
          .define('A', foodblockcompatitemregistry.POMELO_SLAB_ITEM.get())
          .unlockedBy("has_pomelo_slab", has(foodblockcompatitemregistry.POMELO_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.POMELO_CHISELED_BLOCK_ITEM.get())
          .unlockedBy("has_pomelo_block", has(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()))
          .save(output, "pomelo_chiseled_block_from_pomelo_block_stonecutting");

        //tiles
         //crafting
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_TILES_BLOCK_ITEM.get(),2)
          .pattern("   ")
          .pattern("AA ")
          .pattern("AA ")
          .define('A', foodblockcompatitemregistry.POMELO_SLAB_ITEM.get())
          .unlockedBy("has_pomelo_slab", has(foodblockcompatitemregistry.POMELO_SLAB_ITEM.get()))
          .save(output);
         //stonecutting     
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, foodblockcompatitemregistry.POMELO_TILES_BLOCK_ITEM.get())
          .unlockedBy("has_pomelo_block", has(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()))
          .save(output, "pomelo_tiles_block_from_pomelo_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BANANA_INGOT.get())
          .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BANANA_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.BANANA_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_banana_bricks_block", has(foodblockcompatitemregistry.BANANA_BRICKS_BLOCK_ITEM.get()))
          .save(output, "banana_bricks_slab_from_banana_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
          .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STARFRUIT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.STARFRUIT_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_starfruit_bricks_block", has(foodblockcompatitemregistry.STARFRUIT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "starfruit_bricks_slab_from_starfruit_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
          .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KIWIFRUIT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.KIWIFRUIT_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_kiwifruit_bricks_block", has(foodblockcompatitemregistry.KIWIFRUIT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "kiwifruit_bricks_slab_from_kiwifruit_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
          .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GOOSEBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.GOOSEBERRY_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_gooseberry_bricks_block", has(foodblockcompatitemregistry.GOOSEBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "gooseberry_bricks_slab_from_gooseberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
          .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.BLACKBERRY_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_blackberry_bricks_block", has(foodblockcompatitemregistry.BLACKBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "blackberry_bricks_slab_from_blackberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
          .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.RASPBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.RASPBERRY_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_raspberry_bricks_block", has(foodblockcompatitemregistry.RASPBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "raspberry_bricks_slab_from_raspberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
          .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STRAWBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.STRAWBERRY_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_strawberry_bricks_block", has(foodblockcompatitemregistry.STRAWBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "strawberry_bricks_slab_from_strawberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
          .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SUGARAPPLE_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.SUGARAPPLE_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_sugarapple_bricks_block", has(foodblockcompatitemregistry.SUGARAPPLE_BRICKS_BLOCK_ITEM.get()))
          .save(output, "sugarapple_bricks_slab_from_sugarapple_bricks_block_stonecutting");
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
  //----------------------------------------------------------------------------------------Peach-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.PEACH_INGOT.get())
          .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PEACH_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.PEACH_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_peach_bricks_block", has(foodblockcompatitemregistry.PEACH_BRICKS_BLOCK_ITEM.get()))
          .save(output, "peach_bricks_slab_from_peach_bricks_block_stonecutting");
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
  //----------------------------------------------------------------------------------------Tangerine-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
          .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TANGERINE_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.TANGERINE_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_tangerine_bricks_block", has(foodblockcompatitemregistry.TANGERINE_BRICKS_BLOCK_ITEM.get()))
          .save(output, "tangerine_bricks_slab_from_tangerine_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Kumquat-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
          .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KUMQUAT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.KUMQUAT_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_kumquat_bricks_block", has(foodblockcompatitemregistry.KUMQUAT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "kumquat_bricks_slab_from_kumquat_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Persimmon-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
          .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PERSIMMON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.PERSIMMON_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_persimmon_bricks_block", has(foodblockcompatitemregistry.PERSIMMON_BRICKS_BLOCK_ITEM.get()))
          .save(output, "persimmon_bricks_slab_from_persimmon_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Satsuma-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
          .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SATSUMA_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.SATSUMA_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_satsuma_bricks_block", has(foodblockcompatitemregistry.SATSUMA_BRICKS_BLOCK_ITEM.get()))
          .save(output, "satsuma_bricks_slab_from_satsuma_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Mandarin-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
          .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.MANDARIN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.MANDARIN_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_mandarin_bricks_block", has(foodblockcompatitemregistry.MANDARIN_BRICKS_BLOCK_ITEM.get()))
          .save(output, "mandarin_bricks_slab_from_mandarin_bricks_block_stonecutting");
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
  //----------------------------------------------------------------------------------------Citron-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.CITRON_INGOT.get())
          .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CITRON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.CITRON_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_citron_bricks_block", has(foodblockcompatitemregistry.CITRON_BRICKS_BLOCK_ITEM.get()))
          .save(output, "citron_bricks_slab_from_citron_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Buddhashand-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
          .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BUDDHASHAND_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.BUDDHASHAND_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_buddhashand_bricks_block", has(foodblockcompatitemregistry.BUDDHASHAND_BRICKS_BLOCK_ITEM.get()))
          .save(output, "buddhashand_bricks_slab_from_buddhashand_bricks_block_stonecutting");
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
  //----------------------------------------------------------------------------------------Keylime-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
          .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KEYLIME_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.KEYLIME_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_keylime_bricks_block", has(foodblockcompatitemregistry.KEYLIME_BRICKS_BLOCK_ITEM.get()))
          .save(output, "keylime_bricks_slab_from_keylime_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Fingerlime-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
          .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.FINGERLIME_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.FINGERLIME_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_fingerlime_bricks_block", has(foodblockcompatitemregistry.FINGERLIME_BRICKS_BLOCK_ITEM.get()))
          .save(output, "fingerlime_bricks_slab_from_fingerlime_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Grapefruit-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
          .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GRAPEFRUIT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.GRAPEFRUIT_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_grapefruit_bricks_block", has(foodblockcompatitemregistry.GRAPEFRUIT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "grapefruit_bricks_slab_from_grapefruit_bricks_block_stonecutting");
  //----------------------------------------------------------------------------------------Pomelo-----------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_SLAB_ITEM.get())
          .pattern("   ")
          .pattern("   ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.POMELO_INGOT.get())
          .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.POMELO_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.POMELO_BRICKS_SLAB_ITEM.get(), 2)
          .unlockedBy("has_pomelo_bricks_block", has(foodblockcompatitemregistry.POMELO_BRICKS_BLOCK_ITEM.get()))
          .save(output, "pomelo_bricks_slab_from_pomelo_bricks_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BANANA_INGOT.get())
          .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BANANA_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.BANANA_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_banana_bricks_block", has(foodblockcompatitemregistry.BANANA_BRICKS_BLOCK_ITEM.get()))
          .save(output, "banana_bricks_stairs_from_banana_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
          .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STARFRUIT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.STARFRUIT_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_starfruit_bricks_block", has(foodblockcompatitemregistry.STARFRUIT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "starfruit_bricks_stairs_from_starfruit_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
          .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KIWIFRUIT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.KIWIFRUIT_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_kiwifruit_bricks_block", has(foodblockcompatitemregistry.KIWIFRUIT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "kiwifruit_bricks_stairs_from_kiwifruit_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
          .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GOOSEBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.GOOSEBERRY_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_gooseberry_bricks_block", has(foodblockcompatitemregistry.GOOSEBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "gooseberry_bricks_stairs_from_gooseberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
          .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BLACKBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.BLACKBERRY_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_blackberry_bricks_block", has(foodblockcompatitemregistry.BLACKBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "blackberry_bricks_stairs_from_blackberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
          .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.RASPBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.RASPBERRY_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_raspberry_bricks_block", has(foodblockcompatitemregistry.RASPBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "raspberry_bricks_stairs_from_raspberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
          .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.STRAWBERRY_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.STRAWBERRY_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_strawberry_bricks_block", has(foodblockcompatitemregistry.STRAWBERRY_BRICKS_BLOCK_ITEM.get()))
          .save(output, "strawberry_bricks_stairs_from_strawberry_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
          .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SUGARAPPLE_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.SUGARAPPLE_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_sugarapple_bricks_block", has(foodblockcompatitemregistry.SUGARAPPLE_BRICKS_BLOCK_ITEM.get()))
          .save(output, "sugarapple_bricks_stairs_from_sugarapple_bricks_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.PEACH_INGOT.get())
          .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PEACH_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.PEACH_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_peach_bricks_block", has(foodblockcompatitemregistry.PEACH_BRICKS_BLOCK_ITEM.get()))
          .save(output, "peach_bricks_stairs_from_peach_bricks_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
          .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.TANGERINE_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.TANGERINE_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_tangerine_bricks_block", has(foodblockcompatitemregistry.TANGERINE_BRICKS_BLOCK_ITEM.get()))
          .save(output, "tangerine_bricks_stairs_from_tangerine_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
          .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KUMQUAT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.KUMQUAT_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_kumquat_bricks_block", has(foodblockcompatitemregistry.KUMQUAT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "kumquat_bricks_stairs_from_kumquat_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
          .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.PERSIMMON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.PERSIMMON_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_persimmon_bricks_block", has(foodblockcompatitemregistry.PERSIMMON_BRICKS_BLOCK_ITEM.get()))
          .save(output, "persimmon_bricks_stairs_from_persimmon_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
          .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.SATSUMA_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.SATSUMA_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_satsuma_bricks_block", has(foodblockcompatitemregistry.SATSUMA_BRICKS_BLOCK_ITEM.get()))
          .save(output, "satsuma_bricks_stairs_from_satsuma_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
          .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.MANDARIN_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.MANDARIN_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_mandarin_bricks_block", has(foodblockcompatitemregistry.MANDARIN_BRICKS_BLOCK_ITEM.get()))
          .save(output, "mandarin_bricks_stairs_from_mandarin_bricks_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.CITRON_INGOT.get())
          .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.CITRON_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.CITRON_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_citron_bricks_block", has(foodblockcompatitemregistry.CITRON_BRICKS_BLOCK_ITEM.get()))
          .save(output, "citron_bricks_stairs_from_citron_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
          .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.BUDDHASHAND_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.BUDDHASHAND_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_buddhashand_bricks_block", has(foodblockcompatitemregistry.BUDDHASHAND_BRICKS_BLOCK_ITEM.get()))
          .save(output, "buddhashand_bricks_stairs_from_buddhashand_bricks_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
          .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.KEYLIME_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.KEYLIME_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_keylime_bricks_block", has(foodblockcompatitemregistry.KEYLIME_BRICKS_BLOCK_ITEM.get()))
          .save(output, "keylime_bricks_stairs_from_keylime_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
          .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.FINGERLIME_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.FINGERLIME_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_fingerlime_bricks_block", has(foodblockcompatitemregistry.FINGERLIME_BRICKS_BLOCK_ITEM.get()))
          .save(output, "fingerlime_bricks_stairs_from_fingerlime_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
          .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.GRAPEFRUIT_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.GRAPEFRUIT_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_grapefruit_bricks_block", has(foodblockcompatitemregistry.GRAPEFRUIT_BRICKS_BLOCK_ITEM.get()))
          .save(output, "grapefruit_bricks_stairs_from_grapefruit_bricks_block_stonecutting");
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        //plain
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_STAIRS_ITEM.get())
          .pattern("A  ")
          .pattern("AA ")
          .pattern("AAA")
          .define('A', ingotcompatregistry.POMELO_INGOT.get())
          .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
          .save(output);
        //bricks
          SingleItemRecipeBuilder.stonecutting(Ingredient.of(foodblockcompatitemregistry.POMELO_BRICKS_BLOCK_ITEM.get()), RecipeCategory.BUILDING_BLOCKS, 
          foodblockcompatitemregistry.POMELO_BRICKS_STAIRS_ITEM.get(), 1)
          .unlockedBy("has_pomelo_bricks_block", has(foodblockcompatitemregistry.POMELO_BRICKS_BLOCK_ITEM.get()))
          .save(output, "pomelo_bricks_stairs_from_pomelo_bricks_block_stonecutting");
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.BANANA_NUGGET.get())
         .unlockedBy("has_banana_nugget", has(nuggetcompatregistry.BANANA_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.STARFRUIT_NUGGET.get())
         .unlockedBy("has_starfruit_nugget", has(nuggetcompatregistry.STARFRUIT_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
         .unlockedBy("has_kiwifruit_nugget", has(nuggetcompatregistry.KIWIFRUIT_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
         .unlockedBy("has_gooseberry_nugget", has(nuggetcompatregistry.GOOSEBERRY_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
         .unlockedBy("has_blackberry_nugget", has(nuggetcompatregistry.BLACKBERRY_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.RASPBERRY_NUGGET.get())
         .unlockedBy("has_raspberry_nugget", has(nuggetcompatregistry.RASPBERRY_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
         .unlockedBy("has_strawberry_nugget", has(nuggetcompatregistry.STRAWBERRY_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
         .unlockedBy("has_sugarapple_nugget", has(nuggetcompatregistry.SUGARAPPLE_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.PEACH_NUGGET.get())
         .unlockedBy("has_peach_nugget", has(nuggetcompatregistry.PEACH_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.TANGERINE_NUGGET.get())
         .unlockedBy("has_tangerine_nugget", has(nuggetcompatregistry.TANGERINE_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.KUMQUAT_NUGGET.get())
         .unlockedBy("has_kumquat_nugget", has(nuggetcompatregistry.KUMQUAT_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.PERSIMMON_NUGGET.get())
         .unlockedBy("has_persimmon_nugget", has(nuggetcompatregistry.PERSIMMON_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.SATSUMA_NUGGET.get())
         .unlockedBy("has_satsuma_nugget", has(nuggetcompatregistry.SATSUMA_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.MANDARIN_NUGGET.get())
         .unlockedBy("has_mandarin_nugget", has(nuggetcompatregistry.MANDARIN_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.LEMON_NUGGET.get())
         .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.CITRON_NUGGET.get())
         .unlockedBy("has_citron_nugget", has(nuggetcompatregistry.CITRON_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
         .unlockedBy("has_buddhashand_nugget", has(nuggetcompatregistry.BUDDHASHAND_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.LIME_NUGGET.get())
         .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.KEYLIME_NUGGET.get())
         .unlockedBy("has_keylime_nugget", has(nuggetcompatregistry.KEYLIME_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.FINGERLIME_NUGGET.get())
         .unlockedBy("has_fingerlime_nugget", has(nuggetcompatregistry.FINGERLIME_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
         .unlockedBy("has_grapefruit_nugget", has(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_BARS_ITEM.get(), 8)
         .pattern("   ")
         .pattern("AAA")
         .pattern("AAA")
         .define('A', nuggetcompatregistry.POMELO_NUGGET.get())
         .unlockedBy("has_pomelo_nugget", has(nuggetcompatregistry.POMELO_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.BANANA_INGOT.get())
         .unlockedBy("has_banana_nugget", has(ingotcompatregistry.BANANA_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
         .unlockedBy("has_starfruit_nugget", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
         .unlockedBy("has_kiwifruit_nugget", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
         .unlockedBy("has_gooseberry_nugget", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
         .unlockedBy("has_blackberry_nugget", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
         .unlockedBy("has_raspberry_nugget", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
         .unlockedBy("has_strawberry_nugget", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
         .unlockedBy("has_sugarapple_nugget", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.PEACH_INGOT.get())
         .unlockedBy("has_peach_nugget", has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
         .unlockedBy("has_tangerine_nugget", has(ingotcompatregistry.TANGERINE_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
         .unlockedBy("has_kumquat_nugget", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
         .unlockedBy("has_persimmon_nugget", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
         .unlockedBy("has_satsuma_nugget", has(ingotcompatregistry.SATSUMA_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
         .unlockedBy("has_mandarin_nugget", has(ingotcompatregistry.MANDARIN_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.LEMON_INGOT.get())
         .unlockedBy("has_lemon_nugget", has(ingotcompatregistry.LEMON_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.CITRON_INGOT.get())
         .unlockedBy("has_citron_nugget", has(ingotcompatregistry.CITRON_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
         .unlockedBy("has_buddhashand_nugget", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.LIME_INGOT.get())
         .unlockedBy("has_lime_nugget", has(ingotcompatregistry.LIME_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
         .unlockedBy("has_keylime_nugget", has(ingotcompatregistry.KEYLIME_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
         .unlockedBy("has_fingerlime_nugget", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
         .unlockedBy("has_grapefruit_nugget", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_DOOR_ITEM.get(), 3)
         .pattern("AA ")
         .pattern("AA ")
         .pattern("AA ")
         .define('A', ingotcompatregistry.POMELO_INGOT.get())
         .unlockedBy("has_pomelo_nugget", has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.BANANA_NUGGET.get())
       .unlockedBy("has_banana_nugget", has(nuggetcompatregistry.BANANA_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.STARFRUIT_NUGGET.get())
       .unlockedBy("has_starfruit_nugget", has(nuggetcompatregistry.STARFRUIT_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
       .unlockedBy("has_kiwifruit_nugget", has(nuggetcompatregistry.KIWIFRUIT_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
       .unlockedBy("has_gooseberry_nugget", has(nuggetcompatregistry.GOOSEBERRY_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.BLACKBERRY_NUGGET.get())
       .unlockedBy("has_blackberry_nugget", has(nuggetcompatregistry.BLACKBERRY_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.RASPBERRY_NUGGET.get())
       .unlockedBy("has_raspberry_nugget", has(nuggetcompatregistry.RASPBERRY_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.STRAWBERRY_NUGGET.get())
       .unlockedBy("has_strawberry_nugget", has(nuggetcompatregistry.STRAWBERRY_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
       .unlockedBy("has_sugarapple_nugget", has(nuggetcompatregistry.SUGARAPPLE_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.PEACH_NUGGET.get())
       .unlockedBy("has_peach_nugget", has(nuggetcompatregistry.PEACH_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.TANGERINE_NUGGET.get())
       .unlockedBy("has_tangerine_nugget", has(nuggetcompatregistry.TANGERINE_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.KUMQUAT_NUGGET.get())
       .unlockedBy("has_kumquat_nugget", has(nuggetcompatregistry.KUMQUAT_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.PERSIMMON_NUGGET.get())
       .unlockedBy("has_persimmon_nugget", has(nuggetcompatregistry.PERSIMMON_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.SATSUMA_NUGGET.get())
       .unlockedBy("has_satsuma_nugget", has(nuggetcompatregistry.SATSUMA_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.MANDARIN_NUGGET.get())
       .unlockedBy("has_mandarin_nugget", has(nuggetcompatregistry.MANDARIN_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.LEMON_NUGGET.get())
       .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.CITRON_NUGGET.get())
       .unlockedBy("has_citron_nugget", has(nuggetcompatregistry.CITRON_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
       .unlockedBy("has_buddhashand_nugget", has(nuggetcompatregistry.BUDDHASHAND_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.LIME_NUGGET.get())
       .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.KEYLIME_NUGGET.get())
       .unlockedBy("has_keylime_nugget", has(nuggetcompatregistry.KEYLIME_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.FINGERLIME_NUGGET.get())
       .unlockedBy("has_fingerlime_nugget", has(nuggetcompatregistry.FINGERLIME_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
       .unlockedBy("has_grapefruit_nugget", has(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get()))
       .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
       ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_BUTTON_ITEM.get(), 1)
       .requires(nuggetcompatregistry.POMELO_NUGGET.get())
       .unlockedBy("has_pomelo_nugget", has(nuggetcompatregistry.POMELO_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.BANANA_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.BANANA_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.PEACH_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.PEACH_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.CITRON_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.CITRON_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
          .save(output);        
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        //fence
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_FENCE_ITEM.get(), 3)
          .pattern("ABA")
          .pattern("ABA")
          .pattern("   ")
          .define('A', ingotcompatregistry.POMELO_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
          .save(output);        
        //gate
          ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_GATE_ITEM.get(), 1)
          .pattern("BAB")
          .pattern("BAB")
          .pattern("   ")
          .define('A', ingotcompatregistry.POMELO_INGOT.get())
          .define('B', Items.STICK)
          .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get())
        .unlockedBy("has_banana_block",  has(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get())
        .unlockedBy("has_starfruit_block",  has(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get())
        .unlockedBy("has_kiwifruit_block",  has(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get())
        .unlockedBy("has_gooseberry_block",  has(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get())
        .unlockedBy("has_blackberry_block",  has(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get())
        .unlockedBy("has_raspberry_block",  has(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get())
        .unlockedBy("has_strawberry_block",  has(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get())
        .unlockedBy("has_sugarapple_block",  has(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get())
        .unlockedBy("has_peach_block",  has(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get())
        .unlockedBy("has_tangerine_block",  has(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get())
        .unlockedBy("has_kumquat_block",  has(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get())
        .unlockedBy("has_persimmon_block",  has(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get())
        .unlockedBy("has_satsuma_block",  has(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get())
        .unlockedBy("has_mandarin_block",  has(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get())
        .unlockedBy("has_lemon_block",  has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get())
        .unlockedBy("has_citron_block",  has(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get())
        .unlockedBy("has_buddhashand_block",  has(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.LIME_BLOCK_ITEM.get())
        .unlockedBy("has_lime_block",  has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get())
        .unlockedBy("has_keylime_block",  has(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get())
        .unlockedBy("has_fingerlime_block",  has(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get())
        .unlockedBy("has_grapefruit_block",  has(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_PRESSURE_PLATE_ITEM.get())
        .pattern("   ")
        .pattern("AA ")
        .pattern("   ")
        .define('A', foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get())
        .unlockedBy("has_pomelo_block",  has(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.BANANA_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_banana_ingot",  has(ingotcompatregistry.BANANA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_starfruit_ingot",  has(ingotcompatregistry.STARFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_kiwifruit_ingot",  has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_gooseberry_ingot",  has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_blackberry_ingot",  has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_raspberry_ingot",  has(ingotcompatregistry.RASPBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_strawberry_ingot",  has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_sugarapple_ingot",  has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.PEACH_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_peach_ingot",  has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_tangerine_ingot",  has(ingotcompatregistry.TANGERINE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_kumquat_ingot",  has(ingotcompatregistry.KUMQUAT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_persimmon_ingot",  has(ingotcompatregistry.PERSIMMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_satsuma_ingot",  has(ingotcompatregistry.SATSUMA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_mandarin_ingot",  has(ingotcompatregistry.MANDARIN_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.CITRON_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_citron_ingot",  has(ingotcompatregistry.CITRON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_buddhashand_ingot",  has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_keylime_ingot",  has(ingotcompatregistry.KEYLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_fingerlime_ingot",  has(ingotcompatregistry.FINGERLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_grapefruit_ingot",  has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_SIGN_ITEM.get(), 3)
        .pattern("AAA")
        .pattern("AAA")
        .pattern(" B ")
        .define('A', ingotcompatregistry.POMELO_INGOT.get())
        .define('B', Items.STICK)
        .unlockedBy("has_pomelo_ingot",  has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.BANANA_INGOT.get())
        .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
        .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
        .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
        .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
        .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
        .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
        .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
        .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.PEACH_INGOT.get())
        .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
        .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
        .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
        .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
        .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
        .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.LEMON_INGOT.get())
        .unlockedBy("has_lemon_ingot", has(ingotcompatregistry.LEMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.CITRON_INGOT.get())
        .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
        .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.LIME_INGOT.get())
        .unlockedBy("has_lime_ingot", has(ingotcompatregistry.LIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
        .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
        .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
        .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_TRAPDOOR_ITEM.get())
        .pattern("   ")
        .pattern("AAA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.POMELO_INGOT.get())
        .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.BANANA_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.PEACH_INGOT.get())
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.CITRON_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
        .define('B', foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get())
        .unlockedBy("has_glow_berry_block", has(foodblockitemregistry.GLOW_BERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_LAMP_ITEM.get())
        .pattern("AAA")
        .pattern("ABA")
        .pattern("AAA")
        .define('A', ingotcompatregistry.POMELO_INGOT.get())
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.BANANA_NUGGET.get())
        .unlockedBy("has_banana_nugget", has(nuggetcompatregistry.BANANA_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.STARFRUIT_NUGGET.get())
        .unlockedBy("has_starfruit_nugget", has(nuggetcompatregistry.STARFRUIT_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
        .unlockedBy("has_kiwifruit_nugget", has(nuggetcompatregistry.KIWIFRUIT_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
        .unlockedBy("has_gooseberry_nugget", has(nuggetcompatregistry.GOOSEBERRY_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
        .unlockedBy("has_blackberry_nugget", has(nuggetcompatregistry.BLACKBERRY_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.RASPBERRY_NUGGET.get())
        .unlockedBy("has_raspberry_nugget", has(nuggetcompatregistry.RASPBERRY_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
        .unlockedBy("has_strawberry_nugget", has(nuggetcompatregistry.STRAWBERRY_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
        .unlockedBy("has_sugarapple_nugget", has(nuggetcompatregistry.SUGARAPPLE_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.PEACH_NUGGET.get())
        .unlockedBy("has_peach_nugget", has(nuggetcompatregistry.PEACH_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.TANGERINE_NUGGET.get())
        .unlockedBy("has_tangerine_nugget", has(nuggetcompatregistry.TANGERINE_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.KUMQUAT_NUGGET.get())
        .unlockedBy("has_kumquat_nugget", has(nuggetcompatregistry.KUMQUAT_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.PERSIMMON_NUGGET.get())
        .unlockedBy("has_persimmon_nugget", has(nuggetcompatregistry.PERSIMMON_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.SATSUMA_NUGGET.get())
        .unlockedBy("has_satsuma_nugget", has(nuggetcompatregistry.SATSUMA_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.MANDARIN_NUGGET.get())
        .unlockedBy("has_mandarin_nugget", has(nuggetcompatregistry.MANDARIN_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.LEMON_NUGGET.get())
        .unlockedBy("has_lemon_nugget", has(nuggetcompatregistry.LEMON_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.CITRON_NUGGET.get())
        .unlockedBy("has_citron_nugget", has(nuggetcompatregistry.CITRON_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
        .unlockedBy("has_buddhashand_nugget", has(nuggetcompatregistry.BUDDHASHAND_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.LIME_NUGGET.get())
        .unlockedBy("has_lime_nugget", has(nuggetcompatregistry.LIME_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.KEYLIME_NUGGET.get())
        .unlockedBy("has_keylime_nugget", has(nuggetcompatregistry.KEYLIME_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.FINGERLIME_NUGGET.get())
        .unlockedBy("has_fingerlime_nugget", has(nuggetcompatregistry.FINGERLIME_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
        .unlockedBy("has_grapefruit_nugget", has(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_CARPET_ITEM.get(), 3)
        .pattern("   ")
        .pattern("AA ")
        .pattern("AA ")
        .define('A', nuggetcompatregistry.POMELO_NUGGET.get())
        .unlockedBy("has_pomelo_nugget", has(nuggetcompatregistry.POMELO_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BANANA_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_banana_nugget", has(nuggetcompatregistry.BANANA_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BANANA_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_banana_nugget", has(nuggetcompatregistry.BANANA_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.STARFRUIT_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_starfruit_nugget", has(nuggetcompatregistry.STARFRUIT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.STARFRUIT_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_starfruit_nugget", has(nuggetcompatregistry.STARFRUIT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_kiwifruit_nugget", has(nuggetcompatregistry.KIWIFRUIT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_kiwifruit_nugget", has(nuggetcompatregistry.KIWIFRUIT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_gooseberry_nugget", has(nuggetcompatregistry.GOOSEBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_gooseberry_nugget", has(nuggetcompatregistry.GOOSEBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_blackberry_nugget", has(nuggetcompatregistry.BLACKBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_blackberry_nugget", has(nuggetcompatregistry.BLACKBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.RASPBERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_raspberry_nugget", has(nuggetcompatregistry.RASPBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.RASPBERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_raspberry_nugget", has(nuggetcompatregistry.RASPBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_strawberry_nugget", has(nuggetcompatregistry.STRAWBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_strawberry_nugget", has(nuggetcompatregistry.STRAWBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_sugarapple_nugget", has(nuggetcompatregistry.SUGARAPPLE_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_sugarapple_nugget", has(nuggetcompatregistry.SUGARAPPLE_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.PEACH_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_peach_nugget", has(nuggetcompatregistry.PEACH_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.PEACH_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_peach_nugget", has(nuggetcompatregistry.PEACH_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.TANGERINE_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_tangerine_nugget", has(nuggetcompatregistry.TANGERINE_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.TANGERINE_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_tangerine_nugget", has(nuggetcompatregistry.TANGERINE_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.KUMQUAT_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_kumquat_nugget", has(nuggetcompatregistry.KUMQUAT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.KUMQUAT_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_kumquat_nugget", has(nuggetcompatregistry.KUMQUAT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.PERSIMMON_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_persimmon_nugget", has(nuggetcompatregistry.PERSIMMON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.PERSIMMON_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_persimmon_nugget", has(nuggetcompatregistry.PERSIMMON_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.SATSUMA_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_satsuma_nugget", has(nuggetcompatregistry.SATSUMA_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.SATSUMA_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_satsuma_nugget", has(nuggetcompatregistry.SATSUMA_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.MANDARIN_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_mandarin_nugget", has(nuggetcompatregistry.MANDARIN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.MANDARIN_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_mandarin_nugget", has(nuggetcompatregistry.MANDARIN_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.CITRON_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_citron_nugget", has(nuggetcompatregistry.CITRON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.CITRON_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_citron_nugget", has(nuggetcompatregistry.CITRON_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_buddhashand_nugget", has(nuggetcompatregistry.BUDDHASHAND_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_buddhashand_nugget", has(nuggetcompatregistry.BUDDHASHAND_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.KEYLIME_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_keylime_nugget", has(nuggetcompatregistry.KEYLIME_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.KEYLIME_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_keylime_nugget", has(nuggetcompatregistry.KEYLIME_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.FINGERLIME_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_fingerlime_nugget", has(nuggetcompatregistry.FINGERLIME_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.FINGERLIME_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_fingerlime_nugget", has(nuggetcompatregistry.FINGERLIME_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_grapefruit_nugget", has(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_grapefruit_nugget", has(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.POMELO_NUGGET.get())
            .define('B', Items.TORCH)
            .unlockedBy("has_pomelo_nugget", has(nuggetcompatregistry.POMELO_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_SOUL_LANTERN_ITEM.get())
            .pattern("AAA")
            .pattern("ABA")
            .pattern("AAA")
            .define('A', nuggetcompatregistry.POMELO_NUGGET.get())
            .define('B', Items.SOUL_TORCH)
            .unlockedBy("has_pomelo_nugget", has(nuggetcompatregistry.POMELO_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.BANANA_NUGGET.get())
        .define('B', ingotcompatregistry.BANANA_INGOT.get())
        .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.STARFRUIT_NUGGET.get())
        .define('B', ingotcompatregistry.STARFRUIT_INGOT.get())
        .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
        .define('B', ingotcompatregistry.KIWIFRUIT_INGOT.get())
        .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
        .define('B', ingotcompatregistry.GOOSEBERRY_INGOT.get())
        .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
        .define('B', ingotcompatregistry.BLACKBERRY_INGOT.get())
        .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.RASPBERRY_NUGGET.get())
        .define('B', ingotcompatregistry.RASPBERRY_INGOT.get())
        .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
        .define('B', ingotcompatregistry.STRAWBERRY_INGOT.get())
        .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
        .define('B', ingotcompatregistry.SUGARAPPLE_INGOT.get())
        .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.PEACH_NUGGET.get())
        .define('B', ingotcompatregistry.PEACH_INGOT.get())
        .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.TANGERINE_NUGGET.get())
        .define('B', ingotcompatregistry.TANGERINE_INGOT.get())
        .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.KUMQUAT_NUGGET.get())
        .define('B', ingotcompatregistry.KUMQUAT_INGOT.get())
        .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.PERSIMMON_NUGGET.get())
        .define('B', ingotcompatregistry.PERSIMMON_INGOT.get())
        .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.SATSUMA_NUGGET.get())
        .define('B', ingotcompatregistry.SATSUMA_INGOT.get())
        .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.MANDARIN_NUGGET.get())
        .define('B', ingotcompatregistry.MANDARIN_INGOT.get())
        .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.CITRON_NUGGET.get())
        .define('B', ingotcompatregistry.CITRON_INGOT.get())
        .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
        .define('B', ingotcompatregistry.BUDDHASHAND_INGOT.get())
        .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.KEYLIME_NUGGET.get())
        .define('B', ingotcompatregistry.KEYLIME_INGOT.get())
        .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.FINGERLIME_NUGGET.get())
        .define('B', ingotcompatregistry.FINGERLIME_INGOT.get())
        .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
        .define('B', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
        .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_CHAIN_ITEM.get())
        .pattern(" A ")
        .pattern(" B ")
        .pattern(" A ")
        .define('A', nuggetcompatregistry.POMELO_NUGGET.get())
        .define('B', ingotcompatregistry.POMELO_INGOT.get())
        .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.BANANA_INGOT.get())
        .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.STARFRUIT_INGOT.get())
        .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.KIWIFRUIT_INGOT.get())
        .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.GOOSEBERRY_INGOT.get())
        .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.BLACKBERRY_INGOT.get())
        .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.RASPBERRY_INGOT.get())
        .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.STRAWBERRY_INGOT.get())
        .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.SUGARAPPLE_INGOT.get())
        .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.PEACH_INGOT.get())
        .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.TANGERINE_INGOT.get())
        .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.KUMQUAT_INGOT.get())
        .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.PERSIMMON_INGOT.get())
        .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.SATSUMA_INGOT.get())
        .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.MANDARIN_INGOT.get())
        .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.CITRON_INGOT.get())
        .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.BUDDHASHAND_INGOT.get())
        .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.KEYLIME_INGOT.get())
        .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.FINGERLIME_INGOT.get())
        .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
        .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_LADDER_ITEM.get(), 3)
        .pattern("A A")
        .pattern("ABA")
        .pattern("A A")
        .define('A', Items.STICK)
        .define('B', ingotcompatregistry.POMELO_INGOT.get())
        .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.BANANA_INGOT.get())
        .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.STARFRUIT_INGOT.get())
        .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.KIWIFRUIT_INGOT.get())
        .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.GOOSEBERRY_INGOT.get())
        .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.BLACKBERRY_INGOT.get())
        .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.RASPBERRY_INGOT.get())
        .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.STRAWBERRY_INGOT.get())
        .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.SUGARAPPLE_INGOT.get())
        .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.PEACH_INGOT.get())
        .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.TANGERINE_INGOT.get())
        .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.KUMQUAT_INGOT.get())
        .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.PERSIMMON_INGOT.get())
        .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.SATSUMA_INGOT.get())
        .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.MANDARIN_INGOT.get())
        .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.CITRON_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.CITRON_INGOT.get())
        .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.BUDDHASHAND_INGOT.get())
        .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.KEYLIME_INGOT.get())
        .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.FINGERLIME_INGOT.get())
        .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
        .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_TABLE_ITEM.get())
        .pattern("AAA")
        .pattern("B B")
        .pattern("B B")
        .define('A', foodblockcompatitemregistry.POMELO_SLAB_ITEM.get())
        .define('B', ingotcompatregistry.POMELO_INGOT.get())
        .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BANANA_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_banana_nugget", has(nuggetcompatregistry.BANANA_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BANANA_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_banana_nugget", has(nuggetcompatregistry.BANANA_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BANANA_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_banana_nugget", has(nuggetcompatregistry.BANANA_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.STARFRUIT_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_starfruit_nugget", has(nuggetcompatregistry.STARFRUIT_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.STARFRUIT_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_starfruit_nugget", has(nuggetcompatregistry.STARFRUIT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.STARFRUIT_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_starfruit_nugget", has(nuggetcompatregistry.STARFRUIT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_kiwifruit_nugget", has(nuggetcompatregistry.KIWIFRUIT_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_kiwifruit_nugget", has(nuggetcompatregistry.KIWIFRUIT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_kiwifruit_nugget", has(nuggetcompatregistry.KIWIFRUIT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_gooseberry_nugget", has(nuggetcompatregistry.GOOSEBERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_gooseberry_nugget", has(nuggetcompatregistry.GOOSEBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_gooseberry_nugget", has(nuggetcompatregistry.GOOSEBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_blackberry_nugget", has(nuggetcompatregistry.BLACKBERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_blackberry_nugget", has(nuggetcompatregistry.BLACKBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_blackberry_nugget", has(nuggetcompatregistry.BLACKBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.RASPBERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_raspberry_nugget", has(nuggetcompatregistry.RASPBERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.RASPBERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_raspberry_nugget", has(nuggetcompatregistry.RASPBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.RASPBERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_raspberry_nugget", has(nuggetcompatregistry.RASPBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_strawberry_nugget", has(nuggetcompatregistry.STRAWBERRY_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_strawberry_nugget", has(nuggetcompatregistry.STRAWBERRY_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_strawberry_nugget", has(nuggetcompatregistry.STRAWBERRY_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_sugarapple_nugget", has(nuggetcompatregistry.SUGARAPPLE_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_sugarapple_nugget", has(nuggetcompatregistry.SUGARAPPLE_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_sugarapple_nugget", has(nuggetcompatregistry.SUGARAPPLE_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.PEACH_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_peach_nugget", has(nuggetcompatregistry.PEACH_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.PEACH_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_peach_nugget", has(nuggetcompatregistry.PEACH_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.PEACH_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_peach_nugget", has(nuggetcompatregistry.PEACH_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.TANGERINE_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_tangerine_nugget", has(nuggetcompatregistry.TANGERINE_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.TANGERINE_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_tangerine_nugget", has(nuggetcompatregistry.TANGERINE_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.TANGERINE_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_tangerine_nugget", has(nuggetcompatregistry.TANGERINE_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.KUMQUAT_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_kumquat_nugget", has(nuggetcompatregistry.KUMQUAT_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.KUMQUAT_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_kumquat_nugget", has(nuggetcompatregistry.KUMQUAT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.KUMQUAT_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_kumquat_nugget", has(nuggetcompatregistry.KUMQUAT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.PERSIMMON_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_persimmon_nugget", has(nuggetcompatregistry.PERSIMMON_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.PERSIMMON_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_persimmon_nugget", has(nuggetcompatregistry.PERSIMMON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.PERSIMMON_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_persimmon_nugget", has(nuggetcompatregistry.PERSIMMON_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.SATSUMA_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_satsuma_nugget", has(nuggetcompatregistry.SATSUMA_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.SATSUMA_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_satsuma_nugget", has(nuggetcompatregistry.SATSUMA_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.SATSUMA_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_satsuma_nugget", has(nuggetcompatregistry.SATSUMA_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.MANDARIN_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_mandarin_nugget", has(nuggetcompatregistry.MANDARIN_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.MANDARIN_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_mandarin_nugget", has(nuggetcompatregistry.MANDARIN_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.MANDARIN_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_mandarin_nugget", has(nuggetcompatregistry.MANDARIN_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.CITRON_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_citron_nugget", has(nuggetcompatregistry.CITRON_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.CITRON_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_citron_nugget", has(nuggetcompatregistry.CITRON_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.CITRON_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_citron_nugget", has(nuggetcompatregistry.CITRON_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_buddhashand_nugget", has(nuggetcompatregistry.BUDDHASHAND_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_buddhashand_nugget", has(nuggetcompatregistry.BUDDHASHAND_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.BUDDHASHAND_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_buddhashand_nugget", has(nuggetcompatregistry.BUDDHASHAND_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.KEYLIME_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_keylime_nugget", has(nuggetcompatregistry.KEYLIME_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.KEYLIME_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_keylime_nugget", has(nuggetcompatregistry.KEYLIME_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.KEYLIME_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_keylime_nugget", has(nuggetcompatregistry.KEYLIME_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.FINGERLIME_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_fingerlime_nugget", has(nuggetcompatregistry.FINGERLIME_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.FINGERLIME_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_fingerlime_nugget", has(nuggetcompatregistry.FINGERLIME_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.FINGERLIME_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_fingerlime_nugget", has(nuggetcompatregistry.FINGERLIME_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_grapefruit_nugget", has(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_grapefruit_nugget", has(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.GRAPEFRUIT_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_grapefruit_nugget", has(nuggetcompatregistry.GRAPEFRUIT_NUGGET.get()))
            .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
          //regular
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.POMELO_NUGGET.get())
            .define('C', ItemTags.COALS)
            .unlockedBy("has_pomelo_nugget", has(nuggetcompatregistry.POMELO_NUGGET.get()))
            .save(output);
          //redstone
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_REDSTONE_TORCH_ITEM.get())
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.POMELO_NUGGET.get())
            .define('C', Items.REDSTONE)
            .unlockedBy("has_pomelo_nugget", has(nuggetcompatregistry.POMELO_NUGGET.get()))
            .save(output);
          //soul
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_SOUL_TORCH_ITEM.get(), 4)
            .pattern(" C ")
            .pattern(" B ")
            .pattern(" A ")
            .define('A', Items.STICK)
            .define('B', nuggetcompatregistry.POMELO_NUGGET.get())
            .define('C', Items.SOUL_SAND)
            .unlockedBy("has_pomelo_nugget", has(nuggetcompatregistry.POMELO_NUGGET.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.BANANA_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.PEACH_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.CITRON_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_FURNACE_ITEM.get())
        .pattern("ABA")
        .pattern("B B")
        .pattern("ABA")
        .define('A', ingotcompatregistry.POMELO_INGOT.get())
        .define('B', Items.COBBLESTONE)
        .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_banana_block", has(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_starfruit_block", has(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_kiwifruit_block", has(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_gooseberry_block", has(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_blackberry_block", has(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_raspberry_block", has(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_strawberry_block", has(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_sugarapple_block", has(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_blackcherry_block", has(foodblockcompatitemregistry.BLACKCHERRY_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_peach_block", has(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_tangerine_block", has(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_kumquat_block", has(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_persimmon_block", has(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_satsuma_block", has(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_mandarin_block", has(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Lemon---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.LEMON_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_lemon_block", has(foodblockcompatitemregistry.LEMON_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_citron_block", has(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_buddhashand_block", has(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Lime---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.LIME_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_lime_block", has(foodblockcompatitemregistry.LIME_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_keylime_block", has(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_fingerlime_block", has(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_grapefruit_block", has(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()))
        .save(output);        
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_STONE_PATH_ITEM.get(), 6)
        .requires(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get())
        .requires(Items.STONE)
        .unlockedBy("has_pomelo_block", has(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
        .unlockedBy("has_banana_block", has(foodblockcompatitemregistry.BANANA_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
        .unlockedBy("has_starfruit_block", has(foodblockcompatitemregistry.STARFRUIT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
        .unlockedBy("has_kiwifruit_block", has(foodblockcompatitemregistry.KIWIFRUIT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
        .unlockedBy("has_gooseberry_block", has(foodblockcompatitemregistry.GOOSEBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
        .unlockedBy("has_blackberry_block", has(foodblockcompatitemregistry.BLACKBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
        .unlockedBy("has_raspberry_block", has(foodblockcompatitemregistry.RASPBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
        .unlockedBy("has_strawberry_block", has(foodblockcompatitemregistry.STRAWBERRY_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
        .unlockedBy("has_sugarapple_block", has(foodblockcompatitemregistry.SUGARAPPLE_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
        .unlockedBy("has_peach_block", has(foodblockcompatitemregistry.PEACH_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
        .unlockedBy("has_tangerine_block", has(foodblockcompatitemregistry.TANGERINE_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
        .unlockedBy("has_kumquat_block", has(foodblockcompatitemregistry.KUMQUAT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
        .unlockedBy("has_persimmon_block", has(foodblockcompatitemregistry.PERSIMMON_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get())
        .unlockedBy("has_satsuma_block", has(foodblockcompatitemregistry.SATSUMA_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get())
        .unlockedBy("has_mandarin_block", has(foodblockcompatitemregistry.MANDARIN_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.CITRON_SLAB_ITEM.get())
        .unlockedBy("has_citron_block", has(foodblockcompatitemregistry.CITRON_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get())
        .unlockedBy("has_buddhashand_block", has(foodblockcompatitemregistry.BUDDHASHAND_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get())
        .unlockedBy("has_keylime_block", has(foodblockcompatitemregistry.KEYLIME_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get())
        .unlockedBy("has_fingerlime_block", has(foodblockcompatitemregistry.FINGERLIME_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get())
        .unlockedBy("has_grapefruit_block", has(foodblockcompatitemregistry.GRAPEFRUIT_BLOCK_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_BARREL_ITEM.get())
        .pattern("ABA")
        .pattern("A A")
        .pattern("ABA")
        .define('A', foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get())
        .define('B', foodblockcompatitemregistry.POMELO_SLAB_ITEM.get())
        .unlockedBy("has_pomelo_block", has(foodblockcompatitemregistry.POMELO_BLOCK_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.BANANA_INGOT.get())
        .define('B', foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
        .unlockedBy("has_banana_slab", has(foodblockcompatitemregistry.BANANA_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
        .define('B', foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
        .unlockedBy("has_starfruit_slab", has(foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
        .define('B', foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
        .unlockedBy("has_kiwifruit_slab", has(foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
        .define('B', foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
        .unlockedBy("has_gooseberry_slab", has(foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
        .define('B', foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
        .unlockedBy("has_blackberry_slab", has(foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
        .define('B', foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
        .unlockedBy("has_raspberry_slab", has(foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
        .define('B', foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
        .unlockedBy("has_strawberry_slab", has(foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
        .define('B', foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
        .unlockedBy("has_sugarapple_slab", has(foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.PEACH_INGOT.get())
        .define('B', foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
        .unlockedBy("has_peach_slab", has(foodblockcompatitemregistry.PEACH_SLAB_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
        .define('B', foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
        .unlockedBy("has_tangerine_slab", has(foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
        .define('B', foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
        .unlockedBy("has_kumquat_slab", has(foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
        .define('B', foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
        .unlockedBy("has_persimmon_slab", has(foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
        .define('B', foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get())
        .unlockedBy("has_satsuma_slab", has(foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
        .define('B', foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get())
        .unlockedBy("has_mandarin_slab", has(foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.CITRON_INGOT.get())
        .define('B', foodblockcompatitemregistry.CITRON_SLAB_ITEM.get())
        .unlockedBy("has_citron_slab", has(foodblockcompatitemregistry.CITRON_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
        .define('B', foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get())
        .unlockedBy("has_buddhashand_slab", has(foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
        .define('B', foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get())
        .unlockedBy("has_keylime_slab", has(foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
        .define('B', foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get())
        .unlockedBy("has_fingerlime_slab", has(foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
        .define('B', foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get())
        .unlockedBy("has_grapefruit_slab", has(foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get()))
        .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_CHAIR_ITEM.get())
        .pattern("AAA")
        .pattern("BBB")
        .pattern("A A")
        .define('A', ingotcompatregistry.POMELO_INGOT.get())
        .define('B', foodblockcompatitemregistry.POMELO_SLAB_ITEM.get())
        .unlockedBy("has_pomelo_slab", has(foodblockcompatitemregistry.POMELO_SLAB_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.BANANA_INGOT.get())
           .define('B', foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.BANANA_CARPET_ITEM.get())
           .unlockedBy("has_banana_ingot", has(ingotcompatregistry.BANANA_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.STARFRUIT_INGOT.get())
           .define('B', foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.STARFRUIT_CARPET_ITEM.get())
           .unlockedBy("has_starfruit_ingot", has(ingotcompatregistry.STARFRUIT_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.KIWIFRUIT_INGOT.get())
           .define('B', foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.KIWIFRUIT_CARPET_ITEM.get())
           .unlockedBy("has_kiwifruit_ingot", has(ingotcompatregistry.KIWIFRUIT_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.GOOSEBERRY_INGOT.get())
           .define('B', foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.GOOSEBERRY_CARPET_ITEM.get())
           .unlockedBy("has_gooseberry_ingot", has(ingotcompatregistry.GOOSEBERRY_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.BLACKBERRY_INGOT.get())
           .define('B', foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.BLACKBERRY_CARPET_ITEM.get())
           .unlockedBy("has_blackberry_ingot", has(ingotcompatregistry.BLACKBERRY_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.RASPBERRY_INGOT.get())
           .define('B', foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.RASPBERRY_CARPET_ITEM.get())
           .unlockedBy("has_raspberry_ingot", has(ingotcompatregistry.RASPBERRY_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.STRAWBERRY_INGOT.get())
           .define('B', foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.STRAWBERRY_CARPET_ITEM.get())
           .unlockedBy("has_strawberry_ingot", has(ingotcompatregistry.STRAWBERRY_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.SUGARAPPLE_INGOT.get())
           .define('B', foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.SUGARAPPLE_CARPET_ITEM.get())
           .unlockedBy("has_sugarapple_ingot", has(ingotcompatregistry.SUGARAPPLE_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.PEACH_INGOT.get())
           .define('B', foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.PEACH_CARPET_ITEM.get())
           .unlockedBy("has_peach_ingot", has(ingotcompatregistry.PEACH_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.TANGERINE_INGOT.get())
           .define('B', foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.TANGERINE_CARPET_ITEM.get())
           .unlockedBy("has_tangerine_ingot", has(ingotcompatregistry.TANGERINE_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.KUMQUAT_INGOT.get())
           .define('B', foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.KUMQUAT_CARPET_ITEM.get())
           .unlockedBy("has_kumquat_ingot", has(ingotcompatregistry.KUMQUAT_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.PERSIMMON_INGOT.get())
           .define('B', foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.PERSIMMON_CARPET_ITEM.get())
           .unlockedBy("has_persimmon_ingot", has(ingotcompatregistry.PERSIMMON_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SATSUMA_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.SATSUMA_INGOT.get())
           .define('B', foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.SATSUMA_CARPET_ITEM.get())
           .unlockedBy("has_satsuma_ingot", has(ingotcompatregistry.SATSUMA_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MANDARIN_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.MANDARIN_INGOT.get())
           .define('B', foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.MANDARIN_CARPET_ITEM.get())
           .unlockedBy("has_mandarin_ingot", has(ingotcompatregistry.MANDARIN_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CITRON_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.CITRON_INGOT.get())
           .define('B', foodblockcompatitemregistry.CITRON_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.CITRON_CARPET_ITEM.get())
           .unlockedBy("has_citron_ingot", has(ingotcompatregistry.CITRON_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BUDDHASHAND_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.BUDDHASHAND_INGOT.get())
           .define('B', foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.BUDDHASHAND_CARPET_ITEM.get())
           .unlockedBy("has_buddhashand_ingot", has(ingotcompatregistry.BUDDHASHAND_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KEYLIME_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.KEYLIME_INGOT.get())
           .define('B', foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.KEYLIME_CARPET_ITEM.get())
           .unlockedBy("has_keylime_ingot", has(ingotcompatregistry.KEYLIME_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.FINGERLIME_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.FINGERLIME_INGOT.get())
           .define('B', foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.FINGERLIME_CARPET_ITEM.get())
           .unlockedBy("has_fingerlime_ingot", has(ingotcompatregistry.FINGERLIME_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GRAPEFRUIT_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.GRAPEFRUIT_INGOT.get())
           .define('B', foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.GRAPEFRUIT_CARPET_ITEM.get())
           .unlockedBy("has_grapefruit_ingot", has(ingotcompatregistry.GRAPEFRUIT_INGOT.get()))
           .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
           ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.POMELO_BED_ITEM.get())
           .pattern("CCC")
           .pattern("BBB")
           .pattern("A A")
           .define('A', ingotcompatregistry.POMELO_INGOT.get())
           .define('B', foodblockcompatitemregistry.POMELO_SLAB_ITEM.get())
           .define('C', foodblockcompatitemregistry.POMELO_CARPET_ITEM.get())
           .unlockedBy("has_pomelo_ingot", has(ingotcompatregistry.POMELO_INGOT.get()))
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
  //--------------------------------------------------------------------------------------Banana---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_BANANA_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_banana_slab", has(foodblockcompatitemregistry.BANANA_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_BANANA_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_BANANA_CABINET_ITEM.get())
         .unlockedBy("has_banana_slab", has(foodblockcompatitemregistry.BANANA_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Starfruit---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_STARFRUIT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_starfruit_slab", has(foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_STARFRUIT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_STARFRUIT_CABINET_ITEM.get())
         .unlockedBy("has_starfruit_slab", has(foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_KIWIFRUIT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_kiwifruit_slab", has(foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_KIWIFRUIT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_KIWIFRUIT_CABINET_ITEM.get())
         .unlockedBy("has_kiwifruit_slab", has(foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_GOOSEBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_gooseberry_slab", has(foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_GOOSEBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_GOOSEBERRY_CABINET_ITEM.get())
         .unlockedBy("has_gooseberry_slab", has(foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_BLACKBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_blackberry_slab", has(foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_BLACKBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_BLACKBERRY_CABINET_ITEM.get())
         .unlockedBy("has_blackberry_slab", has(foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Raspberry---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_RASPBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_raspberry_slab", has(foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_RASPBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_RASPBERRY_CABINET_ITEM.get())
         .unlockedBy("has_raspberry_slab", has(foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_STRAWBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_strawberry_slab", has(foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_STRAWBERRY_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_STRAWBERRY_CABINET_ITEM.get())
         .unlockedBy("has_strawberry_slab", has(foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_SUGARAPPLE_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_sugarapple_slab", has(foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_SUGARAPPLE_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_SUGARAPPLE_CABINET_ITEM.get())
         .unlockedBy("has_sugarapple_slab", has(foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_PEACH_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_peach_slab", has(foodblockcompatitemregistry.PEACH_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_PEACH_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_PEACH_CABINET_ITEM.get())
         .unlockedBy("has_peach_slab", has(foodblockcompatitemregistry.PEACH_SLAB_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_TANGERINE_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_tangerine_slab", has(foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_TANGERINE_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_TANGERINE_CABINET_ITEM.get())
         .unlockedBy("has_tangerine_slab", has(foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_KUMQUAT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_kumquat_slab", has(foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_KUMQUAT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_KUMQUAT_CABINET_ITEM.get())
         .unlockedBy("has_kumquat_slab", has(foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_PERSIMMON_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_persimmon_slab", has(foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_PERSIMMON_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_PERSIMMON_CABINET_ITEM.get())
         .unlockedBy("has_persimmon_slab", has(foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Satsuma---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_SATSUMA_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_satsuma_slab", has(foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_SATSUMA_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_SATSUMA_CABINET_ITEM.get())
         .unlockedBy("has_satsuma_slab", has(foodblockcompatitemregistry.SATSUMA_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Mandarin---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_MANDARIN_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_mandarin_slab", has(foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_MANDARIN_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_MANDARIN_CABINET_ITEM.get())
         .unlockedBy("has_mandarin_slab", has(foodblockcompatitemregistry.MANDARIN_SLAB_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Citron---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_CITRON_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.CITRON_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_citron_slab", has(foodblockcompatitemregistry.CITRON_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_CITRON_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.CITRON_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_CITRON_CABINET_ITEM.get())
         .unlockedBy("has_citron_slab", has(foodblockcompatitemregistry.CITRON_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Buddhashand---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_BUDDHASHAND_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_buddhashand_slab", has(foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_BUDDHASHAND_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_BUDDHASHAND_CABINET_ITEM.get())
         .unlockedBy("has_buddhashand_slab", has(foodblockcompatitemregistry.BUDDHASHAND_SLAB_ITEM.get()))
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
  //--------------------------------------------------------------------------------------Keylime---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_KEYLIME_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_keylime_slab", has(foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_KEYLIME_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_KEYLIME_CABINET_ITEM.get())
         .unlockedBy("has_keylime_slab", has(foodblockcompatitemregistry.KEYLIME_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Fingerlime---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_FINGERLIME_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_fingerlime_slab", has(foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_FINGERLIME_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_FINGERLIME_CABINET_ITEM.get())
         .unlockedBy("has_fingerlime_slab", has(foodblockcompatitemregistry.FINGERLIME_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Grapefruit---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_GRAPEFRUIT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_grapefruit_slab", has(foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_GRAPEFRUIT_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_GRAPEFRUIT_CABINET_ITEM.get())
         .unlockedBy("has_grapefruit_slab", has(foodblockcompatitemregistry.GRAPEFRUIT_SLAB_ITEM.get()))
         .save(output);
  //--------------------------------------------------------------------------------------Pomelo---------------------------------------------------------------------------------------------
       //small
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SMALL_POMELO_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("B B")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.POMELO_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .unlockedBy("has_pomelo_slab", has(foodblockcompatitemregistry.POMELO_SLAB_ITEM.get()))
         .save(output);
       //medium
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.MEDIUM_POMELO_CABINET_ITEM.get())
         .pattern("AAA")
         .pattern("BCB")
         .pattern("AAA")
         .define('A', foodblockcompatitemregistry.POMELO_SLAB_ITEM.get())
         .define('B', Items.IRON_INGOT)
         .define('C', foodblockcompatitemregistry.SMALL_POMELO_CABINET_ITEM.get())
         .unlockedBy("has_pomelo_slab", has(foodblockcompatitemregistry.POMELO_SLAB_ITEM.get()))
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
 protected void buildDeskRecipes(RecipeOutput output) {
  //--------------------------------------------------------------------------------------Elderberry---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ELDERBERRY_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.ELDERBERRY_NUGGET.get())
      .unlockedBy("has_elderberry_slab", has(foodblockcompatitemregistry.ELDERBERRY_SLAB_ITEM.get()))
      .save(output);
  //---------------------------------------------------------------------------------------Juniper-----------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.JUNIPER_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.JUNIPER_NUGGET.get())
      .unlockedBy("has_juniper_slab", has(foodblockcompatitemregistry.JUNIPER_SLAB_ITEM.get()))
      .save(output);
  //----------------------------------------------------------------------------------------Banana-----------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BANANA_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.BANANA_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.BANANA_NUGGET.get())
      .unlockedBy("has_banana_slab", has(foodblockcompatitemregistry.BANANA_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Starfruit----------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STARFRUIT_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.STARFRUIT_NUGGET.get())
      .unlockedBy("has_starfruit_slab", has(foodblockcompatitemregistry.STARFRUIT_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Kiwifruit----------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KIWIFRUIT_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.KIWIFRUIT_NUGGET.get())
      .unlockedBy("has_kiwifruit_slab", has(foodblockcompatitemregistry.KIWIFRUIT_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Gooseberry---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.GOOSEBERRY_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.GOOSEBERRY_NUGGET.get())
      .unlockedBy("has_gooseberry_slab", has(foodblockcompatitemregistry.GOOSEBERRY_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Blackberry---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKBERRY_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.BLACKBERRY_NUGGET.get())
      .unlockedBy("has_blackberry_slab", has(foodblockcompatitemregistry.BLACKBERRY_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Raspberry----------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.RASPBERRY_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.RASPBERRY_NUGGET.get())
      .unlockedBy("has_raspberry_slab", has(foodblockcompatitemregistry.RASPBERRY_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Strawberry---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.STRAWBERRY_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.STRAWBERRY_NUGGET.get())
      .unlockedBy("has_strawberry_slab", has(foodblockcompatitemregistry.STRAWBERRY_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Sugarapple---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.SUGARAPPLE_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.SUGARAPPLE_NUGGET.get())
      .unlockedBy("has_sugarapple_slab", has(foodblockcompatitemregistry.SUGARAPPLE_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Cherry---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.CHERRY_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.CHERRY_NUGGET.get())
      .unlockedBy("has_cherry_slab", has(foodblockcompatitemregistry.CHERRY_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Blackcherry---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.BLACKCHERRY_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.BLACKCHERRY_NUGGET.get())
      .unlockedBy("has_blackcherry_slab", has(foodblockcompatitemregistry.BLACKCHERRY_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Peach---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PEACH_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.PEACH_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.PEACH_NUGGET.get())
      .unlockedBy("has_peach_slab", has(foodblockcompatitemregistry.PEACH_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Coconut---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.COCONUT_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.COCONUT_NUGGET.get())
      .unlockedBy("has_coconut_slab", has(foodblockcompatitemregistry.COCONUT_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Orange---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.ORANGE_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.ORANGE_NUGGET.get())
      .unlockedBy("has_orange_slab", has(foodblockcompatitemregistry.ORANGE_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Tangerine---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.TANGERINE_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.TANGERINE_NUGGET.get())
      .unlockedBy("has_tangerine_slab", has(foodblockcompatitemregistry.TANGERINE_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Kumquat---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.KUMQUAT_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.KUMQUAT_NUGGET.get())
      .unlockedBy("has_kumquat_slab", has(foodblockcompatitemregistry.KUMQUAT_SLAB_ITEM.get()))
      .save(output);
  //--------------------------------------------------------------------------------------Persimmon---------------------------------------------------------------------------------------------
      ShapedRecipeBuilder.shaped(RecipeCategory.MISC, foodblockcompatitemregistry.PERSIMMON_DESK_ITEM.get())
      .pattern("AAA")
      .pattern("B B")
      .pattern("B B")
      .define('A', foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get())
      .define('B', nuggetcompatregistry.PERSIMMON_NUGGET.get())
      .unlockedBy("has_persimmon_slab", has(foodblockcompatitemregistry.PERSIMMON_SLAB_ITEM.get()))
      .save(output);
      }
  }
}
