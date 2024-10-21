package javafx.demo.graalvm;

import javafx.demo.graalvm.gui.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * the JavaFX application.
 *
 * @author Loïc Lefèvre
 */
public class JavaFXApplication extends Application {

	static Controller guiController;

	public JavaFXApplication() {
		super();
	}

	@Override
	public void start(Stage stage) throws Exception {
		final FXMLLoader fxmlLoader = new FXMLLoader(JavaFXApplication.class.getResource("main-view.fxml"));
		final Parent parent = fxmlLoader.load();
		final Scene scene = new Scene(parent, -1f, -1f, false, SceneAntialiasing.BALANCED);
		stage.setResizable(false);
		stage.setScene(scene);
		stage.setTitle("JavaFX native image with GraalVM!");
		stage.getIcons().add(new Image(Objects.requireNonNull(JavaFXApplication.class.getResourceAsStream("icon.png"))));

		guiController = fxmlLoader.getController();
		guiController.initialize();
		stage.show();
	}
}