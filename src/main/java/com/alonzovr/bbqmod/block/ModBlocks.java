package com.alonzovr.bbqmod.block;

import com.alonzovr.bbqmod.BBQMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GRILL = registerBlock("grill", new GrillBlock(true, 1, FabricBlockSettings.copyOf(Blocks.CAULDRON).luminance(Blocks.createLightLevelFromLitBlockState(3))));
    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(BBQMod.MOD_ID, "tomato_crop"), new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BBQMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BBQMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.addAfter(Blocks.BLAST_FURNACE, GRILL);
        });
    }
}
