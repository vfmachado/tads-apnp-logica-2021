

public class BuzzFeed {

    public static void main(String[] args) {

        //MOSTRAR TODOS OS NUMEROS DE 1 A 100   FEITOOO
        //OS NUMEROS DIVISIVEIS POR 3 -> BUZZ   FEITOOO
        //OS NUMEROS DIVISIVEIS POR 5 -> FEED
        //OS NUMEROS DIVISIVEIS POR 3 E 5 -> BUZZFEED

        int numero = 1;

        while (numero <= 100) {
            
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("BuzzFeed");
            } else if (numero % 3 == 0) {
                System.out.println("Buzz");
            } else if (numero % 5 == 0) {
                System.out.println("Feed");
            } else {
                System.out.println(numero);
            }

            numero++;
        }
        
    }

}
