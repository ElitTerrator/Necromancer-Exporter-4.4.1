package elit.magic.playerModelRenderer.test;

import elit.magic.Magic;
import foundry.veil.api.client.necromancer.animation.Animator;
import foundry.veil.api.client.necromancer.render.NecromancerEntityRenderer;
import foundry.veil.api.client.necromancer.render.NecromancerSkinEntityRenderLayer;
import foundry.veil.api.client.necromancer.render.Skin;
import foundry.veil.api.client.render.rendertype.VeilRenderType;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class ModelTestRenderer extends NecromancerEntityRenderer<ModelTestEntity, ModelTestSkeleton> {
    private static final Identifier RENDERTYPE = Magic.id("model_entity");
    private static final Identifier TEXTURE_LOCATION = Magic.id("textures/entity/texture.png");


    public ModelTestRenderer(EntityRendererFactory.Context context) {
        super(context, 0.3F);
        this.addLayer(new NecromancerSkinEntityRenderLayer<>(this) {
            @Override
            public RenderLayer getRenderType(ModelTestEntity entity) {
                return VeilRenderType.get(RENDERTYPE, TEXTURE_LOCATION);
            }
            @Override
            public Skin getSkin(ModelTestEntity parent) {
                return ModelTestSkin.SKIN;
            }
        });
    }

    @Override
    public ModelTestSkeleton createSkeleton(ModelTestEntity gnomadMogulEntity) {
        return new ModelTestSkeleton();
    }

    @Override
    public Animator<ModelTestEntity, ModelTestSkeleton> createAnimator(ModelTestEntity entity, ModelTestSkeleton Skeleton) {
        return new ModelTestAnimator(entity, Skeleton);
    }
}
