package dev.byt3.flammablegrass;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import javax.annotation.Nonnull;

public class FlammableGrassPlugin extends JavaPlugin {
    public FlammableGrassPlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    public void setup() {
        this.getLogger().atInfo().log("FlammableGrass has been enabled!");
    }
}
