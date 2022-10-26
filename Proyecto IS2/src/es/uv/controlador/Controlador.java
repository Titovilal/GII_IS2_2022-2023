/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.uv.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author scast
 */

public class Controlador 
{
    public Controlador()
    {
        
    }
    
    /**
     * Clase empotrada medicMedicamento
     * 
     * Esta clase implementa a la interfaz ActionListener, y tiene como objetivo
     * leer todas las acciones de los botones de la vista MedicoMedicamento. Se
     * encuentra por ahora sometida a posibles cambios
     *
     */
    public class medicMedicamento implements ActionListener
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
                    
                default:
                {
                    break;    
                }
            }
        }
        
    }
}