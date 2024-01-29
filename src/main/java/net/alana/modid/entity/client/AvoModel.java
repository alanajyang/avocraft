package net.alana.modid.entity.client;

import net.alana.modid.entity.animation.ModAnimations;
import net.alana.modid.entity.custom.AvoEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class AvoModel<T extends AvoEntity> extends SinglePartEntityModel<T> {
	private final ModelPart avo;
	private final ModelPart head;
	public AvoModel(ModelPart root) {
		this.avo = root.getChild("avo");
		this.head = avo.getChild("body");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData avo = modelPartData.addChild("avo", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData body = avo.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-3.0F, -12.0F, -1.0F, 5.0F, 12.0F, 2.0F, new Dilation(0.0F))
		.uv(12, 12).cuboid(-3.0F, -10.0F, 1.0F, 5.0F, 9.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 7).cuboid(-2.0F, -6.0F, 3.0F, 3.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 10).cuboid(-2.0F, -11.0F, 1.0F, 3.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(5, 23).cuboid(2.0F, -10.0F, -1.0F, 1.0F, 9.0F, 3.0F, new Dilation(0.0F))
		.uv(14, 7).cuboid(-2.0F, -1.0F, 1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 14).cuboid(-4.0F, -10.0F, -1.0F, 1.0F, 9.0F, 3.0F, new Dilation(0.0F))
		.uv(23, 20).cuboid(-5.0F, -7.0F, -1.0F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(13, 23).cuboid(3.0F, -7.0F, -1.0F, 1.0F, 5.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 26).cuboid(2.0F, -7.0F, 2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
		.uv(8, 14).cuboid(-4.0F, -7.0F, 2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, 0.0F));

		ModelPartData seed = body.addChild("seed", ModelPartBuilder.create().uv(14, 0).cuboid(-3.0F, -10.0F, -3.0F, 5.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.0F, 0.0F));

		ModelPartData rightleg = avo.addChild("rightleg", ModelPartBuilder.create().uv(10, 23).cuboid(-1.0F, 2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(26, 15).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -3.0F, 1.0F));

		ModelPartData leftleg = avo.addChild("leftleg", ModelPartBuilder.create().uv(26, 12).cuboid(-1.0F, 2.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(28, 0).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -3.0F, 1.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(AvoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.AVO_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.AVO_IDLE, ageInTicks, 1f);
	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		avo.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return avo;
	}
}