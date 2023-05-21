/*
 * algoritmo que cacula o valor total de uma compra de picolés
 * 12/05/2023
 * HelenaMaia
 */
//importa o scanner
import java.util.Scanner;
public class HelenaMaia_Exercicio06 {
    public static void main(String[] args){
        //variaveis
        double kiwi, laranja, roma, total;

        //inicio
        kiwi = laranja = roma = total = 0;

        //novo scanner
        Scanner leitor = new Scanner(System.in);

        //le as quantidades
        System.out.println("Digite a quantidade de picolés de kiwi: ");
        kiwi = leitor.nextDouble();

        System.out.println("Digite a quantidade de picolés de laranja: ");
        laranja = leitor.nextDouble();

        System.out.println("Digite a quantidade de picolés de romã: ");
        roma = leitor.nextDouble();

        //atribui valor ao total
        total = (kiwi * 3.20)+(laranja * 2.39)+(roma * 7.99);

        //mostra o total
        System.out.println("O valor total é: "+total);
    }
}
