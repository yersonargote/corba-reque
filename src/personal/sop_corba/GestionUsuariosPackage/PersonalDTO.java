package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/PersonalDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Sunday, February 27, 2022 4:47:09 PM COT
*/

public final class PersonalDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String tipoId = "";
  public int id = (int)0;
  public String nombreCompleto = "";
  public String ocupacion = "";
  public String usuario = "";
  public String clave = "";

  public PersonalDTO ()
  {
  } // ctor

  public PersonalDTO (String _tipoId, int _id, String _nombreCompleto, String _ocupacion, String _usuario, String _clave)
  {
    tipoId = _tipoId;
    id = _id;
    nombreCompleto = _nombreCompleto;
    ocupacion = _ocupacion;
    usuario = _usuario;
    clave = _clave;
  } // ctor

} // class PersonalDTO
