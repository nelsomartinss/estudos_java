package funcoes_metodos;
import java.util.Scanner;

public class ex096 {
    public static void somador(double n1, double n2){
        double somar = n1 + n2;
        System.out.printf("%.0f + %.0f = %.0f", n1, n2, somar);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = Double.parseDouble(input.nextLine());
        System.out.print("Digite outro número: ");
        double n2 = Double.parseDouble(input.nextLine());

        somador(n1, n2);
    }
}
