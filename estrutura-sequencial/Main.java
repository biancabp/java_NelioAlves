import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    //mensagem explicativa, conforme exemplos.
    Scanner sc = new Scanner(System.in);

    double x;
    double y;
    double A;
    x = sc.nextDouble();
    y = sc.nextDouble();

    A = x + y;

    System.out.println("SOMA =" + A);
}
}