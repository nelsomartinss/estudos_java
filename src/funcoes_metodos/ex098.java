package funcoes_metodos;
import java.util.Scanner;

public class ex098 {
    public static void parOuImpar(int numero){
        if(numero % 2 == 0){
            System.out.printf("Número %d é PAR!", numero);
        } else {
            System.out.printf("Número %d é IMPAR!", numero);
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int entradaNumero = Integer.parseInt(input.nextLine());

        parOuImpar(entradaNumero);
    }
}
