package controll.view.components.cards.delivery;

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

public class DeliveryScreenController implements Initializable {

  @FXML
  private Button backwardButton;

  @FXML
  private Button modalPane;

  @FXML
  private TextField client_TextField;

  @FXML
  private Button forwardButton;

  @FXML
  private Button addNew;

  @FXML
  private VBox Cards;

  /**
   * @param card : receives a card and adds it to interface
   */
  private void addCard(AnchorPane card) {
    Cards.getChildren().add(card);
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
  private AnchorPane createAttendanceCard(String client) {
    AnchorPane attendanceCard = new AnchorPane();

    try {
      URL component_url = getClass().getResource("/View/Components/Cards/Delivery/Attendance.fxml");
      FXMLLoader fxmlLoader = new FXMLLoader();

      attendanceCard = fxmlLoader.load(component_url.openStream());

      AttendanceController AC = (AttendanceController) fxmlLoader.getController();

      AC.setClient(client);

    } catch (IOException e) {
      e.printStackTrace();
    }

    return attendanceCard;
  }

  private void clearModal() {
    client_TextField.setText("");
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

      String client = client_TextField.getText();
      AnchorPane attendanceCard = createAttendanceCard(client);

      addCard(attendanceCard);

      toggleModal();
      clearModal();
    });
  }
}
