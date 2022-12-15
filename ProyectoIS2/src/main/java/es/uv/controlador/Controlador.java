package es.uv.controlador;

import static es.uv.modelo.AccesoBD.loginTrabajador;
import es.uv.modelo.Trabajador;
import es.uv.vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Controlador {

    private Login vista;

    public Controlador(Login vista) {
        this.vista = vista;
        vista.addWindowListener(new ControladorWindowListener());
        vista.setActionListener(new ControladorActionListener());
    }

    class ControladorWindowListener extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    class ControladorActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            switch (command) {
                case "aceptarMedicoMedicamento": {
                    System.out.println("Todo en orden");
                    break;
                }

                case "volverMedicoMedicamento": {
                    break;
                }

                case "restablecerMedicoMedicamento": {
                    break;
                }

                case "comprobarBotiquin": {
                    /*
                        vista.get(num);
                        vista.setMed(Trabajador.comprobarBotiquin(num,bd));
                        
                     */
                    break;
                }
                case "crearPacienteEnfermera":
                    System.out.println("Paciente creado con los datos:\n"
                            + vista.enfermera_getDNI() + "\n" + vista.enfermera_getNombre() + "\n"
                            + vista.enfermera_getApellidos() + "\n" + vista.enfermera_getHabitacion() + "\n"
                            + vista.enfermera_getSintomas());
                    break;
                default: {
                    break;
                }
            }
        }

    }

    /**
     * Clase empotrada medicMedicamento
     *
     * Esta clase implementa a la interfaz ActionListener, y tiene como objetivo
     * leer todas las acciones de los botones de la vista MedicoMedicamento. Se
     * encuentra por ahora sometida a posibles cambios
     *
     */
    /*public class medicMedicamento implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            switch(e.getActionCommand())
            {
                case "aceptarMedicoMedicamento":
                {
                    System.out.println("Todo en orden");
                    break;
                }
                  
                case "volverMedicoMedicamento":
                {
                    break;
                }
                    
                case "restablecerMedicoMedicamento":
                {
                    break;
                }
                    
                case "comprobarBotiquin":
                {
                    /*
                        vista.get(num);
                        vista.setMed(Trabajador.comprobarBotiquin(num,bd));
                        
     *//*
                    break;    
                }
                
                default:
                {
                    break;
                }
            }
        }
        public Trabajador realizarLogin(String usuario, String contra){
            Trabajador t = new Trabajador();
            
            t = loginTrabajador(usuario, contra);
            
            return t;
            
        }
        
    }*/
}
