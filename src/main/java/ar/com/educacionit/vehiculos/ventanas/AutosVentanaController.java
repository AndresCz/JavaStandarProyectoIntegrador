package ar.com.educacionit.vehiculos.ventanas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AutosVentanaController implements Initializable{
    
    private VentanaMaestraMain mainApp;
 
    @FXML
    private Button btnAutosNuevo;
    
    @FXML
    private Button btnAutosEditar;
    
    @FXML
    private Button btnAutosBorrar;
    
    @FXML
    private Button btnAutosCerrar;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
   
    
    public void nuevoVentanaAutos(ActionEvent event) throws IOException{
        mainApp.abrirAutosEdicion();
    }
    
    
    public void editarVentanaAutos(ActionEvent event) {
    }

    
    public void borrarVentanaAutos(ActionEvent event) {
    }
    
    public void cerrarVentanaAutos(ActionEvent event){
        Stage stage = (Stage) btnAutosCerrar.getScene().getWindow();
        stage.close();
        mainApp.setVentanaAutosAbierta(false);
    }
    
    public void setMainApp(VentanaMaestraMain mainApp) {
        this.mainApp = mainApp;
    }
    
}
    
