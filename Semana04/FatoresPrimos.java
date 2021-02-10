import java.util.Scanner;

public class FatoresPrimos {

    public static void main(String[] args) {
        
        /*
        9 => 3 * 3
        90 => 2 * 3 * 3 * 5
            180/2 = 90      2
            90/2 = 45       2
            45/3 = 15
            15/3 = 5
            5/5 = 1
        */

        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        int divisor = 2;

        boolean trocou = false;

        while(numero > 1) {
            if (numero % divisor == 0) {
                if (trocou) {
                    System.out.println();
                    trocou = false;
                }
                
                System.out.print(divisor + " ");
                numero = numero/divisor;
            } else {
                divisor++;
                trocou = true;
            }
        }
    }

}
