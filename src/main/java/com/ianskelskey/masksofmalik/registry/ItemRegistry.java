package com.ianskelskey.masksofmalik.registry;

import com.ianskelskey.masksofmalik.items.MalikDemoDiscItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.ianskelskey.masksofmalik.MasksOfMalikMod.MODID;

public class ItemRegistry {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void registerAll(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
        ITEMS.register(MalikDemoDiscItem.NAME, MalikDemoDiscItem::new);
    }

    private static void addItemsToCreativeInventory(CreativeModeTabEvent.BuildContents event)
    {
        // Each mod item has a static field called TAB that contains the creative inventory location of the item
        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            ITEMS.getEntries().stream()
                    .map(RegistryObject::get)
                    .forEach(event::accept);
        }
    }
}
