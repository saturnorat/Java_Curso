/*
 * algoritmo que soma todo os números cujo quadrado seja divisivel por 4
 * 29/05/23
 * Helena Maia
 */

public class HelenaMaia_Exercicio01 {
    public static void main(String args[]) {
        // variaveis e inicio
        int limite = 0;
        int sum = 0;
        int quad = 0;

        for (int i = 1; i <= limite; i++) {
            quad = i * i;
            if (quad % 4 == 0) {
                sum += i;
            }
        }

        System.out.println("A soma dos números cujo quadrado é divisível por 4 é: " + sum);
    }

}
