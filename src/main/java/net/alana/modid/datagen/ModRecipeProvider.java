package net.alana.modid.datagen;

import net.alana.modid.block.ModBlocks;
import net.alana.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {


        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AVO_PLANKS, 4)
                .input(ModBlocks.AVO_LOG)
                .criterion(hasItem(ModBlocks.AVO_LOG), conditionsFromItem(ModBlocks.AVO_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.AVO_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUP, 1)
                .pattern("# #")
                .pattern(" # ")
                .input('#', Items.CLAY_BALL)
                .criterion(hasItem(Items.CLAY_BALL), conditionsFromItem(Items.CLAY_BALL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUP)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CUP_OF_TEA, 1)
                .input(ModItems.CUP)
                .input(ModItems.ROASTED_TEA_LEAF)
                .criterion(hasItem(ModItems.ROASTED_TEA_LEAF), conditionsFromItem(ModItems.ROASTED_TEA_LEAF))
                .criterion(hasItem(ModItems.CUP), conditionsFromItem(ModItems.CUP))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CUP_OF_TEA)));

        offerSmelting(exporter, List.of(ModItems.TEA_LEAF), RecipeCategory.FOOD, ModItems.ROASTED_TEA_LEAF, 0.15f, 100, "test");

    }
}
