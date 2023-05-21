/*
 * Algoritmo que recebe dois valores e os troca
 * 11/05/2023
 * Helena Maia
 */

public class HelenaMaia_Exercicio04{
    public static void main(String[] args){
        //variaveis
        int A, B, C;

        //inicio
        A = B = C = 0;

        //atribui valores as variaveis
        A = 5;
        B = 7;

        //troca dos valores
        C = A;
        A = B;
        B = C;

        //mostra os valores
        System.out.println("Os valores são A = "+A+" e B = "+B);
    }    
}
