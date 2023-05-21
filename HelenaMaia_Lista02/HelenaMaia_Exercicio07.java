/* 
Algoritmo que le um nº e mostra se ele é positivo
12/05/2023
Helena Maia
*/

//importa scanner
import java.util.Scanner;
public class HelenaMaia_Exercicio07 {
    public static void main(String[] args){
        //variaveis
        int n;

        //inicio
        n = 0;

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        n = leitor.nextInt();

        //SE numero for entre 94 E 456 mostra acertou, se não, errou
        if(n >= 94 && n <= 456){
            System.out.println("Acertou!");
        }else{
            System.out.println("Errou!");
        }

    }
    
}
