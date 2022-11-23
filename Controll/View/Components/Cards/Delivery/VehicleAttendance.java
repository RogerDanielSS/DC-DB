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

public class VehicleAttendance implements Initializable{

    @FXML
    private Label client;

    @FXML
    private VBox Cards;

    @FXML
    private Button addNew;

    private void addCard(AnchorPane card) {
        Cards.getChildren().add(card);
        //Cards.setPrefHeight(Cards.getPrefHeight() + 150);
      }

      private AnchorPane createDeliveryCard() {
        AnchorPane deliveryCard = new AnchorPane();
    
        try {
          URL component_url = getClass().getResource("/View/Components/Cards/Delivery/VehicleDelivery.fxml");
          FXMLLoader fxmlLoader = new FXMLLoader();
    
          deliveryCard = fxmlLoader.load(component_url.openStream());
    
          VehicleDeliveryController VDC = (VehicleDeliveryController) fxmlLoader.getController();
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
