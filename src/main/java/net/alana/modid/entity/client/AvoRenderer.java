package net.alana.modid.entity.client;

import net.alana.modid.TutorialMod;
import net.alana.modid.entity.custom.AvoEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class AvoRenderer extends MobEntityRenderer<AvoEntity, AvoModel<AvoEntity>> {
    private static final Identifier TEXTURE = new Identifier(TutorialMod.Mod_ID, "textures/entity/avotexture.png");
    public AvoRenderer(EntityRendererFactory.Context context) {
        super(context, new AvoModel<>(context.getPart(ModModelLayers.AVO)), 0.6f);
    }

    @Override
    public Identifier getTexture(AvoEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(AvoEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.7f, 0.7f, 0.7f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
