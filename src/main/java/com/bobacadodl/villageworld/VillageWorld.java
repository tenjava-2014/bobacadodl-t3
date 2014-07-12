package com.bobacadodl.villageworld;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * User: bobacadodl
 * Date: 7/12/14
 * Time: 10:42 AM
 */
public class VillageWorld extends JavaPlugin {
    private static VillageWorld instance;

    public void onEnable() {
        instance = this;
        getCommand("village").setExecutor(new VillageCommand());
    }


    public static VillageWorld getInstance() {
        return instance;
    }
}
