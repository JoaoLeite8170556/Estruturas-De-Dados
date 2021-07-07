/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedStack;



/**
 *
 * @author João
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InvalidElement, EmptyException {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        
        
        stack.push(1);
        stack.push(2);
        stack.push(69);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.toString());
        
        
    }
    
}
