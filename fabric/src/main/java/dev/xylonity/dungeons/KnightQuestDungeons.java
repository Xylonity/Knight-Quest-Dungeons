package dev.xylonity.dungeons;

import dev.xylonity.dungeons.client.entity.renderer.PoisonRatmanRenderer;
import dev.xylonity.dungeons.common.entity.entities.PoisonRatmanEntity;
import dev.xylonity.dungeons.registry.KnightQuestDungeonsEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class KnightQuestDungeons implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        KnightQuestDungeonsEntities.init();

        FabricDefaultAttributeRegistry.register(KnightQuestDungeonsEntities.POISON_RATMAN, PoisonRatmanEntity.setAttributes());

        KnightQuestDungeonsCommon.run();
    }

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(KnightQuestDungeonsEntities.POISON_RATMAN, PoisonRatmanRenderer::new);
    }

}
