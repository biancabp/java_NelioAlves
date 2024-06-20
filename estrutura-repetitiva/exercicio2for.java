import java.util.Scanner;

public class exercicio2for {
    public static void main(String[] args) {
        //
        //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dentro = 0; //variaveis iniciadas fora do for
        int fora = 0;  //se estiverem dentro vao ser reiniciada a cada ITERAÇÃO

        for(int i=0; i<N; i++){ //começa no 0, N definido pelo usuario numero limite, vai adicionando ate chegar
            int x = sc.nextInt(); //valor de entrada do x pelo usuario (loop tb)
            if (x>=10 && x<=20){
              dentro += 1;
            }
            else {
               fora += 1;
            }
        }
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
    }
}
