package elit.example.entity;

import elit.example.Exmaple;
import elit.example.test.ModelTestEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAttachmentType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class EntityRegister {

    public static final EntityType<ModelTestEntity> TEST = register("test", EntityType.Builder.create(ModelTestEntity::new, SpawnGroup.MISC)
            .dimensions(0.6F, 2)
            .maxTrackingRange(8));

    public static void bootstrap() {
    }

    public static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        return Registry.register(Registries.ENTITY_TYPE, Exmaple.id(name), builder.build(null));
    }
}
