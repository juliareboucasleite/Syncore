module com.juju.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.juju.demo to javafx.fxml;
    exports com.juju.demo;
}