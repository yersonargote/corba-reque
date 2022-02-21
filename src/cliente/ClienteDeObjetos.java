package cliente;

import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import personal.sop_corba.GestionUsuariosHelper;
import personal.sop_corba.GestionUsuariosOperations;
import personal.sop_corba.GestionUsuariosPackage.CredencialesDTO;
import personal.sop_corba.GestionUsuariosPackage.PersonalDTO;

public class ClienteDeObjetos {

    static GestionUsuariosOperations refUsuarios;

    public static void main(String[] args) {
        try {
            String[] vec = new String[4];
            vec[0] = "-ORBInitialPort";
            System.out.println("Ingrese la dirección IP donde escucha el n_s");
            vec[1] = UtilidadesConsola.leerCadena();
            vec[2] = "-ORBInitialPort";
            System.out.println("Ingrese el puerto donde escucha el n_s");
            vec[3] = UtilidadesConsola.leerCadena();

            // se crea e inicia el ORB
            ORB orb = ORB.init(vec, null);

            // se obtiene un link al name service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // *** Resuelve la referencia del objeto en el N_S ***
            String name = "objUsuarios";
            refUsuarios = GestionUsuariosHelper.narrow(ncRef.resolve_str(name));

            System.out.println("Obtenido el manejador sobre el servidor de objetos: " + refUsuarios);
            menuInicio();
        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            //e.printStackTrace(System.out);
        }

    }
    
    
  private static void menuInicio() {
    String opcion = "";
    do {
      System.out.println("===== Menu Inicio =====");
      System.out.println("1. Abrir sesion.");
      System.out.println("2. Salir.");

      opcion = UtilidadesConsola.leerCadena();

      switch (opcion) {
        case "1":
          abrirSesion();
          break;
        case "2":
          System.out.println("Saliendo...");
          break;
      }
    } while (!opcion.equals("2"));
  }

  private static void abrirSesion() {
    String usuario = "", clave = "";
    do {
      System.out.println("===== Menu Abrir Sesion =====");
      System.out.println("Ingrese usuario.");
      usuario = UtilidadesConsola.leerCadena();
      System.out.println("Ingrese clave.");
      clave = UtilidadesConsola.leerCadena();
    } while (usuario.length() < 4 || clave.length() < 8);

    CredencialesDTO credenciales = new CredencialesDTO(usuario, clave);
    int tipo = -1;
    tipo = refUsuarios.abrirSesion(credenciales);

    switch (tipo) {
      case 0:
        menuAdmin();
        break;
      case 1:
        menuSecretaria();
        break;
      case 2:
        menuPaf();
        break;
      default:
        System.out.printf("El personal %s no está autorizado para ingresar al sistema.%n", usuario); 
        System.out.printf("Verificar que el usuario y la clave sean las correctas.");
        break;
    }
  }

  private static void menuAdmin() {
    String opcion = "";
    do {
      System.out.println("===== Menu Administrador =====");
      System.out.println("1. Registar personal.");
      System.out.println("2. Consultar personal.");
      System.out.println("3. Salir.");

      opcion = UtilidadesConsola.leerCadena();

      switch (opcion) {
        case "1":
          registrarPersonal();
          break;
        case "2":
          consultarPersonal();
          break;
        case "3":
          System.out.println("Saliendo...");
          break;
        default:
          System.out.println("Opcion invalida.");
          break;
      }
    } while (!opcion.equals("3"));
  }

  private static void menuSecretaria() {
    String opcion = "";
    do {
      System.out.println("===== Menu Secretaria =====");
      System.out.println("1. Registar usuario.");
      System.out.println("2. Consultar usuario.");
      System.out.println("3. Salir.");

      opcion = UtilidadesConsola.leerCadena();

      switch (opcion) {
        case "1":
          System.out.println("Registrar usuario en contruccion...");
          break;
        case "2":
          System.out.println("Consultar usuario en contruccion...");
          break;
        case "3":
          System.out.println("Saliendo...");
          break;
      }
    } while (!opcion.equals("3"));
  }

