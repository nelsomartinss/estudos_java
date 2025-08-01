package funcoes_metodos;
import java.util.Scanner;

public class ex097 {
    public static void maior(int n1, int n2){
        int maior = Math.max(n1, n2);
        System.out.printf("O maior número digitado: %d", maior);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int primeiroNumero = Integer.parseInt(input.nextLine());
        System.out.print("Digite outro número: ");
        int segundoNumero = Integer.parseInt(input.nextLine());

        maior(primeiroNumero, segundoNumero);
    }
}
