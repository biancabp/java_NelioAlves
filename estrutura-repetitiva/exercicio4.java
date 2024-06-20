import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        //exemplo.

        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true){ // c true pela flexibilidade e utiliza a condicao de saida BREAK
            // CONDICAO DE SAIDA DEFINIDA NO ELSE DO BREAK.
            int tipoCombustivel = sc.nextInt(); //ela tem q ta dentro do while pq ela deve ser atualizada a cada loop

            if (tipoCombustivel == 1){
            alcool += 1;
            } else if (tipoCombustivel == 2) {
                gasolina += 1;
            } else if (tipoCombustivel == 3) {
                diesel += 1;
            } else if (tipoCombustivel == 4) {
                break; //sai do loop qnd o codigo digitado for 4
            } else {
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
