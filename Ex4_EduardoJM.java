package exemplo_vetores;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex4_EduardoJM {
    
    public static void main(String[] args) {
        
        int numeros1[] = new int [8];
        int numeros2[] = new int [8];
        int resultados[] = new int [8];
        
        Scanner s = new Scanner (System.in);
        
        for (int i=0; i < numeros1.length; i++){
            System.out.println("Digite os 8 valores do primeiro vetor: ");
            numeros1[i] = s.nextInt();
        }
        
        for (int i=0; i < numeros2.length; i++){
            System.out.println("Digite os 8 valores do segundo vetor: ");
            numeros2[i] = s.nextInt();
        }
        
        for (int i=0; i < resultados.length; i++){
            resultados[i] = numeros1[i] * numeros2[i];
        }
        
        for (int i=0; i < resultados.length; i++){
            System.out.println("Multiplicação " + (i+1) + ": (" + numeros1[i] + " * " + numeros2[i] + ")" +
                                " = " + resultados[i]);
        }
        
        
    }
    
}
