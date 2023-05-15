/*
 * Recebe dois números, calcula e mostra a soma dos quadrados deles
 * 03/05/2023
 * Helena Maia
 */
// importa a biblioteca scanner
import java.util.Scanner;

public class ex2{
    public static void main(String[] args){
        //variaveis
        double num1, num2, q1, q2, sum;

        //inicio
        num1 = num2 = q1 = q2 = sum = 0.0;

        //incrementa os scanners 
        Scanner leitor = new Scanner(System.in);
        //pede e recebe os valores de num1 e num2
        System.out.print("Digite o primeiro número: ");
            num1 = leitor.nextDouble();
        System.out.print("Digite o segundo número: ");
            num2 = leitor.nextDouble();
        //atribui os valores dos quadradoss e da soma
            q1 = num1 * num1;
            q2 = num2 * num2;
            sum = q1 + q2;

        //mostra o resultado da soma
        System.out.println("O resultado da soma dos quadrados é: " + sum);
    }
}
