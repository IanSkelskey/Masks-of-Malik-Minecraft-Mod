package com.ianskelskey.masksofmalik.registry;

import com.ianskelskey.masksofmalik.items.MalikDemoDiscItem;
import com.ianskelskey.masksofmalik.items.TabbedItem;
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
        modEventBus.addListener(ItemRegistry::addItemsToCreativeInventory);
    }

    private static void addItemsToCreativeInventory(CreativeModeTabEvent.BuildContents event) {
        ITEMS.getEntries().stream()
                .map(RegistryObject::get)
                .filter(item -> item instanceof TabbedItem)
                .forEach(item -> {
                    if (((TabbedItem) item).getCreativeModeTab() == event.getTab()) {
                        event.accept(item);
                    }
                });
    }
}
