package com.ianskelskey.masksofmalik.item;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.ianskelskey.masksofmalik.MasksOfMalikMod.MODID;
import static com.ianskelskey.masksofmalik.sound.ModSounds.MALIK_DEMO;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
        ITEMS.register("malik_demo_disc",
                () -> new RecordItem(15, MALIK_DEMO, new Item.Properties(), 6740));
        modEventBus.addListener(ModItems::addItemsToCreativeInventory);
    }

    private static void addItemsToCreativeInventory(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            ITEMS.getEntries().stream()
                    .map(RegistryObject::get)
                    .forEach(event::accept);
        }
    }
}
