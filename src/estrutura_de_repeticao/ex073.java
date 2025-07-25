package estrutura_de_repeticao;
import java.util.Scanner;

public class ex073 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = Double.parseDouble(input.nextLine());

        System.out.print("Contagem: ");
        for(int i = 0; i <= numero; i+=1){
            System.out.print(i + ", ");
        }
        System.out.print("FIM!");
    }
}
