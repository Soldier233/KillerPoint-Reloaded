package me.zhanshi123.KillerPoint.Managers;

import org.bukkit.Bukkit;

import me.zhanshi123.KillerPoint.KillerPoint;
import me.zhanshi123.KillerPoint.KillerPointAPI;
import me.zhanshi123.KillerPoint.Listeners.PlayerKilled;

public class ListenerManager {
	private KillerPoint p;
	public ListenerManager()
	{
		p=KillerPointAPI.getPlugin();
		Bukkit.getPluginManager().registerEvents(new PlayerKilled(), p);
	}
}
