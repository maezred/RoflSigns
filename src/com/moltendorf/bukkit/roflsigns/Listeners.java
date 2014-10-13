package com.moltendorf.bukkit.roflsigns;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.inventory.ItemStack;

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
	public void BlockBreakEventLowestHandler(final BlockBreakEvent event) {
		if (event.getBlock().getType() == Material.SIGN_POST) {
			if (!event.getPlayer().getName().equals("roflcopterss99")) {
				return;
			}

			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void BlockBreakEventHighestHandler(final BlockBreakEvent event) {
		if (event.isCancelled()) {
			if (event.getBlock().getType() == Material.SIGN_POST) {
				if (!event.getPlayer().getName().equals("roflcopterss99")) {
					return;
				}

				event.setCancelled(false);
			}
		}
	}

	@EventHandler(priority = EventPriority.LOWEST)
	public void BlockPlaceEventLowestHandler(final BlockPlaceEvent event) {
		if (event.getBlockPlaced().getType() == Material.SIGN_POST) {
			if (!event.getPlayer().getName().equals("roflcopterss99")) {
				return;
			}

			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void BlockPlaceEventHighestHandler(final BlockPlaceEvent event) {
		if (event.isCancelled()) {
			if (event.getBlockPlaced().getType() == Material.SIGN_POST) {
				if (!event.getPlayer().getName().equals("roflcopterss99")) {
					return;
				}

				final ItemStack item = event.getItemInHand();

				if (item.getType() == Material.SIGN && item.getAmount() < 2) {
					item.setAmount(2);
				}

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
		if (event.isCancelled()) {
			if (!event.getPlayer().getName().equals("roflcopterss99")) {
				return;
			}

			event.setCancelled(false);
		}
	}
}
