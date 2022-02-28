// AsistenciaDTO

    public String toCsv() {
        return String.format("%d,%d,%s,%s%n", this.id, this.idPaciente, this.fecha, this.observacion);
    }

    public String toPrint() {
        return String.format("Id: %d%nId paciente: %d%nFecha: %s%nObservacion: %s%n", this.id, this.idPaciente, this.fecha, this.observacion);
    }

// ValoracionFisicaDTO
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