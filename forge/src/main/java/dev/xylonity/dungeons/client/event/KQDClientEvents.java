package dev.xylonity.dungeons.client.event;

import dev.xylonity.dungeons.KQDValues;
import dev.xylonity.dungeons.client.entity.renderer.PoisonRatmanRenderer;
import dev.xylonity.dungeons.registry.KnightQuestDungeonsEntities;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = KQDValues.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KQDClientEvents {

    @SubscribeEvent
    public static void registerEntityRenderers(FMLClientSetupEvent event)
    {
        EntityRenderers.register(KnightQuestDungeonsEntities.POISON_RATMAN.get(), PoisonRatmanRenderer::new);
    }

}
