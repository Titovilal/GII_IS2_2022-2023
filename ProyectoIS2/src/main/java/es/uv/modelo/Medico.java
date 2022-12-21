package es.uv.modelo;

/**
 * class Medico
 * 
 * Clase que implementa la interfaz de trabajador y que representa a un médico dentro de la aplicación
 * 
 * @author mopns
 * @since 30/11/22
 * @version 1.0
 * 
 */

public class Medico implements InterTrabajador {

    private int id;
    private String usuario;
    private String contra;
    private Boolean esMedico;
    
    
    /**
     * getIdTrabajador()
     * 
     * Devuelve el id del trabajador
     * 
     * @return id (int) ID del trabajador
     * 
     */
    @Override
    public int getIdTrabajador() 
    {
        return this.id;
    }
    
    /**
     * setIdTrabajador(int)
     * 
     * Establece el id del trabajador
     * 
     * @param idTrabajador (int) ID del trabajador
     * 
     */
    @Override
    public void setIdTrabajador(int idTrabajador) {
        this.id = idTrabajador;
    }
    
    /**
     * getUsuario()
     * 
     * Devuelve el nombre del usuario
     * 
     * @return usuario(String) Nombre del usuario 
     * 
     */
    @Override
    public String getUsuario() {
        return this.usuario;
    }

     /**
     * setUsuario(String)
     * 
     * Establece el nombre del usuario
     * 
     * @param medico(String) Nombre del usuario 
     * 
     */
    @Override
    public void setUsuario(String medico) {
        this.usuario = medico;
    }

    /**
     * getContrasenya()
     * 
     * Devuelve la contraseña del usuario
     * 
     * @return contra(String) Contraseña del usuario
     * 
     */
    @Override
    public String getContrasenya() {
        return this.contra;
    }
    
    /**
     * setContrasenya(String)
     * 
     * Establece la contraseña del usuario
     * 
     * @param contrasenya(String) Contraseña del usuario
     * 
     */
    @Override
    public void setContrasenya(String contrasenya) {
        this.contra = contrasenya;
    }

    /**
     * getEsMedico()
     * 
     * Informa por medio de un bool si el usuario es o no un médico
     * 
     * @return esMedico(bool) Valor que determina si el usuario es o no médico
     * 
     */
    @Override
    public Boolean getEsMedico() {
        return this.esMedico;
    }

    /**
     * setEsMedico(Boolean)
     * 
     * Establece el valor que determina si el usuario es o no médico
     * 
     * @param esMedico (Boolean) Valor que determina si el usuario es o no médico
     * 
     */
    @Override
    public void setEsMedico(Boolean esMedico) {
        this.esMedico = esMedico;
    }

}
