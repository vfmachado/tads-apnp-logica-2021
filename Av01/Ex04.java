import java.util.Scanner;

public class Ex04 {

    /*
   Desenvolva um programa que simule uma votação de SIM ou NÃO. O primeiro valor digitado será a quantidade de votos, depois receba os N votos que poderão ser 1 para SIM e 0 (zero) para NÃO. Ao final, mostre a mensagem SIM ou NÃO de acordo com o que possuir mais votos.
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int total;
        int sim = 0;
        int nao = 0;
        int voto;

        System.out.println("Quantos serao os votos?");
        total = in.nextInt();

        while (total > 0) {
            System.out.println("Qual o voto (1 para sim e 0 para nao)?");
            voto = in.nextInt();

            if (voto == 1) {
                sim++;
            } else if (voto == 0) {
                nao++;
            } else {
                System.out.println("Voto invalido, nao computado");
                total++;
            }

            total--;
        }

        if (sim > nao) {
            System.out.println("Tivemos mais votos SIM");
        } else if (nao > sim) {
            System.out.println("Tivemos mais votos NAO");
        } else {
            System.out.println("EMPATE...");
        }
        
    }

}
