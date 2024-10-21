package javafx.demo.graalvm;

import javafx.application.Application;

import java.util.Locale;

/**
 * Application main entry point.
 *
 * @author Loïc Lefèvre
 *
 */
public class Main {
	public static void main(final String[] args) {
		// Better looking
		System.setProperty("prism.lcdtext", "false");

		// Standardize dates and numbers formatting
		Locale.setDefault(Locale.US);

		// Launch the JavaFX app
		Application.launch(JavaFXApplication.class, args);
	}
}
