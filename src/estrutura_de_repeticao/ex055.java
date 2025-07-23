package estrutura_de_repeticao;
import java.util.Scanner;

public class ex055 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numerosPares = 0;
        int numerosImpares = 0;

        int i = 1;
        while(i <= 6){
            System.out.printf("Digite o %d° número: ", i);
            int numero = Integer.parseInt(input.nextLine());

            if (numero % 2 == 0){
                numerosPares+=1;
            } else {
                numerosImpares+=1;
            }

            i+=1;
        }

        System.out.printf("Quantidade de números pares: %d\nQuantidade de números impares: %d",
                numerosPares, numerosImpares);
    }
}
