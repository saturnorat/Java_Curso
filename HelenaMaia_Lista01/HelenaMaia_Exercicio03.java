/*
 * recebe valor em real, converte e mostra em dólar
 * 10/05/2023
 * Helena Maia
 */

//importa a biblioteca scanner
import java.util.Scanner;

public class HelenaMaia_Exercicio03{
    public static void main(String[] args){
        //variaveis
        double valorR, valorD;

        //inicio
        valorR = valorD = 0.0;

        //incrementa novo scanner
        Scanner leitor = new Scanner(System.in);
        //pede e recebe o valor em reais
        System.out.print("Digite o valor em reais: ");
        valorR = leitor.nextDouble();
        //atribui valor do dolar (real / )
        valorD = valorR / 0.25;

        //mostra o valor convertido de real pra dolar
        System.out.println("O valor em dólares é: " + valorD);
    }
}
