import java.util.Scanner;

public class L04Ex06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

/*
Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após a leitura do valor, escrever o valor lido na tela
*/
        
        int valor;
        
        do {
            System.out.println("Informe um valor");
            valor = in.nextInt();
            System.out.println("VOCE DIGITOU: " + valor);
        } while (valor < 1 || valor > 10);
            // !(valor >= 1 && valor <= 10)
        System.out.println("VALOR ACEITO!");

    }

}
