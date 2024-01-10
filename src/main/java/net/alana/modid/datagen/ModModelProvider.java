package net.alana.modid.datagen;

import net.alana.modid.block.ModBlocks;
import net.alana.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEA_LEAVES);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUP_OF_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_TEA_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEA_LEAF, Models.GENERATED);
    }
}
