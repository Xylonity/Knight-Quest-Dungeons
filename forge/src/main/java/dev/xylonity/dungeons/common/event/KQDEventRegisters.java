package dev.xylonity.dungeons.common.event;

import dev.xylonity.dungeons.KQDValues;
import dev.xylonity.dungeons.common.entity.entities.PoisonRatmanEntity;
import dev.xylonity.dungeons.registry.KnightQuestDungeonsEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KQDValues.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class KQDEventRegisters {

    /**
     * Sets attributes to every entity defined in the scope.
     */

    @SubscribeEvent
    public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(KnightQuestDungeonsEntities.POISON_RATMAN.get(), PoisonRatmanEntity.setAttributes());
    }

}
