import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        /*
            SE CONDICAO
                CODIGO
            SENAO 
            
            if () {

            } else {    // else nao tem condicao
                        // else eh opcional

            }    

            if () {

            } else if () {

            } else if () {

            }
        */

        int numero = 10;
        boolean maiorQue10 = numero > 10;
        System.out.println(maiorQue10);

        if (maiorQue10) {
            System.out.println("Passou no teste!");
        }

        /*
        COMPARADORES
            >   maior
            <   menor
            >=  maior ou igual
            <=  menor ou igual
            !=  diferente
            !   negacao     (troca o resultado true/false)

        CONECTIVOS
            &&  (e) ambas sendo verdadeiras o resultado verdadeiro
                (26/01) é verao && está calor => verdadeiro

                5 > 3 && 3 < 2  => false
                true && false => false

            ||  (ou) pelo menos uma for verdadeira!
                5 > 3 || 3 < 2  => true
                (26/01) é verao || está calor => verdadeiro
        */

        

    }
}
