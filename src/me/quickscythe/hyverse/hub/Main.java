package me.quickscythe.hyverse.hub;

import org.bukkit.plugin.java.JavaPlugin;

import me.quickscythe.hyverse.hub.listeners.PlayerListener;


public class Main extends JavaPlugin {
	
	private static Main plugin;
	
	public void onEnable(){
		plugin = this;
		
		new PlayerListener(this);
	}
	
	
	public static Main getPlugin() {
		return plugin;
	}

}
