

public class Repeticoes3 {
    public static void main(String[] args) {
        
        int numero;

        //mostrar numeros de 1 a 10
        numero = 1;
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }
        System.out.println("\n\n");
        //mostrar numeros de 10 a 1
        numero = 10;
        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }        

        //repete 10x a msg OI
        numero = 0;
        while (numero < 10) {
            System.out.println("OI");
            numero++;
        }

        //NUMEROS 10 PRIMEIROS MÚLTIPLOS DE 8
        numero = 0;
        int multiplos = 8;
        while (numero < 10) {
            System.out.println(multiplos);
            numero++;
            multiplos += 8;
        }

        numero = 1;
        while (numero <= 10) {
            System.out.println(numero * 8);
            numero++;
        }
    }
}
