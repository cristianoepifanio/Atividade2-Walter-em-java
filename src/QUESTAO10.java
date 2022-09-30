import java.util.Scanner;

public class QUESTAO10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUESTÃO 10");
        System.out.println(" Escreva um algoritmo para simular o caixa de uma empresa. O algoritmo ao ser executado ");
        System.out.println("deve oferecer duas opções: 1–Debitar,2–Creditar, 3–Consultar Saldo e 9–Sair.");
        System.out.println("Não se deve permitir que o saldo fique negativo.");

        //Resposta
        int opcao = 0;
        float saldo = 0;
        float valor = 0;

        while (opcao!=4) {
            System.out.println("Escolha uma operação");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite um valor: ");
                    valor = scanner.nextFloat();
                    if (valor>saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valor;
                    }
                    break;
                case 2:
                    System.out.println("Digite um valor: ");
                    valor = scanner.nextFloat();
                    saldo += valor;
                    break;
                case 3:
                    System.out.println("Saldo atual de "+saldo+" R$.");
                    break;
                case 4:
                    System.out.println("SAIR");
                    break;
                default:
                    System.out.println("operação inválida");

            }
        }
    }
}
