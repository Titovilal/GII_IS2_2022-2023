/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package es.uv.modelo;

import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Miguel
 */
public class EnfermeraTest {
    
    public EnfermeraTest() {
    }

    @Test
    public void testCrearPaciente() {
        Enfermera instancia = new Enfermera();
        instancia.crearPaciente(0,0,"","","");
        assertNull(instancia.devolverPacienteCreado());
    }

    @Test
    public void testComprobarBotiquin() {
        boolean en_rango = true;
        Enfermera instancia = new Enfermera();
        AccesoBD bd = null;
        bd.comprobarAcceso();
        List<Medicamento> medicamentos = instancia.comprobarBotiquin(5, bd);
        Iterator<Medicamento> it = medicamentos.listIterator();
        while (it.hasNext() && en_rango) {
            if (it.next().getUnidades() < 5) {
                en_rango=false;
            }
        }
        assertFalse(en_rango);
    }

    @Test
    public void testMedicamentosDiarios() {
    }
    
}
