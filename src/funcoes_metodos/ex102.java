package funcoes_metodos;

import java.util.Scanner;

public class ex102 {
    public static double media(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = Double.parseDouble(input.nextLine());
        System.out.print("Digite sua segunda nota: ");
        double nota2 = Double.parseDouble(input.nextLine());

        double media = media(nota1, nota2);
        System.out.printf("Sua média: %.1f", media);

    }
}
