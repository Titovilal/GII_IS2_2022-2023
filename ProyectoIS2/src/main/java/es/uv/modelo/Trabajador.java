package es.uv.modelo;

import java.util.List;

public class Trabajador {

    private int idTrabajador;
    private String usuario;
    private String contra;
    private Boolean esMedico;
    private Enfermera enfermera;

    //private List<Paciente> aux; //Lista auxiliar hasta que se pueda pasar información a la base de datos
    public Trabajador() {
    }

    public Trabajador(int idTrabajador, String usuario, String contrasenya, Boolean esMedico) {
        this.idTrabajador = idTrabajador;
        this.usuario = usuario;
        this.contra = contrasenya;
        this.esMedico = esMedico;
        if (Boolean.FALSE.equals(esMedico))//Enfermera
        {
            enfermera = new Enfermera();
        }
    }

    public void crearPaciente(int idPaciente, int habitacion, String dni, String apellidos, String sintomas) {
        if (Boolean.FALSE.equals(esMedico))//Enfermera
        {
            enfermera.crearPaciente(idPaciente, habitacion, dni, apellidos, sintomas);
        }
    }

    public List<Medicamento> comprobarBotiquin(int num, AccesoBD bd) {
        if (Boolean.FALSE.equals(esMedico))//Enfermera
        {
            return enfermera.comprobarBotiquin(num, bd);
        }
        return null;
    }

    public List<Medicamento> medicamentosDiarios(Paciente p, AccesoBD bd) {
        if (Boolean.FALSE.equals(esMedico))//Enfermera
        {
            return enfermera.medicamentosDiarios(p, bd);
        }
        return null;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String medico) {
        this.usuario = medico;
    }

    public String getContrasenya() {
        return contra;
    }

    public void setContrasenya(String contrasenya) {
        this.contra = contrasenya;
    }

    public Boolean getEsMedico() {
        return esMedico;
    }

    public void setEsMedico(Boolean esMedico) {
        this.esMedico = esMedico;
    }
}
