package javafx.demo.graalvm.gui;

import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * GUI controller for widgets.
 *
 * @author Loïc Lefèvre
 */
public class Controller {
	private boolean needsInitialization = true;

	public void initialize() {
		if (needsInitialization) {
			needsInitialization = false;
		}
	}

	@FXML
	private void openLinkDownload() {
		try {
			Desktop.getDesktop().browse(new URI("https://www.graalvm.org/downloads/"));
		}
		catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
	@FXML
	private void openLinkGetStarted() {
		try {
			Desktop.getDesktop().browse(new URI("https://www.graalvm.org/latest/docs/getting-started/"));
		}
		catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}