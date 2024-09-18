package dev.xylonity.dungeons;

import dev.xylonity.dungeons.registry.KQDungeonsEntities;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;

@Mod(KnightQuestDungeonsConstants.MOD_ID)
public class KQDungeons {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, KnightQuestDungeonsConstants.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, KnightQuestDungeonsConstants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KnightQuestDungeonsConstants.MOD_ID);

    public KQDungeons() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Loader-specific registration
        KQDungeonsEntities.ENTITY.register(modEventBus);

        // Common registration
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_TABS.register(modEventBus);

        KnightQuestDungeonsCommon.run();
    }

}