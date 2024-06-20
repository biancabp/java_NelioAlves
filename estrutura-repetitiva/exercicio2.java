import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt(); //o usuario deve informar dnv se n vai ficar repetindo senha invalida
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
