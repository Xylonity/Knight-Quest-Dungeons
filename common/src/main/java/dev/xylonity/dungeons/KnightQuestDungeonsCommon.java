package dev.xylonity.dungeons;

import dev.xylonity.dungeons.platform.KQDPlatform;
import dev.xylonity.dungeons.registry.*;

import java.util.ServiceLoader;

public final class KnightQuestDungeonsCommon {

    public static final KQDPlatform COMMON_PLATFORM = ServiceLoader.load(KQDPlatform.class).findFirst().orElseThrow();

    public static void run() {
        KnightQuestDungeonsBlocks.init();
        KnightQuestDungeonsItems.init();
    }
}