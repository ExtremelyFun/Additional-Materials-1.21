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
    public static final Item Raw_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));
    public static final Item LEAD_INGOT = registerItem( "lead_ingot", new Item(new Item.Settings()));
    public static final Item LEAD_NUGGET = registerItem( "lead_nugget", new Item(new Item.Settings()));
    public static final Item LEAD_SHEET = registerItem( "lead_sheet", new Item(new Item.Settings()));
    public static final Item LEAD_DUST = registerItem( "lead_dust", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AdditionalMaterials.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AdditionalMaterials.LOGGER.info("Registering Mod Items for" + AdditionalMaterials.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(COPPER_NUGGET);
            entries.add(COPPER_SHEET);
            entries.add(COPPER_DUST);
            entries.add(IRON_SHEET);
            entries.add(IRON_DUST);
            entries.add(GOLD_SHEET);
            entries.add(GOLD_DUST);
            entries.add(Raw_LEAD);
            entries.add(LEAD_INGOT);
            entries.add(LEAD_NUGGET);
            entries.add(LEAD_SHEET);
            entries.add(LEAD_DUST);

        });
    }

}
