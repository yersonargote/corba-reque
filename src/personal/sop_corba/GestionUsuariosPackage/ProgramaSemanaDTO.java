package personal.sop_corba.GestionUsuariosPackage;

import java.util.Arrays;


/**
* personal/sop_corba/GestionUsuariosPackage/ProgramaSemanaDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from usuarios.idl
* Sunday, February 27, 2022 4:47:09 PM COT
*/

public final class ProgramaSemanaDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String semana = null;
  public personal.sop_corba.GestionUsuariosPackage.EjercicioDTO ejercicios[] = new personal.sop_corba.GestionUsuariosPackage.EjercicioDTO[0];

  public ProgramaSemanaDTO ()
  {
  } // ctor

  public ProgramaSemanaDTO (String _semana, personal.sop_corba.GestionUsuariosPackage.EjercicioDTO[] _ejercicios)
  {
    semana = _semana;
    ejercicios = _ejercicios;
  } // ctor

    @Override
    public String toString() {
        return "Semana=" + semana + "\nEjercicios=" + Arrays.toString(ejercicios);
    }

} // class ProgramaSemanaDTO
