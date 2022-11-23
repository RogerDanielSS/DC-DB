package controll.view.components.cards.delivery;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class AttendanceController implements Initializable {

  @FXML
  private Label client;

  @FXML
  private Button addNew;

  @FXML
  private VBox Cards;

  String products[] = { "Areia", "Arenoso", "Cascalho", "Brita", "Areia branca" };

  /**
   * @param card : receives a card and adds it to interface
   */
  private void addCard(AnchorPane card) {
    Cards.getChildren().add(card);
    //Cards.setPrefHeight(Cards.getPrefHeight() + 150);
  }

  /**
   * Creates a new delivery card
   * 
   * @param address     : delivery address
   * @param product     : product to be delivery
   * @param quantity    : quantity of the product in meters
   * @param responsible : person reponsible for the delivery
   * @param status      : delivery status
   * @return : a new card
   */
  private AnchorPane createDeliveryCard() {
    AnchorPane deliveryCard = new AnchorPane();

    try {
      URL component_url = getClass().getResource("/View/Components/Cards/Delivery/Delivery.fxml");
      FXMLLoader fxmlLoader = new FXMLLoader();

      deliveryCard = fxmlLoader.load(component_url.openStream());

      DeliveryController DC = (DeliveryController) fxmlLoader.getController();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return deliveryCard;
  }

  public void setClient(String client){
    this.client.setText(client);
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    addNew.setOnAction(event -> { 
      AnchorPane sampleCard = createDeliveryCard();
      addCard(sampleCard);
    }); 
  }
}
