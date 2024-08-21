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
        if(data[pos] == null && pos == top += 1){
            data[pos] = element;
        }

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

}