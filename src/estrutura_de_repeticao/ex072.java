package estrutura_de_repeticao;
import java.util.Scanner;

public class ex072 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double resultado;

        System.out.print("Digite um número: ");
        double numero = Double.parseDouble(input.nextLine());

        for(int i = 1; i <= 10; i+=1){
            resultado = numero * i;
            System.out.printf("%.0f x %d = %.0f\n", numero, i, resultado);
        }
    }
}
