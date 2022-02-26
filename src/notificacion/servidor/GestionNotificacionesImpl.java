/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificacion.servidor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import notificacion.sop_corba.GestionNotificacionesPOA;
import org.omg.CosNaming.NamingContextExt;

/**
 *
 * @author LENOVO
 */
public class GestionNotificacionesImpl extends GestionNotificacionesPOA {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public boolean agregarHistorial(int id, String historial) {
        String path = String.format("%s\\src\\notificacion\\archivos\\usuario%d.txt", 
                System.getProperty("user.dir"), id);
        System.out.println(path);
        try {
            Files.write(
                    Paths.get(path),
                    historial.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException ex) {
            System.out.println("Error: Al crear o agregar información al historial.");
            return false;
        }
        return true;
    }

    @Override
    public boolean agregarAsistencia(String asistencia) {
        String path = String.format("%s\\src\\notificacion\\archivos\\listadoAsistencia.txt",
                System.getProperty("user.dir"));
        System.out.println(path);
        try {
            Files.write(
                    Paths.get(path),
                    asistencia.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException ex) {
            System.out.println("Error: Al crear o agregar información de asistencia.");
            return false;
        }
        return true;
    }

}
