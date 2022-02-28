package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/AsistenciaDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Sunday, February 27, 2022 4:47:09 PM COT
*/

abstract public class AsistenciaDTOHelper
{
  private static String  _id = "IDL:sop_corba/GestionUsuarios/AsistenciaDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "idPaciente",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "fecha",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "observacion",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (personal.sop_corba.GestionUsuariosPackage.AsistenciaDTOHelper.id (), "AsistenciaDTO", _members0);
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

  public static personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO value = new personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO ();
    value.id = istream.read_long ();
    value.idPaciente = istream.read_long ();
    value.fecha = istream.read_string ();
    value.observacion = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO value)
  {
    ostream.write_long (value.id);
    ostream.write_long (value.idPaciente);
    ostream.write_string (value.fecha);
    ostream.write_string (value.observacion);
  }

}
