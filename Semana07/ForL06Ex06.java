import java.util.Scanner;

public class ForL06Ex06 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        /*
            dado o numero 30, queremos a sequencia de fibonacci até esse numero
            0   1   1   2   3   5   8   13  21  34  
                    a   b   c
        */

        int n = 30;
        int a, b, c;
        a = 0;
        b = 1;

       

        System.out.println(a + " " + b);
        /*
        c = a + b;
        while (c <= n) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
        */
        c = a + b;
        for (  ; c <= n ;  c = a + b) {
            System.out.println(c);
            a = b;
            b = c;
        }

        for ( ; ; ) {
            System.out.println("LACOOOOo");
        }
    }

}