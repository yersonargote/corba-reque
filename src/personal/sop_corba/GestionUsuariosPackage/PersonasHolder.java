package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/PersonasHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Sunday, February 27, 2022 4:47:09 PM COT
*/

public final class PersonasHolder implements org.omg.CORBA.portable.Streamable
{
  public personal.sop_corba.GestionUsuariosPackage.PersonalDTO value[] = null;

  public PersonasHolder ()
  {
  }

  public PersonasHolder (personal.sop_corba.GestionUsuariosPackage.PersonalDTO[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = personal.sop_corba.GestionUsuariosPackage.PersonasHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    personal.sop_corba.GestionUsuariosPackage.PersonasHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return personal.sop_corba.GestionUsuariosPackage.PersonasHelper.type ();
  }

}
