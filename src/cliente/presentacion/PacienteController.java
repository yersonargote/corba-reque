package cliente.presentacion;

import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.util.List;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;
import personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO;
import personal.sop_corba.GestionUsuariosPackage.ValoracionFisicaDTO;

/**
 *
 * @author yerso
 */
public class PacienteController extends AActionController {

    private GestorUsuarios gestor;
    private GUIPaciente vista;

    public PacienteController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestorUsuarios) myModel;
        this.vista = (GUIPaciente) myView;
    }

    @Override
    public void actualizar(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "plan":
                consultarPlanFisico();
                break;
            case "asistencia":
                consultarAsistencia();
                break;
            case "valoracion":
                consultarValoracion();
                break;
        }

    }

    private void consultarPlanFisico() {

    }

    private void consultarAsistencia() {
        int id = Integer.parseInt(this.vista.getTxtIdConsultarAsistencia().getText());

        AsistenciaDTO[] asistencias = null;

        asistencias = this.gestor.getGestionUsuarios().consultarAsistencia(id);
        if (asistencias == null) {
            this.vista.getTxtaConsultarAsistencia().setText("No se encontraron asistencias del paciente.");
            return;
        }
        StringBuilder str = new StringBuilder();
        for (AsistenciaDTO asistencia : asistencias) {
            str.append(asistencia.toPrint());
        }
        this.vista.getTxtaConsultarAsistencia().setText(str.toString());
    }

    private void consultarValoracion() {
        int id = Integer.parseInt(this.vista.getTxtIdValoracion().getText());

        ValoracionFisicaDTO valoracionFisicaDTO = null;
        valoracionFisicaDTO = this.gestor.getGestionUsuarios().consultarValoracionFisica(id);

        if (valoracionFisicaDTO != null) {
            String str = String.format("Información: Valoracion fisica encontrada.%n%s", valoracionFisicaDTO.toPrint());
            this.vista.getTxtValoracionRes().setText(str);
        } else {
            this.vista.getTxtValoracionRes().setText("Error: Valoracion fisica NO encontrada.");
        }
    }

}
