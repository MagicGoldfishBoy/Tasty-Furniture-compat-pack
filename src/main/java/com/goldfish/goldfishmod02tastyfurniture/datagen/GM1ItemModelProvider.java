package com.goldfish.goldfishmod02tastyfurniture.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;


public class GM1ItemModelProvider extends ItemModelProvider {

        public GM1ItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, "goldfishmod03tastyfurniturecompatpack", existingFileHelper);
    }

        @Override
        protected void registerModels() {

      //.........elderberry
       //block
        withExistingParent("elderberry_block_item", modLoc("block/elderberry_block"));
       //ingot
        withExistingParent("elderberry_ingot", modLoc("item/elderberry_ingot"));
       //nugget
        withExistingParent("elderberry_nugget", modLoc("item/elderberry_nugget"));

  }
}

// .rootTransforms().scale(0.5f).translation(-0.25f, -0.25f, -0.25f)
//        .end();