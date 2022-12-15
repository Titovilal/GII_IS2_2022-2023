package es.uv.modelo;

import es.uv.modelo.AccesoBD;
import es.uv.modelo.Enfermedad;
import es.uv.modelo.Trabajador;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author raul
 */
public class RaulTest {

    @Test
    public void testConexiónBD() {
        Boolean expResult = true;
        Boolean result = AccesoBD.abrirConexionBD();
        assertEquals(expResult, result);
        //fail("el test falla");
    }

    @Test
    public void testObtenerEnfermedadesBD() { //habria que repetir la misma función para cada tabla
        List<Enfermedad> arrayEjemplo = new ArrayList<Enfermedad>();
        List<Enfermedad> arrayRes = new ArrayList<Enfermedad>();
        Enfermedad e1 = new Enfermedad(1, "lepra", true);
        Enfermedad e2 = new Enfermedad(2, "cancer", true);

        arrayEjemplo.add(e1);
        arrayEjemplo.add(e2);

        arrayRes = AccesoBD.obtenerEnfermedadesBD();

        assertEquals(arrayEjemplo, arrayRes);
        //fail("el test falla");

    }

    @Test
    public void testLoginTrabajador() {
        Trabajador tEjemploBien = new Trabajador(1, "medico", "medico", true);
        Trabajador tEjemploMal = new Trabajador();
        Trabajador resBien;
        Trabajador resMal;

        resBien = AccesoBD.loginTrabajador("medico", "medico");
        resMal = AccesoBD.loginTrabajador("medico", "medique");

        assertEquals(resBien, tEjemploBien);
        assertEquals(resMal, tEjemploMal);
        //fail("el test falla");

    }

}
