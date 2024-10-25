package exemplo_vetores;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex3_EduardoJM {
    
    public static void main(String[] args) {
        
        String nomes[] = new String [5];
        
        Scanner s = new Scanner (System.in);
        
        for (int i=0; i < nomes.length; i++){
            System.out.println("Digite o " + (i+1) + "° nome: ");
            nomes[i] = s.nextLine();
        }
        
        for (int i=0; i < nomes.length; i++){
            System.out.println("Nome "+ (i+1)+ ": " + nomes[i]);
        }
    }
    
}
