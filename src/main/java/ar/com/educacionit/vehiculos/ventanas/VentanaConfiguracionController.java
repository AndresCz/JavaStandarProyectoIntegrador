package ar.com.educacionit.vehiculos.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VentanaConfiguracionController implements Initializable {
    private VentanaMaestraMain mainApp;
    @FXML
    private TextField txtConfiguracionSitema;
    @FXML
    private TextField txtConfiguracionSO;
    @FXML
    private TextField txtConfiguracionUsuario;
    @FXML
    private TextField txtConfiguracionVersionJava;
    @FXML
    private Button btnCerrarConfiguracion;
   
    @FXML
    void cerrarVentanaConfiguracion(ActionEvent event) {
        Stage stage = (Stage) btnCerrarConfiguracion.getScene().getWindow();
        stage.close();
        mainApp.setVentanaConfiguracionAbierta(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtConfiguracionSitema.setText(System.getProperty("os.name")+" - "+System.getProperty("os.arch"));
        txtConfiguracionSO.setText(System.getProperty("os.version")); 
        txtConfiguracionUsuario.setText(System.getProperty("user.name"));
        txtConfiguracionVersionJava.setText("JDK: "+System.getProperty("java.version"));
    }    

    public void setMainApp(VentanaMaestraMain mainApp) {
        this.mainApp = mainApp;
    }
    
}
