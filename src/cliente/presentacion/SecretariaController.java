package cliente.presentacion;

import cliente.UtilidadesFecha;
import cliente.UtilidadesParse;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PacienteDTO;

/**
 *
 * @author yerso
 */
public class SecretariaController extends AActionController {

    private GestorUsuarios gestor;
    private GUIMenuSecretaria vista;

    public SecretariaController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestorUsuarios) myModel;
        this.vista = (GUIMenuSecretaria) myView;
    }

    @Override
    public void actualizar(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "registrar":
                registrarPaciente();
                break;
            case "consultar":
                consultarPaciente();
                break;
            case "listar":
                listarPaciente();
                break;
            case "modificar":
                modificarPaciente();
                break;
            case "eliminar":
                eliminarPaciente();
                break;
            case "consultar_modificar":
                consultarPacienteParaModificar();
                break;
        }
    }

    private void registrarPaciente() {
        String tipoUsuario = "", nombreCompleto, facultad, usuario, clave, fechaIngreso, patologia;
        int id;
        boolean registrado = false;

        nombreCompleto = this.vista.getTxtNombreReg().getText();
        id = UtilidadesParse.StringToInt(this.vista.getTxtIdReg().getText());

        if (this.vista.getRbtnDocenteReg().isSelected()) {
            tipoUsuario = "docente";
        } else if (this.vista.getRbtnAdministrativoReg().isSelected()) {
            tipoUsuario = "administrativo";
        }

        usuario = this.vista.getTxtUsuarioReg().getText();
        clave = String.valueOf(this.vista.getPssClaveReg().getPassword());
        fechaIngreso = UtilidadesFecha.fechaActual();
        patologia = this.vista.getTxtPatologiaReg().getText();
        facultad = this.vista.getTxtFacultadReg().getText();
        PacienteDTO paciente = new PacienteDTO(id, nombreCompleto, facultad, tipoUsuario, fechaIngreso, patologia, usuario, clave);
        registrado = this.gestor.getGestionUsuarios().registrarPaciente(paciente);

        if (registrado) {
            this.vista.getLblMensajeErrorReg().setText("Información: Paciente registrado");
        } else {
            this.vista.getLblMensajeErrorReg().setText("Error: Paciente NO registrado");
        }
    }

    private void consultarPaciente() {
        PacienteDTO pacienteDTO = null;
        int id = UtilidadesParse.StringToInt(this.vista.getTxtConsultaConsultar().getText());
        pacienteDTO = this.gestor.getGestionUsuarios().consultarPaciente(id);

        if (pacienteDTO.id != 0) {
            this.vista.getLblMensajeErrorConsultar().setText("Personal encontrado.");
            this.vista.getLblNombreConsultaRes().setText(pacienteDTO.nombre);
            this.vista.getLblTipoUsuarioConsultaRes().setText(pacienteDTO.tipoUsuario);
            this.vista.getLblUsuarioConsultaRes().setText(pacienteDTO.usuario);
            this.vista.getLblPatologiaConsultarRes().setText(pacienteDTO.patologia);
            this.vista.getLblFacultadConsultarRes().setText(pacienteDTO.facultad);
            this.vista.getLblFechaIngresoConsultarRes().setText(pacienteDTO.fechaIngreso);
        } else {
            this.vista.getLblMensajeErrorConsultar().setText("Personal no encontrado.");
            this.vista.getLblNombreConsultaRes().setText("-");
            this.vista.getLblTipoUsuarioConsultaRes().setText("-");
            this.vista.getLblUsuarioConsultaRes().setText("-");
            this.vista.getLblPatologiaConsultarRes().setText("-");
            this.vista.getLblFacultadConsultarRes().setText("-");
            this.vista.getLblFechaIngresoConsultarRes().setText("-");
        }
    }

    private void listarPaciente() {
        PacienteDTO[] pacientes = null;
        DefaultTableModel modelo = (DefaultTableModel) this.vista.getTblListaPacientes().getModel();
        Object fila[] = new Object[7];
        modelo.setRowCount(0);
        pacientes = this.gestor.getGestionUsuarios().listarPacientes();

        if (pacientes.length != 0) {
            for (PacienteDTO paciente : pacientes) {
                fila[0] = paciente.id;
                fila[1] = paciente.nombre;
                fila[2] = paciente.tipoUsuario;
                fila[3] = paciente.facultad;
                fila[4] = paciente.usuario;
                fila[5] = paciente.patologia;
                fila[6] = paciente.fechaIngreso;
                modelo.addRow(fila);
            }
        }
    }

    private void consultarPacienteParaModificar() {
        int id = UtilidadesParse.StringToInt(this.vista.getTxtModificarConsultar().getText());
        PacienteDTO pacienteDTO = this.gestor.getGestionUsuarios().consultarPaciente(id);

        if (pacienteDTO.id != 0) {
            this.vista.getLblMensajeModificar().setText("Paciente Encontrado.");
            this.vista.getTxtModificarId().setText(String.valueOf(pacienteDTO.id));
            this.vista.getTxtModificarFacultad().setText(pacienteDTO.facultad);
            this.vista.getTxtModificarNombre().setText(pacienteDTO.nombre);
            this.vista.getTxtModificarUsuario().setText(pacienteDTO.usuario);
            this.vista.getTxtModificarPatologia().setText(pacienteDTO.patologia);
            int idx = getCbxTipoUsuario(this.vista.getCbxModificarTipoUsuario(), pacienteDTO.tipoUsuario);
            this.vista.getCbxModificarTipoUsuario().setSelectedIndex(idx);
            this.vista.getBtnModificar().setEnabled(true);
        } else {
            this.vista.getLblMensajeModificar().setText("Paciente No Encontrado.");
            this.vista.getBtnModificar().setEnabled(false);
        }

    }

    private void modificarPaciente() {
        int id;
        String nombre, facultad, tipoUsuario, fechaIngreso, patologia, usuario, clave;
        id = UtilidadesParse.StringToInt(this.vista.getTxtModificarId().getText());
        nombre = this.vista.getTxtModificarNombre().getText();
        facultad = this.vista.getTxtModificarFacultad().getText();
        patologia = this.vista.getTxtModificarPatologia().getText();
        fechaIngreso = UtilidadesFecha.fechaActual();
        usuario = this.vista.getTxtModificarUsuario().getText();
        clave = String.valueOf(this.vista.getPssModificarClave().getPassword());
        tipoUsuario = String.valueOf(this.vista.getCbxModificarTipoUsuario().getSelectedItem()).toLowerCase();
        PacienteDTO pacienteDTO = new PacienteDTO(id, nombre, facultad, tipoUsuario, fechaIngreso, patologia, usuario, clave);
        pacienteDTO = this.gestor.getGestionUsuarios().modificarPaciente(pacienteDTO);
        if (pacienteDTO.id == 0) {
            this.vista.getLblMensajeModificar().setText("No se modifico el paciente.");
        } else {
            this.vista.getLblMensajeModificar().setText("Paciente modificado.");
        }
        this.vista.getBtnModificar().setEnabled(false);
    }

    private void eliminarPaciente() {
        int id = UtilidadesParse.StringToInt(this.vista.getTxtIdEliminar().getText());
        PacienteDTO pacienteEliminado = this.gestor.getGestionUsuarios().eliminarPaciente(id);
        Boolean eliminado = (pacienteEliminado.id == 0);
        if (eliminado) {
            this.vista.getLblEliminarMensaje().setText("Paciente No eliminado.");
        } else {
            this.vista.getLblEliminarMensaje().setText("Paciente eliminado.");
        }

    }

    private int getCbxTipoUsuario(JComboBox<String> cbx, String tipoUsuario) {
        int idx = -1;
        for (int i = 0; i < cbx.getItemCount(); i++) {
            if (cbx.getItemAt(i).toLowerCase().equals(tipoUsuario)) {
                idx = i;
                break;
            }
        }
        return idx;
    }

}
