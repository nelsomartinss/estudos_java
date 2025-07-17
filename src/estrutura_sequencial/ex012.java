import java.util.Map;
import java.util.Scanner;

public class ex012 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = Double.parseDouble(entradaDados.nextLine());

        System.out.print("Digite o valor de B: ");
        double b = Double.parseDouble(entradaDados.nextLine());

        System.out.print("Digite o valor de C: ");
        double c = Double.parseDouble(entradaDados.nextLine());

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.printf("O valor de Δ (delta) é: %.1f", delta);
    }
}