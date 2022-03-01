package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/PersonalDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Tuesday, March 1, 2022 2:25:28 PM COT
*/

abstract public class PersonalDTOHelper
{
  private static String  _id = "IDL:sop_corba/GestionUsuarios/PersonalDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, personal.sop_corba.GestionUsuariosPackage.PersonalDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static personal.sop_corba.GestionUsuariosPackage.PersonalDTO extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [6];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "tipoId",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "nombreCompleto",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "ocupacion",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "usuario",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "clave",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (personal.sop_corba.GestionUsuariosPackage.PersonalDTOHelper.id (), "PersonalDTO", _members0);
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

  public static personal.sop_corba.GestionUsuariosPackage.PersonalDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    personal.sop_corba.GestionUsuariosPackage.PersonalDTO value = new personal.sop_corba.GestionUsuariosPackage.PersonalDTO ();
    value.tipoId = istream.read_string ();
    value.id = istream.read_long ();
    value.nombreCompleto = istream.read_string ();
    value.ocupacion = istream.read_string ();
    value.usuario = istream.read_string ();
    value.clave = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, personal.sop_corba.GestionUsuariosPackage.PersonalDTO value)
  {
    ostream.write_string (value.tipoId);
    ostream.write_long (value.id);
    ostream.write_string (value.nombreCompleto);
    ostream.write_string (value.ocupacion);
    ostream.write_string (value.usuario);
    ostream.write_string (value.clave);
  }

}
