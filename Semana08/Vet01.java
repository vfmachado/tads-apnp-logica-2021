import java.util.Scanner;

public class Vet01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            faça um programa em que o usuário possa digitar X nomes, depois, o programa mostra os X nomes em ordem inversa
        */

        // TESTE COM 3
        /*
            NOME 1 = CAINA
            NOME 2 = MARCIO
            NOME 3 = MICAELA

            ... 
            MICAELA, MARCIO, CAINA

            ===========

            5
            NOMES[0] = DOUGLAS
            NOMES[1] = JESSICA
            NOMES[2] = BERNARDO
            NOMES[3] = LUIS
            NOMES[4] = JEAN
            ...
            JEAN, LUIS, BERNARDO, JESSICA, DOUGLAS
        */

        String[] nomes;
        int tamanho;

        System.out.println("OI usuario, qual quantidade de nomes?");
        tamanho = in.nextInt();

        nomes = new String[tamanho];

        // nomes.length = tamanho do vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o nome da posicao " + i);
            nomes[i] = in.next();
        }
       
        System.out.println("Na ordem inversa...");
        for (int i = tamanho-1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }

}
