
public class Repeticoes {
    public static void main(String[] args) {
        
        /*
        ESTRUTURAS DE CONTROLE

            ESTRUTURAS DE SELEÇÃO
                * IF / ELSE
                * SWITCH CASE    

            ESTRUTURAS DE REPETIÇÃO
                * WHILE
                * DO ... WHILE
                * FOR

                ** FOREACH
                ** FOR MELHORADO
                ** CADA LINGUAGEM TEM SUAS VARIAÇÕES

        */

        //ENQUANTO (valor lógico) { codigo a ser executado }
        // enquanto o valor lógico for verdadeiro, executará o código dentro das {}
        int numero = 0;
        boolean continua = true;
        while (continua) {
            System.out.println("Com variavel boolean!!! " + numero);
            numero++;   //numero = numero + 1

            //numero = 2
            if (numero == 10) {
                continua = false;
            }

        }   //volta para o inicio do while!


        numero = 0;
        while (numero < 10) {
            System.out.println("Utilizando a propria variavel! " + numero);
            numero++;
        }


        numero = 0;
        while (true) {
            System.out.println("Com break... " + numero);
            numero++;

            if (numero == 10) break;
        }
        //continua a lógica do programa...
        System.out.println("Good vibes =D");
    }
}
