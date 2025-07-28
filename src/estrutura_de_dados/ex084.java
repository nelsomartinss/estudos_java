package estrutura_de_dados;
import java.util.Scanner;
import java.util.ArrayList;

public class ex084 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> posicaoNumerosPares = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            System.out.printf("Digite o %dº número: ", i);
            int entradaNumeros = Integer.parseInt(input.nextLine());
            listaNumeros.add(entradaNumeros);

            if(entradaNumeros % 2 == 0){
                numerosPares.add(entradaNumeros);
                posicaoNumerosPares.add(i);
            }
        }
        System.out.printf("\nNúmeros pares digitados: %s\n", numerosPares);
        System.out.printf("Posição dos números pares: %s\n", posicaoNumerosPares);
    }
}
