package cliente.presentacion;

import cliente.UtilidadesFecha;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;
import personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO;
import personal.sop_corba.GestionUsuariosPackage.EjercicioDTO;
import personal.sop_corba.GestionUsuariosPackage.ProgramaFisicoDTO;
import personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO;
import personal.sop_corba.GestionUsuariosPackage.ValoracionFisicaDTO;

/**
 *
 * @author yerso
 */
public class PafController extends AActionController {

    private static final int MAX_EJERCICIOS = 3;

    private final GestorUsuarios gestor;
    private final GUIMenuPaf vista;
    private final List<ProgramaSemanaDTO> semanas;

    public PafController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestorUsuarios) myModel;
        this.vista = (GUIMenuPaf) myView;
        this.semanas = new ArrayList<>();
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
        int vRepeticiones1, vRepeticiones2, vRepeticiones3, vPeso1, vPeso2, vPeso3;
        String vEjercicio1, vEjercicio2, vEjercicio3, vSemana;

        vRepeticiones1 = (Integer) vista.get2SpR1().getValue();
        vRepeticiones2 = (Integer) vista.get2SpR2().getValue();
        vRepeticiones3 = (Integer) vista.get2SpR3().getValue();
        vEjercicio1 = vista.get2TxtEjercicio().getText();
        vEjercicio2 = vista.get2TxtEjercicio2().getText();
        vEjercicio3 = vista.get2TxtEjercicio3().getText();

        vPeso1 = (Integer) vista.get2SpP1().getValue();
        vPeso2 = (Integer) vista.get2SpP2().getValue();
        vPeso3 = (Integer) vista.get2SpP3().getValue();

        vSemana = (String) vista.get2CbxSemanas().getSelectedItem();

        EjercicioDTO[] ejercicios = new EjercicioDTO[MAX_EJERCICIOS];
        ejercicios[0] = new EjercicioDTO(1, vEjercicio1, vRepeticiones1, vPeso1);
        ejercicios[1] = new EjercicioDTO(2, vEjercicio2, vRepeticiones2, vPeso2);
        ejercicios[2] = new EjercicioDTO(3, vEjercicio3, vRepeticiones3, vPeso3);
        for(ProgramaSemanaDTO objSemana : this.semanas) {
            if(objSemana.semana.equals(vSemana)) {
                this.vista.getLblMensajeErrorElaborar().setText(String.format("%s Ya esta registrada.", vSemana));
                return;
            }
        }
        ProgramaSemanaDTO objProgramaSemana = new ProgramaSemanaDTO(vSemana, ejercicios);

        this.semanas.add(objProgramaSemana);
        this.vista.getLblMensajeErrorElaborar().setText(String.format("Programa de %s registrado.%n", vSemana));
    }

    private void registrarAsistencia() {
        int id;
        String fecha, observacion;
        boolean registrado;

        id = Integer.parseInt(this.vista.getTxtIdAsistencia().getText());
        fecha = this.vista.getJcFechaAsistencia();
        if(fecha == null) {
            fecha = UtilidadesFecha.fechaActual();
        }
        observacion = this.vista.getTxtaObservacion().getText();

        AsistenciaDTO asistencia = new AsistenciaDTO(id, id, fecha, observacion);
        registrado = this.gestor.getGestionUsuarios().registrarAsistencia(asistencia);

        if (registrado) {
            this.vista.getLblMensajeErrorAsistencia().setText("Informaci??n: Asistencia registrada");
        } else {
            this.vista.getLblMensajeErrorAsistencia().setText("Error: Asistencia NO registrada");
        }
    }

    private void elaborarProgramaFisico() {
        int id, idPaciente;
        String fechaInicio;
        boolean registrado = false;

        idPaciente = Integer.parseInt(this.vista.get2TxtIdElaborar().getText());
        id = idPaciente;

        fechaInicio = this.vista.get2JcFechaP();
        if(fechaInicio == null) {
            fechaInicio = UtilidadesFecha.fechaActual();
        }
        
        ProgramaSemanaDTO[] array = new ProgramaSemanaDTO[this.semanas.size()];
        this.semanas.toArray(array);
        
        if (this.semanas.size() >= 1) {
            ProgramaFisicoDTO programaFisicoDTO = new ProgramaFisicoDTO(id, idPaciente, fechaInicio, array);
            registrado = this.gestor.getGestionUsuarios().registrarProgramaFisico(programaFisicoDTO);
        } else {
            this.vista.getLblMensajeErrorElaborar().setText("Error: El programa fisico NO tiene semanas programadas.");
        }

        if (registrado) {
            this.vista.getLblMensajeErrorElaborar().setText("Informaci??n: Programa registrado");
            this.semanas.clear();
        } else {
            this.vista.getLblMensajeErrorElaborar().setText("Error: Programa NO registrado");
        }
    }

    private void realizarValoracionFisica() {
        int vId;
        int vFrecuenciaReposo, vFrecuenciaActiva, vEstatura, vMedidaBrazo, vMedidaCintura, vMedidaPecho;
        String vFecha, vEstado;
        boolean registrado = false;
        vId = Integer.parseInt(vista.getTxtIdentificacion().getText());
        vFrecuenciaReposo = Integer.parseInt(vista.getTxtFrecuenciaReposo().getText());
        vFrecuenciaActiva = Integer.parseInt(vista.getTxtFrecuenciaActiva().getText());
        vMedidaBrazo = Integer.parseInt(vista.getTxtMedidaB().getText());
        vMedidaCintura = Integer.parseInt(vista.getTxtMedidaC().getText());
        vEstatura = Integer.parseInt(vista.getTxtEstatura().getText());
        vMedidaPecho = Integer.parseInt(vista.getTxtMedidaP().getText());

        if (vFrecuenciaReposo < 60) {
            vEstado = "Excelente";
        } else if (vFrecuenciaReposo >= 60 && vFrecuenciaReposo < 68) {
            vEstado = "Bueno";
        } else if (vFrecuenciaReposo >= 68 && vFrecuenciaReposo < 76) {
            vEstado = "Normal";
        } else {
            vEstado = "Inadecuado";
        }
        vFecha = vista.getJcFechaV();
        if(vFecha == null) {
            vFecha = UtilidadesFecha.fechaActual();
        }

        ValoracionFisicaDTO objValoracion = new ValoracionFisicaDTO(
                vId, vId, vFecha, vFrecuenciaReposo, vFrecuenciaActiva, vEstatura,
                vMedidaBrazo, vMedidaPecho, vMedidaCintura, vEstado);
        registrado = this.gestor.getGestionUsuarios().registrarValoracionFisica(objValoracion);

        if (registrado) {
            this.vista.getLblMensajeErrorRealizar().setText("Informaci??n: Valoraci??n registrada");
        } else {
            this.vista.getLblMensajeErrorRealizar().setText("Error: Valoraci??n NO registrada");
        }
    }

}
