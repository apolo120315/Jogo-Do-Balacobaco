module com.mycompany.jogodobalacobaco {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.jogodobalacobaco to javafx.fxml;
    exports com.mycompany.jogodobalacobaco;
}
