/*
 * Algoritmo que mostra se um dos numeros é maior ou se são iguais
 * 13/05/2023
 * Helena Maia
 */
//biblio scanner
import java.util.Scanner;
public class HelenaMaia_Exercicio09 {
    public static void main(String[] args){
        //variaveis
        int n1, n2;

        //inicio 
        n1 = n2 = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextInt();

        //mostra qual é maior ou se são iguais
        if(n1>n2){
            System.out.println("O primeiro é maior");
        }else if(n1<n2){
            System.out.println("O segundo é maior");
        }else{
            System.out.println("Os números são iguais");
        }
    }
}
