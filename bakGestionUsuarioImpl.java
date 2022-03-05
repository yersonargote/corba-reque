/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s_gestion_usuarios.servidor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import s_notificacion_usuarios.sop_corba.GestionNotificacionesHelper;
import s_notificacion_usuarios.sop_corba.GestionNotificacionesOperations;
import org.omg.CosNaming.NamingContextExt;
import s_gestion_usuarios.sop_corba.GestionUsuariosPOA;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.AsistenciaDTO;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.CredencialesDTO;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.EjercicioDTO;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PacienteDTO;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PersonalDTO;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaFisicoDTO;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO;
import s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ValoracionFisicaDTO;
import s_gestion_usuarios.sop_corba.PafCallback;

/**
 *
 * @author LENOVO
 */
public class GestionUsuariosImpl extends GestionUsuariosPOA {
    private static final int MAX_PACIENTES = 10;
    private static final int MAX_PERSONAL = 3;
    private static final int MAX_CALLBACKS = 10;
    private GestionNotificacionesOperations refNotificacion;
    private PersonalDTO[] personal;
    private PacienteDTO[] pacientes;
    private List<ProgramaFisicoDTO> programas;
    private int len_personal;
    private int len_pacientes;
    private int len_callbacks;
    
    private final PafCallback[] callbacks;
    
    public GestionUsuariosImpl() {
        this.personal = new PersonalDTO[MAX_PERSONAL];
        this.pacientes = new PacienteDTO[MAX_PACIENTES];
        this.callbacks = new PafCallback[MAX_CALLBACKS];
        this.programas = new ArrayList<>();
        this.len_pacientes = 0;
        this.len_callbacks = 0;
        this.refNotificacion = null;
        PersonalDTO admin = new PersonalDTO("cc", 0, "admin", "admin", "admin", "12345678");
        PersonalDTO secretaria = new PersonalDTO("cc", 1111, "secretaria", "secretaria", "secretaria", "12345678");
        PersonalDTO paf = new PersonalDTO("cc", 2222, "paf", "paf", "paf", "12345678");
        
        this.personal[0] = admin;
        this.personal[1] = secretaria;
        this.personal[2] = paf;
        this.len_personal = 3;
        
        PacienteDTO ana = new PacienteDTO(3333, "ana", "artes", "docente", "12-12-12", "dolor", "ana12345", "12345678");
        PacienteDTO test = new PacienteDTO(4444, "test", "artes", "docente", "12-12-12", "test dolor", "test12345", "12345678");
        this.pacientes[0] = ana;
        this.pacientes[1] = test;
        this.len_pacientes = 2;
    }

    @Override
    public int abrirSesion(CredencialesDTO credenciales) {
        System.out.println("Abriendo Sesion.");
        int rol = -1;
        String usuario = "";
        if(this.personal == null) return rol;
        if(this.personal.length == 0) return rol;
        
        for(int i = 0; i < len_personal; i++) {
            if(personal[i].usuario.equals(credenciales.usuario) && 
                    personal[i].clave.equals(credenciales.clave)) {
                usuario = personal[i].usuario;
                switch(personal[i].ocupacion) {
                    case "admin":
                        rol = 0;
                        break;
                    case "secretaria":
                        rol = 1;
                        break;
                    case "paf":
                        rol = 2;
                        break;
                    default:
                        break;
                }
                break;
            }
        }
        
        if(rol == -1) {
            for(int i = 0; i < len_pacientes; i++) {
                if(pacientes[i].usuario.equals(credenciales.usuario) &&
                        pacientes[i].clave.equals(credenciales.clave)) {
                    usuario = pacientes[i].usuario;
                    rol = 3;
                    break;
                }
            }
        }
        
        if(rol != -1 && this.refNotificacion != null) {
                    String str = String.format("El usuario %s con el rol %d a ingresado al sistema.%n", 
                            usuario, rol);
                    this.refNotificacion.enviarNotificacion(str);
                }
        return rol;
    }

    @Override
    public boolean registrarPersonal(PersonalDTO personal) {
        System.out.println("Registrando personal.");
        boolean registrado = false;
        if(getIndicePersonal(personal.id) != -1) return registrado;
        
        if(this.len_personal >= MAX_PERSONAL) return registrado;
        
        this.personal[len_personal] = personal;
        this.len_personal++;
        registrado = true;
        return registrado;
    }

