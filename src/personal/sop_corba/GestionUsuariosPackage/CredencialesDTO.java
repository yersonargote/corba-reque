package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/CredencialesDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Saturday, February 26, 2022 12:42:38 AM COT
*/

public final class CredencialesDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String usuario = null;
  public String clave = null;

  public CredencialesDTO ()
  {
  } // ctor

  public CredencialesDTO (String _usuario, String _clave)
  {
    usuario = _usuario;
    clave = _clave;
  } // ctor

} // class CredencialesDTO
