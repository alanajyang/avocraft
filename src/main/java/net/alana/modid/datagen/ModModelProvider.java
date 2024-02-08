package net.alana.modid.datagen;

import net.alana.modid.block.ModBlocks;
import net.alana.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CHRYSANTHEMUM, ModBlocks.POTTED_CHRYSANTHEMUM, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(ModBlocks.AVO_LOG).log(ModBlocks.AVO_LOG).wood(ModBlocks.AVO_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AVO_LOG).log(ModBlocks.STRIPPED_AVO_LOG).wood(ModBlocks.STRIPPED_AVO_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AVO_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AVO_LEAVES);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUP_OF_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROASTED_TEA_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEA_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.AVOCADO, Models.GENERATED);

        itemModelGenerator.register(ModItems.AVO_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

    }
}
