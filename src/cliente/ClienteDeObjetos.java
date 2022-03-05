package cliente;

import cliente.presentacion.GUIPrincipal;
import cliente.presentacion.GestorUsuarios;
import cliente.presentacion.RegistroController;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import s_gestion_usuarios.sop_corba.GestionUsuariosOperations;

public class ClienteDeObjetos {

    static GestionUsuariosOperations refUsuarios;

    public static void main(String[] args) {
        GestorUsuarios gestor;

        gestor = new GestorUsuarios();

        // GUI principal
        GUIPrincipal guiPrincipal = new GUIPrincipal();
        gestor.addView(guiPrincipal);
        RegistroController registroControl = new RegistroController(gestor, guiPrincipal);
        guiPrincipal.setVisible(true);

        // Enlaza el action controller de los botones al controlador y fija el comando de acción
        guiPrincipal.getBtnRegistro().addActionListener(registroControl);
        guiPrincipal.getBtnRegistro().setActionCommand("registro");
    }
}
