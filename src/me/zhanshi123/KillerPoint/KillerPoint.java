package me.zhanshi123.KillerPoint;

import org.bukkit.plugin.java.JavaPlugin;

public class KillerPoint extends JavaPlugin
{
	private static KillerPoint instance;
	public void onEnable()
	{
		instance=this;
		KillerPointAPI.init();
	}
	public static KillerPoint getInstance()
	{
		return instance;
	}
}
