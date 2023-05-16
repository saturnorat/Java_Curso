/*
 * algoritmo q fala se os alunos reprovaram ou aprovaram
 * 16/05/2023
 * Helena Maia
 */

 //importa o scanner
 import java.util.Scanner;

public class HelenaMaia_Desafio02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;
        
        System.out.println("Digite as notas dos alunos (digite n para encerrar):");
        
        while (true) {
            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();
            
            if (nota1 < 0) {
                break;
            }
            
            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            
            if (nota2 == 'n'){
                break;
            }
            
            double media = (nota1 + nota2) / 2;
            
            if (media > 5){
                System.out.println("Aprovado");
                aprovados++;
            } else{
                System.out.println("Reprovado");
                reprovados++;
            }
        }
        
        System.out.println("\nQuantidade de aprovados: " + aprovados);
        System.out.println("Quantidade de reprovados: " + reprovados);
    }
}


