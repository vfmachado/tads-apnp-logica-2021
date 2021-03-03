import java.util.Scanner;

public class RepeticaoIndeterminada {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        //REPETICAO INDETERMINADA, EU NÃO SEI QUANTAS VEZES EU VOU EXECUTAR
        int valor = 1;

        while (valor != 0) {
            System.out.println("Informe um valor");
            valor = in.nextInt();
        }

    }
    
}
