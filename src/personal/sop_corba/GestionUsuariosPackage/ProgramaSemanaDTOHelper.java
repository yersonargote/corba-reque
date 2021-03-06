package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/ProgramaSemanaDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Sunday, February 27, 2022 4:47:09 PM COT
*/

abstract public class ProgramaSemanaDTOHelper
{
  private static String  _id = "IDL:sop_corba/GestionUsuarios/ProgramaSemanaDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "semana",
            _tcOf_members0,
            null);
          _tcOf_members0 = personal.sop_corba.GestionUsuariosPackage.EjercicioDTOHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (personal.sop_corba.GestionUsuariosPackage.EjerciciosHelper.id (), "Ejercicios", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "ejercicios",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTOHelper.id (), "ProgramaSemanaDTO", _members0);
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

  public static personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO value = new personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO ();
    value.semana = istream.read_string ();
    value.ejercicios = personal.sop_corba.GestionUsuariosPackage.EjerciciosHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO value)
  {
    ostream.write_string (value.semana);
    personal.sop_corba.GestionUsuariosPackage.EjerciciosHelper.write (ostream, value.ejercicios);
  }

}
