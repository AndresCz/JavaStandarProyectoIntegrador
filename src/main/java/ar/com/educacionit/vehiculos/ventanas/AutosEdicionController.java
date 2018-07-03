package ar.com.educacionit.vehiculos.ventanas;

import ar.com.educacionit.vehiculos.entidades.Auto;
import ar.com.educacionit.vehiculos.recursos.ArchivoLectura;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    public ComboBox<String> cbxAutosEdicionMarca;

    @FXML
    private ComboBox<?> cbxAutosEdicionModelo;

    @FXML
    private ComboBox<String> cbxAutosEdicionColor;

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
        if (formularioCompletado()){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmacion");
            alert.setHeaderText("Está a punto de guardar los datos");
            alert.setContentText("¿Desea continuar?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                Stage stage = (Stage) btnAutosEdicionCancelar.getScene().getWindow();
                Auto elAuto = new Auto(
                    String.valueOf(cbxAutosEdicionMarca.getValue()),
                    "",
                    "",
                    Integer.valueOf(txtAutosEdicionAlto.getText()),
                    Integer.valueOf(txtAutosEdicionAncho.getText()),
                    Integer.valueOf(txtAutosEdicionLargo.getText())
                );
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
    
    public void setMainApp(VentanaMaestraMain mainApp) {
        this.mainApp = mainApp;
    }
    private boolean formularioCompletado(){
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
        if(cbxAutosEdicionMarca.getValue()==null){
            mainApp.alertarSeleccion(cbxAutosEdicionMarca);
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
    @FXML
    private void cargarMarca(ActionEvent event){
        String marca;
        marca = cbxAutosEdicionMarca.getValue();
    }
    @FXML
    private void cargarModelo(ActionEvent event){
   
    }
    @FXML
    private void cargarColor(ActionEvent event){
   
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArchivoLectura archivoMarca = new ArchivoLectura("/home/andres/NetBeansProjects/JavaStandarProyectoIntegrador/src/main/java/ar/com/educacionit/vehiculos/recursos/marcas.txt");
        try {
            cbxAutosEdicionMarca.getItems().addAll(archivoMarca.leerArchivo());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        ArchivoLectura archivoColor = new ArchivoLectura("/home/andres/NetBeansProjects/JavaStandarProyectoIntegrador/src/main/java/ar/com/educacionit/vehiculos/recursos/colores.txt");
        try {
            cbxAutosEdicionColor.getItems().addAll(archivoColor.leerArchivo());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        cbxAutosEdicionModelo.getItems().removeAll(cbxAutosEdicionModelo.getItems());
        int año = Calendar.getInstance().get(Calendar.YEAR);
        ArrayList lista = new ArrayList();
        for(int i = 1985; i <= año; i++){
           lista.add(i);
        }
        cbxAutosEdicionModelo.getItems().addAll(lista);
        
    
    
    }
}
