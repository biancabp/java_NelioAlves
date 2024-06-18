import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        //
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
        Scanner sc = new Scanner(System.in);

        int inicial;
        int fim;
        int total;

        inicial = sc.nextInt();
        fim = sc.nextInt();

        if (inicial > fim) {
            total = -((inicial - fim) - 24);
        }
        else if (inicial < fim){
            total = fim - inicial;
        }
        else {
            total = 24;
        }

        System.out.printf("DUROU %d HORA(S)\n", total);
        sc.close();
    }
}
