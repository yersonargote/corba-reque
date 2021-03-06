package personal.sop_corba;


/**
* personal/sop_corba/_GestionUsuariosStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Sunday, February 27, 2022 4:47:09 PM COT
*/

public class _GestionUsuariosStub extends org.omg.CORBA.portable.ObjectImpl implements personal.sop_corba.GestionUsuarios
{

  public int abrirSesion (personal.sop_corba.GestionUsuariosPackage.CredencialesDTO credenciales)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("abrirSesion", true);
                personal.sop_corba.GestionUsuariosPackage.CredencialesDTOHelper.write ($out, credenciales);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return abrirSesion (credenciales        );
            } finally {
                _releaseReply ($in);
            }
  } // abrirSesion

  public boolean registrarPersonal (personal.sop_corba.GestionUsuariosPackage.PersonalDTO paciente)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarPersonal", true);
                personal.sop_corba.GestionUsuariosPackage.PersonalDTOHelper.write ($out, paciente);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registrarPersonal (paciente        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarPersonal

  public personal.sop_corba.GestionUsuariosPackage.PersonalDTO consultarPersonal (int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarPersonal", true);
                $out.write_long (id);
                $in = _invoke ($out);
                personal.sop_corba.GestionUsuariosPackage.PersonalDTO $result = personal.sop_corba.GestionUsuariosPackage.PersonalDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarPersonal (id        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarPersonal

  public personal.sop_corba.GestionUsuariosPackage.PersonalDTO[] listarPersonal ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listarPersonal", true);
                $in = _invoke ($out);
                personal.sop_corba.GestionUsuariosPackage.PersonalDTO $result[] = personal.sop_corba.GestionUsuariosPackage.PersonasHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listarPersonal (        );
            } finally {
                _releaseReply ($in);
            }
  } // listarPersonal

  public boolean registrarPaciente (personal.sop_corba.GestionUsuariosPackage.PacienteDTO paciente)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarPaciente", true);
                personal.sop_corba.GestionUsuariosPackage.PacienteDTOHelper.write ($out, paciente);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registrarPaciente (paciente        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarPaciente

  public personal.sop_corba.GestionUsuariosPackage.PacienteDTO consultarPaciente (int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarPaciente", true);
                $out.write_long (id);
                $in = _invoke ($out);
                personal.sop_corba.GestionUsuariosPackage.PacienteDTO $result = personal.sop_corba.GestionUsuariosPackage.PacienteDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarPaciente (id        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarPaciente

  public personal.sop_corba.GestionUsuariosPackage.PacienteDTO[] listarPacientes ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("listarPacientes", true);
                $in = _invoke ($out);
                personal.sop_corba.GestionUsuariosPackage.PacienteDTO $result[] = personal.sop_corba.GestionUsuariosPackage.PacientesHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return listarPacientes (        );
            } finally {
                _releaseReply ($in);
            }
  } // listarPacientes

  public boolean registrarValoracionFisica (personal.sop_corba.GestionUsuariosPackage.ValoracionFisicaDTO valoracion)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarValoracionFisica", true);
                personal.sop_corba.GestionUsuariosPackage.ValoracionFisicaDTOHelper.write ($out, valoracion);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registrarValoracionFisica (valoracion        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarValoracionFisica

  public personal.sop_corba.GestionUsuariosPackage.ValoracionFisicaDTO consultarValoracionFisica (int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarValoracionFisica", true);
                $out.write_long (id);
                $in = _invoke ($out);
                personal.sop_corba.GestionUsuariosPackage.ValoracionFisicaDTO $result = personal.sop_corba.GestionUsuariosPackage.ValoracionFisicaDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarValoracionFisica (id        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarValoracionFisica

  public boolean registrarAsistencia (personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO asistencia)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarAsistencia", true);
                personal.sop_corba.GestionUsuariosPackage.AsistenciaDTOHelper.write ($out, asistencia);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registrarAsistencia (asistencia        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarAsistencia

  public personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO[] consultarAsistencia (int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarAsistencia", true);
                $out.write_long (id);
                $in = _invoke ($out);
                personal.sop_corba.GestionUsuariosPackage.AsistenciaDTO $result[] = personal.sop_corba.GestionUsuariosPackage.AsistenciasHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarAsistencia (id        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarAsistencia

  public boolean registrarProgramaFisico (personal.sop_corba.GestionUsuariosPackage.ProgramaFisicoDTO programa)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarProgramaFisico", true);
                personal.sop_corba.GestionUsuariosPackage.ProgramaFisicoDTOHelper.write ($out, programa);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return registrarProgramaFisico (programa        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarProgramaFisico

  public personal.sop_corba.GestionUsuariosPackage.ProgramaFisicoDTO consultarProgramaFisico (int id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarProgramaFisico", true);
                $out.write_long (id);
                $in = _invoke ($out);
                personal.sop_corba.GestionUsuariosPackage.ProgramaFisicoDTO $result = personal.sop_corba.GestionUsuariosPackage.ProgramaFisicoDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarProgramaFisico (id        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarProgramaFisico

  public void registrarCallback (personal.sop_corba.PafCallback callback)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarCallback", true);
                personal.sop_corba.PafCallbackHelper.write ($out, callback);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                registrarCallback (callback        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarCallback

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/GestionUsuarios:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _GestionUsuariosStub
