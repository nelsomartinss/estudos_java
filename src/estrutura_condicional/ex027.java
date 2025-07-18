package estrutura_condicional;
import java.util.Scanner;

public class ex027 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = Double.parseDouble(input.nextLine());
        System.out.print("Digite outro número: ");
        double segundoNumero = Double.parseDouble(input.nextLine());

        if(numero > segundoNumero){
            System.out.print("O primeiro valor é o maior!");
        } else if (numero < segundoNumero){
            System.out.print("O segundo valor é o maior!");
        } else {
            System.out.print("Não existe valor maior, os dois são iguais!");
        }


    }
}
