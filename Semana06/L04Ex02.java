import java.util.Scanner;

public class L04Ex02 {

    public static void main(String[] args) {

        //Ler um número inteiro n. Escrever a soma de todos os números pares de 0 até n
        //n = 10
        //0 2 4 6 8 10 => 30

        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Informe o valor N");
        n = in.nextInt();

        int numeros = 2;
        int soma = 0;
        while (numeros <= n) {
            System.out.println(numeros);
            soma = soma + numeros;
            numeros = numeros + 2;
        }
        
        System.out.println("Soma: " + soma);
    }

}
