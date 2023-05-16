/*  Algoritmo que le 4 numeros e mostra o resultado da soma deles
    08/05/2023
    Helena Maia 
*/
//importa o scanner
import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        //variaveis 
        double n1, n2, n3, n4, result;
        //inicio
        n1 = n2 = n3 = n4 = result = 0;
        //novo scanner
        Scanner leitor = new Scanner(System.in);
        
        //pede e lê os 4 números 
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextDouble();

        System.out.print("Digite o terceiro número: ");
        n3 = leitor.nextDouble();

        System.out.print("Digite o quarto número: ");
        n4 = leitor.nextDouble();
        
        result = n1 + n2 + n3 + n4;

        System.out.println("A soma dos números é: " + result);
    }
}
