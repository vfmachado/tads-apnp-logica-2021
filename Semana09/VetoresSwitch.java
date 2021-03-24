import java.util.Scanner;

public class VetoresSwitch {

    public static void main(String[] args) {

        final int TAMANHO = 10;
        float[] notas = new float[TAMANHO];
        // [0, 0, 0, 0, 0]
        // i 0 1 2 3 4 ultimo indice = tamanho -1
        // i é a matricula do aluno ou o numero da chamado!

        /*
         * FAÇA UM PROGRAMA QUE, DADA UMA QUANTIDADE DE ALUNOS, PERMITA EM UM MENU DE
         * OPÇÕES QUE O PROFESSOR ESCOLHA QUAL OPERAÇÃO DESEJA FAZER 
         * 1. ADICIONAR NOTA
         * 2. NOTA MAIS BAIXA 
         * 3. NOTA MAIS ALTA 
         * 4. MEDIA DAS NOTAS 
         * 5. VER TODAS NOTAS 
         * 6. ENCERRAR
         * 
         * ESSE MENU VAI SE REPETIR A CADA OPERAÇÃO, EXCETO QUANDO ESCOLHIDA A OPÇÃO 6.
         * 
         * AO ADICIONAR UMA NOTA, DEVE SER FEITA UMA VERIFICAÇÃO DE QUE O VALOR ESTEJA
         * ENTRE 0 E 10.
         */

        Scanner in = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Qual a opcao?");
            opcao = in.nextInt();

            switch (opcao) {
            case 1:
                System.out.println("Essa eh a op 1");
                System.out.println("Informe a mat (posicao) e a nota");
                int mat = in.nextInt();
                float nota = in.nextFloat();

                if (mat >= 0 && mat < TAMANHO)
                    notas[mat] = nota;
                else
                    System.out.println("Matricula nao encontrada");


                break;
            case 2:
                System.out.println("Essa eh a op 2");
                float menor = notas[0];
                for (int i = 1; i < TAMANHO; i++) {
                    if (notas[i] <  menor) {
                        menor = notas[i];
                    }
                }
                System.out.println("Menor nota: " + menor);
                break;
            case 3:
                System.out.println("Essa eh a op 3");
                float maior = notas[0];
                for (int i = 1; i < TAMANHO; i++) {
                    if (notas[i] >  maior) {
                        maior = notas[i];
                    }
                }
                System.out.println("Maior nota: " + maior);
                break;
            case 4:
                System.out.println("Essa eh a op 4");
                float soma = 0;
                for (int i = 0; i < TAMANHO; i++) {
                    soma += notas[i];
                }
                float media = soma/TAMANHO;
                System.out.println("Média da turma: " + media);
                break;
            case 5:
                System.out.println("Essa eh a op 5");
                for (int i = 0; i < TAMANHO; i++) {
                    System.out.println("ALUN@ " + i + "\tNota: " + notas[i]);
                }
                
                break;
            case 6:
                System.out.println("Encerrando =)");
                break;
            default:
                System.out.println("Opcao invalida...");
            }

        } while (opcao != 6);

    }

}
