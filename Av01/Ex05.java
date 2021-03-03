import java.util.Scanner;

public class Ex05 {

    /*
   Um grupo de estudantes do IFRS desenvolveu uma plataforma onde os alunos podiam postar gameplays de jogos. Você foi incumbido de desenvolver uma espécie de ranking para a plataforma. Os dados serão identificados por números da seguinte maneira.

        a. Primeiro será informada a quantidade de gameplays registradas
        b. Cada gameplay terá o número da matrícula do aluno (inteiros) e o número do jogo (de 1 a 3)
        c. Os dados serão incluídos de maneira cronológica

    Foi solicitado que você informasse no ranking qual o jogo com mais gameplays publicadas e também qual o jogador (matrícula) que publicou o primeiro vídeo de cada jogo.
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int total;
        int matricula, jogo;

        int t1 = 0, t2 = 0, t3 = 0;
        int j1 = 0, j2 = 0, j3 = 0;

        System.out.print("Total de GAMEPLAYS: ");
        total = in.nextInt();

        while (total > 0) {

            System.out.println("Informe a matricula o jogo (1~3)");

            matricula = in.nextInt();
            jogo = in.nextInt();

            if (jogo == 1) {
                if (t1 == 0) {
                    j1 = matricula;
                }
                
                t1++;
            }
            if (jogo == 2) {
                if (t2 == 0) {
                    j2 = matricula;
                }
                
                t2++;
            }
            if (jogo == 3) {
                if (t3 == 0) {
                    j3 = matricula;
                }
                
                t3++;
            }

            total--;
        }

        System.out.println("O primeiro jogador de cada jogo foi:");
        System.out.println("#1 - " + j1);
        System.out.println("#2 - " + j2);
        System.out.println("#3 - " + j3);
        
        if (t1 > t2 && t1 > t3) {
            System.out.println("Jogo 1 foi o mais jogado");
        } else if (t2 > t1 && t2 > t3) {
            System.out.println("Jogo 2 foi o mais jogado");
        } else {
            System.out.println("Jogo 3 foi o mais jogado");
        }
        
    }

}
