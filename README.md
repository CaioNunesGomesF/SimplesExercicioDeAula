
# **POO - Atividade de aula:**





## 1- Calcular a média aritmética entre duas notas:
```
import java.util.Scanner;

    public class CalculoMedia {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faça um algoritimo para calcular a média aritmética entre

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        if(nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Digite uma nota maior que 0 ou menor que 10.");

        }else {
            
            // Cálculo da média

            double media = (nota1 + nota2) / 2;

        // Fim

        System.out.println(String.format("A media dos alunos é %.1f", media));

     }

}
```

### Saida correta:

    Digite a primeira nota: 
    7,9
    Digite a segunda nota:
    9,8
    A media dos alunos é 8,9

### Saida errada:

    Digite a primeira nota: 
    60
    Digite a segunda nota:
    32
    Digite uma nota maior que 0 ou menor que 10.


## 2- Calcular de horas para minutos e segundos:
    
```
import java.util.Scanner;

public class CalculoHoras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horas, minutos, segundos;

        // 2- Faça um algoritimo que receba uma hora ( uma variável para hora e outra para minutos), calcule e mostre.

        // Hora

        System.out.print("Digite uma hora qualquer: ");
        horas = sc.nextInt();

        if(horas == 1)
            System.out.println("\nHora digitada = " + horas + " hora.");
        else
            System.out.println("\nHora digitada = " + horas + " horas.");

        if(horas > 12 && horas < 24){
            horas = horas / 2;
        }

        // Hora -> Minuto

        minutos = horas * 60;

        System.out.print("\nConvertido em minutos = " + minutos + " minutos.");

        System.out.println();

        // Minutos -> Segundos

        segundos = minutos * 60;

        System.out.println("\nConvertido em segundos = " + segundos + " segundos.");

    }
```

### Saida:

    Digite uma hora qualquer: 18

    Hora digitada = 18 horas.
    
    Convertido em minutos = 540 minutos.
    
    Convertido em segundos = 32400 segundos.

## 3- Calcular o numero de diagonais do polígono convexo:

```
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
```
### Saida:

    Digite o número de lados do polígono convexo: 9

    O número de diagonais do polígono é: 5

### Informações adicionais:

- Codigo feito em java.
- IDE IntelliJ
- Entrega 22/08/2024


