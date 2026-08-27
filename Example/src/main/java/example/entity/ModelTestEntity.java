package elit.example.entity;

import foundry.veil.api.client.necromancer.SkeletonParent;
import foundry.veil.api.client.necromancer.animation.Animator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class ModelTestEntity extends Entity implements SkeletonParent<ModelTestEntity, ModelTestSkeleton> {

    private ModelTestSkeleton skeleton;
    private Animator<ModelTestEntity, ModelTestSkeleton> animator;

    public ModelTestEntity(EntityType<? extends ModelTestEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public void setSkeleton(@Nullable ModelTestSkeleton skeleton) { this.skeleton = skeleton; }
    @Override
    public void setAnimator(@Nullable Animator<ModelTestEntity, ModelTestSkeleton> animator) { this.animator = animator; }
    
    @Override
    public @Nullable ModelTestSkeleton getSkeleton() { return this.skeleton; }
    @Override
    public @Nullable Animator<ModelTestEntity, ModelTestSkeleton> getAnimator() { return this.animator; }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) { }
    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) { }
    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) { }

    @Override
    public void tick() {
        super.tick();
    }
}