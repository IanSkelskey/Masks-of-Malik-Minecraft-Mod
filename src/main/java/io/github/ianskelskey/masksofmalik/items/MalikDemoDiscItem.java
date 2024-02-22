package io.github.ianskelskey.masksofmalik.items;

import io.github.ianskelskey.masksofmalik.registry.SoundRegistry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

public class MalikDemoDiscItem extends RecordItem implements ITabbedItem {

    public static final String NAME = "malik_demo_disc";
    private static final int RECORD_DURATION = 6740;
    private static final ResourceKey<CreativeModeTab> TAB = CreativeModeTabs.TOOLS_AND_UTILITIES;
    private static final Properties PROPERTIES = new Item.Properties().fireResistant().stacksTo(1).rarity(Rarity.RARE);

    public MalikDemoDiscItem() {
        super(15, SoundRegistry.MALIK_DEMO, PROPERTIES, RECORD_DURATION);
    }

    @Override
    public ResourceKey<CreativeModeTab> getCreativeModeTab() {
        return TAB;
    }
}
