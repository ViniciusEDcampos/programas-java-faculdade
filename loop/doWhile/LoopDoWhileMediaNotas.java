
package loopdowhilemedianotas;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LoopDoWhileMediaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in); 
        
       int nota; // Para armazenar a nota inserida
       int somaNotas = 0; // Acumulador das notas
       double mediaNotas = 0; 
       int numeroQuantidade = 0;
       String decisao;
       
       do{
           System.out.println("Digite sua nota: ");
           nota = scanner.nextInt();
           scanner.nextLine(); // Consumir o Enter
           if(nota > 10 || nota <0){
               System.out.println("Valores abaixo de 1 e maiores que 10 não são aceitos");
           }else{
              somaNotas += nota;
            numeroQuantidade ++; 
               
           }
           
           System.out.println("Deseja digitar mais notas?(Digite S para sim e N para não);");
           decisao = scanner.nextLine();
           
       }while (decisao.trim().equalsIgnoreCase("S")) ;
        
        double media = (double) somaNotas  / numeroQuantidade;
        
        System.out.println("Media das notas: " + media);
    }
    
}
