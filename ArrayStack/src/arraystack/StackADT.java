/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystack;

import arraystack.EmptyException;

/**
 *
 * @author João Leite nº 8170556
 */
public interface StackADT<T> {
    /**
     * Adiciona um elemento no topo da Stack
     * @param element o elemento que vai ser inserido na Stack
     */
    public void push(T element) throws InvalidElement;
    
    /**
     * Remove um elemento que está no topo da Stack
     * @return o elemento removido.
     */
    public T pop() throws EmptyException;
    
    /**
     * Retorna o ultimo elemento que foi inserido na Stack
     * @return O elemento que está no topo da Stack. 
     */
    public T peek();
    
    /**
     * Retorna o número de Elementos inseridos na Stack
     * @return o número de elementos na Stack
     */
    public int size();
}
