package dev.xylonity.dungeons.platform;

import dev.xylonity.dungeons.KnightQuestDungeonsConstants;
import dev.xylonity.dungeons.platform.services.IPlatformHelper;
import net.minecraft.world.level.block.Block;

import java.util.ServiceLoader;
import java.util.function.Supplier;

public class KQDungeonsServices {

    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    public static <T> T load(Class<T> clazz) {

        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        KnightQuestDungeonsConstants.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}