/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedStack;

/**
 *
 * @author João Leite Nº 8170556
 */
public class InvalidElement extends Exception {

    /**
     * Creates a new instance of <code>InvalidElement</code> without detail
     * message.
     */
    public InvalidElement() {
    }

    /**
     * Constructs an instance of <code>InvalidElement</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public InvalidElement(String msg) {
        super(msg);
    }
}
