/*
 *algoritmo que soma 10 valores int positivos e mostra sua raiz quadrada
 * 30/05/23
 * HelenaMaia
 */
//importa o scanner e math
import java.util.Scanner;
import java.lang.Math;

public class HelenaMaia_Exercicio06{
    public static void main(String[] args) {
        //variaveis
        int cont, soma, valor;
        double raiz;

        //inicio
        cont = soma = valor = 0;


        //novo scanner
        Scanner leitor = new Scanner(System.in);

        //le 10 valores 
        while (cont < 10){
            System.out.println("Digite um valor inteiro positivo: ");
            valor = leitor.nextInt();
             
            //ignora valores negativos, soma os positivos
            if (valor >= 0){
                soma += valor;
                cont++;
            }
        }

        raiz = Math.sqrt(soma);
        System.out.println("A raiz quadrada da soma dos valores é: " + raiz);
    }
}
