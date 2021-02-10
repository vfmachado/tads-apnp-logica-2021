import java.util.Scanner;

public class L02Ex15 {
    
    public static void main(String[] args) {

        /*
            I = 8H
            F = 12H     F >= I
            TOTAL = 4H   (12 - 8) (F - I)

            I = 23H     DIA = 24H
            F = 4H      F < I
            TOTAL = 5H  (24 - 23 + 4) (DIA - I + F)

            I = 19H
            F = 8H
            TOTAL = 13H 

            I = 20H => 20 ATÉ AS 24 = 4     (24 - 20) = 4
            F = 6H
        */

        Scanner in = new Scanner(System.in);
        int i, f;
        i = in.nextInt();
        f = in.nextInt();

        if (f >= i) {
            System.out.println("Duracao: " + (f - i));
        } else {
            System.out.println("Duracao: " + (24 - i + f));
        }
        
    }

}
