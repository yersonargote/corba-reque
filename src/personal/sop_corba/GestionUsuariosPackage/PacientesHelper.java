package personal.sop_corba.GestionUsuariosPackage;


/**
* personal/sop_corba/GestionUsuariosPackage/PacientesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Tuesday, March 1, 2022 2:25:28 PM COT
*/

abstract public class PacientesHelper
{
  private static String  _id = "IDL:sop_corba/GestionUsuarios/Pacientes:1.0";

  public static void insert (org.omg.CORBA.Any a, personal.sop_corba.GestionUsuariosPackage.PacienteDTO[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static personal.sop_corba.GestionUsuariosPackage.PacienteDTO[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = personal.sop_corba.GestionUsuariosPackage.PacienteDTOHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (personal.sop_corba.GestionUsuariosPackage.PacientesHelper.id (), "Pacientes", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static personal.sop_corba.GestionUsuariosPackage.PacienteDTO[] read (org.omg.CORBA.portable.InputStream istream)
  {
    personal.sop_corba.GestionUsuariosPackage.PacienteDTO value[] = null;
    int _len0 = istream.read_long ();
    value = new personal.sop_corba.GestionUsuariosPackage.PacienteDTO[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = personal.sop_corba.GestionUsuariosPackage.PacienteDTOHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, personal.sop_corba.GestionUsuariosPackage.PacienteDTO[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      personal.sop_corba.GestionUsuariosPackage.PacienteDTOHelper.write (ostream, value[_i0]);
  }

}
