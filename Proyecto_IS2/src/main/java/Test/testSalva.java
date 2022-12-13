/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author scast
 */
public class testSalva {
    /**
     * Lista de test en buscar paciente por DNI
     * 
     * Que el dni no esté en la BBDD
     * Que no sea formato dni
     * Que no hayas escrito nada
     */
    @Test
    void sumaTest() {

        Integer resultadoEsperado = 7;
        Integer a = 3;
        Integer b = 4;

        Integer resultado = a + b;
        assertEquals(resultado, resultadoEsperado);
    }
    /**
     * Lista de test en añadir paciente
     * 
     * Que el dni no esté en la BBDD
     * Que la enfermedad no esté en la BBDD (hacer que pueda elegir la enfermedad)
     * Que la fecha no sea valida
     * No ingresar alguno de los campos
     * Que sea la misma fecha que una anterior
     * Que la fecha sea posterior a la actual
     */
}
