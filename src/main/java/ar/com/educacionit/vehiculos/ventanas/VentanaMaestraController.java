package ar.com.educacionit.vehiculos.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class VentanaMaestraController implements Initializable {

    private VentanaMaestraMain mainApp;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void abrirVentanaAutos(ActionEvent event) {
        this.mainApp.abrirVentanaAutos();
    }
    
    @FXML
    private void abrirVentanaVendedores(ActionEvent event) {
        this.mainApp.abrirVentanaVendedores();
    }
    
    @FXML
    private void abrirVentanaCompradores(ActionEvent event) {
        this.mainApp.abrirVentanaCompradores();
    }
    @FXML
    private void cerrarPrograma(ActionEvent event){
        System.exit(0);
    }
    @FXML
    private void abrirVentanaConfiguracion(ActionEvent event){
        this.mainApp.abrirVentanaConfiguracion();
    }
    
    public void setMainApp(VentanaMaestraMain mainApp) {
        this.mainApp = mainApp;
    }
    
    
    
}
