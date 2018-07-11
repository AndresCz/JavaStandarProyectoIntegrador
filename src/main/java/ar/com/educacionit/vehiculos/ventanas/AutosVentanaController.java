package ar.com.educacionit.vehiculos.ventanas;

import ar.com.educacionit.vehiculos.entidades.Auto;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.collections.ObservableList;

public class AutosVentanaController implements Initializable{
    
    private VentanaMaestraMain mainApp;
    
    @FXML
    private Label lblAutoAlto;

    @FXML
    private Label lblLargo;

    @FXML
    private TableColumn<Auto, String> tblAutoModelo;

    @FXML
    private Label lblAutoPrecio;

    @FXML
    private Label lblPrecio;

    @FXML
    private Label lblAlto;

    @FXML
    private Label lblMarca;

    @FXML
    private Label lblAncho;

    @FXML
    private Label lblDatosDelAuto;

    @FXML
    private Label lblAutoModelo;

    @FXML
    private TableColumn<Auto, String> tblAutoMarca;

    @FXML
    private Label lblAutoColor;

    @FXML
    public TableView<Auto> tblAutoTable;

    @FXML
    private Label lblColor;

    @FXML
    private Label lblAutoMarca;

    @FXML
    private Label lblAutoLargo;

    @FXML
    private TextArea txtDescripcion;

    @FXML
    private Label lblModelo;

    @FXML
    private Label lblAutoAncho;
 
    @FXML
    private Button btnAutosNuevo;
    
    @FXML
    private Button btnAutosEditar;
    
    @FXML
    private Button btnAutosBorrar;
    
    @FXML
    private Button btnAutosCerrar;
    
    
    
    public ObservableList<Auto> autosLista = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
            tblAutoMarca.setCellValueFactory(cellData -> cellData.getValue().marcaProperty());
            tblAutoModelo.setCellValueFactory(cellData -> cellData.getValue().modeloProperty());

            // Listener para detectar el cambio de seleccion
            tblAutoTable.getSelectionModel().selectedItemProperty().addListener(
                    (observable, oldValue, newValue) -> mostarAutoDetalle(newValue));
            
            tblAutoTable.setItems(autosLista);
    }
    
    public void nuevoVentanaAutos(ActionEvent event) throws IOException{
        Stage stage = (Stage) btnAutosCerrar.getScene().getWindow();
        Auto auto = new Auto();
        mainApp.setAuto(auto);
        mainApp.abrirAutosEdicion();
        auto = mainApp.getAuto();
        autosLista.add(auto);
        tblAutoTable.getSelectionModel().select(auto);
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
    
    private void mostarAutoDetalle(Auto auto) {
        if (auto != null) {
            // Llena los Labels con los datos de la persona seleccionada.
            lblAutoAlto.setText(String.valueOf(auto.getAlto()));
            lblAutoAncho.setText(String.valueOf(auto.getAncho()));
            lblAutoLargo.setText(String.valueOf(auto.getLargo()));
            lblAutoMarca.setText(auto.getMarca());
            lblAutoModelo.setText(auto.getModelo());
            lblAutoColor.setText(auto.getColor());
            lblAutoPrecio.setText(auto.getEquipamiento());//TODO ingresar precio
        
        } else {
            // Person es null, limpiamos todos los labels.
            lblAutoAlto.setText("");
            lblAutoAncho.setText("");
            lblAutoLargo.setText("");
            lblAutoMarca.setText("");
            lblAutoModelo.setText("");
            lblAutoColor.setText("");
            lblAutoPrecio.setText("");
        }
    }

}
    
