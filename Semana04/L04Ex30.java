import java.util.Scanner;

public class L04Ex30 {

    public static void main(String[] args) {
        
        /*
            S = 1/1! + 2/3! + 3/5! + 4/7! + 5/9! + ... + n/m!
        */

        Scanner in = new Scanner(System.in);

        int numerador = 1;
        int denominador = 1;
        long fatorial = 1;
        int n = in.nextInt();

        double soma = 0;

        while (numerador <= n) {
            
            int valor = denominador;
            fatorial = 1;
        
            while (valor > 1) {
                fatorial = fatorial * valor;
                valor--;
            }
            
            soma += (double)numerador / fatorial;
            //soma += numerador / fatorial;

            System.out.println(numerador + "/" + denominador + "!" + " Fat: " + fatorial + " Soma atual: " + soma);
            
            numerador++;
            denominador += 2;
        }


    }

}
