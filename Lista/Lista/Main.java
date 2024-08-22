package Lista;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será o tamanho da pilha: ");
        int tamanho = scanner.nextInt();
        StaticList f = new StaticList<>(tamanho);

        f.add(12);
         f.add(14, 1);
         f.add(12);
         f.add(11);
         System.out.println(f.getData(1));
         
        f.mostrarFila();
     }
    }