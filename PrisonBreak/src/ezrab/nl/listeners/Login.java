package ezrab.nl.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class Login implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerLoginEvent e) {
        Bukkit.broadcastMessage(ChatColor.RED + "Hi " + ChatColor.GREEN + e.getHostname() + " " + e.getRealAddress().toString());
    }
}
