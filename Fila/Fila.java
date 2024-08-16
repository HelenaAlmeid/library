package Fila;

public class Fila<T> {
    private int top = -1;
    private T[] data;
    private int base = 0;

    public Fila(int size){
        this.data = (T[]) new Object[size];
    }

    public void add(T element){
        if(isFull() == true){
            System.out.print("A pilha está cheia");
            return;
        }
        data[++top] = element;
    }

    public T remove(){
        if(isEmpty() == true){
            System.out.print("A pilha está vazia");
            return null;
        }
        T removido = data[base];
        data[base++] = null;
        return removido;
    }


    public boolean isFull(){
        if ( top == data.length -1 ){
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
