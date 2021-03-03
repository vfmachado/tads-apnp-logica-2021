import java.util.Scanner;

public class Ex02 {

    /*
     * Escreva um programa que leia os valores inteiros referentes aos lados de um
     * triângulo e verifique se é um triângulo válido. Após, indique se o triângulo
     * é EQUILATERO, ESCALENO ou ISOSCELES. Além disso, o programa deve informar se
     * o triângulo é retângulo.
     * 
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, c;
        System.out.println("Informe os valores");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("eh valido");

            if (a == b && b == c) {
                System.out.println("EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("ISOSCELES");
            } else {
                System.out.println("ESCALENO");

                String msg = "nao eh...";
                // A eh a hipotenusa
                if (a > b && a > c) {
                    if (a * a == (b * b + c * c)) {
                        msg = "Eh triangulo retangulo A eh a hipotenusa";
                    } 
                    // B eh a hipotenusa
                } else if (b > a && b > c) {
                    if (b * b == (a * a + c * c)) {
                        msg = "Eh triangulo retangulo B eh a hipotenusa";
                    }
                    // C eh a hipotenusa
                } else {
                    if (c * c == (a * a + b * b)) {
                        msg = "Eh triangulo retangulo C eh a hipotenusa";
                    }
                }

                System.out.println(msg);
            }

        } else {
            System.out.println("nao eh valido");
        }

    }

}
