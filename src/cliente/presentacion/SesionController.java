package cliente.presentacion;

import java.awt.event.ActionEvent;

import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.CredencialesDTO;

/**
 *
 * @author yerso
 */
public class SesionController extends AActionController {
    private final GestorUsuarios gestorUsuarios;
    private final GUIAbrirSesion vista;

    public SesionController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestorUsuarios = (GestorUsuarios) myModel;
        this.vista = (GUIAbrirSesion) myView;
    }

    private void menuAdmin() {
        GUIMenuAdmin menuAdmin = new GUIMenuAdmin();
        AdminController adminController = new AdminController(this.gestorUsuarios, menuAdmin);

        this.vista.setVisible(false);
        menuAdmin.setVisible(true);

        menuAdmin.getBtnRegistrar().addActionListener(adminController);
        menuAdmin.getBtnRegistrar().setActionCommand("registrar");
        menuAdmin.getBtnConsultar().addActionListener(adminController);
        menuAdmin.getBtnConsultar().setActionCommand("consultar");
        menuAdmin.getBtnListar().addActionListener(adminController);
        menuAdmin.getBtnListar().setActionCommand("listar");
        menuAdmin.getBtnModificarConsultar().addActionListener(adminController);
        menuAdmin.getBtnModificarConsultar().setActionCommand("consultar_modificar");
        menuAdmin.getBtnModificar().addActionListener(adminController);
        menuAdmin.getBtnModificar().setActionCommand("modificar");
        menuAdmin.getBtnEliminar().addActionListener(adminController);
        menuAdmin.getBtnEliminar().setActionCommand("eliminar");
    }
    
    private void menuSecretaria() {
        GUIMenuSecretaria menuSecretaria = new GUIMenuSecretaria();
        SecretariaController secretariaController = new SecretariaController(this.gestorUsuarios, menuSecretaria);
        
        this.vista.setVisible(false);
        menuSecretaria.setVisible(true);
        
        menuSecretaria.getBtnRegistrar().addActionListener(secretariaController);
        menuSecretaria.getBtnRegistrar().setActionCommand("registrar");
        menuSecretaria.getBtnConsultar().addActionListener(secretariaController);
        menuSecretaria.getBtnConsultar().setActionCommand("consultar");
        menuSecretaria.getBtnListar().addActionListener(secretariaController);
        menuSecretaria.getBtnListar().setActionCommand("listar");
        menuSecretaria.getBtnModificarConsultar().addActionListener(secretariaController);
        menuSecretaria.getBtnModificarConsultar().setActionCommand("consultar_modificar");
        menuSecretaria.getBtnModificar().addActionListener(secretariaController);
        menuSecretaria.getBtnModificar().setActionCommand("modificar");
        menuSecretaria.getBtnEliminar().addActionListener(secretariaController);
        menuSecretaria.getBtnEliminar().setActionCommand("eliminar");
    }
    
    
    private void menuPaf() {
        GUIMenuPaf menuPaf = new GUIMenuPaf();
        PafController pafController = new PafController(this.gestorUsuarios, menuPaf);
        
        this.vista.setVisible(false);
        menuPaf.setVisible(true);
        
        // botones
        menuPaf.getBtnRegistrarSemana().addActionListener(pafController);
        menuPaf.getBtnRegistrarSemana().setActionCommand("semana");
        menuPaf.getBtnElaborar().addActionListener(pafController);
        menuPaf.getBtnElaborar().setActionCommand("programa");
        menuPaf.getBtnRealizar().addActionListener(pafController);
        menuPaf.getBtnRealizar().setActionCommand("valoracion");
        menuPaf.getBtnAsistencia().addActionListener(pafController);
        menuPaf.getBtnAsistencia().setActionCommand("asistencia");
    }
    
    private void menuPaciente() {
        GUIPaciente menuPaciente = new GUIPaciente();
        PacienteController pacienteController = new PacienteController(this.gestorUsuarios, menuPaciente);
        
        this.vista.setVisible(false);
        menuPaciente.setVisible(true);
        
        // botones
        menuPaciente.getBtnConsultarValoracion().addActionListener(pacienteController);
        menuPaciente.getBtnConsultarValoracion().setActionCommand("valoracion");
        menuPaciente.getBtnConsultarAsistencia().addActionListener(pacienteController);
        menuPaciente.getBtnConsultarAsistencia().setActionCommand("asistencia");
        menuPaciente.getBtnConsultarPlan().addActionListener(pacienteController);
        menuPaciente.getBtnConsultarPlan().setActionCommand("plan");
    }

    @Override
    public void actualizar(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "login":
                String usuario = this.vista.getTxtUsuarioLogin().getText();
                String clave = String.valueOf(this.vista.getPssClaveLogin().getPassword());
                int tipoUsuario = -1;
                CredencialesDTO credencial = new CredencialesDTO(usuario, clave);
                tipoUsuario = this.gestorUsuarios.getGestionUsuarios().abrirSesion(credencial);
                switch (tipoUsuario) {
                    case 0:
                        menuAdmin();
                        break;
                    case 1:
                        menuSecretaria();
                        break;
                    case 2:
                        this.gestorUsuarios.getGestionUsuarios().registrarCallback(this.gestorUsuarios.getCallback());
                        menuPaf();
                        break;
                    case 3:
                        menuPaciente();
                        break;
                    default:
                        this.vista.getLblMensajeErrorLogin().setText("Credenciales NO VALIDAS");
                        break;
                }
                break;
        }
    }

}
