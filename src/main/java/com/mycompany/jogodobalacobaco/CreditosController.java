package com.mycompany.jogodobalacobaco;

import java.io.IOException;
import javafx.fxml.FXML;

public class CreditosController {

    @FXML
    private void voltarAoMenu() throws IOException {
        App.setRoot("menu");
    }
}
