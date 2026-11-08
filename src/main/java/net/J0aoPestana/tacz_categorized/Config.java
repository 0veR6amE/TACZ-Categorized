package net.J0aoPestana.tacz_categorized;

import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.List;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.ConfigValue<List<? extends String>> ADDON_MODS = BUILDER
            .comment("Extra mod ids whose creative tabs are moved into the TACZ tab.",
                    "Mods that declare a dependency on TACZ are detected automatically and do not need to be listed.")
            .defineListAllowEmpty("addonMods", List.of(), () -> "", Config::isModId);

    static final ModConfigSpec SPEC = BUILDER.build();

    private static boolean isModId(final Object obj) {
        return obj instanceof String modId && modId.matches("[a-z][a-z0-9_]{1,63}");
    }
}
