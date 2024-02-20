package io.github.ianskelskey.masksofmalik.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;

public interface TabbedItem {
    ResourceKey<CreativeModeTab> getCreativeModeTab();
}
