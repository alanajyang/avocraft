package net.alana.modid.item;

import net.alana.modid.TutorialMod;
import net.alana.modid.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TEA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.Mod_ID, "tea"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tea"))
                    .icon(() -> new ItemStack(ModItems.TEA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TEA);
                        entries.add(ModItems.TEA_LEAF);
                        entries.add(ModItems.CUP);
                        entries.add(ModItems.CUP_OF_TEA);
                        entries.add(ModItems.ROASTED_TEA_LEAF);
                        entries.add(ModItems.AVOCADO);
                        entries.add(ModItems.AVO_SPAWN_EGG);
                        entries.add(ModBlocks.CHRYSANTHEMUM);
                        entries.add(ModBlocks.TEA_LEAVES);
                        entries.add(ModBlocks.AVO_LOG);
                        entries.add(ModBlocks.AVO_PLANKS);
                        entries.add(ModBlocks.AVO_WOOD);
                        entries.add(ModBlocks.STRIPPED_AVO_LOG);
                        entries.add(ModBlocks.STRIPPED_AVO_WOOD);
                        entries.add(ModBlocks.AVO_LEAVES);
                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for" + TutorialMod.Mod_ID);
    }
}
