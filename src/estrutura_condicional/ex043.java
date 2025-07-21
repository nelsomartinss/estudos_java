package estrutura_condicional;
import java.util.Scanner;

public class ex043 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double milha = 0;
        double fr = 0;
        double libras = 0;

        System.out.print(""" 
                MENU DE OPÇÕES:
                [1] - Quilômetros para Milhas
                [2] - Celsius para Fahrenheit
                [3] - Quilogramas para Libras
                """);
        System.out.print("Escolha o número correspondente a conversão que deseja: ");
        int numero = Integer.parseInt(input.nextLine());

        System.out.print("Digite um valor que deseja converter: ");
        double valor = Double.parseDouble(input.nextLine());

        switch(numero){
            case 1:
                 milha = valor / 1.609;
                 System.out.printf("%.1fKm são %.1fMi", valor, milha);
                 break;
            case 2:
                fr = (valor * 1.8) + 32;
                System.out.printf("%.1fºC são %.1fºF", valor, fr);
                break;
            case 3:
                libras = valor * 2.205;
                System.out.printf("%.1fKg são %.1fLb", valor, libras);
                break;
            default:
                System.out.print("Opção inválida. Tente novamente");
        }

    }
}
