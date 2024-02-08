package net.alana.modid.datagen;

import net.alana.modid.block.ModBlocks;
import net.alana.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CHRYSANTHEMUM);
        addPottedPlantDrops(ModBlocks.POTTED_CHRYSANTHEMUM);


        addDrop(ModBlocks.STRIPPED_AVO_LOG);
        addDrop(ModBlocks.STRIPPED_AVO_WOOD);
        addDrop(ModBlocks.AVO_LOG);
        addDrop(ModBlocks.AVO_WOOD);
        addDrop(ModBlocks.AVO_PLANKS);

        addDrop(ModBlocks.AVO_LEAVES, leavesDrops(ModBlocks.AVO_LEAVES, ModBlocks.AVO_LEAVES, .005f));
    }


}
