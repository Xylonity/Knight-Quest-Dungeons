package dev.xylonity.dungeons.platform;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface KQDPlatform {
    <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block);
    <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item);
    <T extends CreativeModeTab> Supplier<T> registerCreativeTab(String id, Supplier<T> tab);
    CreativeModeTab.Builder newCreativeTabBuilder();
}