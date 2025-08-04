package funcoes_metodos;
import java.util.Scanner;

public class ex101 {
    public static double somador(double n1, double n2){
        return n1 + n2;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = Double.parseDouble(input.nextLine());
        System.out.print("Digite outro número: ");
        double n2 = Double.parseDouble(input.nextLine());

        double soma = somador(n1, n2);
        System.out.print(soma);
    }
}
