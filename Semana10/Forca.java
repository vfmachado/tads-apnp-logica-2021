import java.util.Scanner;

public class Forca {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a palavra");
        String palavra = in.next().toLowerCase();

        boolean [] acertos = new boolean[palavra.length()];
        
        while (true) {

            System.out.println("Informe uma letra");
            char letra = in.next().charAt(0);

            for (int i = 0; i < palavra.length(); i++) {
                if (letra == palavra.charAt(i)) {
                    System.out.println("Encontrei a letra na posicao " + i);
                    acertos[i] = true;
                }
            }

            int totalAcertos = 0;
            for (int i = 0; i < acertos.length; i++) {
                System.out.println(i + ": " + palavra.charAt(i) + " => "  + acertos[i]);
                if (acertos[i] == true) {
                    totalAcertos++;
                }
            }

            if (totalAcertos == palavra.length())
                break;
        }

        System.out.println("Duas palavras: Para Bens!");
    }

}
