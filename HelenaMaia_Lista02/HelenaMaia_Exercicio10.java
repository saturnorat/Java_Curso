/*
 * Algoritmo que mostra se o número inserido é par ou impar
 * 13/05/2023
 * Helena Maia
 */
//importa scanner
import java.util.Scanner;
public class HelenaMaia_Exercicio10 {
    public static void main(String[] args){
        //variaveis
        int n1;

        //inicio
        n1 = 0;

        //cria novo scanner
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = leitor.nextInt();

        //verifica se é par ou impar e mostra
        if(n1 % 2 == 0){
            System.out.println("O número inserido é PAR");
        }else{
            System.out.println("O número inserido é ÍMPAR");
        }
    }
}
