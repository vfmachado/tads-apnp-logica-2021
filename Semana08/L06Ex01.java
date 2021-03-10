import java.util.Scanner;

public class L06Ex01 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        /*
        matrícula, idade, sexo, altura e
concursado 
        */
        int matricula, idade, altura;
        boolean concursado;
        char genero;

        int totalFemConcursada = 0;
        int totalHomens = 0;
        int concursadoMaisVelho = 0;
        int mulheres30SemConcurso = 0;
        int totalConcursados = 0;

        int tHomensMenos40 = 0;
        int somaAlturasHomens = 0;
        float mediaAlturasHomensMenos40;

        do {

            System.out.println("Informe, na ordem, as informacoes:");
            System.out.println("Matricula, idade, altura, genero (f ou m), concursado");

            matricula = in.nextInt();
            
            if (matricula != 0) {
                idade = in.nextInt();
                altura = in.nextInt();
                genero = in.next().charAt(0);
                concursado = in.nextBoolean();

                if (genero == 'f') {
                    if (concursado == true) {
                        totalFemConcursada++;
            
                    } else { 
                        if (idade > 30) {
                            mulheres30SemConcurso++;
                        }
                    } 
                }
              

                if (genero == 'm') {
                    totalHomens++;

                    if (idade < 40) {
                        tHomensMenos40++;
                        somaAlturasHomens+= altura;
                    }
 
                }

                if (genero == 'm' && concursado) {
                    if (idade > concursadoMaisVelho) {
                        concursadoMaisVelho = idade;
                    }
                }

                if (concursado) {
                    totalConcursados++;
                }
            }
        } while (matricula != 0);

        mediaAlturasHomensMenos40 = (float)somaAlturasHomens/tHomensMenos40;

        //mostrar os valores ... e testem =)
    }

}
