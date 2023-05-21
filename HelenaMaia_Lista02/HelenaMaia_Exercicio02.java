/*
 * Algoritmo que recebe 3 números e mostra qual é o maior
 * 10/05/2023
 * Helena Maia
 */

 //importa o scanner
import java.util.Scanner;

public class HelenaMaia_Exercicio02{
    public static void main(String[] args){
        //variaveis
        int n1, n2, n3, maiorN;

        //inicio
        n1 = n2 = n3 = maiorN = 0;

        //cria um novo scanner 
        Scanner leitor = new Scanner(System.in);

        //pede e recebe os valores
        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextInt();

        System.out.println("Digite o terceiro número: ");
        n3 = leitor.nextInt();

        //fixa n1 como maior número, se n2 for o maior, maiorN recebe o valor de n2 e o mesmo com n3
        maiorN = n1;

        if(n2 > maiorN){
            maiorN = 2;
        }

        if(n3 > maiorN){
            maiorN = 3;
        }

        //Mostra o maior número
        System.out.println("O maior número é: " + maiorN);

    }
}