package Controll.View.Components.Cards.Delivery;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class DeliveryScreenController implements Initializable {

  @FXML
  private Button backwardButton;

  @FXML
  private ChoiceBox<String> product_ChoiceBox;

  @FXML
  private TextField address_TextField;

  @FXML
  private Button modalPane;

  @FXML
  private TextField client_TextField;

  @FXML
  private Button forwardButton;

  @FXML
  private TextField quantity_TextField;

  @FXML
  private Button addNew;

  @FXML
  private VBox Cards;

  String products[] = {"Areia", "Arenoso", "Cascalho", "Brita", "Areia branca"};
  
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
  private AnchorPane createDeliveryCard(String address, String product, String quantity) {
    AnchorPane deliveryCard = new AnchorPane(); 

    try {
      URL component_url = getClass().getResource("/View/Components/Cards/Delivery/Delivery.fxml");
      FXMLLoader fxmlLoader = new FXMLLoader();

      deliveryCard = fxmlLoader.load(component_url.openStream());

      DeliveryController DC = (DeliveryController) fxmlLoader.getController();

      DC.setAddress(address);
      DC.setProduct(product);
      DC.setQuantity(quantity);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return deliveryCard;
  }

  private void clearModal(){
    address_TextField.setText("");
    product_ChoiceBox.setValue(null);
    quantity_TextField.setText("");
    client_TextField.setText("");
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    product_ChoiceBox.getItems().setAll(products);

    addNew.setOnAction(event -> { 
      modalPane.setVisible(true);
    }); 

    backwardButton.setOnAction(event -> { 
      modalPane.setVisible(false);
      clearModal();
    }); 

    forwardButton.setOnAction(event -> { 
      String address = address_TextField.getText();
      String product = product_ChoiceBox.getValue();
      String quantity = quantity_TextField.getText();

      AnchorPane deliveryCard = createDeliveryCard(address, product, quantity);
      addCard(deliveryCard);

      modalPane.setVisible(false);
      clearModal();
    }); 
  }
}
