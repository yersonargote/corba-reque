package personal.sop_corba.GestionUsuariosPackage;

/**
* personal/sop_corba/GestionUsuariosPackage/AsistenciaDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Saturday, February 26, 2022 12:42:38 AM COT
*/

public final class AsistenciaDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO value = null;

  public AsistenciaDTOHolder ()
  {
  }

  public AsistenciaDTOHolder (personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = personal.sop_corba.GestionUsuariosPackage.AsistenciaDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    personal.sop_corba.GestionUsuariosPackage.AsistenciaDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return personal.sop_corba.GestionUsuariosPackage.AsistenciaDTOHelper.type ();
  }

}
