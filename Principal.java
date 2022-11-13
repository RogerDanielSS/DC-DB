/* ***************************************************************
* Autor............: Roger Daniel Santana Simões
* Matricula........: 202010022
* Inicio...........: 09/01/2022
* Ultima alteracao.: 10/01/2022
* Nome.............: Placar
* Funcao...........: Este programa registra placares de partidas de jogos entre duas equipes
*************************************************************** */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application { // Inicio da classe Principal
  /*
   * ***************************************************************
   * Metodo: main
   * Funcao: metodo padrao que executa o programa
   * Parametros: Vetor de Strings chamado args
   * Retorno: vazio
   */
  public static void main(String[] args) throws Exception { // inicio do metodo main
    launch(args);
  }// fim do metodo main

  /*
   * ***************************************************************
   * Metodo: start
   * Funcao: metodo de Aplication sobrescrito que carrega o palco
   * Parametros: Um Stage, do javaFX
   * Retorno: vazio
   */
  @Override
  public void start(Stage stage) throws Exception { // inicio do metodo start
    Parent root = FXMLLoader.load(getClass().getResource("View/BaseScreen.fxml"));
    Scene Scene = new Scene(root);
    stage.setScene(Scene);
    stage.setResizable(false);
    stage.show();
  } // fim do metodo start
} // Fim da classe Principal