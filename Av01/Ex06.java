import java.util.Scanner;

public class Ex06 {

    /*
   Existe uma técnica ninja lendária que permite que os ninjas se dupliquem e criem os chamados clones das sombras, estes clones podem invocar, juntamente com o ninja original a mesma técnica, Duplicando-se novamente, fazendo com que a quantidade de ninjas cresça exponencialmente, 1, 2, 4, 8, 16 … Crie um programa em java, sem utilizar a classe Math, que dada a quantidade de ninjas, retorne quantas vezes a técnica foi executada. Por exemplo, 1 ninja, 0 execuções; 32 ninjas, 5 execuções.
    2^5 =  2 * 2 * 2 * 2 * 2 = 32  operacao inversa
        32 /2
        16 /2
        8 /2
        4 /2
        2 /2
        1
    2^0 = 1
        1

    */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
   
        System.out.println("Quantos ninjas tem no momento?");
        int ninjas = in.nextInt();
        int execucoes = 0;

        while (ninjas != 1) {
            ninjas = ninjas / 2;
            execucoes++;
        }
        
        System.out.println("A tecnica foi executada " + execucoes + " vezes.");
    }

}
