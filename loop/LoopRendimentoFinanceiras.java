
package looprendimentofinanceiras;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LoopRendimentoFinanceiras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        //p - investimento inicial
        //r - taxa de juros anual
        //t - periodo de investimento em anos
        int P = 0,t = 0;
        double r = 0.0;
        int opcao;
        double montante = 0; 
        
        //do while - Usado para fazer o calculo, depois perguntar se deseja fazer novamente
        do{
        System.out.println("Qual opcao deseja? \n" +
            "1 - Capitalizacao simples \n2 - Capitalizacao composta");
            opcao = scanner.nextInt();
            
            System.out.println("Digite o Investimento inicial: ");
            P = scanner.nextInt();
             System.out.println("Digite a taxa de juros anual: ");
            r = scanner.nextDouble();
             System.out.println("Digite o periodo de investimento em anos: ");
            t = scanner.nextInt();
            
        if(opcao == 1){
            montante = P * (1 + (r / 100) * t);
        }else if(opcao == 2){
            montante = P * Math.pow(1 + r / 100, t);
        }else {
                System.out.println("Opção inválida.");
                continue;
        }
            System.out.printf("O montante é: R$ %.2f\n", montante);
            System.out.println("\n Deseja realizar um novo calculo? ");
            System.out.println(
            "1 Realizar novo calculo \n2 - Nao realizar um novo calculo");
            opcao = scanner.nextInt();
             
        }while(opcao == 1);
        
        scanner.close();
    }
    
}
