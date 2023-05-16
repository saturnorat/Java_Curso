/*
 * recebe a idade e mostra se é criança, adolescente, adulto ou idoso
 * 10/05/2023
 * Helena Maia
 */

//importa a biblioteca scanner
import java.util.Scanner;

public class HelenaMaia_Exercicio05{
    public static void main(String[] args) {
        //variaveis
        int idade;
        //inicio
        idade = 0;
        //cria novo scanner
        Scanner leitor = new Scanner(System.in);
        //pede e recebe o valor de idade
        System.out.print("Digite sua idade: ");
        idade = leitor.nextInt();

        //mostra se é kid, teen, adult ou idoso de acordo com o valor inserido para idade
        if(idade >= 0 && idade <= 12){
            System.out.println("tu é criança");
        }else if(idade >= 13 && idade <= 19){
            System.out.println("tu é adolescente");
        }else if(idade >= 20 && idade <= 65){
            System.out.println("tu é adulto");
        }else{
            System.out.println("tu é idoso");
        }

    }
}
