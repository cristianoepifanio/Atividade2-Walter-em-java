import java.util.Scanner;

public class QUESTAO8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUESTÃO 8");
        System.out.println(" Utilizando estrutura de repetição (para), receba um valor e imprima sua tabuada de multiplicação. ");
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        System.out.println("A tabuada de "+n+" é: ");
        for(int i=1;i<=10;i++) {
            System.out.println(n+"x"+i+"= "+n*i);
        }

    }
}
