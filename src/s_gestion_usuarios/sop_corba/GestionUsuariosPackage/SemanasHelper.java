package s_gestion_usuarios.sop_corba.GestionUsuariosPackage;


/**
* s_gestion_usuarios/sop_corba/GestionUsuariosPackage/SemanasHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Saturday, March 5, 2022 10:59:07 AM COT
*/

abstract public class SemanasHelper
{
  private static String  _id = "IDL:sop_corba/GestionUsuarios/Semanas:1.0";

  public static void insert (org.omg.CORBA.Any a, s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTOHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (s_gestion_usuarios.sop_corba.GestionUsuariosPackage.SemanasHelper.id (), "Semanas", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO[] read (org.omg.CORBA.portable.InputStream istream)
  {
    s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO value[] = null;
    int _len0 = istream.read_long ();
    value = new s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTOHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      s_gestion_usuarios.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTOHelper.write (ostream, value[_i0]);
  }

}