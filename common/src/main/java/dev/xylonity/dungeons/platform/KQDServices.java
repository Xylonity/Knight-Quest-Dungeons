package dev.xylonity.dungeons.platform;

import dev.xylonity.dungeons.KQDValues;
import dev.xylonity.dungeons.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

public class KQDServices {

    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);

    public static <T> T load(Class<T> clazz) {

        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        KQDValues.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}