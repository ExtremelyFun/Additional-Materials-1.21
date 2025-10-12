package net.extremelyfun.additionalmaterials.block;

import net.extremelyfun.additionalmaterials.AdditionalMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BLOCK_OF_LEAD = registerBlock("block_of_lead",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block BLOCK_OF_RAW_LEAD = registerBlock("block_of_raw_lead",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LEAD_Ore = registerBlock("lead_ore",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.STONE)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AdditionalMaterials.MOD_ID, name), block);
    }

   private static void registerBlockItem(String name, Block block) {
       Registry.register(Registries.ITEM, Identifier.of(AdditionalMaterials.MOD_ID, name),
               new BlockItem(block, new Item.Settings()));
   }

    public static void registerModBlocks(){
        AdditionalMaterials.LOGGER.info("Registering Mod Blocks for" + AdditionalMaterials.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.BLOCK_OF_RAW_LEAD);
            entries.add(ModBlocks.BLOCK_OF_LEAD);
            entries.add(ModBlocks.LEAD_Ore);

        });
    }
}
