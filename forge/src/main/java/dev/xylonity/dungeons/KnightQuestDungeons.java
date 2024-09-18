package dev.xylonity.dungeons;

import dev.xylonity.dungeons.registry.KnightQuestDungeonsEntities;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

@Mod(KQDValues.MOD_ID)
public class KnightQuestDungeons {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, KQDValues.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, KQDValues.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KQDValues.MOD_ID);

    public KnightQuestDungeons() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        KnightQuestDungeonsEntities.ENTITY.register(modEventBus);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_TABS.register(modEventBus);

        KnightQuestDungeonsCommon.run();
    }

}