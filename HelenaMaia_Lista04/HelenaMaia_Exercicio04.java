/*
 *algoritmo que le uma string e mostra se é um palavrão ou uma palavrinha
 * 29/05/23
 * HelenaMaia
 */

import java.util.Scanner;

public class HelenaMaia_Exercicio04{
    public static void main(String[] args) {
        //variaveis
        String text;

        //novo scanner
        Scanner leitor = new Scanner(System.in);

        //mostra e recebe um texto
        System.out.println("Digite um texto: ");
        text = leitor.nextLine();

        //se o tamanho do texto for maior que 10 mostra "palavrão" se não, "palavrinha"
        if (text.length() > 10) {
            System.out.println("Você digitou um palavrão!");
        } else {
            System.out.println("Você digitou uma palavrinha.");
        }
    }
}