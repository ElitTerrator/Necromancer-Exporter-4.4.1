package elit.magic.playerModelRenderer.test;

import elit.magic.playerModelRenderer.ModelEntity;
import elit.magic.playerModelRenderer.ModelSkeleton;
import foundry.veil.api.client.necromancer.animation.Animator;

public class ModelTestAnimator extends Animator<ModelTestEntity, ModelTestSkeleton> {
    protected ModelTestAnimator(ModelTestEntity parent, ModelTestSkeleton skeleton) {
        super(parent, skeleton);
    }

    @Override
    public void animate() {
        super.animate();
    }
}
