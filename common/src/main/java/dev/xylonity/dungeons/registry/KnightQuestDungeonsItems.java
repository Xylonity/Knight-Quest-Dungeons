package dev.xylonity.dungeons.registry;

import dev.xylonity.dungeons.KnightQuestDungeonsCommon;
import dev.xylonity.dungeons.KQDValues;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public class KnightQuestDungeonsItems {

    public static void init() {}

    public static final Supplier<BlockItem> GREAT_CHALICE = registerItem("great_chalice", () -> new BlockItem(KnightQuestDungeonsBlocks.GREAT_CHALICE.get(), new Item.Properties()));

    private static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        return KnightQuestDungeonsCommon.COMMON_PLATFORM.registerItem(id, item);
    }

    public static final Supplier<CreativeModeTab> KNIGHTQUEST_DUNGEONS_TAB = KnightQuestDungeonsCommon.COMMON_PLATFORM.registerCreativeTab("kqdungeons_tab", () -> KnightQuestDungeonsCommon.COMMON_PLATFORM.newCreativeTabBuilder()
            .title(Component.translatable("itemgroup." + KQDValues.MOD_ID + ".creative_tab"))
            .icon(() -> new ItemStack(Items.ACACIA_BOAT))
            .displayItems((enabledFeatures, entries) -> {
                entries.accept(KnightQuestDungeonsItems.GREAT_CHALICE.get());
            })
            .build());

}
