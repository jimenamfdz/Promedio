module mx.edu.utez.u2_t1_05_creacionform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.u2_t1_05_creacionform to javafx.fxml;
    exports mx.edu.utez.u2_t1_05_creacionform;
}