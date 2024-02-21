package io.github.ianskelskey.masksofmalik.registry;

import io.github.ianskelskey.masksofmalik.items.MalikDemoDiscItem;
import io.github.ianskelskey.masksofmalik.items.ITabbedItem;
import io.github.ianskelskey.masksofmalik.items.StaffWeaponItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.github.ianskelskey.masksofmalik.MasksOfMalikMod.MODID;

public class ItemRegistry {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void registerAll(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
        ITEMS.register(MalikDemoDiscItem.NAME, MalikDemoDiscItem::new);
        ITEMS.register(StaffWeaponItem.NAME, StaffWeaponItem::new);
        modEventBus.addListener(ItemRegistry::addItemsToCreativeInventory);
    }

    private static void addItemsToCreativeInventory(BuildCreativeModeTabContentsEvent event) {
        ITEMS.getEntries().stream()
                .map(RegistryObject::get)
                .filter(item -> item instanceof ITabbedItem)
                .forEach(item -> {
                    if (((ITabbedItem) item).getCreativeModeTab() == event.getTabKey()) {
                        event.accept(item);
                    }
                });
    }
}
