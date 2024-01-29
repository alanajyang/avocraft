package net.alana.modid;

import net.alana.modid.block.ModBlocks;
import net.alana.modid.entity.ModEntities;
import net.alana.modid.entity.client.AvoModel;
import net.alana.modid.entity.client.AvoRenderer;
import net.alana.modid.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHRYSANTHEMUM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CHRYSANTHEMUM, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.AVO, AvoRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.AVO, AvoModel::getTexturedModelData);
    }
}
