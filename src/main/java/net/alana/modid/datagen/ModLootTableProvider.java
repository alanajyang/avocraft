package net.alana.modid.datagen;

import net.alana.modid.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TEA_LEAVES, leavesDrops(ModBlocks.TEA_LEAVES, ModBlocks.TEA_LEAVES, 1f));
        addDrop(ModBlocks.CHRYSANTHEMUM);
        addPottedPlantDrops(ModBlocks.POTTED_CHRYSANTHEMUM);
    }

}
