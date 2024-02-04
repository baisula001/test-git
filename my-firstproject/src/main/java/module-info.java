module com.example.myfirstproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.myfirstproject to javafx.fxml;
    exports com.example.myfirstproject;
}