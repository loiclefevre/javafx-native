module javafx.demo.graalvm {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.swing;
	requires javafx.graphics;
	requires org.controlsfx.controls;
	requires com.dlsc.formsfx;
	requires org.kordamp.bootstrapfx.core;
	requires java.desktop;

	opens javafx.demo.graalvm to javafx.fxml, java.desktop;
	exports javafx.demo.graalvm;

	opens javafx.demo.graalvm.gui to javafx.fxml;
	exports javafx.demo.graalvm.gui;
}