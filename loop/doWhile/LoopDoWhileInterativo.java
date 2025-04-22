
package loopdowhileinterativo;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LoopDoWhileInterativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        
        do{
            System.out.println("Digite sua opçao\n" +
                    "1 - Adicionar\n" +
                    "2 - Removedor\n" +
                    "3 - Sair");
             num = scanner.nextInt();
             
             
        if(num == 1){
         System.out.println("Adicionado com sucesso");
        }else if(num == 2){
            System.out.println("Removido com sucesso");
        }else{
            System.out.println("Saiu");
        }
              
        }while(num == 1 || num == 2);
       
        
    }
    
}
