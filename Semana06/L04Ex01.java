import java.util.Scanner;

public class L04Ex01 {

    public static void main(String[] args) {

        //Ler um número inteiro n. Escrever a soma de todos os números de 1 até n
        //n = 90
        //1 2 3 4 5 6 7 .. 88 89 90

        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Informe o valor N");
        n = in.nextInt();

        int numeros = 1;
        int soma = 0;
        while (numeros <= n) {
            System.out.println(numeros);
            soma = soma + numeros;
            numeros++;
        }
        
        System.out.println("Soma: " + soma);
    }

}
