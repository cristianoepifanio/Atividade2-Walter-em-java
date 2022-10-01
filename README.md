# Atividade2-Walter-em-java
Este repositório foi criado para que eu pudesse praticar a sintaxe em Java e me familiarizar com o processo de versionamento de código usando o Itellij. 
Para isso, eu "traduzi" algumas questões de lógica de programação que estava desenvolvendo no VisualG para a linguagem de programação java.

## Por exemplo

8 – Utilizando estrutura de repetição (para), receba um valor e imprima sua tabuada de multiplicação. 

*NO VISUALG* 
<pre>
Var
// Seção de Declarações das variáveis 

   cont: inteiro
   valor: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   cont<-1
   escreva("Digite um valor: ")
   leia (valor)
   para cont de 1 até 10 passo 1 faca
            Escreva(valor," x ",cont," = ",valor*cont)
            Cont<-cont+1
           fimpara
Fimalgoritmo
</pre>

*EM JAVA*
<pre>
import java.util.Scanner;

public class QUESTAO8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = scanner.nextInt();
        System.out.println("A tabuada de "+n+" é: ");
        for(int i=1;i<=10;i++) {
            System.out.println(n+"x"+i+"= "+n*i);
        }

    }
}
</pre>
