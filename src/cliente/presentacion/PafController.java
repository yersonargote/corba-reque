package cliente.presentacion;


import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;

/**
 *
 * @author yerso
 */
public class PafController extends AActionController {

    private final GestorUsuarios gestor;
    private final GUIMenuPaf vista;
//    private final List<ProgramaSemanaDTO> semanas;

    public PafController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestorUsuarios) myModel;
        this.vista = (GUIMenuPaf) myView;
//        this.semanas = new ArrayList<>();
    }

    @Override
    public void actualizar(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "valoracion":
                realizarValoracionFisica();
                break;
            case "semana":
                semanaProgramaFisico();
                break;
            case "programa":
                elaborarProgramaFisico();
                break;
            case "asistencia":
                registrarAsistencia();
                break;
        }
    }

    private void semanaProgramaFisico() {
//        int vRepeticiones1, vRepeticiones2, vRepeticiones3, vPeso1, vPeso2, vPeso3;
//        String vEjercicio1, vEjercicio2, vEjercicio3, vSemana;
//
//        vRepeticiones1 = (Integer) vista.get2SpR1().getValue();
//        vRepeticiones2 = (Integer) vista.get2SpR2().getValue();
//        vRepeticiones3 = (Integer) vista.get2SpR3().getValue();
//        vEjercicio1 = vista.get2TxtEjercicio().getText();
//        vEjercicio2 = vista.get2TxtEjercicio2().getText();
//        vEjercicio3 = vista.get2TxtEjercicio3().getText();
//
//        vPeso1 = (Integer) vista.get2SpP1().getValue();
//        vPeso2 = (Integer) vista.get2SpP2().getValue();
//        vPeso3 = (Integer) vista.get2SpP3().getValue();
//
//        vSemana = (String) vista.get2CbxSemanas().getSelectedItem();
//
//        List<EjercicioDTO> ejercicios = new ArrayList<>();
//        ejercicios.add(new EjercicioDTO(1, vEjercicio1, vRepeticiones1, vPeso1));
//        ejercicios.add(new EjercicioDTO(2, vEjercicio2, vRepeticiones2, vPeso2));
//        ejercicios.add(new EjercicioDTO(3, vEjercicio3, vRepeticiones3, vPeso3));
//        ProgramaSemanaDTO objProgramaSemana = new ProgramaSemanaDTO(vSemana, ejercicios);
//
//        this.semanas.add(objProgramaSemana);
    }

    private void registrarAsistencia() {
//        int id;
//        String fecha, observacion;
//        boolean registrado = false;
//
//        id = Integer.parseInt(this.vista.getTxtIdAsistencia().getText());
//        fecha = this.vista.getJcFechaAsistencia();
//        observacion = this.vista.getTxtaObservacion().getText();
//
//        AsistenciaDTO asistencia = new AsistenciaDTO(id, id, fecha, observacion);
//
//        try {
//            registrado = this.gestor.getGestionUsuarios().registrarAsistencia(asistencia);
//        } catch (RemoteException ex) {
//            this.vista.getLblMensajeErrorAsistencia().setText("Error: No se pudo registrar la asistencia del paciente\n" + ex.getMessage());
//        }
//        
//        if (registrado) {
//            this.vista.getLblMensajeErrorAsistencia().setText("Información: Asistencia registrada");
//            this.semanas.clear();
//        } else {
//            this.vista.getLblMensajeErrorAsistencia().setText("Error: Asistencia NO registrada");
//        }
    }

    private void elaborarProgramaFisico() {
//        int id, idPaciente;
//        String fechaInicio;
//        boolean registrado = false;
//
//        idPaciente = Integer.parseInt(this.vista.get2TxtIdElaborar().getText());
//        id = idPaciente;
//
//        fechaInicio = this.vista.get2JcFechaP();
//
//        ProgramaFisicoDTO programaFisicoDTO = new ProgramaFisicoDTO(id, idPaciente, fechaInicio, this.semanas);
//        
//        if(this.semanas.size() > 1)
//            try {
//                registrado = this.gestor.getGestionUsuarios().registrarProgramaFisico(programaFisicoDTO);
//            } catch (RemoteException ex) {
//                this.vista.getLblMensajeErrorElaborar()
//                        .setText("Error: No se pudo elaborar el programa fisico del paciente\n" + ex.getMessage());
//            }
//        else
//            this.vista.getLblMensajeErrorElaborar().setText("Error: El programa fisico no contiene semanas.");
//
//        if (registrado) {
//            this.vista.getLblMensajeErrorElaborar().setText("Información: Programa registrado");
//            this.semanas.clear();
//        } else {
//            this.vista.getLblMensajeErrorElaborar().setText("Error: Programa NO registrado");
//        }
    }

    private void realizarValoracionFisica() {
//        int vId;
//        int vFrecuenciaReposo, vFrecuenciaActiva, vEstatura, vMedidaBrazo, vMedidaCintura, vMedidaPecho;
//        String vFecha, vEstado;
//        boolean registrado = false;
//        vId = Integer.parseInt(vista.getTxtIdentificacion().getText());
//        vFrecuenciaReposo = Integer.parseInt(vista.getTxtFrecuenciaReposo().getText());
//        vFrecuenciaActiva = Integer.parseInt(vista.getTxtFrecuenciaActiva().getText());
//        vMedidaBrazo = Integer.parseInt(vista.getTxtMedidaB().getText());
//        vMedidaCintura = Integer.parseInt(vista.getTxtMedidaC().getText());
//        vEstatura = Integer.parseInt(vista.getTxtEstatura().getText());
//        vMedidaPecho = Integer.parseInt(vista.getTxtMedidaP().getText());
//
//        if (vFrecuenciaReposo < 60) {
//            vEstado = "Excelente";
//        } else if (vFrecuenciaReposo >= 60 && vFrecuenciaReposo < 68) {
//            vEstado = "Bueno";
//        } else if (vFrecuenciaReposo >= 68 && vFrecuenciaReposo < 76) {
//            vEstado = "Normal";
//        } else {
//            vEstado = "Inadecuado";
//        }
//        vFecha = vista.getJcFechaV();
//
//        ValoracionFisicaDTO objValoracion = new ValoracionFisicaDTO(vId, vId, vFecha, vFrecuenciaReposo, vFrecuenciaActiva, vEstatura,
//                vMedidaBrazo, vMedidaPecho, vMedidaCintura, vEstado);
//        try {
//            registrado = this.gestor.getGestionUsuarios().registrarValoracionFisica(objValoracion);
//        } catch (RemoteException ex) {
//            this.vista.getLblMensajeErrorRealizar().setText("Error: No se pudo realizar la valoración del paciente\n" + ex.getMessage());
//        }
//
//        if (registrado) {
//            this.vista.getLblMensajeErrorRealizar().setText("Información: Valoración registrada");
//        } else {
//            this.vista.getLblMensajeErrorRealizar().setText("Error: Valoración NO registrada");
//        }
    }

}
