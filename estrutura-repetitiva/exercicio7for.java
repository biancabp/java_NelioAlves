import java.util.Scanner;

public class exercicio7for {

    //Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
    //começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
    //exemplo.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1;i<=N;i++) {
            if (N >= 0){
                int quadrado = (int) Math.pow(i, 2);
                int cubo = (int) Math.pow(i, 3);
                System.out.print(i + " ");
                System.out.print(quadrado + " ");
                System.out.println(cubo);
            }
        }
    }
}
