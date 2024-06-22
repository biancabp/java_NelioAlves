import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Scanner sc = new Scanner(System.in);

        int id1; // Código da peça 1
        double n1;  // Número de peças 1
        double v1; // Valor unitário de cada peça 1
        int id2; // Código da peça 2
        double n2;  // Número de peças 2
        double v2; // Valor unitário de cada peça 2
        double total; // Valor total a ser pago

        // Leitura dos dados da peça 1
        id1 = sc.nextInt();
        n1 = sc.nextDouble();
        v1 = sc.nextDouble();

        // Leitura dos dados da peça 2
        id2 = sc.nextInt();
        n2 = sc.nextDouble();
        v2 = sc.nextDouble();

        // Cálculo do valor total a ser pago
        total = (n1 * v1 + n2 * v2);

        // Exibição do valor total a ser pago com duas casas decimais
        System.out.printf("VALOR A PAGAR: %.2f%n", total);

        // Fechamento do Scanner
        sc.close();
    }
}
