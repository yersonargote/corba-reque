package personal.sop_corba.GestionUsuariosPackage;

/**
* sop_corba/GestionUsuariosPackage/PersonalDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Sunday, February 20, 2022 9:09:21 PM COT
*/

public final class PersonalDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public personal.sop_corba.GestionUsuariosPackage.PersonalDTO value = null;

  public PersonalDTOHolder ()
  {
  }

  public PersonalDTOHolder (personal.sop_corba.GestionUsuariosPackage.PersonalDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = personal.sop_corba.GestionUsuariosPackage.PersonalDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
        personal.sop_corba.GestionUsuariosPackage.PersonalDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return personal.sop_corba.GestionUsuariosPackage.PersonalDTOHelper.type ();
  }

}
