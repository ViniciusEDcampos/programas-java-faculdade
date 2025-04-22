
package loopwhilesenha;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LoopWhileSenha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String senha = "1234";
        String tentativa = "";
        Scanner scanner = new Scanner(System.in);
        
        while(!tentativa.equals(senha)){
         
            System.out.println("Digite sua senha: ");
            tentativa = scanner.nextLine();
        }
        
    }
    
}
