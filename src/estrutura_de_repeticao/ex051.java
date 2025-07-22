package estrutura_de_repeticao;
import java.util.Scanner;

public class ex051 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int incrementoOuDecremento = 0;

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = Integer.parseInt(input.nextLine());
        System.out.print("Digite o segundo valor: ");
        int segundoValor = Integer.parseInt(input.nextLine());

        if(primeiroValor < segundoValor){
            System.out.print("Digite o incremento: ");
            incrementoOuDecremento = Integer.parseInt(input.nextLine());

            while(primeiroValor < segundoValor){
                System.out.printf(primeiroValor + " ");
                primeiroValor+=incrementoOuDecremento;
            }
        } else {
            System.out.print("Digite o decremento: ");
            incrementoOuDecremento = Integer.parseInt(input.nextLine());

            while(primeiroValor > segundoValor){
                System.out.printf(primeiroValor + " ");
                primeiroValor-=incrementoOuDecremento;
            }
        }

        System.out.print("Acabou!");

    }
}
