import java.util.Scanner;

public class estruturacondicional1 {
    public static void main(String[] args) {

        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.
        Scanner sc = new Scanner(System.in);
        int A;
        int B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são Multiplos");
        }

        sc.close();
    }
}
