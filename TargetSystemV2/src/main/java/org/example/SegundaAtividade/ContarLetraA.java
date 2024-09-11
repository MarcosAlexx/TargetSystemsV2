package org.example.SegundaAtividade;
import java.util.Scanner;

public class ContarLetraA {
    public static int contarA(String texto) {
        int contador = 0;
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();
        int quantidade = contarA(texto);
        System.out.println("A letra 'a' aparece " + quantidade + " vez(es) na string.");
        scanner.close();
    }
}
