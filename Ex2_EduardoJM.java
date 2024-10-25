package exemplo_vetores;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex2_EduardoJM {
    
    public static void main(String[] args) {
        
        double notas[] = new double [10];
        double mediaSala, soma=0, maiorNota=-999999, menorNota=999999;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite 10 notas: ");
        
        for (int i=0; i < notas.length; i++){
            notas[i] = s.nextDouble();
            soma += notas[i];
            
            
            //CASO O PRIMEIRO VALOR DIGITADO FOR O MAIOR,
            //OCORRERÁ UM ERRO.
            
            
            if (notas[i] < menorNota){
                menorNota = notas[i];
            } else if (notas[i] > maiorNota){
                maiorNota = notas[i];
            }
        }
        
        mediaSala = soma / notas.length;
        System.out.println("Media Final: " + mediaSala);
        System.out.println("Maior nota da turma: " + maiorNota);
        System.out.println("Menor nota da turma: " + menorNota);
         
    }
    
}
