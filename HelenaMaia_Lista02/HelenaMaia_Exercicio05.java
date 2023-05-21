/*
 * Algoritmo que recebe um numero e mostra ele e seu antecessor e sucessor
 * 11/05/2023
 * Helena Maia
 */

 //importa scanner
import java.util.Scanner;
public class HelenaMaia_Exercicio05 {
    public static void main(String[] args){
        //variaveis
        int n1;

        //inicio
        n1 = 0;

        //cria um novo scanner 
        Scanner leitor = new Scanner(System.in);

        //le n1
        System.out.println("Digite um número");
        n1 = leitor.nextInt();

        //mostra os paranaue: antecessor (número - 1), numero e sucessor (numero + 1)
        System.out.println("Antecessor: "+(n1 - 1)+" Número: "+n1+" Sucessor: "+(n1 + 1));
    }
}