    @Override
    public PersonalDTO consultarPersonal(int id) {
        System.out.println("Consultar Personal.");
        PersonalDTO personalDTO = new PersonalDTO();
        int index = getIndicePersonal(id);
        if(index != -1) {
            personalDTO = this.personal[index];
        }
        return personalDTO;
    }
    
    private int getIndicePersonal(int id) {
        int indice = -1;
        for (int i = 0; i < this.len_personal; i++) {
            if (this.personal[i].id == id) {
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
        System.out.println("Listando Personal.");
        return Arrays.stream(this.personal).limit(this.len_personal).collect(Collectors.toList()).toArray(new PersonalDTO[this.len_personal]);
    }
    
    private int getIndicePaciente(int id) {
        int indice = -1;
        for (int i = 0; i < this.len_pacientes; i++) {
            if (this.pacientes[i].id == id) {
                indice = i;
                break;
            }
        }
        return indice;
    }

    @Override
    public boolean registrarPaciente(PacienteDTO paciente) {
        System.out.println("Registrando Paciente.");
        boolean registrado = false;
        if(getIndicePersonal(paciente.id) != -1) return registrado;
        
        if(this.len_pacientes >= MAX_PACIENTES) return registrado;
        
        this.pacientes[len_pacientes] = paciente;
        this.len_pacientes++;
        
        // TODO: Hacer el callback a los pafs.
        for(int i=0; i<len_callbacks; i++) {
            String mensaje = String.format(
                    "Id: %d y nombre %s. Esta disponible para ser valorado.%n",
                    paciente.id, paciente.nombre
            );
            this.callbacks[i].notificar(mensaje);
        }
        registrado = true;
        return registrado;
    }

    @Override
    public PacienteDTO consultarPaciente(int id) {
        System.out.println("Consultando Paciente.");
        PacienteDTO paciente = new PacienteDTO();
        int indice = this.getIndicePaciente(id);
        if (indice >= 0) {
            paciente = this.pacientes[indice];
        }
        return paciente;
    }

    @Override
    public PacienteDTO[] listarPacientes() {
        System.out.println("Listando Pacientes.");
        return Arrays.stream(this.pacientes).limit(this.len_pacientes).collect(Collectors.toList()).toArray(new PacienteDTO[this.len_pacientes]);
    }

    @Override
    public boolean registrarValoracionFisica(ValoracionFisicaDTO valoracion) {
        System.out.println("Registrando valoracion fisica.");
        boolean registrado = false;
        if(getIndicePaciente(valoracion.id) == -1) return registrado;
        
        String info = valoracion.toCsv();
        return this.refNotificacion.agregarHistorial(valoracion.idPaciente, info);
    }

    @Override
    public ValoracionFisicaDTO consultarValoracionFisica(int id) {
        System.out.println("Valoracion fisica.");
        String path = String.format("%s\\src\\s_notificacion_usuarios\\archivos\\usuario%d.txt", 
                System.getProperty("user.dir"), id);
        ValoracionFisicaDTO valoracionFisica = new ValoracionFisicaDTO();
        File file = new File(path);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                String[] partes = line.split(",");
                if (partes.length == 10) {
                    valoracionFisica = new ValoracionFisicaDTO(
                            Integer.parseInt(partes[0]), Integer.parseInt(partes[1]),
                            partes[2], Integer.parseInt(partes[3]), Integer.parseInt(partes[4]), 
                            Integer.parseInt(partes[5]), Integer.parseInt(partes[6]), 
                            Integer.parseInt(partes[7]), Integer.parseInt(partes[8]), partes[9]
                    );
                }
            }
        } catch (IOException ex) {
        }
        return valoracionFisica;
    }

    @Override
    public boolean registrarAsistencia(AsistenciaDTO asistencia) {
        System.out.println("Registrando asistencia.");
        boolean registrado = false;
        if(getIndicePaciente(asistencia.idPaciente) == -1) return registrado;
        return this.refNotificacion.agregarAsistencia(asistencia.toCsv());
    }

