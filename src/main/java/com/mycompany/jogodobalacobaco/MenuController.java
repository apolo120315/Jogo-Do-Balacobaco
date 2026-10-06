package com.mycompany.jogodobalacobaco;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuController {

    @FXML private Button IniciarJogo;
    @FXML private Button Ranking;
    @FXML private Button Creditos;
    @FXML private Button Config;
    @FXML private Button Sair;

    @FXML
    private void initialize() {
        configurarHover(IniciarJogo);
        configurarHover(Ranking);
        configurarHover(Creditos);
        configurarHover(Config);
        configurarHover(Sair);
    }

    private void configurarHover(Button botao) {
        String estiloNormal =
            "-fx-background-color: rgba(0,0,0,0.45);" +
            "-fx-border-color: rgba(255,255,255,0.35);" +
            "-fx-border-width: 1.5px;" +
            "-fx-border-radius: 8px;" +
            "-fx-background-radius: 8px;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 14px;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;";

        String estiloHover =
            "-fx-background-color: rgba(70,130,180,0.85);" +
            "-fx-border-color: rgba(255,255,255,0.9);" +
            "-fx-border-width: 1.5px;" +
            "-fx-border-radius: 8px;" +
            "-fx-background-radius: 8px;" +
            "-fx-text-fill: white;" +
            "-fx-font-size: 14px;" +
            "-fx-font-weight: bold;" +
            "-fx-cursor: hand;";

        botao.setStyle(estiloNormal);

        DropShadow sombraNormal = new DropShadow(6, Color.rgb(0, 0, 0, 0.4));
        DropShadow sombraHover = new DropShadow(12, Color.rgb(70, 130, 180, 0.7));
        botao.setEffect(sombraNormal);

        botao.setOnMouseEntered((MouseEvent e) -> {
            botao.setStyle(estiloHover);
            botao.setScaleX(1.12);
            botao.setScaleY(1.12);
            botao.setEffect(sombraHover);
        });

        botao.setOnMouseExited((MouseEvent e) -> {
            botao.setStyle(estiloNormal);
            botao.setScaleX(1.0);
            botao.setScaleY(1.0);
            botao.setEffect(sombraNormal);
        });
    }

    @FXML
    private void selecaoDeHistoria() throws IOException {
        App.setRoot("selecao");
    }

    @FXML
    private void ranking() throws IOException {
        App.setRoot("ranking");
    }

    @FXML
    private void creditos() throws IOException {
        App.setRoot("creditos");
    }

    @FXML
    private void config() throws IOException {
        System.out.println("Configuração clicada");
    }

    @FXML
    private void fechar(ActionEvent event) {
        Stage stage = (Stage) Sair.getScene().getWindow();
        stage.close();
    }
}