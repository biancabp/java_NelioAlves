import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        Scanner sc = new Scanner(System.in);
        double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO, raio, l2;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        raio = Math.pow(C, 2);
        l2 = Math.pow(B, 2);

        TRIANGULO = (A * C)/ 2;
        CIRCULO = 3.14159 * raio;
        TRAPEZIO = ((A + B)* C)/2;
        QUADRADO = l2;
        RETANGULO = A * B;

        System.out.printf("TRIANGULO = %.2f%n", TRIANGULO);
        System.out.printf("CIRCULO = %.2f%n", CIRCULO);
        System.out.printf("TRAPEZIO = %.2f%n", TRAPEZIO);
        System.out.printf("QUADRADO = %.2f%n", QUADRADO);
        System.out.printf("RETANGULO = %.2f%n", RETANGULO);

        sc.close();
    }
}
