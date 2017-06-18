package me.zhanshi123.KillerPoint;

import org.bukkit.entity.Player;

public class Utils {
	public static String translateColorCodes(String textToTranslate)
	{
		String text=null;
		text=textToTranslate.replace('&', '¡ì');
		return text;
	}
	public static void sendMessage(String message,Player target)
	{
		//target.sendMessage();
	}
}
