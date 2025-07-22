package estrutura_de_repeticao;
import java.util.Scanner;

public class ex048 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(input.nextLine());

        int i = 1;
        while(i <= numero){
            System.out.print(i + " ");
            i+=1;
        }
        System.out.print("Acabou!");
    }
}
