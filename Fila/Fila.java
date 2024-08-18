package Fila;

public class Fila<T> {
    private int top = -1;
    private T[] data;
    private int base = 0;

    public Fila(int size){
        this.data = (T[]) new Object[size];
    }

    public void add(T element){
       if (isFull() == true){
            System.out.print("A fila está cheia");
            return;
       }
       top = move(top);
       data[top] = element;
       
    }

    public T remove(){
        if(isEmpty() == true){
            System.out.print("A fila está vazia");
            return null;
        }
        if (base == 4) {
            T removido = data[base];
            data[base] = null;
            base = 0;
            return removido;
        }
        T removido = data[base];
        data[base++] = null;
        return removido;
    }

    public int move(int pos){
        if (pos +1 == data.length){
            return 0;
        }
        return pos +1;
    }


    public boolean isFull(){
       if(base == 0 && data[data.length -1] == null ){
            return false;
       }
       if (base != 0 && data[base -1] == null){
        return false;
       }

       return true;
    }

    public boolean isEmpty(){
        if ( data[base] == null){
            return true;
        }
        return false;
    }

    public void mostrarFila(){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]);
        }
    }







}