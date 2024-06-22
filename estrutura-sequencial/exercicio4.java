import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.
        Scanner sc = new Scanner(System.in);
        int id;
        double h; // horas trabalhadas
        double v; // o valor que recebe por hora
        double total;

        id = sc.nextInt();
        h = sc.nextDouble();
        v = sc.nextDouble();
        total = h * v;

        System.out.printf("NUMBER = %d%n", id); // preste atencao q essa formataçao so da c printf
        System.out.printf("SALARY = U$ %.2f%n", total); // incluindo duas casas decimais (%.2f).
// O CODIGO NAO LE . PQ TA EM PORTUGUES
        sc.close();
    }
    }
