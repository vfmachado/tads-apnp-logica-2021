
public class Cond2 {

    public static void main(String[] args) {
        
        if (5 == 3 && 3 > 2) {
            System.out.println("5 eh igual a 3");
        } else if (10 < 0 || 4 % 2 == 1) {
            System.out.println("A condicao do primeiro IF falhou e a deste if (10 < 0) nao");
        } else {
            System.out.println("Nenhum if anterior foi verdadeiro");
        }

    }

}
