package net.alana.modid.datagen;

import net.alana.modid.world.ModConfiguredFeatures;
import net.alana.modid.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.concurrent.CompletableFuture;

public class ModWorldGenerator extends FabricDynamicRegistryProvider {
    public ModWorldGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        final RegistryWrapper.Impl<PlacedFeature> placedFeatureRegistry = registries.getWrapperOrThrow(RegistryKeys.PLACED_FEATURE);

        entries.add(ModPlacedFeatures.AVO_PLACED_KEY, placedFeatureRegistry.getOrThrow(ModPlacedFeatures.AVO_PLACED_KEY).value());

        final RegistryWrapper.Impl<ConfiguredFeature<?, ?>> configuredFeatureRegistry = registries.getWrapperOrThrow(RegistryKeys.CONFIGURED_FEATURE);

        entries.add(ModConfiguredFeatures.AVO_KEY, configuredFeatureRegistry.getOrThrow(ModConfiguredFeatures.AVO_KEY).value());



    }

    @Override
    public String getName() {
        return "World Gen";
    }
}
