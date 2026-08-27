package elit.example;

import elit.example.playerModelRenderer.EntityRegister;
import elit.example.playerModelRenderer.test.ModelTestRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {  
        EntityRendererRegistry.register(EntityRegister.TEST, ModelTestRenderer::new);
    }
}
