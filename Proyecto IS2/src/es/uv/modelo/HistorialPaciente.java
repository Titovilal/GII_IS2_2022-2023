package es.uv.modelo;

//import com.mysql.cj.conf.ConnectionUrlParser.Pair;
//import java.util.ArrayList;
import java.util.Date;

public class HistorialPaciente {

    private int idHistorial, idPaciente, idEnfermedad;
    private Date fechaAlta;
    //private ArrayList<Pair<Date, String>> vectorFechaEnfermedad;

    public HistorialPaciente() {
    }
    
    public HistorialPaciente(int idHistorial, int idPaciente, int idEnfermedad, Date fechaAlta) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.idEnfermedad = idEnfermedad;
        this.fechaAlta = fechaAlta;
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

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

}
