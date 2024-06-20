import java.util.Scanner;

public class exercicio3for {
    public static void main(String[] args) {
        //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
        //de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
        //conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        //peso 5.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        for (double i=0; i<N;i++){
            double media1 = sc.nextDouble();
            double media2 = sc.nextDouble();
            double media3 = sc.nextDouble();
            double mediaPonderada = (media1 * 2 + media2 * 3 + media3 * 5) / (2 + 3 + 5);

            System.out.printf("%.1f%n", mediaPonderada);
        }
        sc.close();
    }
}
