/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package es.uv.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author scast
 */
public class MedicoTest {
    
    public MedicoTest() {
    }

    /**
     * Test of getIdTrabajador method, of class Medico.
     */
    @Test
    public void testGetIdTrabajador() {
        System.out.println("getIdTrabajador");
        Medico instance = new Medico();
        int expResult = 0;
        int result = instance.getIdTrabajador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdTrabajador method, of class Medico.
     */
    @Test
    public void testSetIdTrabajador() {
        System.out.println("setIdTrabajador");
        int idTrabajador = 0;
        Medico instance = new Medico();
        instance.setIdTrabajador(idTrabajador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Medico.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Medico.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String medico = "";
        Medico instance = new Medico();
        instance.setUsuario(medico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContrasenya method, of class Medico.
     */
    @Test
    public void testGetContrasenya() {
        System.out.println("getContrasenya");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.getContrasenya();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContrasenya method, of class Medico.
     */
    @Test
    public void testSetContrasenya() {
        System.out.println("setContrasenya");
        String contrasenya = "";
        Medico instance = new Medico();
        instance.setContrasenya(contrasenya);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEsMedico method, of class Medico.
     */
    @Test
    public void testGetEsMedico() {
        System.out.println("getEsMedico");
        Medico instance = new Medico();
        Boolean expResult = null;
        Boolean result = instance.getEsMedico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEsMedico method, of class Medico.
     */
    @Test
    public void testSetEsMedico() {
        System.out.println("setEsMedico");
        Boolean esMedico = null;
        Medico instance = new Medico();
        instance.setEsMedico(esMedico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
