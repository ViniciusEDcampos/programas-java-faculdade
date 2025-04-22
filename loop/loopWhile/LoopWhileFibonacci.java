
package loopwhilefibonacci;

/**
 *
 * @author ACER
 */
public class LoopWhileFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor1 = 0;
        int valor2 = 1;
        
        int i = 0;
        
        while(i < 10){
            
           System.out.print(valor1);
           
             if (i < 9) {
                System.out.print(", ");
            }
             
            int sequencia = valor1 + valor2; 
            valor1 = valor2;
            valor2 = sequencia;
           i++;
        }
    }
}
