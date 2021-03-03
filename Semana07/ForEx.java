
public class ForEx {
    public static void main(String[] args) {
       
        /*
        1. inicializacao
        2. TESTE LOGICO (VERDADEIRO => CONTINUA; FALSO => TERMINA)
        3. BLOCO DE CODIGO
        4. PASSO (INCREMENTO, DECREMENTO, ...)
        VOLTA AO PASSO 2...
        */
        System.out.println("\nNUMEROS 1 ATÉ 5");
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println(i);
        }
       
        System.out.println("\nNUMEROS PARES DE 0 ATÉ 20");
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }
        
        //NUMEROS IMPARES DO 21 AO 1
        System.out.println("\nNUMEROS IMPARES DO 21 AO 1");
        for (int i = 21; i >= 1; i -= 2) {  // i -= 2 <=> i = i - 2
            System.out.println(i);
        }
    }
}
