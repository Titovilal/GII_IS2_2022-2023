package es.uv.modelo;

public class Enfermera {

    private String nombre, usuario, contraseña;
    public void altaPaciente(String nombrePaciente, String apellidosPaciente, String dniPaciente)
    {
        //base de datos = new Paciente(nombrePaciente, apellidosPaciente, dniPaciente);
        Paciente p = new Paciente(nombrePaciente, apellidosPaciente, dniPaciente);
    }
}
