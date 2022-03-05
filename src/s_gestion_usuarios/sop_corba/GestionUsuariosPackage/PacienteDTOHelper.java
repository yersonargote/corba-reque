package s_gestion_usuarios.sop_corba.GestionUsuariosPackage;


/**
* s_gestion_usuarios/sop_corba/GestionUsuariosPackage/PacienteDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Saturday, March 5, 2022 10:59:07 AM COT
*/

abstract public class PacienteDTOHelper
{
  private static String  _id = "IDL:sop_corba/GestionUsuarios/PacienteDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PacienteDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PacienteDTO extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [8];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "nombre",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "facultad",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "tipoUsuario",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "fechaIngreso",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "patologia",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[6] = new org.omg.CORBA.StructMember (
            "usuario",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[7] = new org.omg.CORBA.StructMember (
            "clave",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PacienteDTOHelper.id (), "PacienteDTO", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PacienteDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PacienteDTO value = new s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PacienteDTO ();
    value.id = istream.read_long ();
    value.nombre = istream.read_string ();
    value.facultad = istream.read_string ();
    value.tipoUsuario = istream.read_string ();
    value.fechaIngreso = istream.read_string ();
    value.patologia = istream.read_string ();
    value.usuario = istream.read_string ();
    value.clave = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, s_gestion_usuarios.sop_corba.GestionUsuariosPackage.PacienteDTO value)
  {
    ostream.write_long (value.id);
    ostream.write_string (value.nombre);
    ostream.write_string (value.facultad);
    ostream.write_string (value.tipoUsuario);
    ostream.write_string (value.fechaIngreso);
    ostream.write_string (value.patologia);
    ostream.write_string (value.usuario);
    ostream.write_string (value.clave);
  }

}