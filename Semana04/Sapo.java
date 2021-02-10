import java.util.Scanner;

public class Sapo {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int pulo, quantCanos;
        
        System.out.println("Qual a altura do pulo");
        pulo = in.nextInt();

        System.out.println("Quantos canos?");
        quantCanos = in.nextInt();
        int contador = 1;

        System.out.println("Cano 1:");
        int alturaAtual = in.nextInt();
        
        boolean ganhou = true;

        while (contador < quantCanos) {
            System.out.println("Cano " + (contador+1) + ": ");
            int proxCano = in.nextInt();
                        
            int diff = proxCano - alturaAtual;
            if (diff > pulo || -diff > pulo) {
                System.out.println("Perdeu aqui! Diff: " + diff);
                ganhou = false;
            }
         
            alturaAtual = proxCano;
            
            contador++;
        }

        if (ganhou) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }
    }

}
