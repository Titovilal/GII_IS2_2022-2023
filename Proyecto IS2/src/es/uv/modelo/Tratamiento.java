/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.modelo;

/**
 *
 * @author scast
 */
public class Tratamiento {
    private int idTratamiento, idEnfermedad, idMedicamento;
    private String dosis;

    public Tratamiento() {
    }
    public Tratamiento(int idTratamiento, int idEnfermedad, int idMedicamento, String dosis) {
        this.idTratamiento = idTratamiento;
        this.idEnfermedad = idEnfermedad;
        this.idMedicamento = idMedicamento;
        this.dosis = dosis;
    }
    

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
}
