/*
 * algoritmo que gera 50 numeros int e 50 reais e soma eles em variaveis, depois mostra as somas e qual foi maior
 * 29/05/23
 * HelenaMaia
 */
import java.util.Random;

public class HelenaMaia_Exercicio03{
    public static void main(String[] args){
        //variaveis e inicialização
        int sumInt, numInt;
        double sumReal, numReal;
        sumInt = numInt = 0;
        numReal = sumReal = 0.0;

        // cria novo random
        Random aleatorio = new Random();

        //laço
        for(int i = 0; i < 50; i++) {
            numInt = aleatorio.nextInt(100); // Gera um número inteiro aleatório entre 0 e 99
            sumInt += numInt;
            }

        for(int i = 0; i < 50; i++) {
            numReal = aleatorio.nextDouble() * 100; // Gera um número real aleatório entre 0.0 e 99.99999999999999
            sumReal += numReal;
            }
                
            // Exibir as duas somas e indicar a maior
            System.out.println("Soma dos números inteiros: " + sumInt);
            System.out.println("Soma dos números reais: " + sumReal);
                
        if (sumInt > sumReal) {
            System.out.println("A soma dos números inteiros é maior.");
        } else if (sumReal > sumInt) {
            System.out.println("A soma dos números reais é maior.");
        } else {
            System.out.println("As duas somas são iguais.");
            }

    }
}