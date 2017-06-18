package me.zhanshi123.KillerPoint.Managers;

import java.util.HashMap;

import me.zhanshi123.KillerPoint.KPPlayer;

public class PointManager {
	//*******************************
	//****注意   使用前务必检查是否contains****
	//*******************************
	public PointManager()
	{
		data=new HashMap<String,KPPlayer>();
		pointManager=this;
	}
	public static PointManager getPointManager()
	{
		if(pointManager!=null)
		{
			return pointManager;
		}
		else
		{
			new RuntimeException("PointManager还没有被初始化!");
			return null;
		}
	}
	private static PointManager pointManager=null;
	private static HashMap<String,KPPlayer> data;
	public void addKPPlayer(KPPlayer target,String name)
	{
		data.put(name, target);
	}
	public boolean containKPPlayer(String name)
	{
		if(data.containsKey(name))
			return true;
		else
			return false;
	}
	public void removeKPPlayer(String name)
	{
		data.remove(name);
	}
}