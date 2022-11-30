/**
 * Enfermedad
 * 
 * Objeto que representa una enfermedad dentro del sistema
 * 
 */
package es.uv.modelo;

public class Enfermedad {

    private int idEnfermedad;
    private String sintomas;
    private Boolean contagiosa;

    /**
     *  Enfermedad()
     * 
     * Constructor de la clase Enfermedad para enfermedades sin inicializar
     * 
     */
    public Enfermedad() {
    }

    /**
     *  Enfermedad (int, String, Boolean)
     * 
     * Constructor de la clase Enfermedad para la inicialización de enfermedades
     * 
     * @param idEnfermedad (int) Código de indentificación de la enfermedad
     * @param sintomas (String) Síntomas de la enfermedad
     * @param contagiosa (Boolean) Valor que determina si es o no contagiosa
     * 
     */
    public Enfermedad(int idEnfermedad, String sintomas, Boolean contagiosa) {
        this.idEnfermedad = idEnfermedad;
        this.sintomas = sintomas;
        this.contagiosa = contagiosa;
    }
    
    /**
     * getEnfermedad()
     * 
     * Función que obtiene el código de la enfermedad
     * 
     * @return idEnfermedad(int) Código de indentificación de la enfermedad
     */
    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    /**
     * setIdEnfermedad(int)
     * 
     * Función que establece el código de una enfermedad
     * 
     * @param idEnfermedad (int) Código de indentificación de la enfermedad
     */
    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }
    
    /**
     * getSintomas()
     * 
     * Función que obtiene los síntomas de una enfermedad
     * 
     * @return sintomas(String) Síntomas de la enfermedad
     */

    public String getSintomas() {
        return sintomas;
    }

    
    /**
     * setSintomas(String)
     * 
     * Función que establece los síntomas de una enfermedad
     * 
     * @param sintomas (String) Síntomas de la enfermedad
     */
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    /**
     * getContagiosa()
     * 
     * Función que obtiene si una enfermedad es contagiosa o no
     * 
     * @return contagiosa (Boolean) Valor que determina si es o no contagiosa
     */
    public Boolean getContagiosa() {
        return contagiosa;
    }

    
    /**
     * setContagiosa(Boolean)
     * 
     * Función que establece si una enfermedad es contagiosa o no
     * 
     * @param contagiosa (Boolean) Valor que determina si es o no contagiosa
     */
    public void setContagiosa(Boolean contagiosa) {
        this.contagiosa = contagiosa;
    }
}
