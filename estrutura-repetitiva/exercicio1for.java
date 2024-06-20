import java.util.Scanner;

public class exercicio1for {
    public static void main(String[] args) {
        //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
//iterar é como seguir uma receita que instrui você a repetir um passo várias vezes, até que uma certa condição seja atendida.
        for (int i=1; i<=x; i++){ //nao usamos x pq x eh ate onde eh definido p rodar
            //o i vai começa de 1 pq a questao pede isso
           if (i % 2 != 0){
               System.out.println(i);
           }
        }

        sc.close();
    }
}
