package com.mycompany.jogodobalacobaco;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author aluno
 */
public class ConfigController {
    
    
    @FXML
    private void voltarAoMenu() throws IOException {
        App.setRoot("menu");
    }
}
