package com.bobacadodl.villageworld;

import org.bukkit.entity.Player;

/**
 * User: bobacadodl
 * Date: 7/12/14
 * Time: 11:15 AM
 */
public class VPlayer extends OfflineVPlayer {
    private Player player;

    public VPlayer(Player player) {
        super(player);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
