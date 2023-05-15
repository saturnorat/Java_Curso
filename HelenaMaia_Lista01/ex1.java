import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = leitor.nextDouble();

        System.out.print("Digite o quarto número: ");
        double numero4 = leitor.nextDouble();

        double resultado = numero1 + numero2 + numero3 + numero4;

        System.out.println("A soma dos números é: " + resultado);
    }
}
