package Controll.View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Controll.View.Components.Cards.DeliveryController;
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
   * @param card : receives a card and adds it to interface
   */
  private void addCard(AnchorPane card) {
    Cards.getChildren().add(card);
    Cards.setPrefHeight(Cards.getPrefHeight() + 150);
  }


  /** Creates a new delivery card 
   * @param address : delivery address
   * @param product : product to be delivery
   * @param quantity : quantity of the product in meters
   * @param responsible : person reponsible for the delivery
   * @param status : delivery status
   * @return : a new card 
   */
  private AnchorPane createDeliveryCard(String address, String product, String quantity, String responsible, String status) {
    AnchorPane deliveryCard = new AnchorPane(); 

    try {
      URL component_url = getClass().getResource("/View/Components/Cards/Delivery.fxml");
      FXMLLoader fxmlLoader = new FXMLLoader();

      deliveryCard = fxmlLoader.load(component_url.openStream());

      DeliveryController DC = (DeliveryController) fxmlLoader.getController();

      DC.setAddress(address);
      DC.setProduct(product);
      DC.setQuantity(quantity);
      DC.setResponsible(responsible);
      DC.setStatus(status);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return deliveryCard;
  }


  @Override
  public void initialize(URL location, ResourceBundle resources) { // Inicio do metodo Initialize

    ToggleSideBar.setOnAction(event -> { // Inicio do controle do botao voltar 
      addCard(createDeliveryCard("teste", "teste", "teste", "teste", "teste"));
    }); // Fim do controle do botao voltar

  }// Fim do metodo Initialize
}
