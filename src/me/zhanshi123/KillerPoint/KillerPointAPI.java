package me.zhanshi123.KillerPoint;

import me.zhanshi123.KillerPoint.Managers.ConfigManager;
import me.zhanshi123.KillerPoint.Managers.ListenerManager;
import me.zhanshi123.KillerPoint.Managers.PointManager;

public class KillerPointAPI
{
	private static ConfigManager configManager;
	private static KillerPoint plugin;
	public static void init()
	{
		new ConfigManager();
		new PointManager();
		new ListenerManager();
		configManager=ConfigManager.getConfigManager();
		plugin=KillerPoint.getInstance();
	}
	public static ConfigManager getConfigManager()
	{
		return configManager;
	}
	public static KillerPoint getPlugin()
	{
		return plugin;
	}
}
