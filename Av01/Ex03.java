import java.util.Scanner;

public class Ex03 {

    /*
     Faça um programa que Java que dado um número inteiro maior ou igual a 1, mostre para o usuário a mensagem “Eu amo Java!!!” com a quantidade de letras 'o' igual ao número digitado. Por exemplo, se o número digitado for 3, a saída será “Eu amooo Java!!!”
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Quanto vc ama Java?");
        int repeticoes = in.nextInt();

        String texto = "Eu am";
        while (repeticoes > 0) {
            texto += "o";
            repeticoes--;
        } 
        texto += " Java!!!";
        
        System.out.println(texto);
        
    }

}
