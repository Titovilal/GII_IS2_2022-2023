package es.uv.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistorialPaciente {

    /**
     * ParFechaEnfermedad
     *
     * Clase empotrada para almacenar un par de variables tipo Date y String
     */
    public class ParFechaEnfermedad {

        public Date fecha;
        public String enfermedad;

        public ParFechaEnfermedad() {
        }

        public ParFechaEnfermedad(Date fecha, String enfermedad) {
            this.fecha = fecha;
            this.enfermedad = enfermedad;
        }
    }
    //Variables fuera de la tabla historialPaciente para hacer consultas    // ¿Se podría poner en public?
    private String apellidosPaciente; 
    private String dniPaciente;
    //Variables de la tabla historialPaciente
    private int idHistorial;
    private int idPaciente;
    private List<ParFechaEnfermedad> paresFechaEnfermedad;

    public HistorialPaciente() {
        paresFechaEnfermedad = new ArrayList<>();
    }

    public HistorialPaciente(int idHistorial, int idPaciente, List<ParFechaEnfermedad> paresFechaEnfermedad) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.paresFechaEnfermedad = paresFechaEnfermedad;
    }

    public String getApellidosPaciente() {
        return apellidosPaciente;
    }

    public void setApellidosPaciente(String apellidosPaciente) {
        this.apellidosPaciente = apellidosPaciente;
    }

    public String getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public List<ParFechaEnfermedad> getParesFechaEnfermedad() {
        return paresFechaEnfermedad;
    }

    public void setParesFechaEnfermedad(List<ParFechaEnfermedad> paresFechaEnfermedad) {
        this.paresFechaEnfermedad = paresFechaEnfermedad;
    }

    public void addParFechaEnfermedad(Date fecha, String enfermedad) {
        paresFechaEnfermedad.add(new ParFechaEnfermedad(fecha, enfermedad));
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
}
