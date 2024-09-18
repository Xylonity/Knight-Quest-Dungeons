package dev.xylonity.dungeons;

import dev.xylonity.dungeons.platform.KQDungeonsPlatform;
import dev.xylonity.dungeons.registry.*;

import java.util.ServiceLoader;

public final class KnightQuestDungeonsCommon {

    public static final KQDungeonsPlatform COMMON_PLATFORM = ServiceLoader.load(KQDungeonsPlatform.class).findFirst().orElseThrow();

    public static void run() {
        KnightQuestDungeonsBlocks.init();
        KnightQuestDungeonsItems.init();
    }
}