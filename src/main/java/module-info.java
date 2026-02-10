module chess.fxchess {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens chess.fxchess to javafx.fxml;
    exports chess.fxchess;
}