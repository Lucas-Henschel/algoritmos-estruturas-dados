/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exceptions;

/**
 *
 * @author lucas
 */
public class FilaVaziaException extends RuntimeException {

    /**
     * Creates a new instance of <code>FilaVaziaException</code> without detail
     * message.
     */
    public FilaVaziaException() {
    }

    /**
     * Constructs an instance of <code>FilaVaziaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FilaVaziaException(String msg) {
        super(msg);
    }
}
