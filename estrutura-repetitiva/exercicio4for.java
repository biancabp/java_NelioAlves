import java.util.Scanner;

public class exercicio4for {
    public static void main(String[] args) {
        //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i=0; i<N; i++){
            String a = sc.next();
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (y != 0){
               double resultado = x / y;
                System.out.println(resultado);
            }
            else {
                System.out.println("divisao impossivel");
            }
        }
        sc.close();
    }
}
