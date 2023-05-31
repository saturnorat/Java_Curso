/*
 * algoritmo que faz a media de 500 notas inseridas (valor que pode ser alterado no codigo)
 * 17/05/2023
 * Helena Maia
 */
import java.util.Scanner;

public class HelenaMaia_Exercicio03{
    public static void main(String[] args){
        //novo scanner
        Scanner input = new Scanner(System.in);
        
        //variaveis
        double nota, soma;

        //inicio
        nota = soma = 0.0;

        for(int cont = 1; cont <= 500; cont++){
            //recebe e le as notas
            System.out.print("\nDigite uma nota: ");
            nota = input.nextInt();
            soma = soma + nota; //da valor a soma
        }
        System.out.println("A média das notas é de "+(soma / 500));//mostra a media
    }
}