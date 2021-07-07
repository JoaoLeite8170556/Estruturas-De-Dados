
package LinkedStack;

/**
 *
 * @author João Leite Nº 8170556
 */
public class LinearNode<T> {
    
    private LinearNode<T> next;
    private T element;

    public LinearNode(T element) {
        this.element = element;
    }

    public LinearNode() {
        this.next = null;
        this.element = null;
    }
    
    public LinearNode<T> getNext(){
        return next;
    }
    
    public void setNext(LinearNode<T> node){
        this.next=node;
    }
    
    public T getElement(){
        return this.element;
    }
    
    public void setElement(T element){
        this.element = element;
    }
}
