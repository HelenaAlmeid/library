package Fila;

import java.util.Scanner;



public class Main {
     public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será o tamanho da pilha: ");
        int tamanho = scanner.nextInt();
        Fila f = new Fila<>(tamanho);

        f.add(8);
        f.add(12);
        f.add(12);
        f.remove();
        f.remove();
        f.add(3);
       
        f.mostrarFila();
     }
    }