/*
 * Algoritmo que le dois numeros e mostra todos os numeros inteiros entre eles
 * 17/05/2023
 * Helena Maia
 */

 //faz import do scanner
 import java.util.Scanner;
public class HelenaMaia_Exercicio02 {
    public static void main(String[] args){
        //variaveis
        int n1, n2;

        //inicio
        n1 = n2 = 0;

        //cria novo scanner
        Scanner leitor = new Scanner(System.in);
         
        System.out.println("Digite dois números para a sequência: ");
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        
        for(int cont = n1 + 1; cont < n2; cont ++){
            System.out.println("\n"+cont);//imprime os num
        }
        
    }
}
