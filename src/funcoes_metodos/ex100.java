package funcoes_metodos;
import java.util.Scanner;

public class ex100 {
    public static void Fibonacci(int numero){
        int primeiroNumero = 0;
        int segundoNumero = 1;
        int terceiroNumero;

        for(int i = 0; i <= numero; i++){
            System.out.printf(" %d >>", primeiroNumero);
            terceiroNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = terceiroNumero;
        }

        System.out.print(" FIM!");

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(input.nextLine());

        Fibonacci(numero);
    }
}
