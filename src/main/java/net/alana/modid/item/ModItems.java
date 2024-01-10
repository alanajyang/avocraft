package net.alana.modid.item;

import net.alana.modid.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEA = registerItem("tea", new Item(new FabricItemSettings()));
    public static final Item TEA_LEAF = registerItem("tea_leaf", new Item(new FabricItemSettings()));
    public static final Item CUP = registerItem("cup", new Item(new FabricItemSettings()));
    public static final Item CUP_OF_TEA = registerItem("cup_of_tea", new Item(new FabricItemSettings().food(ModFoodComponents.CUP_OF_TEA)));
    public static final Item ROASTED_TEA_LEAF = registerItem("roasted_tea_leaf", new Item(new FabricItemSettings()));

    private static void addItemsToFoodAndDrinkTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(TEA);
        entries.add(TEA_LEAF);
        entries.add(CUP);
        entries.add(CUP_OF_TEA);
        entries.add(ROASTED_TEA_LEAF);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.Mod_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.Mod_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkTabItemGroup);
    }
}
