package es.uv.modelo;

import java.util.List;

public class Enfermera extends Trabajador implements InterTrabajador {

    private List<Paciente> aux; //Lista auxiliar hasta que se pueda pasar información a la base de datos

    public Enfermera() {
        //Constructor
    }

    public void crearPaciente(int idPaciente, int habitacion, String dni, String apellidos, String sintomas) {
        aux.add(new Paciente(idPaciente, habitacion, dni, apellidos, sintomas));
    }

    public Paciente devolverPacienteCreado() {
        return aux.get(0);
    }

    public List<Medicamento> comprobarBotiquin(int num, AccesoBD bd) {

        List<Medicamento> medicamentos = bd.obtenerMedicamentosBD();
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getUnidades() >= num) {
                medicamentos.remove(medicamento);
            }
        }
        return medicamentos;
    }

    public List<Medicamento> medicamentosDiarios(Paciente p, AccesoBD bd) {
        return bd.obtenerMedicamentosBD();
    }
}
