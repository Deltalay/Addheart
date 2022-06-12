package com.delta.health.listener;


import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import com.delta.health.Main;

public class PlugListener implements Listener {
	private Main plugin;
	public PlugListener(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler
	public void Addheart(EntityDamageEvent e) {
		
		Entity d =  e.getEntity();
		if (d instanceof Player) {
			Player p = (Player) d;
			p.setMaxHealth((double) p.getPlayer().getHealth() + (double) 25) ;
			p.setHealth((double) p.getPlayer().getHealth() + (double) 25);	
			Bukkit.getServer().broadcastMessage(p.getName() + " get new " + p.getPlayer().getHealth() + " hearts");
		}
		
		
	}
}
