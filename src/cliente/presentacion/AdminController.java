package cliente.presentacion;

import cliente.UtilidadesParse;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import personal.sop_corba.GestionUsuariosPackage.PersonalDTO;

public class AdminController extends AActionController {

    private GestorUsuarios gestor;
    private final GUIMenuAdmin vista;

    public AdminController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestorUsuarios) myModel;
        this.vista = (GUIMenuAdmin) myView;
    }

    @Override
    public void actualizar(ActionEvent actionEvent) {
        switch (actionEvent.getActionCommand()) {
            case "registrar":
                registrarPersonal();
                break;
            case "consultar":
                consultarPersonal();
                break;
            case "listar":
                listarPersonal();
                break;
            case "consultar_modificar":
                consultarPersonalParaModificar();
                break;
            case "modificar":
                modificarPersonal();
                break;
            case "eliminar":
                eliminarPersonal();
                break;
        }
    }

    private void registrarPersonal() {
        String tipoId = "", nombreCompleto, ocupacion = "", usuario, clave;
        int id;
        boolean registrado = false;

        if (this.vista.getRbtnCCReg().isSelected()) {
            tipoId = "cc";
        } else if (this.vista.getRbtnPasaporteReg().isSelected()) {
            tipoId = "pasaporte";
        } else if (this.vista.getRbtnTIReg().isSelected()) {
            tipoId = "ti";
        }

        nombreCompleto = this.vista.getTxtNombreReg().getText();
        id = UtilidadesParse.StringToInt(this.vista.getTxtIdReg().getText());

        if (this.vista.getRbtnSecretariaReg().isSelected()) {
            ocupacion = "secretaria";
        } else if (this.vista.getRbtnPaf().isSelected()) {
            ocupacion = "paf";
        }

        usuario = this.vista.getTxtUsuarioReg().getText();
        clave = String.valueOf(this.vista.getPssClaveReg().getPassword());
        PersonalDTO personal = new PersonalDTO(tipoId, id, nombreCompleto, ocupacion, usuario, clave);
        registrado = this.gestor.getGestionUsuarios().registrarPersonal(personal);

        if (registrado) {
            this.vista.getLblMensajeErrorReg().setText("Información: Personal registrado");
        } else {
            this.vista.getLblMensajeErrorReg().setText("Error: Personal NO registrado");
        }
    }

    private void consultarPersonal() {
        PersonalDTO personal = null;
        int id = UtilidadesParse.StringToInt(this.vista.getTxtConsultaConsultar().getText());
        personal = this.gestor.getGestionUsuarios().consultarPersonal(id);

        if (personal.id != 0) {
            this.vista.getLblMensajeErrorConsultar().setText("Personal encontrado.");
            this.vista.getLblNombreConsultaRes().setText(personal.nombreCompleto);
            this.vista.getLblOcupacionConsultaRes().setText(personal.ocupacion);
            this.vista.getLblUsuarioConsultaRes().setText(personal.usuario);
        } else {
            this.vista.getLblMensajeErrorConsultar().setText("Personal no encontrado.");
            this.vista.getLblNombreConsultaRes().setText("-");
            this.vista.getLblOcupacionConsultaRes().setText("-");
            this.vista.getLblUsuarioConsultaRes().setText("-");
        }
    }
    
    private void consultarPersonalParaModificar() {
        int id = UtilidadesParse.StringToInt(this.vista.getTxtModificarConsultar().getText());
        PersonalDTO personal = this.gestor.getGestionUsuarios().consultarPersonal(id);
        
        if(personal.id != 0) {
            int cbx_idx = getCbxIndexTipoId(this.vista.getCbxModificarTipoId(), personal.tipoId);
            this.vista.getCbxModificarTipoId().setSelectedIndex(cbx_idx);
            cbx_idx = getCbxIndexOcupacion(this.vista.getCbxModificarOcupacion(), personal.ocupacion);
            this.vista.getCbxModificarOcupacion().setSelectedIndex(cbx_idx);
            this.vista.getTxtModificarId().setText(Integer.toString(personal.id));
            this.vista.getTxtModificarNombre().setText(personal.nombreCompleto);
            this.vista.getTxtModificarUsuario().setText(personal.usuario);
            this.vista.getBtnModificar().setEnabled(true);
            this.vista.getLblModificarMensaje().setText("Personal encontrado.");
        } else {
            this.vista.getLblModificarMensaje().setText("Personal no encontrado.");
            this.vista.getBtnModificar().setEnabled(false);
        }
    }
    
    private int getCbxIndexTipoId(JComboBox cbx, String item) {
        int idx = -1;
        switch(item) {
            case "cc":
                item = "Cedula de Ciudadania";
                break;
            case "pasaporte":
                item = "Pasaporte";
                break;
            case "ti":
                item = "Tarjeta de Identidad";
                break;
        }
        
        for (int i = 0; i < cbx.getItemCount(); i++) {
            if(cbx.getItemAt(i).equals(item)) {
                idx = i;
                break;
            }
        }
        return idx;
    }
    
    private String toTipoId(String item) {
        switch(item) {
            case "Cedula de Ciudadania":
                item = "cc";
                break;
            case "Pasaporte":
                item = "pasaporte";
                break;
            case "Tarjeta de Identidad":
                item = "ti";
                break;
        }
        return item;
    }
    
    private int getCbxIndexOcupacion(JComboBox cbx, String item) {
        int idx = -1;
        switch(item) {
            case "secretaria":
                item = "Secretaria";
                break;
            case "paf":
                item = "PAF";
                break;
        }
        
        for (int i = 0; i < cbx.getItemCount(); i++) {
            if(cbx.getItemAt(i).equals(item)) {
                idx = i;
                break;
            }
        }
        return idx;
    }
    
    private void modificarPersonal() {
        int id;
        String tipo_id, nombre, ocupacion, usuario, clave;
        
        id = UtilidadesParse.StringToInt(this.vista.getTxtModificarId().getText());
        tipo_id = toTipoId(String.valueOf(this.vista.getCbxModificarTipoId().getSelectedItem()));
        nombre = this.vista.getTxtModificarNombre().getText();
        ocupacion = String.valueOf(this.vista.getCbxModificarOcupacion().getSelectedItem()).toLowerCase();
        usuario = this.vista.getTxtModificarUsuario().getText();
        clave = String.valueOf(this.vista.getPssModificarClave().getPassword());
        
        PersonalDTO personal = new PersonalDTO(tipo_id, id, nombre, ocupacion, usuario, clave);
        personal = this.gestor.getGestionUsuarios().modificarPersonal(personal);
        if(personal.id == 0) {
            this.vista.getLblModificarMensaje().setText("No se pudo modificar el Personal.");
        } else {
            this.vista.getLblModificarMensaje().setText("Personal modificado.");
        }
        this.vista.getBtnModificar().setEnabled(false);
    }

    private void listarPersonal() {
        PersonalDTO[] personal = null;
        DefaultTableModel modelo = (DefaultTableModel) this.vista.getTblListaPersonal().getModel();
        Object fila[] = new Object[4];
        modelo.setRowCount(0);

        personal = this.gestor.getGestionUsuarios().listarPersonal();

        if (personal.length != 0) {
            for (PersonalDTO per : personal) {
                fila[0] = per.id;
                fila[1] = per.nombreCompleto;
                fila[2] = per.ocupacion;
                fila[3] = per.usuario;
                modelo.addRow(fila);
            }
        }
    }

    private void eliminarPersonal() {
        int id = UtilidadesParse.StringToInt(this.vista.getTxtEliminarId().getText());
        PersonalDTO eliminado = this.gestor.getGestionUsuarios().eliminarPersonal(id);
        if(eliminado.id != 0) {
            this.vista.getLblEliminarMensaje().setText("Personal Eliminado.");
        } else {
            this.vista.getLblEliminarMensaje().setText("Personal NO eliminado");
        }
    }
}
