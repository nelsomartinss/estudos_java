package estrutura_condicional;
import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        double numero = Double.parseDouble(input.nextLine());

        if(numero % 2 == 0){
            System.out.printf("%.0f é PAR!", numero);
        } else {
            System.out.printf("%.0f é IMPAR!", numero);
        }
    }
}
