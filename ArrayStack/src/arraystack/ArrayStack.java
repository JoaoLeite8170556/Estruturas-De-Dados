
package arraystack;

/**
 * ArrayStack
 * @author João Leite Nº 8170556
 */
public class ArrayStack<T> implements StackADT<T> {
    
    private final int DEFAULT_CAPACITY = 5;
    private int top;
    private T[] stack;
    
    public ArrayStack(){
        this.top=0;
        this.stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }
    
    public ArrayStack(int inicialCapacity){
        this.top=0;
        this.stack=(T[]) (new Object[DEFAULT_CAPACITY]);
    }
    
    

    @Override
    public void push(T element) throws InvalidElement {
        if(this.top == this.stack.length){
            expandCapacity();
        }
        
        if(element == null){
            throw new InvalidElement("Este elemento é inválido.");
        }
        
        this.stack[this.top]= element;
        this.top++;
    }
    
    private void expandCapacity(){
        T[] largerStack = (T[])(new Object[this.stack.length*2]);
        
        for(int i=0; i<this.stack.length;i++){
            largerStack[i] = stack[i];
        }
        this.stack = largerStack;
    }

    @Override
    public T pop() throws EmptyException {
        if(isEmpty()){
            throw new EmptyException("Este ArrayStack está vazio.");
        }
        this.top--;
        T result = this.stack[this.top];
        this.stack[this.top]=null;
        return result;
    }

    @Override
    public T peek() {
        return this.stack[this.top];
    }

    @Override
    public int size() {
        return this.top;
    }
    
    
    private boolean isEmpty(){
        return (this.top==0);
    }
}