  private static void menuPaf() {
    String opcion = "";
    do {
      System.out.println("===== Menu Paf =====");
      System.out.println("1. Valorar paf.");
      System.out.println("2. Registrar asistencia.");
      System.out.println("3. Salir.");

      opcion = UtilidadesConsola.leerCadena();

      switch (opcion) {
        case "1":
          System.out.print("Valorar paf en contrucción...");
          break;
        case "2":
          System.out.print("Registar asistencia en contrucción...");
          break;
        case "3":
          System.out.println("Saliendo...");
          break;
      }
    } while (!opcion.equals("3"));
  }

  private static void registrarPersonal() {
    String usuario = "", clave = "", nombre = "", ocupacion = "", tipoId = "";
    int id = -1, opcion_tipo = -1;
    boolean registrado = false;
    do {
      System.out.println("===== Registrar personal =====");
      do {
        System.out.println("Ingrese tipoId.");
        System.out.println("1. Cedula");
        System.out.println("2. Pasaporte");
        System.out.println("3. Tarjeta Identidad");
        System.out.println("4. Salir.");
        opcion_tipo = UtilidadesConsola.leerEntero();
        switch (opcion_tipo) {
          case 1:
            tipoId = "cc";
            opcion_tipo = 4;
            break;
          case 2:
            tipoId = "pp";
            opcion_tipo = 4;
            break;
          case 3:
            tipoId = "ti";
            opcion_tipo = 4;
            break;
          case 4:
            System.out.println("Saliendo...");
            break;
          default:
            System.out.println("Opcion no valida");
            break;
        }
      } while (opcion_tipo != 4);

      System.out.println("Ingrese id.");
      id = UtilidadesConsola.leerEntero();
      System.out.println("Ingrese nombre completo.");
      nombre = UtilidadesConsola.leerCadena();
      do {
        System.out.println("Ingrese ocupacion.");
        System.out.println("1. Secretaria");
        System.out.println("2. Paf");
        System.out.println("3. Salir");
        opcion_tipo = UtilidadesConsola.leerEntero();
        switch (opcion_tipo) {
          case 1:
            ocupacion = "secretaria";
            opcion_tipo = 3;
            break;
          case 2:
            ocupacion = "paf";
            opcion_tipo = 3;
            break;
          case 3:
            System.out.println("Saliendo...");
            break;
          default:
            System.out.println("Opcion no valida");
            break;
        }
      } while (opcion_tipo != 3);
      System.out.println("Ingrese usuario.");
      usuario = UtilidadesConsola.leerCadena();
      System.out.println("Ingrese clave.");
      clave = UtilidadesConsola.leerCadena();
    } while (usuario.length() < 8 || clave.length() < 8 || id <= 0 || nombre.length() < 2);

    PersonalDTO personal = new PersonalDTO(tipoId, id, nombre, ocupacion, usuario, clave);
    registrado = refUsuarios.registrarPersonal(personal);
    if (registrado) {
      System.out.println("Personal registrado exitosamente.");
    } else {
      System.out.println("Personal NO registrado, se alcanzó la cantidad máxima de usuarios a registrar Excedido el limite de personal a registrar.");
    }
  }

  private static void consultarPersonal() {
    PersonalDTO personal = null;
    int id = -1;
    System.out.println("===== Consultar personal =====");
    System.out.println("Ingrese id.");
    id = UtilidadesConsola.leerEntero();
    personal = refUsuarios.consultarPersonal(id);

    if (personal != null) {
      System.out.println("Personal encontrado.");
      System.out.println("Id: " + personal.id);
      System.out.println("Nombre: " + personal.nombreCompleto);
      System.out.println("Ocupacion: " + personal.ocupacion);
      System.out.println("Usuario: " + personal.usuario);
    } else {
      System.out.println("Personal NO encontrado.");
    }
  }
}
