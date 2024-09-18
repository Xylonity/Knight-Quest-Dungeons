package dev.xylonity.dungeons.registry;

import dev.xylonity.dungeons.KnightQuestDungeonsConstants;
import dev.xylonity.dungeons.common.entity.entities.PoisonRatmanEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KQDungeonsEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KnightQuestDungeonsConstants.MOD_ID);

    public static final RegistryObject<EntityType<PoisonRatmanEntity>> POISON_RATMAN;

    static {
        POISON_RATMAN = register("poison_ratman", PoisonRatmanEntity::new, MobCategory.MONSTER , 1f, 1f);
    }

    private static <X extends Entity> RegistryObject<EntityType<X>> register(String name, EntityType.EntityFactory<X> entity, MobCategory category, float width, float height) {
        return ENTITY.register(name, () -> EntityType.Builder.of(entity, category).sized(width, height).build(String.valueOf(new ResourceLocation(KnightQuestDungeonsConstants.MOD_ID, name))));
    }

}
