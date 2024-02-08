package net.alana.modid.datagen;

import net.alana.modid.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.AVO_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.AVO_WOOD.asItem())
                .add(ModBlocks.STRIPPED_AVO_LOG.asItem())
                .add(ModBlocks.STRIPPED_AVO_WOOD.asItem())
                .add(ModBlocks.AVO_LOG.asItem());
    }
}
