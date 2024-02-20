package io.github.ianskelskey.masksofmalik.items;

import io.github.ianskelskey.masksofmalik.registry.SoundRegistry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;

public class MalikDemoDiscItem extends RecordItem implements TabbedItem {

    public static final String NAME = "malik_demo_disc";
    private static final int RECORD_DURATION = 6740;
    private static final ResourceKey<CreativeModeTab> TAB = CreativeModeTabs.TOOLS_AND_UTILITIES;

    public MalikDemoDiscItem() {
        super(15, SoundRegistry.MALIK_DEMO, new Item.Properties(), RECORD_DURATION);
    }

    @Override
    public ResourceKey<CreativeModeTab> getCreativeModeTab() {
        return TAB;
    }
}
