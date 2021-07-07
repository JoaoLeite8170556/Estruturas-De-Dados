/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedStack;



/**
 * LinkedStack
 * @author João Leite Nº 8170556
 */
public class LinkedStack<T> implements StackADT<T> {
    private LinearNode<T> top;
    private int contador;
    
    public LinkedStack(){
        this.top= new LinearNode<T>(null);
        this.contador = 0;
    }
    

    @Override
    public void push(T element) throws InvalidElement {
        if(element==null){
            throw new InvalidElement("Este elemento é inválido");       
        }
        LinearNode<T> newNode = new LinearNode<T>(element);
        
        if(isEmpty()){
           this.top=newNode;
           this.top.setNext(null);
        }else{
           newNode.setNext(this.top);
           this.top=newNode;
        }
        this.contador++;
    }

    @Override
    public T pop() throws EmptyException{
        if(isEmpty()){
            throw new EmptyException("Este Stack está vazia!!!!");
        }
        LinearNode<T> topNode = this.top;
        this.top = topNode.getNext();
        this.contador--;
        return topNode.getElement();
    }

    @Override
    public T peek() {
        return this.top.getElement();
    }

    @Override
    public int size() {
        return this.contador;
    }
    
    /**
     * Método que verifica se a Stack está vázia
     * @return true se estiver vazia ou false se estiver com algum elemento dentro
     */
    private boolean isEmpty(){
        return (this.contador==0);
    }
    
    @Override
    public String toString()
  {
    String result = "";
    LinearNode current = this.top;

    while (current != null)
    {
      result = result + (current.getElement()).toString() + "\n";
      current = current.getNext();
    }

    return result;
  }
    
 
}
