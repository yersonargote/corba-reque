package cliente.presentacion;

import java.awt.event.ActionEvent;

import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import personal.sop_corba.GestionUsuariosHelper;
import personal.sop_corba.GestionUsuariosOperations;

/**
 *
 * @author yerso
 */
public class RegistroController extends AActionController {

    private GestorUsuarios gestor;
    private final GUIPrincipal vista;

    public RegistroController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestorUsuarios) myModel;
        this.vista = (GUIPrincipal) myView;
    }

    @Override
    public void actualizar(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "registro":
                String ip = this.vista.getTxtIp().getText();
                String puerto = this.vista.getTxtPuerto().getText();
                this.gestor.setGestionUsuarios((GestionUsuariosOperations)obtenerObjetoRemoto(ip, puerto));
                boolean registrado = (this.gestor.getGestionUsuarios() != null);
                if (registrado) {
                    GUIAbrirSesion guiAbrirSesion = new GUIAbrirSesion();
                    SesionController sesionController = new SesionController(this.gestor, guiAbrirSesion);

                    this.vista.setVisible(false);
                    guiAbrirSesion.setVisible(true);

                    guiAbrirSesion.getBtnLogin().addActionListener(sesionController);
                    guiAbrirSesion.getBtnLogin().setActionCommand("login");
                } else {
                    this.vista.getLblMensajeErrorLogin().setText("Problema al registrar el objeto remoto del cliente.");
                }
                break;
        }
    }

    private GestionUsuariosOperations obtenerObjetoRemoto(String ip, String puerto) {
        try {
            String[] vec = new String[4];
            vec[0] = "-ORBInitialPort";
            vec[1] = ip;
            vec[2] = "-ORBInitialPort";
            vec[3] = puerto;

            // se crea e inicia el ORB
            ORB orb = ORB.init(vec, null);

            // se obtiene un link al name service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // *** Resuelve la referencia del objeto en el N_S ***
            String name = "objUsuarios";
            return (GestionUsuariosOperations) GestionUsuariosHelper.narrow(ncRef.resolve_str(name));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
