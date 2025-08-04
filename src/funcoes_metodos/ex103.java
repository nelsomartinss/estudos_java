package funcoes_metodos;
import java.util.Scanner;

public class ex103 {
    public static int maior(int n1, int n2, int n3){
        return Math.max(Math.max(n1, n2), n3);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = Integer.parseInt(input.nextLine());
        System.out.print("Digite o segundo número: ");
        int n2 = Integer.parseInt(input.nextLine());
        System.out.print("Digite o terceiro número: ");
        int n3 = Integer.parseInt(input.nextLine());

        int maior = maior(n1, n2, n3);
        System.out.printf("O maior número digitado: %d", maior);
    }
}
