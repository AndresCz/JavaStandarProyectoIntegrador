package ar.com.educacionit.vehiculos.ventanas;

import ar.com.educacionit.vehiculos.entidades.Auto;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Control;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VentanaMaestraMain extends Application{

    private Stage primaryStage;
    private BorderPane ventanaMaestra;
    private boolean ventanaAutosAbierta=false;
    private boolean ventanaVendedoresAbierta=false;
    private boolean ventanaCompradoresAbierta=false;
    private boolean ventanaAutosEdicion=false;
    private boolean ventanaConfiguracionAbierta=false;
    private boolean ventanaCompradorEdicionAbierta=false;
    private boolean ventanaVendedorEdicionAbierta=false;
    
    private Auto auto;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Ventana Maestra");
        initVentanaMaestra();

    }
    
    public void initVentanaMaestra(){
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/VentanaMaestra.fxml"));
            ventanaMaestra = (BorderPane) loader.load();
            VentanaMaestraController controlador = loader.getController();
            controlador.setMainApp(this);
            Scene scene = new Scene(ventanaMaestra);
            primaryStage.setTitle("Proyecto Integrador");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public void abrirVentanaAutos() {
        try {
            if(!ventanaAutosAbierta){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/AutosVentana.fxml"));
            AnchorPane ventanaAutos = (AnchorPane) loader.load();
            AutosVentanaController controladorAutos = loader.getController();
            controladorAutos.setMainApp(this);
            Stage autosStage = new Stage();
            Scene scene = new Scene(ventanaAutos);
            autosStage.setTitle("Autos");
            autosStage.setScene(scene);
            autosStage.show();
            setVentanaAutosAbierta(true);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    public void abrirVentanaVendedores(){
        try {
            if(!ventanaVendedoresAbierta){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/VendedoresVentana.fxml"));
            AnchorPane ventanaVendedores = (AnchorPane) loader.load();
            VendedoresVentanaController controladorVendedores = loader.getController();
            controladorVendedores.setMainApp(this);
            Stage vendedoresStage = new Stage();
            Scene scene = new Scene(ventanaVendedores);
            vendedoresStage.setTitle("Vendedores");
            vendedoresStage.setScene(scene);
            vendedoresStage.show();
            setVentanaVendedoresAbierta(true);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void abrirVentanaCompradores(){
        try {
            if(!ventanaCompradoresAbierta){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/CompradoresVentana.fxml"));
            AnchorPane ventanaCompradores = (AnchorPane) loader.load();
            CompradoresVentanaController controladorCompradores = loader.getController();
            controladorCompradores.setMainApp(this);
            Stage compradoresStage = new Stage();
            Scene scene = new Scene(ventanaCompradores);
            compradoresStage.setTitle("Compradores");
            compradoresStage.setScene(scene);
            compradoresStage.show();
            setVentanaCompradoresAbierta(true);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void abrirVentanaConfiguracion(){
        try {
            if(!ventanaConfiguracionAbierta){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/VentanaConfiguracion.fxml"));
            AnchorPane ventanaConfiguracion = (AnchorPane) loader.load();
            VentanaConfiguracionController controladorConfiguracion = loader.getController();
            controladorConfiguracion.setMainApp(this);
            Stage configuracionStage = new Stage();
            Scene scene = new Scene(ventanaConfiguracion);
            configuracionStage.setTitle("Configuracion");
            configuracionStage.setScene(scene);
            configuracionStage.show();
            setVentanaConfiguracionAbierta(true);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void abrirAutosEdicion(){
        try {
            if(!ventanaAutosEdicion){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/AutosEdicion.fxml"));
            AnchorPane autosEdicion = (AnchorPane) loader.load();
            AutosEdicionController controladorAutosEdicion = loader.getController();
            controladorAutosEdicion.setMainApp(this);
            Stage autosEdicionStage = new Stage();
            Scene scene = new Scene(autosEdicion);
            autosEdicionStage.setTitle("Nuevo Auto");
            autosEdicionStage.setScene(scene);
            setVentanaAutosEdicion(true);
            autosEdicionStage.showAndWait();
            
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public void abrirVendedorEdicion(){
        try {
            if(!ventanaVendedorEdicionAbierta){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/VendedorEdicion.fxml"));
            AnchorPane vendedorEdicion = (AnchorPane) loader.load();
            VendedorEdicionController controladorVendedorEdicion = loader.getController();
            controladorVendedorEdicion.setMainApp(this);
            Stage vendedorEdicionStage = new Stage();
            Scene scene = new Scene(vendedorEdicion);
            vendedorEdicionStage.setTitle("Nuevo Vendedor");
            vendedorEdicionStage.setScene(scene);
            vendedorEdicionStage.show();
            setVentanaVendedorEdicionAbierta(true);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public void abrirCompradorEdicion(){
        try {
            if(!ventanaCompradorEdicionAbierta){
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/CompradorEdicion.fxml"));
            AnchorPane compradorEdicion = (AnchorPane) loader.load();
            CompradorEdicionController controladorCompradorEdicion = loader.getController();
            controladorCompradorEdicion.setMainApp(this);
            Stage compradorEdicionStage = new Stage();
            Scene scene = new Scene(compradorEdicion);
            compradorEdicionStage.setTitle("Nuevo Comprador");
            compradorEdicionStage.setScene(scene);
            compradorEdicionStage.show();
            setVentanaCompradorEdicionAbierta(true);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        launch(args);
    }    

    public void setVentanaAutosAbierta(boolean ventanaAutosAbierta) {
        this.ventanaAutosAbierta = ventanaAutosAbierta;
    }
    public void setVentanaVendedoresAbierta(boolean ventanaVendedoresAbierta) {
        this.ventanaVendedoresAbierta = ventanaVendedoresAbierta;
    }
    public void setVentanaCompradoresAbierta(boolean ventanaCompradoresAbierta){
        this.ventanaCompradoresAbierta = ventanaCompradoresAbierta;
    }

    public void setVentanaAutosEdicion(boolean ventanaAutosEdicion) {
        this.ventanaAutosEdicion = ventanaAutosEdicion;
    }

    public void setVentanaConfiguracionAbierta(boolean ventanaConfiguracionAbierta) {
        this.ventanaConfiguracionAbierta = ventanaConfiguracionAbierta;
    }
    
    public void setVentanaCompradorEdicionAbierta(boolean ventanaCompradorEdicionAbierta) {
        this.ventanaCompradorEdicionAbierta = ventanaCompradorEdicionAbierta;
    }

    public void setVentanaVendedorEdicionAbierta(boolean ventanaVendedorEdicionAbierta) {
        this.ventanaVendedorEdicionAbierta = ventanaVendedorEdicionAbierta;
    }
    
    protected void alertarVacio(Control campo) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("");
        alert.setHeaderText("Alerta");
        alert.setContentText("El campo no puede estar vacio");
        alert.showAndWait();
        campo.requestFocus();
    }
    protected void alertarEntero(Control campo) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("");
        alert.setHeaderText("Alerta");
        alert.setContentText("Se deben ingresar numeros enteros");
        alert.showAndWait();
        campo.requestFocus();
    }
    protected void alertarDecimal(Control campo) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("");
        alert.setHeaderText("Alerta");
        alert.setContentText("Se deben ingresar numeros con decimales");
        alert.showAndWait();
        campo.requestFocus();
    }
    protected void alertarSeleccion(Control campo) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("");
        alert.setHeaderText("Alerta");
        alert.setContentText("Se debe seleccionar una opcion");
        alert.showAndWait();
        campo.requestFocus();
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    
}
