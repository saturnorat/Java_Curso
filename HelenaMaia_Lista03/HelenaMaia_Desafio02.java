/*
 * Algoritmo que mostra um numero, um numero de vezes de acordo com seu valor
 * 17/05/2023
 * Helena Maia
 */

import java.util.Scanner;

public class HelenaMaia_Desafio02{
    public static void main(String[] args) {
        //variaveis
        int num;

        //inicio
        num = 0;

        Scanner leitor = new Scanner(System.in);//novo scanner

        //pede e recebe um numero
        System.out.println("Digite um número inteiro acima de 1: ");
        num = leitor.nextInt();

        System.out.println("Saída: ");

        if(num <1 ) { //nao aceita numero menor q 1
            System.out.println("Número inválido. Digite um número inteiro acima de 1.");
        } else {
            for(int cont = 0; cont < num; cont++){ //o numero é mostrado enquanto o contador for menor que ele
                System.out.println(num);
            }
        }
    }
}