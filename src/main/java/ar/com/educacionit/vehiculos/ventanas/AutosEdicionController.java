package ar.com.educacionit.vehiculos.ventanas;

import ar.com.educacionit.vehiculos.entidades.Auto;
import ar.com.educacionit.vehiculos.recursos.ArchivoLectura;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
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
import javafx.stage.Stage;

public class AutosEdicionController extends AutosVentanaController implements Initializable{
    
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
    private ComboBox<String> cbxAutosEdicionModelo;

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
                try{
                Auto auto = mainApp.getAuto();
                auto.setAlto(Integer.parseInt(txtAutosEdicionAlto.getText()));
                auto.setAncho(Integer.parseInt(txtAutosEdicionAncho.getText()));
                auto.setLargo(Integer.parseInt(txtAutosEdicionLargo.getText()));
                auto.setMarca(cbxAutosEdicionMarca.getValue());
                auto.setModelo(cbxAutosEdicionModelo.getValue());
                auto.setColor(cbxAutosEdicionColor.getValue());
                auto.setPrecio(Integer.parseInt(txtAutosEdicionPrecio.getText()));
                auto.setEquipamiento(txaAutosEdicionEquipamiento.getText());
                Stage stage = (Stage) btnAutosEdicionCancelar.getScene().getWindow();
                stage.close();
                mainApp.setVentanaAutosEdicion(false);
                }catch(Exception error){
                    System.out.println("Error : "+error);
                }
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
        String modelo;
        modelo = cbxAutosEdicionModelo.getValue();
    }
    @FXML
    private void cargarColor(ActionEvent event){
        String color;
        color = cbxAutosEdicionColor.getValue();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArchivoLectura archivoMarca = new ArchivoLectura("/home/andres/NetBeansProjects/JavaStandarProyectoIntegrador/src/main/java/ar/com/educacionit/vehiculos/recursos/marcas.txt");
        try {
            cbxAutosEdicionMarca.getItems().addAll(archivoMarca.leerArchivo());
        } catch (IOException e) {
            System.out.println(e);
        }
        
        ArchivoLectura archivoColor = new ArchivoLectura("/home/andres/NetBeansProjects/JavaStandarProyectoIntegrador/src/main/java/ar/com/educacionit/vehiculos/recursos/colores.txt");
        try {
            cbxAutosEdicionColor.getItems().addAll(archivoColor.leerArchivo());
        } catch (IOException e) {
            System.out.println(e);
        }
        
        cbxAutosEdicionModelo.getItems().removeAll(cbxAutosEdicionModelo.getItems());
        int año = Calendar.getInstance().get(Calendar.YEAR);
        ArrayList<String> lista = new ArrayList();
        for(int i = 1985; i <= año; i++){
           lista.add(String.valueOf(i));
        }
        cbxAutosEdicionModelo.getItems().addAll(lista);
  
    }

}
