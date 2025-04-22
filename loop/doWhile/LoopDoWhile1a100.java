
package loopdowhile1a100;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LoopDoWhile1a100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int num = 0;
       
       Scanner scanner = new Scanner(System.in);
       
       do{
           System.out.println("Digite um numero de 1 a 100: ");
           num = scanner.nextInt();      
       }while(num >0 && num < 101);
      
    }   
}
