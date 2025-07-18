package estrutura_condicional;
import java.util.Scanner;

public class ex028 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double primeiraNota = Double.parseDouble(input.nextLine());
        System.out.print("Digite sua segunda nota: ");
        double segundaNota = Double.parseDouble(input.nextLine());

        double media = (primeiraNota + segundaNota) / 2;

        if(media > 0 && media <= 4.9){
            System.out.printf("Média: %.1f: REPROVADO", media);
        } else if(media >= 5.0 && media <= 6.9){
            System.out.printf("Média: %.1f: RECUPERAÇÃO", media);
        } else if(media >= 7 && media <= 10){
            System.out.printf("Média: %.1f: APROVADO", media);
        } else {
            System.out.print("Média inválida! Tente novamente!");
        }

    }
}
