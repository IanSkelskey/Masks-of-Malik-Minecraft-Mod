package io.github.ianskelskey.masksofmalik.registry;

import io.github.ianskelskey.masksofmalik.paintings.CatPainting;
import io.github.ianskelskey.masksofmalik.paintings.MalikPainting;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static io.github.ianskelskey.masksofmalik.MasksOfMalikMod.MODID;

public class PaintingRegistry {
    public static final DeferredRegister<PaintingVariant> PAINTINGS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, MODID);

    public static void registerAll(IEventBus modEventBus) {
        PAINTINGS.register(modEventBus);
        PAINTINGS.register(MalikPainting.NAME, MalikPainting::new);
        PAINTINGS.register(CatPainting.NAME, CatPainting::new);
    }
}
