package com.ianskelskey.masksofmalik;

import com.ianskelskey.masksofmalik.item.ModItems;
import com.ianskelskey.masksofmalik.sound.ModSounds;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.ianskelskey.masksofmalik.item.ModItems.MALIK_DEMO_DISC;

@Mod(MasksOfMalikMod.MODID)
public class MasksOfMalikMod
{
    public static final String MODID = "masksofmalik";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MasksOfMalikMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ModItems.register(modEventBus);
        ModSounds.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(MALIK_DEMO_DISC);
        }
    }
}
