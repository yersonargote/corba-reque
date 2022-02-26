/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.servidor;

import java.util.ArrayList;
import java.util.List;
import notificacion.sop_corba.GestionNotificacionesHelper;
import notificacion.sop_corba.GestionNotificacionesOperations;
import org.omg.CosNaming.NamingContextExt;
import personal.sop_corba.GestionUsuariosPOA;
import personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO;
import personal.sop_corba.GestionUsuariosPackage.CredencialesDTO;
import personal.sop_corba.GestionUsuariosPackage.PacienteDTO;
import personal.sop_corba.GestionUsuariosPackage.PersonalDTO;
import personal.sop_corba.GestionUsuariosPackage.ValoracionFisicaDTO;
import personal.sop_corba.PafCallback;

/**
 *
 * @author LENOVO
 */
public class GestionUsuariosImpl extends GestionUsuariosPOA {
    private GestionNotificacionesOperations refNotificacion;
    private final List<PersonalDTO> personal;
//    private final List<CredencialesDTO> usuarios;
    
    public GestionUsuariosImpl() {
        this.personal = new ArrayList<>();
        this.refNotificacion = null;
//        this.usuarios = new ArrayList<>();
        PersonalDTO admin = new PersonalDTO("cc", 12345678, "admin", "admin", "admin", "12345678");
//        CredencialesDTO adminC = new CredencialesDTO("admin", "12345678");
        this.personal.add(admin);
//        this.usuarios.add(adminC);
    }

    @Override
    public int abrirSesion(CredencialesDTO credenciales) {
        int rol = -1;
        if(this.personal == null) return rol;
        if(this.personal.isEmpty()) return rol;
        
        for(PersonalDTO personalDTO : this.personal) {
            if(personalDTO.usuario.equals(credenciales.usuario) && personalDTO.clave.equals(credenciales.clave)) {
                switch(personalDTO.ocupacion) {
                    case "admin":
                        rol = 0;
                        break;
                    case "secretaria":
                        rol = 1;
                        break;
                    case "paf":
                        rol = 2;
                        break;
                    case "paciente":
                        rol = 3;
                        break;
                    default:
                        break;
                }
                if(rol != -1 && this.refNotificacion != null) {
                    String str = String.format("El usuario %s con el rol %d a ingresado al sistema.%n", personalDTO.usuario, rol);
                    this.refNotificacion.enviarNotificacion(str);
                }
                break;
            }
        }
        return rol;
    }

    @Override
    public boolean registrarPersonal(PersonalDTO personal) {
        boolean registrado = false;
        if(getIndicePersonal(personal.id) != -1) return registrado;
        
        if(this.personal.size() >= 3) return registrado;
        
        this.personal.add(personal);
        registrado = true;
        return registrado;
    }

    @Override
    public PersonalDTO consultarPersonal(int id) {
        PersonalDTO personalDTO = null;
        int index = getIndicePersonal(id);
        if(index != -1) {
            personalDTO = this.personal.get(index);
        }
        return personalDTO;
    }
    
    private int getIndicePersonal(int id) {
        int indice = -1;
        for (int i = 0; i < this.personal.size(); i++) {
            if (this.personal.get(i).id == id) {
                indice = i;
                break;
            }
        }
        return indice;
    }
    
    // TODO: esto no es un callback es un registro de otro servidor.
    public boolean registrarCallback(NamingContextExt nce, String servicio) {
        //GestionNotificaciones ref;
        System.out.println("Consultando referencia remota");
        try {
            this.refNotificacion = GestionNotificacionesHelper.narrow(nce.resolve_str(servicio));
            return true;
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public PersonalDTO[] listarPersonal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarPaciente(PacienteDTO paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PacienteDTO consultarPaciente(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PacienteDTO[] listarPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarValoracionFisica(ValoracionFisicaDTO valoracion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ValoracionFisicaDTO consultarValoracionFisica(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registrarAsistencia(AsistenciaDTO asistencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AsistenciaDTO consultarAsistencia(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarCallback(PafCallback callback) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
