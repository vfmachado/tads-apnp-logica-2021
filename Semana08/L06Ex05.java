import java.util.Scanner;

public class L06Ex05 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float x;
        
        System.out.println("Informe o valor x para cacular e^x");
        x = in.nextFloat();

        float numerador = 1;
        float denominador = 1;
        float soma = 1;

        for (int i = 1; i < 10; i++) {
            numerador = numerador * x;
            denominador = denominador * i;
            soma = soma + numerador/denominador;
        }

        System.out.println("Resultado: " + soma);

    }

}
