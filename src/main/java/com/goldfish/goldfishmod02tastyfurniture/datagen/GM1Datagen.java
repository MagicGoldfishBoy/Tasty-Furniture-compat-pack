package com.goldfish.goldfishmod02tastyfurniture.datagen;

import com.goldfish.goldfishmod02tastyfurniture.datagen.GM1RecipeProvider.GM1RecipeProviderConcrete;
import com.mojang.logging.LogUtils;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class GM1Datagen {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static ExistingFileHelper ExistingFileHelper;

    public static void gatherData(GatherDataEvent event) {
        
        //Blockstates
        try {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            generator.addProvider(
                event.includeClient(),
                new GM1BlockStateProvider(output, "goldfishmod02tastyfurniture", existingFileHelper));
                
        } catch (RuntimeException e) {
            LOGGER.error("failed to generate blockstates");
        }

        //Item Models
        try {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(
            event.includeClient(),
            new GM1ItemModelProvider(output, "goldfishmod02tastyfurniture", existingFileHelper));
            
        } catch (Exception e) {
            LOGGER.error("failed to generate item models");
        }

        //Recipes
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
            
            generator.addProvider(
                event.includeServer(),
                new GM1RecipeProviderConcrete(output, lookupProvider));
          
        } catch (Exception e) {
            LOGGER.error("failed to generate recipes");
        }         
 }
}

            // PackOutput output = event.getGenerator().getPackOutput();
            // new GM1BlockStateProvider(output, TastyFurniture.MODID, ExistingFileHelper);