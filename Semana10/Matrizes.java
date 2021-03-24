

public class Matrizes {

    public static void main(String[] args) {
        
        final int LINHAS = 8;
        final int COLUNAS = 8;
                        // linhas e colunas
        int[][] matriz = new int[LINHAS][COLUNAS]; //5 linhas (de 0 a 4) e 3 colunas (de 0 a 2) => total de 15 valores inteiros

        matriz[0][0] = 1;
        matriz[4][2] = 9;

        //for para passar por todas as linhas da matriz
        for (int linha = 0; linha < LINHAS; linha++) {
           
            //passa pelas colunas
            for (int coluna = 0; coluna < COLUNAS; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }

        //EXERCICIOS BÁSICOS
        /*
            SOLICITAR PARA O USUÁRIO O TAMANHO DE UMA MATRIZ E MOSTRAR ELA PREENCHIDA COM ZEROS NA TELA

            DADA UMA MATRIZ 5X5, SOLICITAR DENTRO DE UM LAÇO, AS POSICOES DE LINHA E COLUNA E UM NOVO VALOR, ATUALIZAR O VALOR NA POSICAO E MOSTRAR A MATRIZ NOVAMENTE

            VERIFICAR QUAIS LINHAS DA MATRIZ TEM TODOS OS VALORES IGUAIS

                1   2   3
                2   2   2
                1   4   2  
                1   1   1

                RESULTADO => LINHA 1, 3

            VERIFICAR QUAIS COLUNAS DA MATRIZ TEM TODOS VALORES IGUAIS

                1   2   3
                1   2   2
                1   4   2  
                1   1   1

                RESULTADO => COLUNA 0

        */


    }

}
