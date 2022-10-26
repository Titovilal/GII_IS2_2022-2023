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
    private String medico, contraseña;
    private Boolean esMedico;

    public Trabajador(int idTrabajador, String medico, String contraseña, Boolean esMedico) {
        this.idTrabajador = idTrabajador;
        this.medico = medico;
        this.contraseña = contraseña;
        this.esMedico = esMedico;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Boolean getEsMedico() {
        return esMedico;
    }

    public void setEsMedico(Boolean esMedico) {
        this.esMedico = esMedico;
    }
}
