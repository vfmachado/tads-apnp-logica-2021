import java.util.Scanner;

public class L04Ex04 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        //Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e (c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor do saldo deve ser atualizado.

        //REPETIÇÃO IDEDETERMINADA
        float saldo = 0;
        int opcao = 0;

        while (opcao != 4) {

            System.out.print(
                "\n\nO que vc quer fazer?\n" +
                "\t1. Saldo\n" + 
                "\t2. Saque\n" + 
                "\t3. Deposito\n" +
                "\t4. Sair\n" +
                "Opcao: " 
            );
            opcao = in.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Quanto vc quer sacar?");
                float quantia = in.nextFloat();
                saldo = saldo - quantia;
            } else if (opcao == 3) {
                System.out.println("Quanto vc quer depositar?");
                float quantia = in.nextFloat();
                saldo = saldo + quantia;
            }
        }

        System.out.println("TERMINEI!!!");

    }

}
