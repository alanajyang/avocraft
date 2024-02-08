package net.alana.modid;

import net.alana.modid.block.ModBlocks;
import net.alana.modid.entity.ModEntities;
import net.alana.modid.entity.custom.AvoEntity;
import net.alana.modid.item.ModItemGroups;
import net.alana.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String Mod_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.AVO, AvoEntity.createAvoAttributes());

		StrippableBlockRegistry.register(ModBlocks.AVO_LOG, ModBlocks.STRIPPED_AVO_LOG);
		StrippableBlockRegistry.register(ModBlocks.AVO_WOOD, ModBlocks.STRIPPED_AVO_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AVO_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AVO_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_AVO_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_AVO_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AVO_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AVO_LEAVES, 30, 60);
	}
}