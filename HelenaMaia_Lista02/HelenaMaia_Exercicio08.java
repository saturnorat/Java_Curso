/*
 * Algoritmo que mostra se a pessoa tem um imc saudavel
 * 12/05/2023
 * Helena Maia
 */

 //importa o scanner e o java math para usar o pow (potencia)
 import java.util.Scanner;
 import java.lang.Math;

public class HelenaMaia_Exercicio08 {
    public static void main(String[] args){
        //variaveis
        int idade;
        double altura, peso, imc;
        Character sex;
        String nome;

        //inicio
        idade = 0;
        altura = peso = imc = 0.0;
        sex = ' ';
        nome = " ";

        //novo scanner
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = leitor.nextLine();

        System.out.println("Digite seu sexo: ");
        sex = leitor.next().charAt(0);

        System.out.println("Digite sua altura: ");
        altura = leitor.nextDouble();

        System.out.println("Digite seu peso: ");
        peso = leitor.nextDouble();


        //calculo do imc
        imc = peso / (Math.pow(altura, 2));

        //decisão encadeada se o individuo esta com o imc ideal
        if(imc >= 18.5 && imc <= 24.9){
            System.out.println("IMC normal!");
        }
        else if(imc < 18.5){
            System.out.println("Você está sobpeso (magreza)");
        }
        else{
            System.out.println("Você está sobrepeso!");
        }
    }
}
