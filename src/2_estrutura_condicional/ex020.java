package estrutura_condicional;
import java.util.Scanner;

public class ex020 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double primeiraNota = Double.parseDouble(input.nextLine());

        System.out.print("Digite sua segunda nota: ");
        double segundaNota =  Double.parseDouble(input.nextLine());

        double media = (primeiraNota + segundaNota) / 2;
        System.out.printf("Média: %.1f\n", media);

        if(media >= 7.0){
            System.out.print("Aprovado!");
        } else {
            System.out.print("Reprovado!");
        }

    }
}
