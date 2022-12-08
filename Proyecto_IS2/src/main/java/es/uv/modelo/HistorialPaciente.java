package es.uv.modelo;

//import com.mysql.cj.conf.ConnectionUrlParser.Pair;
//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;

public class HistorialPaciente {

    /**
     * ParFechaEnfermedad
     *
     * Clase empotrada para almacenar un par de variables tipo Date y String
     */
    class ParFechaEnfermedad {

        public Date fecha;
        public String enfermedad;

        public ParFechaEnfermedad() {
        }

        public ParFechaEnfermedad(Date fecha, String enfermedad) {
            this.fecha = fecha;
            this.enfermedad = enfermedad;
        }
    }
    //Variables fuera de la tabla historialPaciente para hacer consultas
    public String apellidosPaciente;
    public String dniPaciente;
    //Variables de la tabla historialPaciente
    private int idHistorial, idPaciente;
    private Date fechaAlta;
    private ArrayList<ParFechaEnfermedad> paresFechaEnfermedad;

    public HistorialPaciente() {
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

    public HistorialPaciente(int idHistorial, int idPaciente, Date fechaAlta, ArrayList<ParFechaEnfermedad> paresFechaEnfermedad) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.fechaAlta = fechaAlta;
        this.paresFechaEnfermedad = paresFechaEnfermedad;
    }

    public ArrayList<ParFechaEnfermedad> getParesFechaEnfermedad() {
        return paresFechaEnfermedad;
    }

    public void setParesFechaEnfermedad(ArrayList<ParFechaEnfermedad> paresFechaEnfermedad) {
        this.paresFechaEnfermedad = paresFechaEnfermedad;
    }
    
    public void addParFechaEnfermedad (Date fecha, String enfermedad){
        paresFechaEnfermedad.add(new ParFechaEnfermedad(fecha, enfermedad));
    }
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
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