module module {
	requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.base;
	requires java.desktop;

    opens View to javafx.graphics, javafx.fxml;
}