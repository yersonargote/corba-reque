package s_notificacion_usuarios.sop_corba;


/**
* s_notificacion_usuarios/sop_corba/GestionNotificacionesOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from notificacion.idl
* Saturday, March 5, 2022 10:59:17 AM COT
*/

public interface GestionNotificacionesOperations 
{
  void enviarNotificacion (String mensaje);
  boolean agregarHistorial (int id, String historial);
  boolean agregarAsistencia (String asistencia);
} // interface GestionNotificacionesOperations