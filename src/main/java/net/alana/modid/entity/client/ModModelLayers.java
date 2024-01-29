package net.alana.modid.entity.client;

import net.alana.modid.TutorialMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer AVO =
        new EntityModelLayer(new Identifier(TutorialMod.Mod_ID, "avo"), "main");
}
