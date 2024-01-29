package net.alana.modid.entity;

import net.alana.modid.TutorialMod;
import net.alana.modid.entity.custom.AvoEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<AvoEntity> AVO = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(TutorialMod.Mod_ID, "avo"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AvoEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1f)).build());
}
