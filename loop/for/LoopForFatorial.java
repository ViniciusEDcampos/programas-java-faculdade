package loopforfatorial;

import java.util.Scanner;

public class LoopForFatorial {

    public static void main(String[] args) {
        int numero;
        long fatorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero para o calculo fatorial: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);
        scanner.close();
    }
}