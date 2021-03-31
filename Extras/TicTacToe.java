import java.util.Scanner;

public class TicTacToe {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] jogo = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(jogo[i][j] + "  ");
            } 
            System.out.println();   
        }

        int jogador = 1;
        boolean ganhou = false;
        do {
            System.out.println("Jogador " + jogador + " em qual linha e coluna vc quer jogar?");
            int linha = in.nextInt();
            int coluna = in.nextInt();

            jogo[linha][coluna] = jogador;


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(jogo[i][j] + "  ");
                } 
                System.out.println();   
            }
 /*
            //primeira linha
            if (jogo[0][0] == jogo[0][1] && jogo[0][0] == jogo[0][2] ) {
                System.out.println("TERMINOU");
                break;
            }

             //segunda linha
             if (jogo[1][0] == jogo[1][1] && jogo[1][0] == jogo[1][2] ) {
                System.out.println("TERMINOU");
                break;
            }


            //terceira linha
            if (jogo[2][0] == jogo[2][1] && jogo[2][0] == jogo[2][2] ) {
                System.out.println("TERMINOU");
                break;
            }
*/

            for (int i = 0; i < 3; i++) {
                
                //linhas
                if (jogo[i][0] == jogo[i][1] && jogo[i][0] == jogo[i][2] && jogo[i][0]  == jogador) {
                    System.out.println("TERMINOU");
                    ganhou = true;
                    break;
                }

                //colunas
                if (jogo[0][i] == jogo[1][i] && jogo[0][i] == jogo[2][i] && jogo[0][i] == jogador) {
                    System.out.println("TERMINOU");
                    ganhou = true;
                    break;
                }
            }


            if (jogo[0][0] == jogo[1][1] && jogo[0][0] == jogo[2][2] && jogo[0][0] == jogador) {
                ganhou = true;
                System.out.println("TERMINOU");
            }

            if (jogo[0][2] == jogo[1][1] && jogo[0][2] == jogo[0][2] && jogo[0][2] == jogador) {
                ganhou = true;
                System.out.println("TERMINOU");
            }

            if (jogador == 1)
                jogador = 2;
            else
                jogador = 1;

        } while (!ganhou);

    }

}
