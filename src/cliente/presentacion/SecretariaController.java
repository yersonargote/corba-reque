package cliente.presentacion;

import cliente.UtilidadesFecha;
import cliente.UtilidadesParse;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;

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
//        PacienteDTO paciente = new PacienteDTO(usuario, clave, id, nombreCompleto, facultad, tipoUsuario, fechaIngreso, patologia);
//        registrado = this.gestor.getGestionUsuarios().registrarPaciente(paciente);
//
//        if (registrado) {
//            this.vista.getLblMensajeErrorReg().setText("Información: Paciente registrado");
//        } else {
//            this.vista.getLblMensajeErrorReg().setText("Error: Paciente NO registrado");
//        }
    }

    private void consultarPaciente() {
//        PacienteDTO pacienteDTO = null;
//        int id = UtilidadesParse.StringToInt(this.vista.getTxtConsultaConsultar().getText());
//            pacienteDTO = this.gestor.getGestionUsuarios().consultarPaciente(id);
//
//        if (pacienteDTO != null) {
//            this.vista.getLblMensajeErrorConsultar().setText("Personal encontrado.");
//            this.vista.getLblNombreConsultaRes().setText(pacienteDTO.getNombre());
//            this.vista.getLblTipoUsuarioConsultaRes().setText(pacienteDTO.getTipoUsuario());
//            this.vista.getLblUsuarioConsultaRes().setText(pacienteDTO.getUsuario());
//            this.vista.getLblPatologiaConsultarRes().setText(pacienteDTO.getPatologia());
//            this.vista.getLblFacultadConsultarRes().setText(pacienteDTO.getFacultad());
//            this.vista.getLblFechaIngresoConsultarRes().setText(pacienteDTO.getFechaIngreso());
//        } else {
//            this.vista.getLblMensajeErrorConsultar().setText("Personal no encontrado.");
//            this.vista.getLblNombreConsultaRes().setText("-");
//            this.vista.getLblTipoUsuarioConsultaRes().setText("-");
//            this.vista.getLblUsuarioConsultaRes().setText("-");
//            this.vista.getLblPatologiaConsultarRes().setText("-");
//            this.vista.getLblFacultadConsultarRes().setText("-");
//            this.vista.getLblFechaIngresoConsultarRes().setText("-");
//        }
    }

    private void listarPaciente() {
//        List<PacienteDTO> pacientes = null;
//        DefaultTableModel modelo = (DefaultTableModel) this.vista.getTblListaPacientes().getModel();
//        Object fila[] = new Object[7];
//        pacientes = this.gestor.getGestionUsuarios().listarPaciente();
//
//        if (pacientes != null) {
//            for (PacienteDTO paciente : pacientes) {
//                fila[0] = paciente.getId();
//                fila[1] = paciente.getNombre();
//                fila[2] = paciente.getTipoUsuario();
//                fila[3] = paciente.getFacultad();
//                fila[4] = paciente.getUsuario();
//                fila[5] = paciente.getPatologia();
//                fila[6] = paciente.getFechaIngreso();
//                modelo.addRow(fila);
//            }
//        }
    }

}
