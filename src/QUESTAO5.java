import java.util.Scanner;

public class QUESTAO5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUESTÃO 5");
        System.out.println(" Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida");
        System.out.println("a distância total percorrida pelo automóvel e o total de combustível gasto.");
        System.out.println("Qual a kilometragem rodada?");
        float kilometragem = scanner.nextFloat();
        System.out.println("Quanto foi gasto de gasolina?");
        float gasto = scanner.nextFloat();
        if (gasto == 0){
            System.out.println("Não é possível calcular. Você não andou nada?");
        } else {
            System.out.println("Seu gasto médio foi de "+(kilometragem/gasto)+" Km/L");
        }

    }
}
