package io.github.ianskelskey.masksofmalik;

import io.github.ianskelskey.masksofmalik.registry.ItemRegistry;
import io.github.ianskelskey.masksofmalik.registry.PaintingRegistry;
import io.github.ianskelskey.masksofmalik.registry.SoundRegistry;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MasksOfMalikMod.MODID)
public class MasksOfMalikMod
{
    public static final String MODID = "masksofmalik";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MasksOfMalikMod()
    {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        // Register the deferred registries
        ItemRegistry.registerAll(modEventBus);
        PaintingRegistry.registerAll(modEventBus);
        SoundRegistry.registerAll(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }
}
