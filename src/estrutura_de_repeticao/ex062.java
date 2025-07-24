package estrutura_de_repeticao;
import java.util.Scanner;

public class ex062 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double somatorio = 0;

        while(true){
            System.out.print("\nDigite um número: ");
            double numero = Double.parseDouble(input.nextLine());
            somatorio+=numero;

            System.out.printf("Somatório dos números: %.0f", somatorio);

            if(numero == 111){
                break;
            }
        }
    }
}
