/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package exceptions;

/**
 *
 * @author lucas
 */
public class FilaCheiaException extends RuntimeException {

    /**
     * Creates a new instance of <code>FilaCheiaException</code> without detail
     * message.
     */
    public FilaCheiaException() {
    }

    /**
     * Constructs an instance of <code>FilaCheiaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public FilaCheiaException(String msg) {
        super(msg);
    }
}
