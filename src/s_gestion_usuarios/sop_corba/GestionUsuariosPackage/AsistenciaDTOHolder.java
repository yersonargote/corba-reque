package s_gestion_usuarios.sop_corba.GestionUsuariosPackage;

/**
* s_gestion_usuarios/sop_corba/GestionUsuariosPackage/AsistenciaDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Saturday, March 5, 2022 10:59:07 AM COT
*/

public final class AsistenciaDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public s_gestion_usuarios.sop_corba.GestionUsuariosPackage.AsistenciaDTO value = null;

  public AsistenciaDTOHolder ()
  {
  }

  public AsistenciaDTOHolder (s_gestion_usuarios.sop_corba.GestionUsuariosPackage.AsistenciaDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = s_gestion_usuarios.sop_corba.GestionUsuariosPackage.AsistenciaDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    s_gestion_usuarios.sop_corba.GestionUsuariosPackage.AsistenciaDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return s_gestion_usuarios.sop_corba.GestionUsuariosPackage.AsistenciaDTOHelper.type ();
  }

}