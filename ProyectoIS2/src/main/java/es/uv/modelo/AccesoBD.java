package es.uv.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class AccesoBD {

    private static AccesoBD instanciaUnica = null;
    private static Connection conexionBD = null;
    private static final String NOMBRE = "nombre";
    private static final String APELLIDOS = "apellidos";
    private static final String SINTOMAS = "sintomas";
    private static final String ID_PACIENTE = "idPaciente";
    private static final String ID_TRABAJADOR = "idTrabajador";

    public static AccesoBD getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new AccesoBD();
        }
        return instanciaUnica;
    }

    private AccesoBD() {
        abrirConexionBD();
    }

    public static Boolean abrirConexionBD() {
        Boolean res = false;
        if (conexionBD == null) {
            String nombreConexionBD = "jdbc:mysql://localhost/isii"; //dirección bd
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conexionBD = DriverManager.getConnection(nombreConexionBD, "root", ""); //por defecto user: root, contra:""
                Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, "Conexion con exito");
                res = true;
            } catch (Exception e) {
//                System.out.println("error conectando a base de datos"); // por algun motivo, a netbeans no le gusta el system.err
            }
        }
        return res;
    }

    public boolean comprobarAcceso() {
        abrirConexionBD();
        return conexionBD != null;
    }

    public static void cerrarConexionBD() {
        if (conexionBD != null) {
            try {
                conexionBD.close();
                conexionBD = null;
            } catch (SQLException e) {
                Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    //////////////////////////////////////////////////enfermedades//////////////////////////////////////////////////
    public static List<Enfermedad> obtenerEnfermedadesBD() { //select all
        abrirConexionBD();
        ArrayList<Enfermedad> enfermedades = new ArrayList<>();
        try ( Statement s = conexionBD.createStatement()) {
            String con;

            con = "SELECT idEnfermedad,sintomas,contagiosa FROM enfermedades";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Enfermedad enf = new Enfermedad();
                enf.setIdEnfermedad(resultados.getInt("idEnfermedad"));
                enf.setSintomas(resultados.getString(SINTOMAS));
                enf.setContagiosa(resultados.getBoolean("contagiosa"));
                enfermedades.add(enf);
            }
        } catch (Exception e) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
        }
        return enfermedades;
    }

    //////////////////////////////////////////////////historial//////////////////////////////////////////////////
    /**
     * HistorialPaciente obtenerHistorialBD(String dni)
     *
     *
     * @param dni Cadena a buscar en la BBDD
     * @return Historial del paciente con el dni correspondente
     */
    public static HistorialPaciente obtenerHistorialBD(String dni) {
        try ( Statement s = conexionBD.createStatement()) {
            abrirConexionBD();
            String selectQuery
                    = "SELECT DNI, apellidos, nombre, fechaAlta"
                    + " FROM pacientes p INNER JOIN historial h ON p.idPaciente = h.idPaciente"
                    + " INNER JOIN enfermedades e ON h.idEnfermedad = e.idEnfermedad"
                    + " WHERE p.DNI = '" + dni + "'"
                    + " ORDER BY fechaAlta ASC";

            ResultSet resultados = s.executeQuery(selectQuery);

            return rellenarHistorialPaciente(resultados);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * HistorialPaciente rellenarHistorialPaciente(ResultSet resultados)
     *
     * @param resultados
     * @return
     * @throws SQLException
     */
    private static HistorialPaciente rellenarHistorialPaciente(ResultSet resultados) throws SQLException {

        boolean primeraEscritura = true;
        HistorialPaciente h = new HistorialPaciente();

        while (resultados.next()) {
            if (primeraEscritura) {
                h.setDniPaciente(resultados.getString("DNI"));
                h.setApellidosPaciente(resultados.getString(APELLIDOS));
                primeraEscritura = false;
            }
            h.addParFechaEnfermedad(resultados.getDate("fechaAlta"), resultados.getString(NOMBRE));
        }
        return h;
    }

    /**
     * boolean addHistorialPacienteBD(String dni, String fecha, String
     * enfermedad)
     *
     * @param dni
     * @param fecha
     * @param enfermedad
     * @return
     */
    public static boolean addHistorialPacienteBD(String dni, String fecha, String enfermedad) {
        try ( Statement s = conexionBD.createStatement()) {
            if (esFechaFutura(fecha)) {
                return false;
            } else {
                abrirConexionBD();
                String updateQuery
                        = "INSERT INTO historial( idPaciente, fechaAlta, idEnfermedad) VALUES("
                        + "(SELECT idPaciente FROM pacientes p WHERE p.DNI = '" + dni + "'), "
                        + "DATE '" + fecha + "', "
                        + "(SELECT idEnfermedad FROM enfermedades e WHERE e.nombre = '" + enfermedad + "'))";

                s.executeUpdate(updateQuery);
                return true;
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    /**
     * boolean esFechaFutura(String fecha)
     *
     * @param fecha
     * @return
     * @throws ParseException
     */
    private static boolean esFechaFutura(String fecha) throws ParseException {
        Date fechaActual = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaHistorial = formatter.parse(fecha);

        return fechaHistorial.after(fechaActual);
    }

//////////////////////////////////////////////////medicamentos//////////////////////////////////////////////////
    public static List<Medicamento> obtenerMedicamentosBD() { //select all
        abrirConexionBD();
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        try ( Statement s = conexionBD.createStatement()) {
            String con;

            con = "SELECT idMedicamento,unidades,alergias,efectosSecundarios FROM medicamentos";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Medicamento m = new Medicamento();
                m.setIdMedicamento(resultados.getInt("idMedicamento"));
                m.setNombre(resultados.getString(NOMBRE));
                m.setUnidades(resultados.getInt("unidades"));
                m.setAlergias(resultados.getString("alergias"));
                m.setEfectosSecunadarios(resultados.getString("efectosSecundarios"));
                medicamentos.add(m);
            }
        } catch (Exception e) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
        }
        return medicamentos;
    }

    //////////////////////////////////////////////////medicamentos//////////////////////////////////////////////////
    //Te devuelve una lista con los medicamentos del paciente pasado como argumento.
    public static List<String> obtenerMedicamentosPacienteBD(String idPaciente) {
        abrirConexionBD();
        ArrayList<String> medicamentos = new ArrayList<>();
        try ( Statement s = conexionBD.createStatement()) {
            String con;

            con = "SELECT mm.nombre FROM enfermedadespaciente ep "
                    + "INNER JOIN tratamientos tt ON ep.idEnfermedad = tt.idEnfermedad "
                    + "INNER JOIN medicamentos mm ON mm.idMedicamento = tt.idMedicamento "
                    + "WHERE ep.idPaciente = " + idPaciente;
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                medicamentos.add(resultados.getString(NOMBRE));
            }
        } catch (Exception e) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
        }
        return medicamentos;
    }

    //////////////////////////////////////////////////pacientes//////////////////////////////////////////////////
    public static List<Paciente> obtenerPacientesBD() { //select all
        abrirConexionBD();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try ( Statement s = conexionBD.createStatement()) {
            String con;

            con = "SELECT idPaciente,DNI,apellidos,habitacion,sintomas FROM pacientes";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Paciente p = new Paciente();
                p.setIdPaciente(resultados.getInt(ID_PACIENTE));
                p.setDni(resultados.getString("DNI"));
                p.setApellidos(resultados.getString(APELLIDOS));
                p.setHabitacion(resultados.getInt("habitacion"));
                p.setSintomas(resultados.getString(SINTOMAS));
                pacientes.add(p);
            }
        } catch (Exception e) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
        }
        return pacientes;
    }

    //////////////////////////////////////////////////pacientes//////////////////////////////////////////////////
    public static List<Paciente> obtenerPacientesDelDiaBD() { //Te quedas solo con los pacientes que tengan habitación y sintomas
        abrirConexionBD();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try ( Statement s = conexionBD.createStatement()) {
            String con;

            con = "SELECT idPaciente,DNI,apellidos,habitacion,sintomas FROM pacientes WHERE habitacion!=\"null\" AND sintomas!=\"null\"";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Paciente p = new Paciente();
                p.setIdPaciente(resultados.getInt(ID_PACIENTE));
                p.setDni(resultados.getString("DNI"));
                p.setApellidos(resultados.getString(APELLIDOS));
                p.setHabitacion(resultados.getInt("habitacion"));
                p.setSintomas(resultados.getString(SINTOMAS));
                pacientes.add(p);
            }
        } catch (Exception e) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
        }
        return pacientes;
    }

    //////////////////////////////////////////////////trabajadores//////////////////////////////////////////////////
    public static List<Trabajador> obtenerTrabajadoresBD() { //select all
        abrirConexionBD();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        try ( Statement s = conexionBD.createStatement()) {
            String con;

            con = "SELECT idTrabajador,medico,usuario,contra FROM trabajadores";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Trabajador t = new Trabajador();
                t.setIdTrabajador(resultados.getInt(ID_TRABAJADOR));
                t.setEsMedico(resultados.getBoolean("medico"));
                t.setUsuario(resultados.getString("usuario"));
                t.setContrasenya(resultados.getString("contra"));
                trabajadores.add(t);
            }
        } catch (Exception e) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
        }
        return trabajadores;
    }

    //////////////////////////////////////////////////trabajadores//////////////////////////////////////////////////
    public static Trabajador loginTrabajador(String usuario, String contra) {
        abrirConexionBD();
        Trabajador t = new Trabajador();

        try ( Statement s = conexionBD.createStatement()) {
            String con = "SELECT idTrabajador,medico,usuario,contra FROM trabajadores WHERE usuario='" + usuario + "' AND contra ='" + contra + "'";

            ResultSet resultados = s.executeQuery(con);

            resultados.next();
            t.setIdTrabajador(resultados.getInt(ID_TRABAJADOR));
            t.setEsMedico(resultados.getBoolean("medico"));
            t.setUsuario(resultados.getString("usuario"));
            t.setContrasenya(resultados.getString("contra"));
        } catch (Exception e) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
        }

        return t;
    }

    //////////////////////////////////////////////////trabajadores//////////////////////////////////////////////////
    public static List<Tratamiento> obtenerTratamientoBD() { //select all
        abrirConexionBD();
        ArrayList<Tratamiento> tratamientos = new ArrayList<>();
        try ( Statement s = conexionBD.createStatement()) {
            String con;

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
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
        }
        return tratamientos;
    }

    //////////////////////////////////////////////////trabajadores//////////////////////////////////////////////////
    public static List<Visita> obtenerVisitasBD() { //select all
        abrirConexionBD();
        ArrayList<Visita> visitas = new ArrayList<>();
        try ( Statement s = conexionBD.createStatement()) {
            String con;

            con = "SELECT idVisitas,idTrabajador,idPaciente,fecha FROM visitas";
            ResultSet resultados = s.executeQuery(con);
            while (resultados.next()) {
                Visita v = new Visita();
                v.setIdVisita(resultados.getInt("idVisitas"));
                v.setIdTrabajador(resultados.getInt(ID_TRABAJADOR));
                v.setIdPaciente(resultados.getInt(ID_PACIENTE));
                v.setFecha(resultados.getDate("fecha"));
                visitas.add(v);
            }
        } catch (Exception e) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, e);
        }
        return visitas;
    }

}
