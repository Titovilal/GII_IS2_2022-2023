/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.modelo;

/**
 *
 * @author scast
 */
public class Trabajador {

    private int idTrabajador;
    private String usuario, contra;
    private Boolean esMedico;
    
    public Trabajador(){
    }

    public Trabajador(int idTrabajador, String medico, String contraseña, Boolean esMedico) {
        this.idTrabajador = idTrabajador;
        this.usuario = medico;
        this.contra = contraseña;
        this.esMedico = esMedico;
    }
    
    public void crearPaciente(int idPaciente, int habitacion, String dni, String apellidos, String sintomas){
        Paciente paciente = new Paciente( idPaciente, habitacion, dni, apellidos, sintomas);
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

    public String getContraseña() {
        return contra;
    }

    public void setContraseña(String contraseña) {
        this.contra = contraseña;
    }

    public Boolean getEsMedico() {
        return esMedico;
    }

    public void setEsMedico(Boolean esMedico) {
        this.esMedico = esMedico;
    }
}
