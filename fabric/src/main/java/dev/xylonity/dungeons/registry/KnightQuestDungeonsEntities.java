package dev.xylonity.dungeons.registry;

import dev.xylonity.dungeons.KQDValues;
import dev.xylonity.dungeons.common.entity.entities.PoisonRatmanEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class KnightQuestDungeonsEntities {

    public static void init() {}

    public static final EntityType<PoisonRatmanEntity> POISON_RATMAN;

    static {
        POISON_RATMAN = register("poison_ratman", PoisonRatmanEntity::new, MobCategory.MONSTER , 1f, 1f);
    }

    private static <X extends Entity> EntityType<X> register(String name, EntityType.EntityFactory<X> entity, MobCategory spawnGroup, float width, float height) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(KQDValues.MOD_ID, name), EntityType.Builder.of(entity, spawnGroup).sized(width, height).build(name));
    }

}
