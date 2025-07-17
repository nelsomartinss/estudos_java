package estrutura_condicional;
import java.util.Scanner;

public class ex022 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = Integer.parseInt(input.nextLine());

        // Ano bissexto é divisível por 4, mas não por 100 ou se é divisível por 400
        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.print("É bissexto!");
        } else {
            System.out.print("Não é bissexto!");
        }
    }
}
