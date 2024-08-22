import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faça um algoritimo para calcular a média aritmética entre

        System.out.println("Digite a primeira nota.");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota.");
        double nota2 = sc.nextDouble();

        // Cálculo da média

        double media = nota1 + nota2 / 2;

        // Fim

        System.out.println(String.format("A media dos alunos é %.1f", media));

    }


}