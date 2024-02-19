package com.ianskelskey.masksofmalik.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;

import static com.ianskelskey.masksofmalik.sounds.ModSounds.MALIK_DEMO;

public class MalikDemoDiscItem extends RecordItem {

    public static final String NAME = "malik_demo_disc";

    public static final CreativeModeTab TAB = CreativeModeTabs.TOOLS_AND_UTILITIES;

    public MalikDemoDiscItem() {
        super(15, MALIK_DEMO, new Item.Properties(), 6740);
    }
}
