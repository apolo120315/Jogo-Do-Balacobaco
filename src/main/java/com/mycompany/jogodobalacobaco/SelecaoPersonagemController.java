package com.mycompany.jogodobalacobaco;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SelecaoPersonagemController {

    @FXML private Label tituloLabel;
    @FXML private Button personagem1;
    @FXML private Button personagem2;
    @FXML private Button personagem3;
    @FXML private Button Voltar;

    @FXML
    private void initialize() {
        String mundo = App.getMundoSelecionado();

        if ("oriental".equals(mundo)) {
            tituloLabel.setText("Mundo Oriental - Escolha o personagem");
            personagem1.setText("Samurai");
            personagem2.setText("Ninja");
            personagem3.setText("Monge");
        } else if ("magia".equals(mundo)) {
            tituloLabel.setText("Mundo Magia - Escolha o personagem");
            personagem1.setText("Mago");
            personagem2.setText("Feiticeira");
            personagem3.setText("Druida");
        } else {
            tituloLabel.setText("Selecione o personagem");
            personagem1.setText("Personagem 1");
            personagem2.setText("Personagem 2");
            personagem3.setText("Personagem 3");
        }
    }

    @FXML
    private void escolherPersonagem1() {
        System.out.println("Escolheu: " + personagem1.getText() + " | Mundo: " + App.getMundoSelecionado());
    }

    @FXML
    private void escolherPersonagem2() {
        System.out.println("Escolheu: " + personagem2.getText() + " | Mundo: " + App.getMundoSelecionado());
    }

    @FXML
    private void escolherPersonagem3() {
        System.out.println("Escolheu: " + personagem3.getText() + " | Mundo: " + App.getMundoSelecionado());
    }

    @FXML
    private void voltarAoMenu() throws IOException {
        App.setRoot("selecao");
    }
}