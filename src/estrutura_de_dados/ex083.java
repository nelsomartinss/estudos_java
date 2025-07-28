package estrutura_de_dados;
import java.util.Scanner;
import java.util.ArrayList;

public class ex083 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<Integer> listaMultiplosDe10 = new ArrayList<>();

        for(int i = 0; i < 15; i++){
            System.out.print("Digite um número: ");
            int entradaNumeros = Integer.parseInt(input.nextLine());
            listaNumeros.add(entradaNumeros);

        if(entradaNumeros % 10 == 0){
            listaMultiplosDe10.add(i);
        }

        }
        System.out.printf("Lista de números: %s\n", listaNumeros);
        System.out.printf("Posição dos números múltiplos de 10: %s\n", listaMultiplosDe10);


    }
}
