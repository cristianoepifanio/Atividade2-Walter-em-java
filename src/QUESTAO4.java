import java.util.Scanner;

public class QUESTAO4   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUESTÃO 4");
        System.out.println("Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. ");
        System.out.println("Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.");
        System.out.println("");
        System.out.println("RESPOSTA");
        //Resposta
        System.out.println("Qual é o valor do produto?");
        float valor = scanner.nextFloat();
        System.out.println("Qual é a percentagem?");
        float perc = scanner.nextFloat();
        float valorFinal = valor+(valor*(perc/100));
        System.out.println("O valor final é de "+valorFinal+" R$.");

    }

}
