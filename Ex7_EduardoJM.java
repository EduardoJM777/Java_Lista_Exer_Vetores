package exemplo_vetores;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */

public class Ex7_EduardoJM {
    
    public static void main(String[] args) {
        
        int valores[] = new int [50];
        int input;
        boolean presente=false;
        Random r = new Random();
        String numeros = "";
        
        Scanner s = new Scanner (System.in);
        
        for(int i=0; i < valores.length; i++){
            valores[i] = r.nextInt(1, 100);
        }
        
        for (int i=0; i < valores.length; i++){
            numeros += valores[i]+"-";
        }
        
        System.out.println("Números Gerados: \n" + numeros);
        
        System.out.println("Digite um valor entre 1 e 100: ");
        input = s.nextInt();
        
        for (int i=0; i < valores.length; i++){
            if (valores[i] == input){
                presente = true;
                break;
            } else {
                presente = false;
            }
        }
        
        if (presente == true){
            System.out.println("O valor digitado está presente!");
        } else {
            System.out.println("O valor digitado não está presente!");
        }
        
        
    }
    
}
