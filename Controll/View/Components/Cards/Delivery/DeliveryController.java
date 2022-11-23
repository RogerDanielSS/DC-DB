package controll.view.components.cards.delivery;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeliveryController implements Initializable {

    @FXML
    private AnchorPane Card;

    @FXML
    private TextField quantity, address, product;

    @FXML
    private Label responsible;

    @FXML
    private Label status;

    @FXML
    private Button catchButton;

    @FXML
    private ChoiceBox<String> product_ChoiceBox;

    String products[] = { "Areia", "Arenoso", "Cascalho", "Brita", "Areia branca" };

    /**
     * Creates a new card parsing all the attributes
     * 
     * @param address     : delivery address
     * @param product     : product to be delivery
     * @param quantity    : quantity of the product in meters
     * @param responsible : person reponsible for the delivery
     * @param status      : delivery status
     */
    public DeliveryController(String address, String product, String quantity, String responsible, String status) {
        this.setAddress(address);
        this.setProduct(product);
        this.setQuantity(quantity);
        this.setResponsible(responsible);
        this.setStatus(status);
    }

    /**
     * Creates a new card parsing no attribute
     */
    public DeliveryController() {
    }

    /**
     * @return Delivery Card
     */
    public AnchorPane getCard() {
        return this.Card;
    }

    /**
     * @param quantity : sets quantity on card
     */
    public void setQuantity(String quantity) {
        this.quantity.setText(quantity);
    }

    /**
     * @param address : sets address on card
     */
    public void setAddress(String address) {
        this.address.setText(address);
    }

    /**
     * @param responsible : sets responsible on card
     */
    public void setResponsible(String responsible) {
        this.responsible.setText(responsible);
    }

    /**
     * @param product : sets product on card
     */
    public void setProduct(String product) {
        this.product.setText(product);
    }

    /**
     * @param status : sets status on card
     */
    public void setStatus(String status) {
        this.status.setText(status);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        product_ChoiceBox.getItems().setAll(products);

        catchButton.setOnAction(event -> {
            status.setText("null");

        });
    }
}