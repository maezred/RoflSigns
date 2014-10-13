package com.moltendorf.bukkit.roflsigns;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;

/**
 * Listener register.
 *
 * @author moltendorf
 */
public class Listeners implements Listener {

	final protected Plugin plugin;

	protected Listeners(final Plugin instance) {
		plugin = instance;
	}

	@EventHandler(priority = EventPriority.LOWEST)
	public void BlockPlaceEventLowestHandler(final BlockPlaceEvent event) {
		if (!event.getPlayer().getName().equals("roflcopterss99")) {
			return;
		}

		if (event.getBlockPlaced().getType() == Material.SIGN_POST) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void BlockPlaceEventHighestHandler(final BlockPlaceEvent event) {
		if (!event.getPlayer().getName().equals("roflcopterss99")) {
			return;
		}

		if (event.isCancelled()) {
			if (event.getBlockPlaced().getType() == Material.SIGN_POST) {
				event.setCancelled(false);
			}
		}
	}

	@EventHandler(priority = EventPriority.LOWEST)
	public void SignChangeEventLowestHandler(final SignChangeEvent event) {
		if (!event.getPlayer().getName().equals("roflcopterss99")) {
			return;
		}

		event.setCancelled(true);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void SignChangeEventHighestHandler(final SignChangeEvent event) {
		if (!event.getPlayer().getName().equals("roflcopterss99")) {
			return;
		}

		if (event.isCancelled()) {
			event.setCancelled(false);
		}
	}
}
