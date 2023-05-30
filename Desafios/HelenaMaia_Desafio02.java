/*
 * algoritmo q fala se os alunos reprovaram ou aprovaram
 * 16/05/2023
 * Helena Maia
 */

 //importa o scanner
 import java.util.Scanner;

public class HelenaMaia_Desafio04{
    public static void main(String[] args) {
     
     //novo scanner
        Scanner scanner = new Scanner(System.in);
     //variaveis e inicialização
        int aprovados = 0;
        int reprovados = 0;
        double nota1, nota2, media;
        nota1 = nota2 = media = 0.0;
     
        
        System.out.println("Digite as notas dos alunos (digite um numero negativo para encerrar):");
        
       //loop de ler as notas
        while (true) {
            System.out.print("Nota 1: ");
            nota1 = scanner.nextDouble();
            
         //se a nota for negativa, para
            if (nota1 < 0) {
                break;
            }
            
            System.out.print("Nota 2: ");
            nota2 = scanner.nextDouble();
            
            if (nota2 < 0){
                break;
            }
           
            media = (nota1 + nota2) / 2;
            
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


