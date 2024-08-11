package Pilha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual será o tamanho da pilha: ");
        int tamanho = scanner.nextInt();
        StaticStack p = new StaticStack<>(tamanho);

    }
    
}