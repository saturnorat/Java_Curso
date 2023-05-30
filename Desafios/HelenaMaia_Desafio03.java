/*
 * algoritmo que
 * 20/05/2023
 * HelenaMaia
 */

import java.util.Scanner;

public class HelenaMaia_Desafio03{
    public static void main(String[] args) {
        
        //variaveis
        Scanner leitor = new Scanner(System.in);
        String senha;
        //inicio
        senha = " ";
        
        for (int i = 0; i > -1; i++) {
            System.out.println("Digite a senha: ");
            senha = leitor.next();

            if (senha.equals("JumiraldsMeuXuxu")) {
                System.out.println("Senha correta!");
                break;
            }
            else{
                System.out.println("Tente novamente: ");
            }
        }


    }
}