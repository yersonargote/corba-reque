/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import javax.swing.JOptionPane;
import personal.sop_corba.PafCallbackPOA;

/**
 *
 * @author yerso
 */
public class PafCallbackImpl extends PafCallbackPOA {

    @Override
    public void notificar(String mensaje) {
        String msg = String.format("Se acaba de registrar un paciente con la siguiente información.%n%s%n", mensaje);
        System.out.printf(msg);
        JOptionPane.showMessageDialog(null, msg, "Notificar Registro Paciente", JOptionPane.DEFAULT_OPTION);
    }
    
}
