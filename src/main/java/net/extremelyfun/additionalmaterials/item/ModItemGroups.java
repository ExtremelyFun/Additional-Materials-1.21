package net.extremelyfun.additionalmaterials.item;

import net.extremelyfun.additionalmaterials.AdditionalMaterials;
import net.extremelyfun.additionalmaterials.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Additional_Materials_Items_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AdditionalMaterials.MOD_ID, "additional_materials_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LEAD_INGOT))
                    .displayName(Text.translatable("itemgroup.additional-materials.additional_material_items"))
                    .entries((displayContext, entries) -> {
                    entries.add(ModItems.COPPER_NUGGET);
                    entries.add(ModItems.COPPER_SHEET);
                    entries.add(ModItems.COPPER_DUST);
                    entries.add(ModItems.IRON_SHEET);
                    entries.add(ModItems.IRON_DUST);
                    entries.add(ModItems.GOLD_SHEET);
                    entries.add(ModItems.GOLD_DUST);
                    entries.add(ModItems.RAW_LEAD);
                    entries.add(ModItems.LEAD_INGOT);
                    entries.add(ModItems.LEAD_NUGGET);
                    entries.add(ModItems.LEAD_SHEET);
                    entries.add(ModItems.LEAD_DUST);
                    entries.add(ModItems.RAW_OSMIUM);
                    entries.add(ModItems.OSMIUM_INGOT);
                    entries.add(ModItems.OSMIUM_NUGGET);
                    entries.add(ModItems.OSMIUM_SHEET);
                    entries.add(ModItems.OSMIUM_DUST);
                    entries.add(ModItems.RAW_SILVER);
                    entries.add(ModItems.SILVER_INGOT);
                    entries.add(ModItems.SILVER_NUGGET);
                    entries.add(ModItems.SILVER_SHEET);
                    entries.add(ModItems.SILVER_DUST);
                    entries.add(ModItems.RAW_TIN);
                    entries.add(ModItems.TIN_INGOT);
                    entries.add(ModItems.TIN_NUGGET);
                    entries.add(ModItems.TIN_SHEET);
                    entries.add(ModItems.TIN_DUST);
                    entries.add(ModItems.RAW_TUNGSTEN);
                    entries.add(ModItems.TUNGSTEN_INGOT);
                    entries.add(ModItems.TUNGSTEN_NUGGET);
                    entries.add(ModItems.TUNGSTEN_SHEET);
                    entries.add(ModItems.TUNGSTEN_DUST);
                    entries.add(ModItems.STEEL_INGOT);
                    entries.add(ModItems.STEEL_NUGGET);
                    entries.add(ModItems.STEEL_SHEET);
                    entries.add(ModItems.STEEL_DUST);

                    }).build());

    public static final ItemGroup Additional_Materials_Blocks_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AdditionalMaterials.MOD_ID, "additional_materials_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.LEAD_BLOCK))
                    .displayName(Text.translatable("itemgroup.additional-materials.additional_material_blocks"))
                    .entries((displayContext, entries) -> {
                    entries.add(ModBlocks.RAW_LEAD_BLOCK);
                    entries.add(ModBlocks.LEAD_BLOCK);
                    entries.add(ModBlocks.LEAD_Ore);

                    }).build());



    public static void registerItemGroups() {
        AdditionalMaterials.LOGGER.info("Registering Item Groups for" + AdditionalMaterials.MOD_ID);
    }
}
