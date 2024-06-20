import java.util.Scanner;

public class testandoAula {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0; // inicialização da variavel para ela receber o valor

        while ( x != 0){   //enqt x for diferente de zero
            soma += x; // soma = soma + x
            x = sc.nextInt();
        }

        System.out.println(soma);
    }
}
