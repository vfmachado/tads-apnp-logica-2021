import java.util.Scanner;

public class ForPrimos {

    public static void main(String[] args) {
        
        /*
            15 é primo? nooops
                divs: 1, 3, 5, 15

            7 é primo? yeesss
                divs: 1, 7

            20 é primo? noooppps
                divs: mais que 2 divs

            quantos divisores tem o numero 8?
                8/1     8/2     8/3     8/4     8/5     8/6 ... 8/8
                1, 2, 4, 8
        */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int totalDiv = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                System.out.println("Eh divisivel por " + i);
                totalDiv++;
            }
        }

        //ESSA MSG DEVE APARECER APENAS UMA VEZ... LOGO FORA DO FOR
        if (totalDiv == 2) {
            System.out.println("EH PRIMO!!!");
        } else {
            System.out.println("NAO EH PRIMO");
        }
    }

}
