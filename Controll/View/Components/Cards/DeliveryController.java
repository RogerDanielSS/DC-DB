package Controll.View.Components.Cards;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class DeliveryController implements Initializable{

    @FXML
    private AnchorPane Card;

    @FXML
    private Label quantity;

    @FXML
    private Label address;

    @FXML
    private Label responsible;

    @FXML
    private Label material;

    @FXML
    private Label status;

    public DeliveryController(){

    }

    /**
     * @return Delivery Card
     */
    public AnchorPane getCard(){
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
     * @param material : sets material on card 
     */
    public void setMaterial(String material) {
        this.material.setText(material);
    }


    /**
     * @param status : sets status on card 
     */
    public void setStatus(String status) {
        this.status.setText(status);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) { // Inicio do metodo Initialize
  
    }// Fim do metodo Initialize
}