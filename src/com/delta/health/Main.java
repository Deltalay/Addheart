package com.delta.health;

import org.bukkit.plugin.java.JavaPlugin;

import com.delta.health.listener.PlugListener;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		new PlugListener(this);
	}
}
