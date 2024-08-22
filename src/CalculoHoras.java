import java.util.Scanner;

public class CalculoHoras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horas, minutos, segundos;

        // 2- Faça um algoritimo que receba uma hora ( uma variável para hora e outra para minutos), calcule e mostre.

        // Hora

        System.out.print("Digite um hora qualquer: ");
        horas = sc.nextInt();

        if (horas == 1)
            System.out.println("\nHora digitada = " + horas + " hora.");
        else
            System.out.println("\nHora digitada = " + horas + " horas.");

        if (horas > 12 && horas < 24) {
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

}