/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.modelo;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Enfermera extends Trabajador {
    private List<Paciente> aux; //Lista auxiliar hasta que se pueda pasar información a la base de datos

    public Enfermera() {
    }
    
    public void crearPaciente(int idPaciente, int habitacion, String dni, String apellidos, String sintomas){
        aux.add(new Paciente( idPaciente, habitacion, dni, apellidos, sintomas));
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
    
    public List<Medicamento> medicamentosDiarios(Paciente p, AccesoBD bd){
        List<Medicamento> medicamentos = bd.obtenerMedicamentosBD();
        Iterator<Medicamento> it = medicamentos.listIterator();
        return medicamentos;
    }
    
}
