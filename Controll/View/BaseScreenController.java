package Controll.View;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BaseScreenController implements Initializable {

  @FXML
  private Button turnOnSideBar, turnOffSideBar;

  @FXML
  private Button deliveryButton;

  @FXML
  private VBox Cards;

  @FXML
  private Button ProductsButton;
  
  @FXML
  private HBox sideBar;    
  
  @FXML
  private AnchorPane base;

  private void ToggleSideBar(){
    sideBar.setVisible(!sideBar.isVisible());
  }

  private void setBasePane() {
    try {
      URL component_url = getClass().getResource("/View/Components/Cards/Delivery/DeliveryBaseScreen.fxml");
      AnchorPane pane = (AnchorPane) FXMLLoader.load(component_url);
      base.getChildren().setAll(pane);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }




  @Override
  public void initialize(URL location, ResourceBundle resources) {

    turnOffSideBar.setOnAction(event -> {
      ToggleSideBar();
    });

    turnOnSideBar.setOnAction(event -> {
      ToggleSideBar();
    });

    deliveryButton.setOnAction(event -> {
      setBasePane();
      ToggleSideBar();
    });

  }
}
