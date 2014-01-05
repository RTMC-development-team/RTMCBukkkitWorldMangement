package com.rushteamc.plugin.bukkit.WorldMangement;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin
{
	/*
	 * TODO:
	 *   - Monitor player logout
	 *   - Monitor player world teleportations
	 *   - When players logs out or world teleports check if the world they left has any online players
	 *   - If no line players in the world unload the world and tag world with logout date.
	 *   - Monitor world creations.
	 *   - If total number of worlds is above configurable threshold try remove the world that has the longest time since last unload that is:
	 *     1) not listed in a configurable do not remove list.
	 *     2) currently not populated.
	 */
	
	public void onEnable()
	{
		;
	}
	
	public void onDisable()
	{
		;
	}
}
