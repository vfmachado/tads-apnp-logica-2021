import java.util.Scanner;

public class Ex07 {

    /*
    Competição de Salto Ornamental - Crie um programa em Java que dado
os atributos Grau de Dificuldade e as 7 notas de um atleta A e outro atleta B, indique a pontuação de cada atleta e quem foi o vencedor.
    O cálculo da pontuação é feito com a soma da notas, excluindo a menor e maior nota e, ao final, multiplicando-se pelo Grau de Dificuldade.

    5   8   8   8   7   9   10 = 55 - 5 - 10 = 40
    gf = 2
    8   8   8   7   9 = 40 * 2 = 80

    */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int somaNotasA = 0;
        int menorNotaA = 999999;
        int maiorNotaA = -999999;
        
        int totalNotas = 7;

        System.out.println("Informe os valores referentes ao Atleta A");
        System.out.println("Qual o grau de dificuldade?");
        int gfA = in.nextInt();

        while (totalNotas > 0) {

            System.out.println("Informe a nota");
            int nota = in.nextInt();

            somaNotasA += nota;

            if (nota < menorNotaA) {
                menorNotaA = nota;
            }

            if (nota > maiorNotaA) {
                maiorNotaA = nota;
            }

            totalNotas--;
        }

        int pontuacaoA = (somaNotasA - menorNotaA - maiorNotaA) * gfA;
        

        //atleta B
        int somaNotasB = 0;
        int menorNotaB = 999999;
        int maiorNotaB = -999999;
        
        totalNotas = 7;
        System.out.println("Informe os valores referentes ao Atleta B");
        System.out.println("Qual o grau de dificuldade?");
        int gfB = in.nextInt();

        while (totalNotas > 0) {

            System.out.println("Informe a nota");
            int nota = in.nextInt();

            somaNotasB += nota;

            if (nota < menorNotaB) {
                menorNotaB = nota;
            }

            if (nota > maiorNotaB) {
                maiorNotaB = nota;
            }

            totalNotas--;
        }

        int pontuacaoB = (somaNotasB - menorNotaB - maiorNotaB) * gfB;

        System.out.println("Pontuacao A: " + pontuacaoA);
        System.out.println("Pontuacao B: " + pontuacaoB);

        if (pontuacaoA > pontuacaoB) {
            System.out.println("A ganhou!");
        } else if (pontuacaoB > pontuacaoA) {
            System.out.println("B ganhou!");
        } else {
            System.out.println("EMPATE");
        }

    }

}
