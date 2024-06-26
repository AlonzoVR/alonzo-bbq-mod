package com.alonzovr.bbqmod;

import com.alonzovr.bbqmod.block.ModBlocks;
import com.alonzovr.bbqmod.block.entity.ModBlockEntities;
import com.alonzovr.bbqmod.item.ModItemGroups;
import com.alonzovr.bbqmod.item.ModItems;
import com.alonzovr.bbqmod.util.ModCustomTrades;
import com.alonzovr.bbqmod.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BBQMod implements ModInitializer {
    public static final String MOD_ID = "bbqmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModItemGroups.registerItemGroups();
		ModCustomTrades.registerCustomTrades();
		ModLootTableModifiers.modifyLootTables();
	}
}