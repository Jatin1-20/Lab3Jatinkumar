module com.example.lab3jatinkumar {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.lab3jatinkumar to javafx.fxml;
    exports com.example.lab3jatinkumar;
}