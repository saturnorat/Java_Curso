/*
 * Algoritmo q calcula e mostra a area de um triangulo
 * 11/05/2023
 * Helena Maia
 */

//importa a biblio scanner
import java.util.Scanner;

public class HelenaMaia_Exercicio03 {
    public static void main(String[] args){
        //variaveis
        double b, h, A;

        //inicio
        b = h = A = 0;

        //cria um novo scanner 
        Scanner leitor = new Scanner(System.in);

        //pede e recebe os valores
        System.out.println("Digite a base do triângulo: ");
        b = leitor.nextDouble();

        System.out.println("Digite a altura do triângulo: ");
        h = leitor.nextDouble();

        //determina o valor da área
        A = (b * h) / 2;

        //mostra 
        System.out.println("A área do triângulo é: " + A);


    }
}
