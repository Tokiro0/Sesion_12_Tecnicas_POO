/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesPersonalizadas;

/**
 *
 * @author tokiro
 */
public class MiExcepcionNumerica extends Exception {

    private final static String MENSAJE = ""
            + "Error de conversión númerica, "
            + "ingresa un texto que contenga un número";

    public MiExcepcionNumerica() {
        super(MENSAJE);
    }
}
