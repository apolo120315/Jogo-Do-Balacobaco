package com.mycompany.jogodobalacobaco;

import java.io.IOException;
import javafx.fxml.FXML;

public class SelecaoPersonagemController {

    @FXML
    private void voltarAoMenu() throws IOException {
        App.setRoot("menu");
    }
}
