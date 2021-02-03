import java.util.Scanner;

public class Repeticoes2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String nome;
        int quantidade;

        System.out.println("Informe seu nome e quantas vezes vc quer que ele seja mostrado");
        nome = in.next();
        quantidade = in.nextInt();

        int vezes = 0;
        while (vezes < quantidade) {
            System.out.println("usando a variavel vezes " + nome);
            vezes++;
        }


        while (quantidade > 0) {
            System.out.println("usar a propria variavel quantidade " + nome);
            quantidade--;
        }

    }

}
