package estrutura_de_dados;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class ex085 {
    public static void main(String[] args){
        Random gerador = new Random();
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<Integer> posicoesChave = new ArrayList<>();
        int indice = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 30; i++){
            int numero = gerador.nextInt(15) + 1; // 1 a 15
            listaNumeros.add(numero);
        }

        System.out.print("Digite um número: ");
        int chave = Integer.parseInt(input.nextLine());

        for(int x : listaNumeros){
            if(x == chave){
                posicoesChave.add(indice); // salvando na lista o indice em que o número foi encontrado
            }
            indice++;
        }

        if(posicoesChave.size() > 0){
            System.out.printf("O número %d foi encontrado %d vez(es)\n", chave, posicoesChave.size()); // o tamanho da array é exatamente a quantidade de vezes que o número foi encontrado
            System.out.printf("Posições: %s\n", posicoesChave); // array de posições
        } else {
            System.out.printf("O número %d não foi encontrado\n", chave);
        }
    }
}
