package me.zhanshi123.KillerPoint.Managers;

import java.io.File;
import java.util.List;

import org.bukkit.configuration.file.FileConfiguration;

import me.zhanshi123.KillerPoint.KillerPoint;

public class ConfigManager {
	private KillerPoint instance;
	private FileConfiguration config;
	private static ConfigManager cm=null;
	public ConfigManager()
	{
		instance=KillerPoint.getInstance();
		reload();
		cm=this;
	}
	private void reload()
	{
		File f=new File(instance.getDataFolder(),"config.yml");
		if(!f.exists())
		{
			instance.saveDefaultConfig();
			instance.reloadConfig();
		}
		config=instance.getConfig();
		loadConfig();
	}
	public static ConfigManager getConfigManager()
	{
		if(cm!=null)
		{
			return cm;
		}
		else
		{
			new RuntimeException("ConfigManager还没有被初始化!");
			return null;
		}
	}
	
	private void loadConfig()
	{
		//Messages部分
		prefix=config.getString("Messages.prefix");
		
		
		//General部分
		worlds=config.getStringList("General.worlds");
	}
	//上方为初始化部分
	private String prefix;
	
	private List<String> worlds;
	//下方子方法
	
	public String getPrefix()
	{
		return prefix;
	}
	public List<String> getWorlds()
	{
		return worlds;
	}
}
