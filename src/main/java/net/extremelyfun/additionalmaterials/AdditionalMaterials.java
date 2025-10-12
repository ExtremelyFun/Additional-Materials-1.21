package net.extremelyfun.additionalmaterials;

import net.extremelyfun.additionalmaterials.block.ModBlocks;
import net.extremelyfun.additionalmaterials.item.ModItemGroups;
import net.extremelyfun.additionalmaterials.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalMaterials implements ModInitializer {
    public static final String MOD_ID = "additional-materials";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}