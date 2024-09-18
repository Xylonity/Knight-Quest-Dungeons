package dev.xylonity.dungeons;

import net.fabricmc.api.ModInitializer;

public class KQDungeons implements ModInitializer {
    
    @Override
    public void onInitialize() {
        KQDungeonsCommon.init();
    }
}
