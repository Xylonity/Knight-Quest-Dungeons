package dev.xylonity.dungeons.registry;

import dev.xylonity.dungeons.KnightQuestDungeonsCommon;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class KnightQuestDungeonsBlocks {

    public static void init() {}

    public static final Supplier<Block> GREAT_CHALICE = registerBlock("great_chalice", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER)));

    private static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block) {
        return KnightQuestDungeonsCommon.COMMON_PLATFORM.registerBlock(id, block);
    }

}
