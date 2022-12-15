package es.uv.controlador;

import es.uv.modelo.Enfermera;
import es.uv.modelo.Medico;
import es.uv.modelo.InterTrabajador;

public class Factoria {

    /**
     * Método para crear enfermeras y medicos de la interfaz InterTrabajador
     *
     * @param usuario Nombre del objeto a crear por la factoria
     * @return Objeto creado a partir de la especifiación
     */
    public InterTrabajador crearTrabajador(String usuario) {
        if (usuario.equals("medico")) {
            return new Medico();
        } else if (usuario.equals("enfermera")) {
            return new Enfermera();
        }
        throw new UnsupportedOperationException("La clase " + usuario + " no existe: medico o enfermera como opciones validas");
    }
}
