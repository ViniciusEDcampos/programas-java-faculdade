
package loopdowhileadvinhacao;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LoopDoWhileAdvinhacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numeroUsuario = 0;
        int numeroSistema = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tente adivinhar o numero sorteado");
        System.out.println("Digite um numero de 1 a 100");
        numeroUsuario = scanner.nextInt();
        numeroSistema = random.nextInt(100);
        
        do{
            System.out.println("Tente novamente");
            numeroUsuario = scanner.nextInt();
            
            if(numeroUsuario < numeroSistema){
                System.out.println("Maior");
            }
            else if(numeroUsuario > numeroSistema){
                System.out.println("Menor");
            }else if(numeroUsuario == numeroSistema){
                System.out.println("Acertou, o numero e: " + numeroSistema);
            }
            
        }while(numeroSistema != numeroUsuario);

    }
    
}
