package de.florianmichael.viaerrorhandler;

import org.bukkit.plugin.java.JavaPlugin;

public class ViaErrorHandler extends JavaPlugin {

    @Override
    public void onLoad() {
        System.setProperty("viaversion.strict-error-handling1_20_5", "false");
        getLogger().info("ViaVersion strict error handling disabled for 1.20.5 players!");
    }

}
