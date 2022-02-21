package cliente.presentacion;

import mvcf.AModel;
import personal.sop_corba.GestionUsuariosOperations;

/**
 *
 * @author yerso
 */
public class GestorUsuarios extends AModel {
    private GestionUsuariosOperations gestor;
    
    public GestorUsuarios() {}
    
    public GestorUsuarios(GestionUsuariosOperations gestor) {
        this.gestor = gestor;
    }
    
    public GestionUsuariosOperations getGestionUsuarios() {
        return this.gestor;
    }

    public void setGestionUsuarios(GestionUsuariosOperations gestionUsuarios) {
        this.gestor = gestionUsuarios;
    }
}
