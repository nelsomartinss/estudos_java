package estrutura_de_repeticao;
import java.util.Scanner;

public class ex050 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = Integer.parseInt(input.nextLine());
        System.out.print("Digite o segundo valor: ");
        int segundoValor = Integer.parseInt(input.nextLine());
        System.out.print("Digite o incremento: ");
        int incremento = Integer.parseInt(input.nextLine());

        while(primeiroValor <= segundoValor){
            System.out.printf(primeiroValor + " ");
            primeiroValor+=incremento;
        }
        System.out.print("Acabou!");

    }
}
