

public class Vet02 {

    public static void main(String[] args) {
    /*    
        //DECLARE E INICIALIZE UM VETOR DE 10 POSICOES
        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        
        //COLOQUE NOS INDICES IMPARES OS NUMEROS MULTIPLOS DE 2
          [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
  indices  0  1  2  3  4  5  6  7  8  9          
              ^     ^     ^     ^     ^
              2     4     6     8     10       
          [0, 2, 0, 4, 0, 6, 0, 8, 0, 10]    
        //COLOQUE NOS INDICES PARES OS NUMEROS MULTIPLOS 3
            [0, 2, 0, 4, 0, 6, 0, 8, 0, 10]  
             ^     ^     ^     ^     ^
             3     6     9     12    15
                         
        //NO FINAL, MOSTRE TODO O VETOR, INDICANDO OS INDICES

            [3, 2, 6, 4, 9, 6, 12, 8, 15, 10]  
    */

        int vetor[] = new int[10];

        /*
        ALTERNATIVA 1
        laço    (0 ... 9, de um 1 em 1)
            if pos eh impar
                faço a coisa do impar
            else
                faco a coisa do par

        int mult2 = 2;
        int mult3 = 3;
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 1) {
                vetor[i] = mult2;
                mult2 += 2; //mult2 = mult2 + 2
            } else {
                vetor[i] = mult3;
                mult3 += 3;
            }
        
        }
        */

        /*
        ALTERNATIVA 2

        LACO PELOS IMPARES (1 ... 9, de 2 em 2)
            faço a coisa do impar
        
        LACO PELOS PARES (0 ... 8, de 2 em 2)
            faco a coisa do par
        */

        int mult2 = 2;
        for (int i = 1; i < vetor.length; i = i + 2) {
            vetor[i] = mult2;
            mult2 = mult2 + 2;
        }

        int mult3 = 3;
        for (int i = 0; i < vetor.length; i = i + 2) {
            vetor[i] = mult3;
            mult3 = mult3 + 3;
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Na posicao " + i + " tem o valor " + vetor[i]);
        }

    }

}
