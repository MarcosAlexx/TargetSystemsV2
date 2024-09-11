package org.example.PrimeiraAtividade;
import java.util.Scanner;

public class Fibonacci {
    public static boolean pertenceFibonacci(int n) {
        int a = 0, b = 1;
        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
}
