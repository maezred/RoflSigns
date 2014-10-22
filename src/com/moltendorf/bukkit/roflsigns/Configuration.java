package com.moltendorf.bukkit.roflsigns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
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

		final protected Set<UUID> players = new HashSet<>(Arrays.asList(
			UUID.fromString("89554931-504c-46b4-9809-63cee1436d14"),    // roflcopterss99
			UUID.fromString("501b67c9-4021-4ae5-a1e0-40f856d7606a")     // moltendorf
		));

	}

	// Final data.
	final protected Global global = new Global();

	public Configuration() {

		// Placeholder.
	}
}
