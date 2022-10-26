package es.uv.modelo;

public class HistorialPaciente {

    private int idHistorial, idPaciente,idEnfermedad, fechaAlta;

    public HistorialPaciente(int idHistorial, int idPaciente, int idEnfermedad, int fechaAlta) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.idEnfermedad = idEnfermedad;
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

    public int getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(int fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    
}
