package io.github.ianskelskey.masksofmalik.items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

// Placeholder for staff weapon class
public class StaffWeaponItem extends SwordItem implements ITabbedItem {

    public static final String NAME = "staff_weapon"; // Unique identifier for your weapon
    private static final ResourceKey<CreativeModeTab> TAB = CreativeModeTabs.COMBAT;
    private static final Properties PROPERTIES = new Item.Properties().stacksTo(1).durability(100).rarity(Rarity.UNCOMMON);
    private static final int ATTACK_DAMAGE = 3;
    private static final float ATTACK_SPEED = -2.4F;

    public StaffWeaponItem() {
        super(Tiers.DIAMOND, ATTACK_DAMAGE, ATTACK_SPEED, PROPERTIES);
    }

    @Override
    public ResourceKey<CreativeModeTab> getCreativeModeTab() {
        return TAB;
    }
}