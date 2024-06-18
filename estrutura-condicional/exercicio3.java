import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.
        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        int valor;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1) {
           valor = 4 * quantidade;
        } else if ( codigo == 2){
           valor = (int) (4.50 * quantidade);
        } else if ( codigo == 3 ) {
            valor = 5 * quantidade;
        } else if ( codigo == 4) {
            valor = (int) (5.50 * quantidade);
        }
        else {
            valor = 6 * quantidade;
        }

        System.out.printf("Total: R$ %d\n", valor);

        sc.close();
    }
}
