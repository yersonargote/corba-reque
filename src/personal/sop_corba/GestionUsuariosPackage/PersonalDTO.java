package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/PersonalDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Saturday, February 26, 2022 12:42:38 AM COT
*/

public final class PersonalDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String tipoId = null;
  public int id = (int)0;
  public String nombreCompleto = null;
  public String ocupacion = null;
  public String usuario = null;
  public String clave = null;

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
