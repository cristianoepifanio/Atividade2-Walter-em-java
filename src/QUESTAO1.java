import java.util.Scanner;

public class QUESTAO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUESTÃO 1");
        System.out.println(" Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.");
        System.out.println(" No final informar o nome do aluno e a sua média (aritmética). Caso a média seja inferior a 7, ele está reprovado.");
        System.out.println("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();
        float media = (nota1+nota2+nota3)/3;
        if (media<7){
            System.out.println("O aluno está reprovado");
        } else {
            System.out.println("A média do aluno é "+media+". Parabéns, foi aprovado");
        }

    }
}