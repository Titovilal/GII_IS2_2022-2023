package es.uv.modelo;

public class Medicamento {

    private int idMedicamento, unidades;
    private String nombre, alergias, efectosSecunadarios, dosis;

    public Medicamento() {
    }
    
    public Medicamento(int idMedicamento, String nombre, int unidades, String alergias, String efectosSecunadarios, String dosis) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.unidades = unidades;
        this.alergias = alergias;
        this.efectosSecunadarios = efectosSecunadarios;
        this.dosis = dosis;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String alergias) {
        this.nombre = nombre;
    }
    
    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEfectosSecunadarios() {
        return efectosSecunadarios;
    }

    public void setEfectosSecunadarios(String efectosSecunadarios) {
        this.efectosSecunadarios = efectosSecunadarios;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
}
