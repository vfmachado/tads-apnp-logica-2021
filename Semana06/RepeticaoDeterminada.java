import java.util.Scanner;

public class For {
        
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //REPETIÇÃO DETERMINADA
        //CONHECIDA A QUANTIDADE DE VEZES QUE DEVE EXECUTAR
    
        //calcule a media de 5 valores
        //QUANTIDADE VEZES É 5
        int quant = 0;
        int soma = 0;
        while (quant < 5) {
            System.out.println("executando " + quant);
            
            System.out.println("Informe um valor");
            int valor = in.nextInt();
            
            soma = soma + valor;
            System.out.println("Soma atual " + soma);
            quant++;
        }

        float media = (float)soma/5;
        System.out.println("Media: " + media);

        //REPETIÇÃO INDETERMINADA
        
    }

}
