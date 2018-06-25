package ar.com.educacionit.vehiculos.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CompradoresVentanaController implements Initializable{
    @FXML
    private Button btnCompradorNuevo;
    
    private VentanaMaestraMain mainApp;
        
    @FXML
    private Button btnCompradorCerrar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    @FXML
    void abrirCompradorEdicion(ActionEvent event) {
        mainApp.abrirCompradorEdicion();
    }
    @FXML
    void cerrarVentanaComprador(ActionEvent event) {
        Stage stage = (Stage) btnCompradorCerrar.getScene().getWindow();
        stage.close();
        mainApp.setVentanaCompradoresAbierta(false);
    }

    public void setMainApp(VentanaMaestraMain mainApp) {
        this.mainApp = mainApp;
    }
    
}
