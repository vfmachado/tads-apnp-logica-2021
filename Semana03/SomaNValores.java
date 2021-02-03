import java.util.Scanner;

public class SomaNValores {

    public static void main(String[] args) {
        
        //SOMAR N VALORES, ONDE N É INFORMADO PELO USUARIO

        // 1. DESCOBRIR O VALOR DE N
        // 2. REPETIR N VEZES A LEITURA DE UM VALOR
                //REPETIR N VEZES
                //FAZER A LEITURA DO VALOR
        // 3. ACUMULAR O VALOR NA VARIAVEL SOMA
        // 4. mostrar o resultado
        Scanner in = new Scanner(System.in);
        int numeros;
        int soma = 0;
        int valor;

        System.out.println("Oi Usuário, quantos valores serão somados?");
        numeros = in.nextInt();

        while (numeros > 0) {
            //System.out.println("...");
            numeros--;

            System.out.println("Informe o valor");
            valor = in.nextInt();

            soma = soma + valor;
            System.out.println("Total parcial: " + soma);
        }

        System.out.println("TOTAL: " + soma);

    }

}
