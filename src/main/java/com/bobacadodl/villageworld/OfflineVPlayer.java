package com.bobacadodl.villageworld;

import org.bukkit.OfflinePlayer;

/**
 * User: bobacadodl
 * Date: 7/12/14
 * Time: 11:16 AM
 */
public class OfflineVPlayer {
    private OfflinePlayer offlinePlayer;

    public OfflineVPlayer(OfflinePlayer offlinePlayer) {
        this.offlinePlayer = offlinePlayer;
    }

    public OfflinePlayer getPlayer() {
        return offlinePlayer;
    }

}
