/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.modelo;

import java.sql.*;
import java.util.*;

/**
 *
 * @author raul
 */
public final class AccesoBD {

    private static AccesoBD instanciaUnica = null;
    private static Connection conexionBD = null;

    public static AccesoBD getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new AccesoBD();
        }
        return instanciaUnica;
    }

    private AccesoBD() {
        abrirConexionBD();
    }

    public static void abrirConexionBD() {
        if (conexionBD == null) {
            String nombreConexionBD = "jdbc:mysql://localhost/isii"; //dirección bd
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexionBD = DriverManager.getConnection(nombreConexionBD, "root", ""); //por defecto user: root, contra:""
                System.out.println("conexión con éxito");
            } catch (Exception e) {
                System.out.println("error conectando a base de datos"); // por algun motivo, a netbeans no le gusta el system.err
            }
        }
    }

    public boolean comprobarAcceso() {
        abrirConexionBD();
        return conexionBD != null;
    }

    public void cerrarConexionBD() {
        if (conexionBD != null) {
            try {
                conexionBD.close();
                conexionBD = null;
            } catch (Exception e) {
                System.out.println("error comprobando producto");
            }
        }
    }

    //////////////////////////////////////////////////enfermedades//////////////////////////////////////////////////
    public static List<Enfermedad> obtenerEnfermedadesBD() { //select all
        abrirConexionBD();
        ArrayList<Enfermedad> enfermedades = new ArrayList<>();
        try {
            String con;
            Statement s = conexionBD.createStatement();

            con = "SELECT idEnfermedad,sintomas,contagiosa FROM enfermedades";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Enfermedad enf = new Enfermedad();
                enf.setIdEnfermedad(resultados.getInt("idEnfermedad"));
                enf.setSintomas(resultados.getString("sintomas"));
                enf.setContagiosa(resultados.getBoolean("contagiosa"));
                enfermedades.add(enf);
            }
        } catch (Exception e) {
            System.out.println("error obteniendo lista enfermedades");
        }
        return enfermedades;
    }

    //////////////////////////////////////////////////historial//////////////////////////////////////////////////
    public static List<HistorialPaciente> obtenerHistorialBD() { //select all
        abrirConexionBD();
        ArrayList<HistorialPaciente> historial = new ArrayList<>();
        try {
            String con;
            Statement s = conexionBD.createStatement();

            con = "SELECT idHistorial,idPaciente,fechaAlta,idEnfermedad FROM enfermedades";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                HistorialPaciente h = new HistorialPaciente();
                h.setIdHistorial(resultados.getInt("idHistorial"));
                h.setIdPaciente(resultados.getInt("idPaciente"));
                h.setFechaAlta(resultados.getDate("fechaAlta"));
                h.setIdEnfermedad(resultados.getInt("idEnfermedad"));
                historial.add(h);
            }
        } catch (Exception e) {
            System.out.println("error obteniendo historial");
        }
        return historial;
    }

    //////////////////////////////////////////////////medicamentos//////////////////////////////////////////////////
    public static List<Medicamento> obtenerMedicamentosBD() { //select all
        abrirConexionBD();
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        try {
            String con;
            Statement s = conexionBD.createStatement();

            con = "SELECT idMedicamento,unidades,alergias,efectosSecundarios FROM medicamentos";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Medicamento m = new Medicamento();
                m.setIdMedicamento(resultados.getInt("idMedicamentos"));
                m.setUnidades(resultados.getInt("unidades"));
                m.setAlergias(resultados.getString("alergias"));
                m.setEfectosSecunadarios(resultados.getString("efectosSecundarios"));
                medicamentos.add(m);
            }
        } catch (Exception e) {
            System.out.println("error obteniendo medicamentos");
        }
        return medicamentos;
    }

    //////////////////////////////////////////////////pacientes//////////////////////////////////////////////////
    public static List<Paciente> obtenerPacientesBD() { //select all
        abrirConexionBD();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try {
            String con;
            Statement s = conexionBD.createStatement();

            con = "SELECT idPaciente,DNI,apellidos,habitacion,sintomas FROM pacientes";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Paciente p = new Paciente();
                p.setIdPaciente(resultados.getInt("idPaciente"));
                p.setDni(resultados.getString("DNI"));
                p.setApellidos(resultados.getString("apellidos"));
                p.setHabitacion(resultados.getInt("habitacion"));
                p.setSintomas(resultados.getString("sintomas"));
                pacientes.add(p);
            }
        } catch (Exception e) {
            System.out.println("error obteniendo pacientes");
        }
        return pacientes;
    }

    //////////////////////////////////////////////////pacientes//////////////////////////////////////////////////
    public static List<Paciente> obtenerPacientesDelDiaBD() { //Te quedas solo con los pacientes que tengan habitación y sintomas
        abrirConexionBD();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try {
            String con;
            Statement s = conexionBD.createStatement();

            con = "SELECT idPaciente,DNI,apellidos,habitacion,sintomas FROM pacientes WHERE habitacion!=\"null\" AND sintomas!=\"null\"";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Paciente p = new Paciente();
                p.setIdPaciente(resultados.getInt("idPaciente"));
                p.setDni(resultados.getString("DNI"));
                p.setApellidos(resultados.getString("apellidos"));
                p.setHabitacion(resultados.getInt("habitacion"));
                p.setSintomas(resultados.getString("sintomas"));
                pacientes.add(p);
            }
        } catch (Exception e) {
            System.out.println("error obteniendo pacientes");
        }
        return pacientes;
    }

    //////////////////////////////////////////////////trabajadores//////////////////////////////////////////////////
    public static List<Trabajador> obtenerTrabajadoresBD() { //select all
        abrirConexionBD();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        try {
            String con;
            Statement s = conexionBD.createStatement();

            con = "SELECT idTrabajador,medico,usuario,contra FROM trabajadores";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Trabajador t = new Trabajador();
                t.setIdTrabajador(resultados.getInt("idTrabajador"));
                t.setEsMedico(resultados.getBoolean("medico"));
                t.setUsuario(resultados.getString("usuario"));
                t.setContrasenya(resultados.getString("contra"));
                trabajadores.add(t);
            }
        } catch (Exception e) {
            System.out.println("error obteniendo trabajadores");
        }
        return trabajadores;
    }

    public static Trabajador loginTrabajador(String usuario, String contra) {
        abrirConexionBD();
        Trabajador t = new Trabajador();
        
        try {
            Statement s = conexionBD.createStatement();
            String con = "SELECT idTrabajador,medico,usuario,contra FROM trabajadores WHERE usuario='" + usuario + "' AND contra ='" + contra + "'";
            
            ResultSet resultados = s.executeQuery(con);
            
            resultados.next();
            t.setIdTrabajador(resultados.getInt("idTrabajador"));
            t.setEsMedico(resultados.getBoolean("medico"));
            t.setUsuario(resultados.getString("usuario"));
            t.setContrasenya(resultados.getString("contra"));
        } catch (Exception e) {
            System.out.println("error realizando login");
        }

        return t;
    }

    //////////////////////////////////////////////////trabajadores//////////////////////////////////////////////////
    public static List<Tratamiento> obtenerTratamientoBD() { //select all
        abrirConexionBD();
        ArrayList<Tratamiento> tratamientos = new ArrayList<>();
        try {
            String con;
            Statement s = conexionBD.createStatement();

            con = "SELECT idTratamiento,idEnfermedad,idMedicamento,dosis FROM tratamiento";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Tratamiento t = new Tratamiento();
                t.setIdTratamiento(resultados.getInt("idTratameinto"));
                t.setIdEnfermedad(resultados.getInt("idEnfermedad"));
                t.setIdMedicamento(resultados.getInt("idMedicamento"));
                t.setDosis(resultados.getString("dosis"));
                tratamientos.add(t);
            }
        } catch (Exception e) {
            System.out.println("error obteniendo tratamientos");
        }
        return tratamientos;
    }

    //////////////////////////////////////////////////trabajadores//////////////////////////////////////////////////
    public static List<Visita> obtenerVisitasBD() { //select all
        abrirConexionBD();
        ArrayList<Visita> visitas = new ArrayList<>();
        try {
            String con;
            Statement s = conexionBD.createStatement();

            con = "SELECT idVisitas,idTrabajador,idPaciente,fecha FROM visitas";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Visita v = new Visita();
                v.setIdVisita(resultados.getInt("idVisitas"));
                v.setIdTrabajador(resultados.getInt("idTrabajador"));
                v.setIdPaciente(resultados.getInt("idPaciente"));
                v.setFecha(resultados.getDate("fecha"));
                visitas.add(v);
            }
        } catch (Exception e) {
            System.out.println("error obteniendo visitas");
        }
        return visitas;
    }

}
