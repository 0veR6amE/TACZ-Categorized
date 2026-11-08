package net.J0aoPestana.tacz_categorized;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;


@Mod(Tacz_categorized.MOD_ID)
public class Tacz_categorized {
    public static final String MOD_ID = "tacz_categorized";

    public Tacz_categorized(IEventBus modEventBus, ModContainer modContainer) {
        modContainer.registerConfig(ModConfig.Type.CLIENT, Config.SPEC);
    }

}
