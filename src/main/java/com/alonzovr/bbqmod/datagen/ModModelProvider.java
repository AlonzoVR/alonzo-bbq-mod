package com.alonzovr.bbqmod.datagen;

import com.alonzovr.bbqmod.block.ModBlocks;
import com.alonzovr.bbqmod.block.TomatoCropBlock;
import com.alonzovr.bbqmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BARBECUE_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP_BOTTLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BARBECUE_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BARBECUE_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_KETCHUP_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARBECUE_PORKCHOP, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BARBECUE_PORKCHOP, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP_PORKCHOP, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_KETCHUP_PORKCHOP, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARBECUE_MUTTON, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BARBECUE_MUTTON, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP_MUTTON, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_KETCHUP_MUTTON, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARBECUE_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BARBECUE_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_KETCHUP_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.KETCHUP_RABBIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_KETCHUP_RABBIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARBECUE_RABBIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BARBECUE_RABBIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_SKEWER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COOKED_BEEF_SKEWER, Models.HANDHELD);
    }
}
