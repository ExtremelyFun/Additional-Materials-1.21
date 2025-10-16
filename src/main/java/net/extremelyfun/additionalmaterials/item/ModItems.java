package net.extremelyfun.additionalmaterials.item;

import net.extremelyfun.additionalmaterials.AdditionalMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem( "copper_nugget", new Item(new Item.Settings()));
    public static final Item COPPER_SHEET = registerItem( "copper_sheet", new Item(new Item.Settings()));
    public static final Item COPPER_DUST = registerItem( "copper_dust", new Item(new Item.Settings()));
    public static final Item IRON_SHEET = registerItem( "iron_sheet", new Item(new Item.Settings()));
    public static final Item IRON_DUST = registerItem( "iron_dust", new Item(new Item.Settings()));
    public static final Item GOLD_SHEET = registerItem( "gold_sheet", new Item(new Item.Settings()));
    public static final Item GOLD_DUST = registerItem( "gold_dust", new Item(new Item.Settings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));
    public static final Item LEAD_INGOT = registerItem( "lead_ingot", new Item(new Item.Settings()));
    public static final Item LEAD_NUGGET = registerItem( "lead_nugget", new Item(new Item.Settings()));
    public static final Item LEAD_SHEET = registerItem( "lead_sheet", new Item(new Item.Settings()));
    public static final Item LEAD_DUST = registerItem( "lead_dust", new Item(new Item.Settings()));
    public static final Item RAW_OSMIUM = registerItem("raw_osmium", new Item(new Item.Settings()));
    public static final Item OSMIUM_INGOT = registerItem( "osmium_ingot", new Item(new Item.Settings()));
    public static final Item OSMIUM_NUGGET = registerItem( "osmium_nugget", new Item(new Item.Settings()));
    public static final Item OSMIUM_SHEET = registerItem( "osmium_sheet", new Item(new Item.Settings()));
    public static final Item OSMIUM_DUST = registerItem( "osmium_dust", new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem( "silver_ingot", new Item(new Item.Settings()));
    public static final Item SILVER_NUGGET = registerItem( "silver_nugget", new Item(new Item.Settings()));
    public static final Item SILVER_SHEET = registerItem( "silver_sheet", new Item(new Item.Settings()));
    public static final Item SILVER_DUST = registerItem( "silver_dust", new Item(new Item.Settings()));
    public static final Item RAW_ZINC = registerItem("raw_zinc", new Item(new Item.Settings()));
    public static final Item ZINC_INGOT = registerItem( "zinc_ingot", new Item(new Item.Settings()));
    public static final Item ZINC_NUGGET = registerItem( "zinc_nugget", new Item(new Item.Settings()));
    public static final Item ZINC_SHEET = registerItem( "zinc_sheet", new Item(new Item.Settings()));
    public static final Item ZINC_DUST = registerItem( "zinc_dust", new Item(new Item.Settings()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
    public static final Item TIN_INGOT = registerItem( "tin_ingot", new Item(new Item.Settings()));
    public static final Item TIN_NUGGET = registerItem( "tin_nugget", new Item(new Item.Settings()));
    public static final Item TIN_SHEET = registerItem( "tin_sheet", new Item(new Item.Settings()));
    public static final Item TIN_DUST = registerItem( "tin_dust", new Item(new Item.Settings()));
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_INGOT = registerItem( "tungsten_ingot", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_NUGGET = registerItem( "tungsten_nugget", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_SHEET = registerItem( "tungsten_sheet", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_DUST = registerItem( "tungsten_dust", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = registerItem( "steel_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_NUGGET = registerItem( "steel_nugget", new Item(new Item.Settings()));
    public static final Item STEEL_SHEET = registerItem( "steel_sheet", new Item(new Item.Settings()));
    public static final Item STEEL_DUST = registerItem( "steel_dust", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdditionalMaterials.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdditionalMaterials.LOGGER.info("Registering Mod Items for" + AdditionalMaterials.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }

}
