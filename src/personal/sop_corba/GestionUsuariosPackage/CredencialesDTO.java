package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/CredencialesDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Sunday, February 27, 2022 4:47:09 PM COT
*/

public final class CredencialesDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String usuario = "";
  public String clave = "";

  public CredencialesDTO ()
  {
  } // ctor

  public CredencialesDTO (String _usuario, String _clave)
  {
    usuario = _usuario;
    clave = _clave;
  } // ctor

} // class CredencialesDTO
