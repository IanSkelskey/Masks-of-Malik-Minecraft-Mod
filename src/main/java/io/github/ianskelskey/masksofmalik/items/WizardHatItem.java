package io.github.ianskelskey.masksofmalik.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

public class WizardHatItem extends ArmorItem implements ITabbedItem {
    public static final String NAME = "wizard_hat";
    private static final ResourceKey<CreativeModeTab> TAB = CreativeModeTabs.COMBAT;
    private static final Properties PROPERTIES = new Properties().stacksTo(1).durability(100).rarity(Rarity.UNCOMMON);
    private static final ArmorMaterial MATERIAL = ArmorMaterials.LEATHER;

    public WizardHatItem() {
        super(MATERIAL, Type.HELMET, PROPERTIES);
    }

    @Override
    public ResourceKey<CreativeModeTab> getCreativeModeTab() {
        return TAB;
    }
}
