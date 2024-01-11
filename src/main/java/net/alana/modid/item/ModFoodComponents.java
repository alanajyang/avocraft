package net.alana.modid.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CUP_OF_TEA = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 1f).build();
    public static final FoodComponent AVOCADO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
}
