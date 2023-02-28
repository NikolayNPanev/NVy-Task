module sit.tuvarna.bg.nvytask {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens sit.tuvarna.bg.nvytask to javafx.fxml;
    exports sit.tuvarna.bg.nvytask;
}