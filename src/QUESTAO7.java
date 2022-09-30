import java.util.Scanner;

public class QUESTAO7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUESTÃO 7");
        System.out.println("Utilizando estrutura de repetição (enquanto), receba n números e ao final exiba a média.");
        System.out.println("");
        System.out.println("RESPOSTA");
        //Resposta
        System.out.println("Quantas notas?");
        int n = scanner.nextInt();
        int i = 1;
        float media = 0;
        while (i <= n) {
            System.out.println("Digite a nota: ");
            float nota = scanner.nextFloat();
            media += nota;
            i++;
        }
        System.out.println("A média é "+(media/n));
    }
}
