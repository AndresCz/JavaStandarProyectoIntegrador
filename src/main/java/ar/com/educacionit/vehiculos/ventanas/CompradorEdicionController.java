package ar.com.educacionit.vehiculos.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CompradorEdicionController implements Initializable {
    private VentanaMaestraMain mainApp;
    @FXML
    private TextField txtCompradorEdicionNombre;
    @FXML
    private TextField txtCompradorEdicionApellido;
    @FXML
    private TextField txtCompradorEdicionNroDocumento;
    @FXML
    private TextField txtCompradorEdicionPresupuesto;    
    @FXML
    private Button btnCompradorEdicionAceptar;
    @FXML
    private Button btnCompradorEdicionCancelar;
   
    @FXML
    void aceptarCompradorEdicion(ActionEvent event) {
        
    }
    @FXML
    void cancelarCompradorEdicion(ActionEvent event) {
        Stage stage = (Stage) btnCompradorEdicionCancelar.getScene().getWindow();
        stage.close();
        mainApp.setVentanaCompradorEdicionAbierta(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setMainApp(VentanaMaestraMain mainApp) {
        this.mainApp = mainApp;
    }
    
}
