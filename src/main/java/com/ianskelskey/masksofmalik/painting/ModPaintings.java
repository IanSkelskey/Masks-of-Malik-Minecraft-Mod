package com.ianskelskey.masksofmalik.painting;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.ianskelskey.masksofmalik.MasksOfMalikMod.MODID;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTINGS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MODID);

    public static void register(IEventBus modEventBus) {
        PAINTINGS.register(modEventBus);
        PAINTINGS.register("malik_painting",
                () -> new PaintingVariant(16, 16));
        PAINTINGS.register("cat_painting",
                () -> new PaintingVariant(64, 64));
    }
}
