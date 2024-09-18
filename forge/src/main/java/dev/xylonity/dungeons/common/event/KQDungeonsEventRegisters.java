package dev.xylonity.dungeons.common.event;

import dev.xylonity.dungeons.KnightQuestDungeonsConstants;
import dev.xylonity.dungeons.common.entity.entities.PoisonRatmanEntity;
import dev.xylonity.dungeons.registry.KQDungeonsEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KnightQuestDungeonsConstants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class KQDungeonsEventRegisters {

    /**
     * Sets attributes to every entity defined in the scope.
     */

    @SubscribeEvent
    public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(KQDungeonsEntities.POISON_RATMAN.get(), PoisonRatmanEntity.setAttributes());
    }

}
