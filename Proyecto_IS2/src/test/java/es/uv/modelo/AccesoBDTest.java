package es.uv.modelo;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccesoBDTest {

    public AccesoBDTest() {
    }

    // <editor-fold defaultstate="collapsed" desc="Test Instancia y Constructor"> 
    /**
     * Test of getInstance method, of class AccesoBD.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        AccesoBD expResult = null;
        AccesoBD result = AccesoBD.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test para el constructor
     */
    @Test
    public void testAccesoBD() {

    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Salva - Test historias obtenerHistorial y añadirHistorial">  
    /**
     * Test of obtenerHistorialBD method, of class AccesoBD.
     */
    @Test
    public void testObtenerHistorialBD() {
        System.out.println("obtenerHistorialBD");
        String dni = "";
        HistorialPaciente expResult = null;
        HistorialPaciente result = AccesoBD.obtenerHistorialBD(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of addHistorialPacienteBD method, of class AccesoBD.
     */
    @Test
    public void testAddHistorialPacienteTodoCorrectoBD() {
        System.out.println("addHistorialPacienteBD");
        String dni = "";
        String fecha = "";
        String enfermedad = "";
        boolean expResult = false;
        boolean result = AccesoBD.addHistorialPacienteBD(dni, fecha, enfermedad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHistorialPacienteBD method, of class AccesoBD.
     */
    @Test
    public void testAddHistorialPacienteFechaPosteriorBD() {
        System.out.println("addHistorialPacienteBD");
        String dni = "";
        String fecha = "";
        String enfermedad = "";
        boolean expResult = false;
        boolean result = AccesoBD.addHistorialPacienteBD(dni, fecha, enfermedad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHistorialPacienteBD method, of class AccesoBD.
     */
    @Test
    public void testAddHistorialPacienteFechaAnteriorBD() {
        System.out.println("addHistorialPacienteBD");
        String dni = "";
        String fecha = "";
        String enfermedad = "";
        boolean expResult = false;
        boolean result = AccesoBD.addHistorialPacienteBD(dni, fecha, enfermedad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHistorialPacienteBD method, of class AccesoBD.
     */
    @Test
    public void testAddHistorialPacienteSinEnfermedadBD() {
        System.out.println("addHistorialPacienteBD");
        String dni = "";
        String fecha = "";
        String enfermedad = "";
        boolean expResult = false;
        boolean result = AccesoBD.addHistorialPacienteBD(dni, fecha, enfermedad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHistorialPacienteBD method, of class AccesoBD.
     */
    @Test
    public void testAddHistorialPacienteNoExisteEnfermedadBD() {
        System.out.println("addHistorialPacienteBD");
        String dni = "";
        String fecha = "";
        String enfermedad = "";
        boolean expResult = false;
        boolean result = AccesoBD.addHistorialPacienteBD(dni, fecha, enfermedad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Sergio - Test historias obtenerPacientesDia y obtenerMedicamentosDia">  
    /**
     * Test of obtenerPacientesDelDiaBD method, of class AccesoBD.
     */
    @Test
    public void testObtenerPacientesDelDiaBD() {
        System.out.println("obtenerPacientesDelDiaBD");
        List<Paciente> result = AccesoBD.obtenerPacientesDelDiaBD();
        List<Paciente> expResult = null;

        Paciente p1 = new Paciente(1, 101, "20202020A", "Lopez Guijarro", "Dolor de cabeza");
        Paciente p2 = new Paciente(2, 102, "20202020B", "Agüero Penales", "Fiebre");
        expResult.add(p1);
        expResult.add(p2);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("PAcooooooooo");
    }

    /**
     * Test of obtenerMedicamentosPacienteBD method, of class AccesoBD.
     */
    @Test
    public void testObtenerMedicamentosPacienteBD() {
        System.out.println("obtenerMedicamentosPacienteBD");
        String idPaciente = "";
        List<String> expResult = null;
        List<String> result = AccesoBD.obtenerMedicamentosPacienteBD("1");

        String s1 = "Frenador";
        expResult.add(s1);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("PAcooo2");
    }
    // </editor-fold>

    /**
     * Test of abrirConexionBD method, of class AccesoBD.
     */
    @Test
    public void testAbrirConexionBD() {
        System.out.println("abrirConexionBD");
        Boolean expResult = null;
        Boolean result = AccesoBD.abrirConexionBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarAcceso method, of class AccesoBD.
     */
    @Test
    public void testComprobarAcceso() {
        System.out.println("comprobarAcceso");
        AccesoBD instance = null;
        boolean expResult = false;
        boolean result = instance.comprobarAcceso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarConexionBD method, of class AccesoBD.
     */
    @Test
    public void testCerrarConexionBD() {
        System.out.println("cerrarConexionBD");
        AccesoBD instance = null;
        instance.cerrarConexionBD();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEnfermedadesBD method, of class AccesoBD.
     */
    @Test
    public void testObtenerEnfermedadesBD() {
        System.out.println("obtenerEnfermedadesBD");
        List<Enfermedad> expResult = null;
        List<Enfermedad> result = AccesoBD.obtenerEnfermedadesBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMedicamentosBD method, of class AccesoBD.
     */
    @Test
    public void testObtenerMedicamentosBD() {
        System.out.println("obtenerMedicamentosBD");
        List<Medicamento> expResult = null;
        List<Medicamento> result = AccesoBD.obtenerMedicamentosBD();

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPacientesBD method, of class AccesoBD.
     */
    @Test
    public void testObtenerPacientesBD() {
        System.out.println("obtenerPacientesBD");
        List<Paciente> expResult = null;
        List<Paciente> result = AccesoBD.obtenerPacientesBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTrabajadoresBD method, of class AccesoBD.
     */
    @Test
    public void testObtenerTrabajadoresBD() {
        System.out.println("obtenerTrabajadoresBD");
        List<Trabajador> expResult = null;
        List<Trabajador> result = AccesoBD.obtenerTrabajadoresBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginTrabajador method, of class AccesoBD.
     */
    @Test
    public void testLoginTrabajador() {
        System.out.println("loginTrabajador");
        String usuario = "";
        String contra = "";
        Trabajador expResult = null;
        Trabajador result = AccesoBD.loginTrabajador(usuario, contra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTratamientoBD method, of class AccesoBD.
     */
    @Test
    public void testObtenerTratamientoBD() {
        System.out.println("obtenerTratamientoBD");
        List<Tratamiento> expResult = null;
        List<Tratamiento> result = AccesoBD.obtenerTratamientoBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerVisitasBD method, of class AccesoBD.
     */
    @Test
    public void testObtenerVisitasBD() {
        System.out.println("obtenerVisitasBD");
        List<Visita> expResult = null;
        List<Visita> result = AccesoBD.obtenerVisitasBD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
