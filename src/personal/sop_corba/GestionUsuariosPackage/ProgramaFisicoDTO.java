package personal.sop_corba.GestionUsuariosPackage;

import java.util.Arrays;

/**
 * personal/sop_corba/GestionUsuariosPackage/ProgramaFisicoDTO.java . Generated
 * by the IDL-to-Java compiler (portable), version "3.2" from usuarios.idl
 * Tuesday, March 1, 2022 2:25:28 PM COT
 */
public final class ProgramaFisicoDTO implements org.omg.CORBA.portable.IDLEntity {

    public int id = (int) 0;
    public int idPaciente = (int) 0;
    public String fechaInicio = "";
    public personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO semanas[] = new personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO[0];

    public ProgramaFisicoDTO() {
    } // ctor

    public ProgramaFisicoDTO(int _id, int _idPaciente, String _fechaInicio, personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO[] _semanas) {
        id = _id;
        idPaciente = _idPaciente;
        fechaInicio = _fechaInicio;
        semanas = _semanas;
    } // ctor

    @Override
    public String toString() {
        return "Id=" + id + "\nId Paciente=" + idPaciente + "\nFecha Inicio=" + fechaInicio + "\nSemanas=" + Arrays.toString(semanas);
    }
} // class ProgramaFisicoDTO
