package estrutura_de_repeticao;

import java.util.Scanner;

public class ex075 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double soma = 0;

        System.out.print("Digite um número: ");
        double numero = Double.parseDouble(input.nextLine());
        System.out.print("Quanto a sequência deve crescer? : ");
        double numeroRazao = Double.parseDouble(input.nextLine());

        for(int i = 1; i <= 10; i+=1){
            System.out.printf("número atual: %.0f\n", numero);
            soma+=numero;
            numero+=numeroRazao;
        }
        System.out.printf("\nSoma de todos os números: %.0f\n", soma);

        input.close();
    }
}
