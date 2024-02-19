package com.ianskelskey.masksofmalik.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;

import static com.ianskelskey.masksofmalik.registry.SoundRegistry.MALIK_DEMO;

public class MalikDemoDiscItem extends RecordItem implements TabbedItem {

    public static final String NAME = "malik_demo_disc";
    private static final int RECORD_DURATION = 6740;
    private static final CreativeModeTab TAB = CreativeModeTabs.TOOLS_AND_UTILITIES;

    public MalikDemoDiscItem() {
        super(15, MALIK_DEMO, new Item.Properties(), RECORD_DURATION);
    }

    @Override
    public CreativeModeTab getCreativeModeTab() {
        return TAB;
    }
}
