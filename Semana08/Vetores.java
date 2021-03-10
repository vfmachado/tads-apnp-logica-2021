import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        
        /*
        CONJUNTO DE VARIAVEIS QUE TEM O MESMO OBJETIVO TAMBÉM O MESMO TIPO!!!

        6 ALUNOS
        float m1, m2, m3, m4, m5, m6
        float[] notas;      //declaracao
        notas = new float[6];   //inicialização
                          ^ tamanho  
 
        */

        //DECLARACAO
        float[] notas;

        //INICIALIZAÇÃO
        notas = new float[6];

        //DECLARACAO + INICIALIZAÇÃO
        float[] ns = new float[10];


        //VETOR DE notas tem TAMANHO 6
        //AS POSICOES VAO DE 0 A 5 (TAMANHO -1)

        // NOME_VARIAVEL [ POSICAO ]
        // NOTAS NA POSICAO x

        //ATRIBUIÇÃO
        notas[0] = 8.5f;
        notas[1] = 0.0f;
        notas[2] = 3.0f;
        notas[3] = 4.0f;
        notas[4] = 0.0f;
        notas[5] = 6.0f;
       
        for (int pos = 0; pos < 6; pos++) {
            System.out.println("TESTE: " + notas[pos]);
        }
    }

}
