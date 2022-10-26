package es.uv.modelo;

public class Enfermedad {

    private int idEnfermedad;
    private String sintomas;
    private Boolean contagiosa;

    public Enfermedad(int idEnfermedad, String sintomas, Boolean contagiosa) {
        this.idEnfermedad = idEnfermedad;
        this.sintomas = sintomas;
        this.contagiosa = contagiosa;
    }

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Boolean getContagiosa() {
        return contagiosa;
    }

    public void setContagiosa(Boolean contagiosa) {
        this.contagiosa = contagiosa;
    }
}
