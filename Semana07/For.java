
public class For {
    public static void main(String[] args) {
        
        //REPETIÇÕES DETERMINADAS
        // a utilização do FOR

        /* 
        3 tipos de estrutura de repeticao

        while
            while (condicao) {
                //dentro do laco de repeticao a condicao se torne falsa
            }

        do ... while    => executa pelo menos uma vez
            do {
                //dentro do laco de repeticao a condicao se torne falsa
            } while (condicao);

        
        for     => maneira resumida de escrever os 3 passos de uma repeticao
        * inicio
        * teste
        * incremento / passo
          
            for ( inicio ;  teste ; passo ) {
                //codigo
            }

            ex: 1 até 100 (de 1 em 1)
            int i;
            for ( i = 1 ;  i <= 100 ; i++ ) {
                //codigo
            }
        */

        //MOSTRAR O NUMEROS DE 1 ATÉ 5
        int i;

        System.out.println("WHILE");
        i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println();
        

        System.out.println("DO ... WHILE");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
        System.out.println();


        System.out.println("FOR");
        for (i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
}
