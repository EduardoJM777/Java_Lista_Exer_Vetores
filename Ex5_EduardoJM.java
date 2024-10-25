package exemplo_vetores;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex5_EduardoJM {
    
    public static void main(String[] args) {
        
        int qtdFrutas;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite a quantidade de frutas: ");
        qtdFrutas = s.nextInt();
        
        String frutas[] = new String [qtdFrutas];
        
        
        for (int i=0; i < frutas.length; i++){
            System.out.println("Digite o nome da fruta " + (i+1) + " :");
            frutas[i] = s.next();
        }
        
        for (int i=0; i < frutas.length; i++){
            System.out.println("\nFruta " + (i+1) + ": " + frutas[i] +
                                "(" + frutas[i].length() + " caracteres)");
        }
        
    }
    
}
