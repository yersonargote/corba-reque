package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/PacienteDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Saturday, February 26, 2022 12:42:38 AM COT
*/

public final class PacienteDTO implements org.omg.CORBA.portable.IDLEntity
{
  public int id = (int)0;
  public String nombre = null;
  public String facultad = null;
  public String tipoUsuario = null;
  public String fechaIngreso = null;
  public String patologia = null;
  public String usuario = null;
  public String clave = null;

  public PacienteDTO ()
  {
  } // ctor

  public PacienteDTO (int _id, String _nombre, String _facultad, String _tipoUsuario, String _fechaIngreso, String _patologia, String _usuario, String _clave)
  {
    id = _id;
    nombre = _nombre;
    facultad = _facultad;
    tipoUsuario = _tipoUsuario;
    fechaIngreso = _fechaIngreso;
    patologia = _patologia;
    usuario = _usuario;
    clave = _clave;
  } // ctor

} // class PacienteDTO
