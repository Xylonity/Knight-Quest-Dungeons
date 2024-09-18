package dev.xylonity.dungeons.client.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.xylonity.dungeons.KQDValues;
import dev.xylonity.dungeons.client.entity.model.PoisonRatmanModel;
import dev.xylonity.dungeons.common.entity.entities.PoisonRatmanEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class PoisonRatmanRenderer extends GeoEntityRenderer<PoisonRatmanEntity> {

    public PoisonRatmanRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PoisonRatmanModel());

        this.addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull PoisonRatmanEntity animatable) {
        return new ResourceLocation(KQDValues.MOD_ID, "textures/entity/poisonratman.png");
    }

    @Override
    public void render(@NotNull PoisonRatmanEntity entity, float entityYaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource bufferSource, int packedLight) {

        poseStack.scale(1f, 1f, 1f);

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}

