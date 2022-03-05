// AsistenciaDTO

    public int id = (int) 0;
    public int idPaciente = (int) 0;
    public String fecha = "";
    public String observacion = "";

    public String toCsv() {
        return String.format("%d,%d,%s,%s%n", this.id, this.idPaciente, this.fecha, this.observacion);
    }

    public String toPrint() {
        return String.format("Id: %d%nId paciente: %d%nFecha: %s%nObservacion: %s%n", this.id, this.idPaciente, this.fecha, this.observacion);
    }

// Credenciales
    public String usuario = "";
    public String clave = "";

// Ejercicio
    public int id = (int) 0;
    public String nombre = "";
    public int repeticiones = (int) 0;
    public float peso = (float) 0;

    @Override
    public String toString() {
        return "\nId=" + id + "\nNombre=" + nombre + "\nRepeticiones=" + repeticiones + "\nPeso=" + peso;
    }

// Paciente
    public int id = (int) 0;
    public String nombre = "";
    public String facultad = "";
    public String tipoUsuario = "";
    public String fechaIngreso = "";
    public String patologia = "";
    public String usuario = "";
    public String clave = "";

// Personal
    public String tipoId = "";
    public int id = (int) 0;
    public String nombreCompleto = "";
    public String ocupacion = "";
    public String usuario = "";
    public String clave = "";

// ProgramaFisico
    public int id = (int) 0;
    public int idPaciente = (int) 0;
    public String fechaInicio = "";
    public personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO semanas[] = new personal.sop_corba.GestionUsuariosPackage.ProgramaSemanaDTO[0];

    @Override
    public String toString() {
        return "Id=" + id + "\nId Paciente=" + idPaciente + "\nFecha Inicio=" + fechaInicio + "\nSemanas=" + Arrays.toString(semanas);
    }

// ProgramaSemana
    public String semana = "";
    public personal.sop_corba.GestionUsuariosPackage.EjercicioDTO ejercicios[] = new personal.sop_corba.GestionUsuariosPackage.EjercicioDTO[0];

    @Override
    public String toString() {
        return "Semana=" + semana + "\nEjercicios=" + Arrays.toString(ejercicios);
    }

// ValoracionFisicaDTO
    public int id = (int) 0;
    public int idPaciente = (int) 0;
    public String fecha = "";
    public int frecuenciaCardiacaReposo = (int) 0;
    public int frecuenciaCardiacaActiva = (int) 0;
    public int estatura = (int) 0;
    public int brazo = (int) 0;
    public int pecho = (int) 0;
    public int cintura = (int) 0;
    public String estado = "";
    
    public String toCsv() {
        return String.format("%d,%d,%s,%d,%d,%d,%d,%d,%d,%s%n",
                this.id, this.idPaciente, this.fecha, this.frecuenciaCardiacaReposo,
                this.frecuenciaCardiacaActiva, this.estatura, this.brazo, this.pecho,
                this.cintura, this.estado);
    }
    
    public String toPrint() {
        return "Valoracion Fisica.\n" + "Id Paciente: " + idPaciente + " - Fecha: " + fecha 
                + "\nFrecuencia Cardiaca en Reposo: " + frecuenciaCardiacaReposo + " - Frecuencia Cardiaca Activa: " + frecuenciaCardiacaActiva
                + "\nEstatura: " + estatura + " - Brazo: " + brazo + " - Pecho: " + pecho + " - Cintura: " + cintura + " - Estado:" + estado;
    }