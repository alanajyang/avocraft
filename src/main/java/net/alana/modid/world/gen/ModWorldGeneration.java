package net.alana.modid.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOre();
        ModTreeGeneration.generateTrees();
    }
}
