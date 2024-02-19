package com.ianskelskey.masksofmalik;

import com.ianskelskey.masksofmalik.registry.ItemRegistry;
import com.ianskelskey.masksofmalik.registry.PaintingRegistry;
import com.ianskelskey.masksofmalik.sounds.ModSounds;
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
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ItemRegistry.registerAll(modEventBus);
        PaintingRegistry.registerAll(modEventBus);
        ModSounds.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }
}
