package notificacion.servidor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class UtilidadesArchivo {

    private BufferedWriter archivoEscritura;
    private BufferedReader archivoLectura;

    public void abrirArchivo(String nombre, boolean escritura) throws IOException {
        if (escritura == true) {
            this.archivoEscritura = new BufferedWriter(new FileWriter(nombre, true));
        } else {
            this.archivoLectura = new BufferedReader(new FileReader(nombre));
        }
    }

    public void escribirArchivo(String datos) throws IOException {
        archivoEscritura.write(datos);
        archivoEscritura.newLine();
    }

    public String leerArchivo() throws IOException {
        return archivoLectura.readLine();
    }

    public void cerrarArchivo() throws IOException {
        if (archivoEscritura != null) {
            archivoEscritura.close();
        }
        if (archivoLectura != null) {
            archivoLectura.close();
        }
    }

    public boolean puedeLeer() throws IOException {
        return archivoLectura.ready();
    }

    public String[] LeerPalabras(int cantidad) {
        String[] palabras = new String[cantidad];
        int i = 0;
        try {
            while (this.puedeLeer() && i < cantidad) {
                palabras[i] = this.leerArchivo();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return palabras;
    }

    public int contarLineas(String nombre) throws IOException {
        abrirArchivo(nombre, false);
        int lineas = 0;
        while (puedeLeer()) {
            leerArchivo();
            lineas++;
        }
        cerrarArchivo();
        return lineas;
    }

    public void eliminar(String nombre) throws IOException {
        abrirArchivo(nombre, false);

    }

    public void agregarDato(String dato) throws IOException {
        archivoEscritura.write(dato + " ");
    }

}
