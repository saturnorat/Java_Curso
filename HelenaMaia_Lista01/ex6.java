/*
 * calcula e mostra perímetro do circulo a partir do valor do raio inserido
 * 03/05/2023
 * Helena Maia
 */

//importa a biblioteca scanner
import java.util.Scanner;

public class ex6{
    public static void main(String[] args){
        //variaveis
        double raio, perimetro;
        //inicio
        raio = perimetro = 0.0;
        //cria novo scanner
        Scanner leitor = new Scanner(System.in);
        //pede e recebe valor do raio
        System.out.print("Digite o valor do raio: ");
        raio = leitor.nextDouble();

        //atribui valor a perimetro
        perimetro = (2 * 3.14) * raio;

        System.out.println("O perímetro do círculo é: "+ perimetro);
    }
}