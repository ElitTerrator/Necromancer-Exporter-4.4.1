package elit.example.entity;

import elit.example.entity.ModelEntity;
import elit.example.entity.ModelSkeleton;
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
