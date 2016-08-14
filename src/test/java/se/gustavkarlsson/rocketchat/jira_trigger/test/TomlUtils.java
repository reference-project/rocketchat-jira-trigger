package se.gustavkarlsson.rocketchat.jira_trigger.test;

import com.moandjiezana.toml.Toml;
import se.gustavkarlsson.rocketchat.jira_trigger.configuration.ConfigurationTest;

import java.io.InputStream;

public class TomlUtils {

	private static Toml minimal;
	private static Toml defaults;

	public synchronized static Toml getMinimalToml() throws Exception {
		if (minimal == null) {
			InputStream minimalFile = ConfigurationTest.class.getClassLoader().getResourceAsStream("minimal.toml");
			minimal = new Toml().read(minimalFile);
		}
		return minimal;
	}

	public synchronized static Toml getDefaultsToml() throws Exception {
		if (defaults == null) {
			InputStream defaultFile = ConfigurationTest.class.getClassLoader().getResourceAsStream("defaults.toml");
			defaults = new Toml().read(defaultFile);
		}
		return defaults;
	}
}