    @Override
    public AsistenciaDTO[] consultarAsistencia(int id) {
        System.out.println("Consultando asistencia.");
        String path = String.format("%s\\src\\s_notificacion_usuarios\\archivos\\listadoAsistencia.txt", 
                System.getProperty("user.dir"));
        AsistenciaDTO asistenciaDTO = new AsistenciaDTO();
        File file = new File(path);
        BufferedReader br = null;
        List<AsistenciaDTO> asistencias = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                String[] partes = line.split(",");
                if (partes.length == 4 && Integer.parseInt(partes[0]) == id) {
                    asistenciaDTO = new AsistenciaDTO(
                            Integer.parseInt(partes[0]), Integer.parseInt(partes[1]), 
                            partes[2], partes[3]);
                    asistencias.add(asistenciaDTO);
                }
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                System.out.println("No se pudo cerrar el flujo.");
            }
        }
        AsistenciaDTO[] array = new AsistenciaDTO[asistencias.size()];
        
        return asistencias.toArray(array);
    }

    @Override
    public void registrarCallback(PafCallback callback) {
        System.out.println("Registrando paf callback.");
        boolean registrado = false;
        for(PafCallback paf : this.callbacks) {
            if(callback.equals(paf)) {
                registrado = true;
            }
        }
        if(!registrado && this.callbacks.length <= MAX_CALLBACKS) {
            this.callbacks[len_callbacks] = callback;
            this.len_callbacks++;
        }
    }

    @Override
    public boolean registrarProgramaFisico(ProgramaFisicoDTO programa) {
        System.out.println("Registrando programa fisico.");
        boolean registrado = false;
        for(int i = 0; i < this.len_pacientes; i++) {
            if(this.pacientes[i].id == programa.idPaciente) {
                registrado = true;
            }
        }
        
        if(!registrado) return false;
        
        for(int i = 0; i < this.programas.size(); i++)  {
            if(programa.idPaciente == this.programas.get(i).idPaciente) {
                this.programas.set(i, programa);
                return true;
            }
        }
        this.programas.add(programa);
        return true;
    }

    @Override
    public ProgramaFisicoDTO consultarProgramaFisico(int id) {
        System.out.println("Consultando programa fisico.");
        for(int i = 0; i < this.programas.size(); i++) {
            ProgramaFisicoDTO programa = this.programas.get(i);
            if(programa.idPaciente == id) {
                return programa;
            }
        }
        return new ProgramaFisicoDTO();
    }

    @Override
    public PersonalDTO modificarPersonal(PersonalDTO personal) {
        System.out.println("Modificando personal.");
        int idx = getIndicePersonal(personal.id);
        if(idx == -1) return new PersonalDTO();
        
        PersonalDTO aux = this.personal[idx];
        this.personal[idx] = personal;
        return aux;
    }

    @Override
    public PersonalDTO eliminarPersonal(int id) {
        System.out.println("Eliminando personal.");
        int idx = getIndicePersonal(id);
        if(idx == -1) return new PersonalDTO();
        
        PersonalDTO eliminado = this.personal[idx];
        this.personal[idx] = null;
        this.len_personal--;
        this.personal = Arrays.asList(this.personal).stream().filter(e -> e != null).limit(MAX_PERSONAL).toArray(PersonalDTO[]::new);
        return eliminado;
    }

    @Override
    public PacienteDTO modificarPaciente(PacienteDTO paciente) {
        System.out.println("Modificando paciente.");
        int idx = getIndicePaciente(paciente.id);
        if(idx == -1) return new PacienteDTO();
        
        PacienteDTO aux = this.pacientes[idx];
        this.pacientes[idx] = paciente;
        return aux;
    }

    @Override
    public PacienteDTO eliminarPaciente(int id) {
        System.out.println("Eliminar paciente.");
        int idx = getIndicePaciente(id);
        if(idx == -1) return new PacienteDTO();
        
        PacienteDTO eliminado = this.pacientes[idx];
        this.pacientes[idx] = null;
        this.len_pacientes--;
        
        this.pacientes = Arrays.asList(this.pacientes).stream().filter(e -> e != null).limit(MAX_PACIENTES).toArray(PacienteDTO[]::new);
        return eliminado;
    }
}