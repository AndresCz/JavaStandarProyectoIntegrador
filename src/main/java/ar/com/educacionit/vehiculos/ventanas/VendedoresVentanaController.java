/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author andres
 */
public class VendedoresVentanaController implements Initializable{
    
    private VentanaMaestraMain mainApp;
    @FXML
    private Button btnVendedorNuevo;
    @FXML
    private Button btnVendedorCerrar;

    @FXML
    public void nuevoVendedorVentana(ActionEvent event) {
        mainApp.abrirVendedorEdicion();
    }

    public void cerrarVentanaVendedor(ActionEvent event){
        Stage stage = (Stage) btnVendedorCerrar.getScene().getWindow();
        stage.close();
        mainApp.setVentanaVendedoresAbierta(false);    
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void setMainApp(VentanaMaestraMain mainApp) {
        this.mainApp = mainApp;
    }
    
}
