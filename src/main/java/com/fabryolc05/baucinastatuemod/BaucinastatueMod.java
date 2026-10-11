package com.fabryolc05.baucinastatuemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaucinastatueMod implements ModInitializer {
    public static final String MOD_ID = "baucinastatuemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing BaucinastatueMod");
        ModRegistries.register();
    }
}