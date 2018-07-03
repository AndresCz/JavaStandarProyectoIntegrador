package ar.com.educacionit.vehiculos.recursos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoLectura {
    private String url;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public ArchivoLectura(String url) {
        this.url = url;
    }
    
    public ArrayList<String> leerArchivo() throws IOException{
        File archivo = new File(url);
        ArrayList <String> lista = new ArrayList();
        try(BufferedReader archivoLectura = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea=archivoLectura.readLine())!= null){
                lista.add(linea);
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return lista;
    }
}
  
    


