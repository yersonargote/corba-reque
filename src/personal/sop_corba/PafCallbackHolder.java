package personal.sop_corba;

/**
* personal/sop_corba/PafCallbackHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Saturday, February 26, 2022 12:42:38 AM COT
*/

public final class PafCallbackHolder implements org.omg.CORBA.portable.Streamable
{
  public personal.sop_corba.PafCallback value = null;

  public PafCallbackHolder ()
  {
  }

  public PafCallbackHolder (personal.sop_corba.PafCallback initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = personal.sop_corba.PafCallbackHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    personal.sop_corba.PafCallbackHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return personal.sop_corba.PafCallbackHelper.type ();
  }

}