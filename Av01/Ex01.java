import java.util.Scanner;

public class Ex01 {

    /*
    Faça um programa que leia 100 valores inteiros e informe quantos deles são divisíveis por 3, quantos são divisíveis por 5 e quantos são  divisíveis por 3 e por 5.
    */

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        final int TOTAL = 100;
        int quant = 0;
        int valor;

        int div3 = 0, div5 = 0, div3e5 = 0;

        while (quant < TOTAL) {
            System.out.println("Informe um valor");
            valor = in.nextInt();    

            if (valor % 3 == 0) {
                div3++;
            }

            if (valor % 5 == 0) {
                div5++;
            }

            if (valor % 3 == 0 && valor % 5 == 0) {
                div3e5++;
            }

            quant++;
        }


        System.out.printf("Dos valores informados, %d sao divisiveis por 3, %d sao divisiveis por 5 e %d sao divisiveis por 3 e 5.", div3, div5, div3e5);
    }
    
}
