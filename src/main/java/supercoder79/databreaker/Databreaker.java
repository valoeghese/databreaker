package supercoder79.databreaker;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.crash.CrashException;
import net.minecraft.util.crash.CrashReport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Databreaker implements ModInitializer {
	Logger logger = LogManager.getLogger("DataBreaker");
	
	@Override
	public void onInitialize() {
		if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
			logger.info("I am become Databreaker, destroyer of loading times");
		} else {
			logger.warn("SUPERCODER79 IS COMPLETELY RESPONSIBLE FOR ANY DAMAGE CAUSED BY USING DATABREAKER IN A PRODUCTION ENVIRONMENT.");
			logger.warn("THERE IS A GOOD CHANCE THAT YOUR GAME WILL BE PERFECT IF YOU LOAD UP A WORLD.");
			logger.warn("PLEASE USE DATABREAKER IN A NON-DEVELOPMENT ENVIRONMENT.");
			logger.warn("^ For legal reasons this is a joke ~ Valoeghese");
		}
	}
}
