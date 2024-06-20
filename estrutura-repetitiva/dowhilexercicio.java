import java.util.Scanner;

public class dowhilexercicio {
    public static void main(String[] args) {
        // exercicio do-while

        Scanner sc = new Scanner(System.in);

        char letra;

        do {
            System.out.println("Digite a temperatura em Celsius:");
            double C = sc.nextDouble();
            double F = ((9 * C) / 5) + 32;
            System.out.println("Equivalente em Fahrenheit: " + F);
            System.out.println(" Deseja repetir (s/n)?");
            letra = sc.next().charAt(0);
        } while (letra != 'n');
    }
}
