/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

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
public class testRaul {

    @Test
    public void testConexiónBD() {
        Boolean res;
        res = AccesoBD.abrirConexionBD();
        assertTrue(res);
        fail("el test falla");

    }
    
    @Test
    public void testObtenerEnfermedadesBD(){ //habria que repetir la misma función para cada tabla
        List<Enfermedad> arrayEjemplo = new ArrayList<Enfermedad>();
        List<Enfermedad> arrayRes = new ArrayList<Enfermedad>();
        Enfermedad e1 = new Enfermedad(1, "lepra", true);
        Enfermedad e2 = new Enfermedad(2, "cancer", true);
        
        arrayEjemplo.add(e1);
        arrayEjemplo.add(e2);
        
        arrayRes = AccesoBD.obtenerEnfermedadesBD();
        
        //assertArrayEquals(arrayEjemplo, arrayRes); no entiendo por que no funciona
        fail("el test falla");

    }
    
    @Test
    public void testLoginTrabajador(){
        Trabajador tEjemploBien = new Trabajador(1, "medico", "medico", true);
        Trabajador tEjemploMal = new Trabajador();
        Trabajador resBien;
        Trabajador resMal;
        
        
        resBien = AccesoBD.loginTrabajador("medico", "medico");
        resMal = AccesoBD.loginTrabajador("medico", "medique");
        
        assertEquals(resBien, tEjemploBien);
        assertEquals(resMal, tEjemploMal);
        fail("el test falla");

    }

}
