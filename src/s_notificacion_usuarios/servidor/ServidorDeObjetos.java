package s_notificacion_usuarios.servidor;

import s_notificacion_usuarios.sop_corba.GestionNotificaciones;
import s_notificacion_usuarios.sop_corba.GestionNotificacionesHelper;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;


public class ServidorDeObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
        String[] vec = new String[4];
        vec[0] = "-ORBInitialHost";
        System.out.println("Ingrese la dirección IP donde escucha el n_s");
        vec[1] = UtilidadesConsola.leerCadena();
        vec[2] = "-ORBInitialPort";
        System.out.println("Ingrese el puerto donde escucha el n_s");
        vec[3] = UtilidadesConsola.leerCadena();
        GestionNotificacionesImpl objRemoto = new GestionNotificacionesImpl();
        inicializarORB(vec,objRemoto);
    } 
	
	catch (Exception e) {
		System.out.println("Error: " + e);
		e.printStackTrace(System.out);
	}

	System.out.println("Servidor: Saliendo ...");
    }
    
    private static void inicializarORB(String[] vec, GestionNotificacionesImpl objRemoto) throws ServantNotActive, WrongPolicy, org.omg.CORBA.ORBPackage.InvalidName, AdapterInactive, InvalidName, NotFound, CannotProceed
  {             
        
      // crea e inicia el ORB
      ORB orb = ORB.init(vec, null);      
      POA rootpoa =  POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
      rootpoa.the_POAManager().activate();
       
      //*** se genera la referencia del servant
      org.omg.CORBA.Object obj = rootpoa.servant_to_reference(objRemoto);
      GestionNotificaciones href = GestionNotificacionesHelper.narrow(obj);
	  
      // se obtiene un link al name service
      org.omg.CORBA.Object objref =orb.resolve_initial_references("NameService");
      NamingContextExt ncref = NamingContextExtHelper.narrow(objref);

      // *** se realiza el binding de la referencia del servant en el N_S ***
      String name = "objNotificacion";
      NameComponent path[] = ncref.to_name( name );
      ncref.rebind(path, href);

      System.out.println("El Servidor esta listo y esperando ...");

      // esperan por las invocaciones desde los clientes
      orb.run();
  }
    
}
