package Lista;

import java.util.Arrays;

public class StaticList<T>{
    private T[] data;
    private int size;
    private int top = -1;

    public StaticList(int size){
        this.size = size;
        this.data = (T[]) new Object[size];
    }

    public void clear(){
        if(isEmpty() == true){
            throw new IllegalStateException("A lista está vazia");
        }
        Arrays.fill(data, null);
        top = -1;
    }

    public void add(T element){
        if(isFull() == true){
            throw new IllegalStateException("A lista está cheia!");
        }
        data[++top] = element;
    }

    public void add(T element, int pos){
        if(isFull() == true){
            throw new IllegalStateException("A lista está cheia");
        }
        if(pos > data.length -1){
            throw new IllegalStateException("Está posição não é válida!");
        }
        if(data[pos] == null && pos == top + 1){ 
            data[pos] = element;
            top++;
            return;
        }
        if(data[pos] != null){
            for(int i = top; i >= pos; i--){
                T e = data[i];
                data[i + 1] = e;
            }
            data[pos] = element;
            top++;
            return;
        }
        throw new IllegalStateException("Não foi possivel adicionar o elemento na lista!");


    }

    public T remove(int pos){
        if(isEmpty() == true){
            throw new IllegalStateException("A lista está vazia");
        }
        if(data[pos] == null){
            throw new IllegalStateException("A posição está vazia!");
        }
        if(pos > data.length - 1){
            throw new IllegalStateException("Está posição não é válida!");
        }

        T e = data[pos];
        
        for(int i = pos; i <= top; i++){
            T item = data[pos + 1];
            data[i] = item;
        }

        data[top--] = null;

        return e;

    }

    public boolean isEmpty(){
        if(data[0] == null){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(data[size -1] == null){
            return false;
        }
        return true;
    }

    public void setData(T element, int pos){
        if(pos == top + 2 && top < data.length - 1){
            throw new IllegalStateException("Não foi possivel adicionar o elemento nesta posição!");
        }
        if(data[pos] == null){
            data[pos] = element;
            top++;
        }

        data[pos] = element;

    }

    public T getData(int pos){
        return data[pos];
    }

    public int getSize(){
        return top + 1;
    }

    public int find(T element){
        int pos = -1;
        for(int i = 0; i < data.length; i++){
            if(data[i] == element){
                pos = i;
                return pos;
            }
        }
        throw new IllegalStateException("Não foi possivel encontrar o elemento!");     
    }

    public void mostrarFila(){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]);
        }
    }
}