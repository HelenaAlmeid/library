package Pilha;

public class StaticStack<T> {
    private int top = -1;
    private T[] data;
    private int size;


    public StaticStack(int size){
        this.data = (T[]) new Object[size];
        this.size = size;

    }

    public void push(T dat){
        if(isFull() == true){
            System.out.print("A pilha está cheia");
            return;
        }
        top++;  
        data[top] = dat;  
    }

    public T pop(){
        if(isEmpty() == true){
            System.out.print("A pilha está vazia");
            return null;
        }
        T removido = data[top];
        data[top] = null;
        top--;
        return removido;
    }

    public void clear(){
        for(int i = top; i >= 0; i-- ){
            data[i] = null;
        }

        this.top = -1;
    }

    public boolean isFull(){
        if ( top == size -1 ){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if( top == -1){
            return true;
        }
        return false;
    }
    
}
