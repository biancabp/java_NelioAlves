import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        Scanner sc = new Scanner(System.in);

        double π = 3.14159;
        double raio;
        double A;
        double R;

        raio = sc.nextInt();
        R = Math.pow(raio, 2);
        A = π * R;

        System.out.println("A =" + A);

    }
}