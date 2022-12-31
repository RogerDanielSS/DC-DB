package Controll.View.Components.Cards.Delivery;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class VehicleDeliveryScreenController implements Initializable{
    @FXML
    private VBox Cards;

    @FXML
    private Button addNew;

    @FXML
    private Button modalPane;

    @FXML
    private TextField VeiculoID_TextField;

    @FXML
    private Button backwardButton;

    @FXML
    private Button forwardButton;



    private void addCard(AnchorPane card) {
        Cards.getChildren().add(card);
    }

    private AnchorPane createAttendanceCard(String client) {
        AnchorPane attendanceCard = new AnchorPane();
    
        try {
          URL component_url = getClass().getResource("/View/Components/Cards/Delivery/VehicleAttendance.fxml");
          FXMLLoader fxmlLoader = new FXMLLoader();
    
          attendanceCard = fxmlLoader.load(component_url.openStream());
    
          VehicleAttendance VA = (VehicleAttendance) fxmlLoader.getController();
    
          VA.setClient(client);
    
        } catch (IOException e) {
          e.printStackTrace();
        }
    
        return attendanceCard;
      }
    
      private void clearModal() {
        VeiculoID_TextField.setText("");
      }
    
      private void toggleModal(){
        modalPane.setVisible(!modalPane.isVisible());
      }
    
      @Override
      public void initialize(URL location, ResourceBundle resources) {
    
        addNew.setOnAction(event -> {
          toggleModal();
        });
    
        backwardButton.setOnAction(event -> {
          toggleModal();
          clearModal();
        });
    
        forwardButton.setOnAction(event -> {
    
          String veiculo = VeiculoID_TextField.getText();
          AnchorPane attendanceCard = createAttendanceCard(veiculo);
    
          addCard(attendanceCard);
    
          toggleModal();
          clearModal();
        });
    }
}
