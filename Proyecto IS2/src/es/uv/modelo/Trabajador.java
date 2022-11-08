/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.modelo;

import java.util.Iterator;
import java.util.List;

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

    public Trabajador(int idTrabajador, String medico, String contrasenya, Boolean esMedico) {
        this.idTrabajador = idTrabajador;
        this.usuario = medico;
        this.contra = contrasenya;
        this.esMedico = esMedico;
    }
    
    public void crearPaciente(int idPaciente, int habitacion, String dni, String apellidos, String sintomas){
        Paciente paciente = new Paciente( idPaciente, habitacion, dni, apellidos, sintomas);
    }
    
    public List<Medicamento> comprobarBotiquin(int num,AccesoBD bd){
        
        List<Medicamento> medicamentos = bd.obtenerMedicamentosBD();
        Iterator<Medicamento> it = medicamentos.listIterator();
        while(it.hasNext()){
            if(it.next().getUnidades()>=num)
                medicamentos.remove(it);
        }
        return medicamentos;        
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
