package com.moltendorf.bukkit.roflsigns;

import java.util.UUID;

/**
 * Configuration class.
 *
 * @author moltendorf
 */
public class Configuration {

	static protected class Global {

		// Final data.
		final protected boolean enabled = true; // Whether or not the plugin is enabled at all; useful for using it as an interface (default is true).

		final protected UUID player = UUID.fromString("89554931-504c-46b4-9809-63cee1436d14");

	}

	// Final data.
	final protected Global global = new Global();

	public Configuration() {

		// Placeholder.
	}
}
