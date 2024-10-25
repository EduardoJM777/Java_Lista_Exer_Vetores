package exemplo_vetores;

import java.util.Scanner;

/**
 *
 * @author 60003233
 */

public class Ex1_EduardoJM {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double notas[] = new double [4];
        double mediafinal, soma=0;
        
        System.out.println("Informe as notas dos bimestres: ");
        System.out.println("1° Bimestre: ");
        notas[0] = s.nextDouble(); 
        System.out.println("2° Bimestre: ");
        notas[1] = s.nextDouble();
        System.out.println("3° Bimestre: ");
        notas[2] = s.nextDouble();
        System.out.println("4° Bimestre: ");
        notas[3] = s.nextDouble(); 
        
        //Calculo Manual
        mediafinal = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("Média Final: " + mediafinal);
        
        System.out.println("Calculo com Laço: ");
        for (int i=0; i < notas.length; i++){
            soma += notas[i];
             System.out.println("Soma: " + soma);
        }
        
        mediafinal = soma / notas.length;
        System.out.println("Média Final: " + mediafinal);
    }
    
}
