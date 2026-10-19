package com.mycompany.jogodobalacobaco;

import java.io.IOException;
import javafx.fxml.FXML;

public class SelecaoHistoriaController {

    @FXML
    private void voltarAoMenu() throws IOException {
        App.setRoot("menu");
    }

    @FXML
    private void MundoOriental() throws IOException {
        App.setMundoSelecionado("oriental");
        App.setRoot("selecaoPersonagem");
    }

    @FXML
    private void MundoMagia() throws IOException {
        App.setMundoSelecionado("magia");
        App.setRoot("selecaoPersonagem");
    }
}