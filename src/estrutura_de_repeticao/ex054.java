package estrutura_de_repeticao;

import java.util.Scanner;

public class ex054 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int somador = 0;
        int i = 1;

        while(i <= 7){
           System.out.printf("Digite o %dº número: ", i);
           numero = Integer.parseInt(input.next());
           somador+=numero;
           i+=1;
        }
        System.out.printf("Somatório dos números: %d", somador);
    }
}
