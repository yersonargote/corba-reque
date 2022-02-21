/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificacion.servidor;

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
    
}
