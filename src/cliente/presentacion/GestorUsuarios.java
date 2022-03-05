package cliente.presentacion;

import mvcf.AModel;
import s_gestion_usuarios.sop_corba.GestionUsuariosOperations;
import s_gestion_usuarios.sop_corba.PafCallback;

/**
 *
 * @author yerso
 */
public class GestorUsuarios extends AModel {
    private GestionUsuariosOperations gestor;
    private PafCallback callback;
    
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

    public PafCallback getCallback() {
        return callback;
    }

    public void setCallback(PafCallback callback) {
        this.callback = callback;
    }
    
}
