/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.modelo;

import java.util.Date;

/**
 *
 * @author scast
 */
public class Visita {
    private int idVisita, idTrabajador, idPaciente;
    private Date fecha;

    public Visita() {
    }
    public Visita(int idVisita, int idTrabajador, int idPaciente, Date fecha) {
        this.idVisita = idVisita;
        this.idTrabajador = idTrabajador;
        this.idPaciente = idPaciente;
        this.fecha = fecha;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
