package ar.com.educacionit.vehiculos.ventanas;

import ar.com.educacionit.vehiculos.entidades.Auto;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Control;
import javafx.stage.Stage;

public class AutosEdicionController implements Initializable {
    
    private VentanaMaestraMain mainApp;
    
    @FXML
    private TextField txtAutosEdicionAlto;

    @FXML
    private TextField txtAutosEdicionLargo;
    
    @FXML
    private TextField txtAutosEdicionAncho;
    
    @FXML
    private ComboBox<?> cbxAutosEdicionMarca;

    @FXML
    private ComboBox<?> cbxAutosEdicionModelo;

    @FXML
    private ComboBox<?> cbxAutosEdicionColor;

    @FXML
    private TextField txtAutosEdicionPrecio;
  
    @FXML
    private TextArea txaAutosEdicionEquipamiento;

    @FXML
    private Button btnAutosEdicionAceptar;

    @FXML
    private Button btnAutosEdicionCancelar;

    @FXML
    void aceptarAutosEdicion(ActionEvent event) {
        if (isFormularioOK()){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmacion");
            alert.setHeaderText("Está a punto de guardar los datos");
            alert.setContentText("¿Desea continuar?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                Stage stage = (Stage) btnAutosEdicionCancelar.getScene().getWindow();
                Auto elAuto = new Auto("", "", "", Integer.valueOf(txtAutosEdicionAlto.getText()), Integer.valueOf(txtAutosEdicionAncho.getText()), Integer.valueOf(txtAutosEdicionLargo.getText()));
                stage.close();
                mainApp.setVentanaAutosEdicion(false);
            }
        }      
    }
        
    @FXML
    void cancelarAutosEdicion(ActionEvent event) {
    Stage stage = (Stage) btnAutosEdicionCancelar.getScene().getWindow();
        stage.close();
        mainApp.setVentanaAutosEdicion(false);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    public void setMainApp(VentanaMaestraMain mainApp) {
        this.mainApp = mainApp;
    }
    private boolean isFormularioOK(){
        try {
            Integer.parseInt(txtAutosEdicionAlto.getText());
        }catch (NumberFormatException e) {
            mainApp.alertarEntero(txtAutosEdicionAlto);
            return false;
        }
        try {
            Integer.parseInt(txtAutosEdicionLargo.getText());
        }catch (NumberFormatException e) {
            mainApp.alertarEntero(txtAutosEdicionLargo);
            return false;
        }
        try {
            Integer.parseInt(txtAutosEdicionAncho.getText());
        }catch (NumberFormatException e) {
            mainApp.alertarEntero(txtAutosEdicionAncho);
            return false;
        }

        try {
            Double.parseDouble(txtAutosEdicionPrecio.getText());
        }catch (NumberFormatException e) {
            mainApp.alertarDecimal(txtAutosEdicionPrecio);
            return false;
        }    
        if (txaAutosEdicionEquipamiento.getText().trim().isEmpty()){
            mainApp.alertarVacio(txaAutosEdicionEquipamiento);
            return false;
        }
        return true;
     }
    
    
}
