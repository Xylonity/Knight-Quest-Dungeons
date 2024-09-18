package dev.xylonity.dungeons.client.entity.model;

import dev.xylonity.dungeons.KQDValues;
import dev.xylonity.dungeons.common.entity.entities.PoisonRatmanEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class PoisonRatmanModel extends GeoModel<PoisonRatmanEntity> {

    @Override
    public ResourceLocation getModelResource(PoisonRatmanEntity animatable) {
        return new ResourceLocation(KQDValues.MOD_ID, "geo/poisonratman.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PoisonRatmanEntity animatable) {
        return new ResourceLocation(KQDValues.MOD_ID, "textures/entity/poisonratman.png");
    }

    @Override
    public ResourceLocation getAnimationResource(PoisonRatmanEntity animatable) {
        return new ResourceLocation(KQDValues.MOD_ID, "animations/poisonratman.animation.json");
    }

    @Override
    public void setCustomAnimations(PoisonRatmanEntity animatable, long instanceId, AnimationState<PoisonRatmanEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }

}
