/*
 * Algoritmo que determina o valor de números positivos, se o user digita 0 o programa para
 * 16/05/2023
 * Helena Maia
 */
//importa o scanner
import java.util.Scanner;

public class HelenaMaia_Desafio01{

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //variaveis
        int mV, n1;

        //inicialização
        mV = n1 = 0;
        
        //mostra pra digitar uma sequencia
        System.out.println("Digite uma sequência de números inteiros positivos:");
        
        //enquanto true ("infinito") é lido n1
        while(true){
            n1 = leitor.nextInt();
            
            //SE n1 == 0 para o programa
            if (n1 == 0){
                break;
            }
            
            //SE o numero inserido for maior, passa o valor pra variavel mV (maior valor)
            if (n1 > mV){
                mV = n1;
            }
        }
        
        //mostra o maior valor
        System.out.println("O maior valor digitado foi: " + mV);
    }
}

