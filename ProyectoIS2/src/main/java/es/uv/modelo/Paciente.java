package es.uv.modelo;

public class Paciente {

    private int idPaciente;
    private int habitacion;
    private String dni;
    private String apellidos;
    private String sintomas;

    public Paciente() {
    }

    public Paciente(int idPaciente, int habitacion, String dni, String apellidos, String sintomas) {
        this.idPaciente = idPaciente;
        this.habitacion = habitacion;
        this.dni = dni;
        this.apellidos = apellidos;
        this.sintomas = sintomas;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return apellidos;
    }

}
