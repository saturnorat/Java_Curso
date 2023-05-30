/*
 * algoritmo que recebe 3 n°s e enquanto a soma deles for diferente de 48 ou 71, continua lendo
 * 29/05/23
 * HelenaMaia
 */

 import java.util.Scanner;
public class HelenaMaia_Exercicio02 {
    public static void main(String args[]){
        //variaveis e inicialização
        int soma = 0;
        int n1, n2, n3;
        n1 = n2 = n3 = 0;

        //scanner
        Scanner leitor = new Scanner(System.in);
        //laço, enquanto a soma dos 3 valores for diferente de 48 e de 71, continua lendo infinitamente
        while(soma != 48 && soma != 71){
            System.out.println("Digite o primeiro número: ");
            n1 = leitor.nextInt();

            System.out.println("Digite o segundo número: ");
            n2 = leitor.nextInt();

            System.out.println("Digite o terceiro número: ");
            n3 = leitor.nextInt();

            soma = n1 + n2 + n3;
        }

    }
}
