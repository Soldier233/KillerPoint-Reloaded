package me.zhanshi123.KillerPoint.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.zhanshi123.KillerPoint.KPPlayer;

public class PointChangedEvent extends Event{
	KPPlayer kpplayer;
	Player player;
	int amount=0;
	private static final HandlerList handlers = new HandlerList();
	public HandlerList getHandlers() 
	{
		return handlers;
	}
	public static HandlerList getHandlerList() 
	{
	    return handlers;
	}
	public PointChangedEvent(KPPlayer player,int amount)
	{
		this.kpplayer=player;
		this.player=player.getPlayer();
		this.amount=amount;
	}
    public KPPlayer getKPPlayer() {
        return kpplayer;
    }
    public Player getPlayer()
    {
    	return player;
    }
    public int getChangedValue()
    {
    	return amount;
    }
}
