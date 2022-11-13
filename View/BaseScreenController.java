package View;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class BaseScreenController implements Initializable {

  @FXML
  private VBox Cards;

  @FXML
  private Button ToggleSideBar;

  /**
   * 
   */
  private void addCard() {
    try {

      AnchorPane card = (AnchorPane) FXMLLoader.load(getClass().getResource("/Components/Cards/Delivery.fxml"));
      Cards.getChildren().add(card);
      Cards.setPrefHeight(Cards.getPrefHeight() + 150);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) { // Inicio do metodo Initialize


    ToggleSideBar.setOnAction(event -> { // Inicio do controle do botao voltar
      addCard();
    }); // Fim do controle do botao voltar

  }// Fim do metodo Initialize
}
