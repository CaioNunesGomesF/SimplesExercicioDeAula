import java.util.Scanner;

public class CalculoPoligonoConvexo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /* 3- Faça um algorítimo que receba o número de lados de um poligono convexo, calcule e mostre
         o número de diagonais desse poligono. Sabe-se que ND =N* (N - 3) / 2, onde N é o número de lados do poligonos.*/

        System.out.print("Digite o número de lados do polígono convexo: ");
        int n = sc.nextInt();

        // Calcula o número de diagonais

        int numeroDiagonais = (n * (n - 3)) / 2;

        // Fim

        System.out.println("\nO número de diagonais do polígono é: " + numeroDiagonais);
    }
}

