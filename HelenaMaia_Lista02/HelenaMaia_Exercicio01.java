/*
 * Algoritmo que desconta 15% do valor inserido, mostra o valor original e o descontado
 * 10/05/23
 * Helena Maia
 */

//importa o scanner
import java.util.Scanner;

public class HelenaMaia_Exercicio01{
    public static void main(String[] args){
        //variaveis
        double desc, valdesc, val;

        //inicio
        valdesc = val = 0;

        //cria um novo scanner 
        Scanner leitor = new Scanner(System.in);

        //pede e recebe um valor
        System.out.print("Digite um valor: ");
        val = leitor.nextDouble();
        
        //atribuindo valor as variaveis desc (desconto) e valdesc(valor com desconto)
        desc = val * 0.15;
        valdesc = val - desc;
        
        //mostra os valores
        System.out.println("Valor original: " + val);
        System.out.println("Valor com desconto: " + valdesc);
    }
}