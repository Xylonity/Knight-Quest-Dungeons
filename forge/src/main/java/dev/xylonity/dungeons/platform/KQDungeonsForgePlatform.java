package dev.xylonity.dungeons.platform;

import dev.xylonity.dungeons.KQDungeons;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class KQDungeonsForgePlatform implements KQDungeonsPlatform {
    @Override
    public <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block) {
        return KQDungeons.BLOCKS.register(id, block);
    }

    @Override
    public <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        return KQDungeons.ITEMS.register(id, item);
    }

    @Override
    public <T extends CreativeModeTab> Supplier<T> registerCreativeTab(String id, Supplier<T> tab) {
        return KQDungeons.CREATIVE_TABS.register(id, tab);
    }

    @Override
    public CreativeModeTab.Builder newCreativeTabBuilder() {
        return CreativeModeTab.builder();
    }

}
