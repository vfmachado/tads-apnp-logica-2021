import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

        //O SCANNER PERMITE A LEITURA DE VARIAS ENTRADAS DE DADOS. QUANDO INFORMAMOS O SYSTEM.IN, DIZEMOS QUE QUEREMOS LER DO TECLADO NO TERMINAL. in de input
        Scanner in = new Scanner(System.in);

        System.out.println("Oi do JAVA");
        System.out.println("Informe um valor: ");
        
        //DECLARA UMA VARIAVEL, NOS RESERVAMOS ESPACO NA MEMORIA!
        int valor;
        float nota;

        valor = in.nextInt();

        System.out.println("O usuario digitou: " + valor);

        int dobro = valor * 2;
        System.out.printf("O dobro do valor: %d\n", dobro);
        
	}

}