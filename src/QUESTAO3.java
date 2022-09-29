import java.util.Scanner;

public class QUESTAO3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUESTÃO 3");
        System.out.println(" Uma loja está vendendo seus produtos em 5 (cinco) prestações sem juros.");
        System.out.println("Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações.");
        System.out.println("Digite o valor do produto: ");
        float valor = scanner.nextFloat();
        System.out.println("O valor das prestações é de "+(valor/5)+" R$");

    }
}
