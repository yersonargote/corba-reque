package s_gestion_usuarios.sop_corba.GestionUsuariosPackage;

/**
 * s_gestion_usuarios/sop_corba/GestionUsuariosPackage/CredencialesDTO.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2" from
 * usuarios.idl Saturday, March 5, 2022 10:59:07 AM COT
 */
public final class CredencialesDTO implements org.omg.CORBA.portable.IDLEntity {

    public String usuario = "";
    public String clave = "";

    public CredencialesDTO() {
    } // ctor

    public CredencialesDTO(String _usuario, String _clave) {
        usuario = _usuario;
        clave = _clave;
    } // ctor

} // class CredencialesDTO