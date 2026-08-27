package elit.example;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import elit.example.entity.EntityRegister;

public class Example implements ModInitializer {
	public static final String MOD_ID = "example";

	public static final Logger EXAMPLE = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EntityRegister.bootstrap();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
