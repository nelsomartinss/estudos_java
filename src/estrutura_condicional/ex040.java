package estrutura_condicional;
import java.util.Scanner;

public class ex040 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double calc = 0;
        boolean operacaoValida = true;
        char operador = ' ';

        System.out.print("\nDigite o primeiro número: ");
        double primeiroNumero = Double.parseDouble(input.nextLine());
        System.out.print("Digite o segundo número: ");
        double segundoNumero = Double.parseDouble(input.nextLine());
        System.out.print("""
                
                [1] - Soma
                [2] - Subtração
                [3] - Multiplicação
                [4] - Divisão
                """);
        System.out.print("Digite o número da operação: ");
        int numeroOperador = Integer.parseInt(input.nextLine());

        switch(numeroOperador){
            case 1:
                calc = primeiroNumero + segundoNumero;
                operador = '+';
                break;
            case 2:
                calc = primeiroNumero - segundoNumero;
                operador = '-';
                break;
            case 3:
                calc = primeiroNumero * segundoNumero;
                operador = '*';
                break;
            case 4:
                calc = primeiroNumero / segundoNumero;
                operador = '/';
                break;
            default:
                System.out.print("\nOperação inválida!\n");
                operacaoValida = false;
        }

        if(operacaoValida){
            System.out.printf("\n%.1f %s %.1f = %.1f\n", primeiroNumero, operador, segundoNumero, calc);
        }

    }
}
