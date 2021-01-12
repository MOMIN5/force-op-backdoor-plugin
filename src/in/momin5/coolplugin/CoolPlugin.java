package in.momin5.coolplugin;

import in.momin5.coolplugin.events.MessageEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class CoolPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
    getServer().getPluginManager().registerEvents(new MessageEvent(), this);
    getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[CoolPlugin]This Plugin is now enabled!");
    }

    
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[CoolPlugin]This Plugin is now disabled");

    }
}
