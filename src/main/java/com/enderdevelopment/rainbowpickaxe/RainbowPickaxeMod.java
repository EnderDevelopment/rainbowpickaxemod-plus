package com.enderdevelopment.rainbowpickaxe;

import net.fabricmc.api.ModInitializer;

public class RainbowPickaxeMod implements ModInitializer {
    public static final String MOD_ID = "rainbowpickaxe";

    @Override
    public void onInitialize() {
        ModItems.init();
        ModEvents.init();
    }
}