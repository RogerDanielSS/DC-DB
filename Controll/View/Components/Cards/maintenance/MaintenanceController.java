package Controll.View.Components.Cards.maintenance;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MaintenanceController implements Initializable {

    @FXML
    private TextField data;

    @FXML
    private Button ToggleEdit;

    @FXML
    private TextField data1;

    @FXML
    private TextArea description;

    @FXML
    private TextField vehicle1;

    @FXML
    private TextField vehicle;

    String products[] = {"Areia", "Arenoso", "Cascalho", "Brita", "Areia branca"};

    /**
     * Creates a new card parsing no attribute
     */
    public MaintenanceController() {
    }

    /**
     * @param quantity : sets quantity on card
     */
    public void setVehicle(String vehicle) {
        this.vehicle.setText(vehicle);
    }

    /**
     * @param address : sets address on card
     */
    public void setData(String data) {
        this.data.setText(data);
    }

    /**
     * @param responsible : sets responsible on card
     */
    public void setDescription(String description) {
        this.description.setText(description);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) { // Inicio do metodo Initialize

    }// Fim do metodo Initialize
}