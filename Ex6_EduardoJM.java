package exemplo_vetores;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex6_EduardoJM {
    
    public static void main(String[] args) {
        
        int qtdPrecos;
        double mediaPrecos, soma=0, maiorPreco = -99999, menorPreco = 99999;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de pre�os: ");
        qtdPrecos = s.nextInt();
        
        double precos[] = new double [qtdPrecos];
        
        for (int i=0; i < precos.length; i++){
            System.out.println("Digite o pre�o " + (i+1) + ": ");
            precos[i] = s.nextDouble();
            soma += precos[i];
            
            
            //CASO O PRIMEIRO VALOR DIGITADO FOR O MAIOR,
            //OCORRER� UM ERRO.
            
            
            if (precos[i] < menorPreco){
                menorPreco = precos[i];
            } else if (precos[i] > maiorPreco){
                maiorPreco = precos[i];
            }
        }
        
        mediaPrecos = soma / precos.length;
        
        System.out.println("Media dos Pre�os: " + mediaPrecos);
        System.out.println("Menor Pre�o: " + menorPreco);
        System.out.println("Maior Pre�o: " + maiorPreco);
        
    }
    
}
