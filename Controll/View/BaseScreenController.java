package Controll.View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Controll.View.Components.Cards.DeliveryController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
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
      URL component_url = getClass().getResource("/View/Components/Cards/Delivery.fxml");
      FXMLLoader card = new FXMLLoader();
      // AnchorPane the_card = FXMLLoader.load(component_url);


      AnchorPane the_card = card.load(component_url.openStream());
      

      DeliveryController DC = (DeliveryController) card.getController();
      DC.setAddress("UESB");
      DC.setMaterial("Areia");
      DC.setQuantity("14");
      DC.setResponsible("Roger");
      DC.setStatus("Aguardando");


      // card.setController(DC);
      Cards.getChildren().add(the_card);
      Cards.setPrefHeight(Cards.getPrefHeight() + 150);
    } catch (IOException e) {
      // TODO Auto-generated catch block
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
