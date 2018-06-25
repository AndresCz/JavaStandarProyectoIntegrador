package ar.com.educacionit.vehiculos.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VendedorEdicionController implements Initializable {
    private VentanaMaestraMain mainApp;
    
    @FXML
    private TextField txtVendedorEdicionNombre;
    @FXML
    private TextField txtVendedorEdicionApellido;    
    @FXML
    private TextField txtVendedorEdicionNroDocumento;
    @FXML
    private TextField txtVendedorEdicionAutosVendidos;
    @FXML
    private Button btnVendedorEdicionAceptar;    
    @FXML
    private Button btnVendedorEdicionCancelar;
    @FXML
    void aceptarVendedorEdicion(ActionEvent event) {
        
    }
    @FXML
    void cancelarVendedorEdicion(ActionEvent event) {
        Stage stage = (Stage) btnVendedorEdicionCancelar.getScene().getWindow();
        stage.close();
        mainApp.setVentanaVendedorEdicionAbierta(false);
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setMainApp(VentanaMaestraMain mainApp) {
        this.mainApp = mainApp;
    }

    
    
}
