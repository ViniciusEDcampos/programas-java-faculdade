
package loopforsomavetor;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LoopForSomaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numeros[] = new int[10];
        Scanner scanner = new Scanner(System.in);
         int Soma = 0; 
        
        for(int i=0;i<10;i++){
        
            System.out.println("Digite um numero: ");
            numeros[i] = scanner.nextInt();
            Soma = numeros[i] + Soma;
        }
        
        System.out.println("A soma de todos numeros digitados sao: " + Soma);
              
    }
    
}
