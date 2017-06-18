package me.zhanshi123.KillerPoint;

import org.bukkit.entity.Player;

public class KPPlayer{
	Player p;
	int point=0;
	public KPPlayer(Player p,int point)
	{
		this.p=p;
		this.point=point;
	}
	public void addPoint(int amount)
	{
		point+=amount;
	}
	public boolean isClear()
	{
		if(point<=0)
			return true;
		else
			return false;
	}
	public void setPoint(int point)
	{
		this.point=point;
	}
	public int getPoint()
	{
		return point;
	}
	public Player getPlayer()
	{
		return p;
	}
}
