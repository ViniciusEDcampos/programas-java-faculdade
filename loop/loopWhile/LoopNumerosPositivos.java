
package loopnumerospositivos;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LoopNumerosPositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while(num > -1){
        
            System.out.println("Digite um Numero: ");
            num = scanner.nextInt();
            
        }
        
        
    }
    
}
