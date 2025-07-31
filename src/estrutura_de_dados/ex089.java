package estrutura_de_dados;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class ex089 {
    public static void main(String[] args){
        Random gerador = new Random();
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            listaDeNumeros.add(gerador.nextInt(100));
        }

        ArrayList<Integer> numerosOrdenados = new ArrayList<>(listaDeNumeros);
        Collections.sort(numerosOrdenados); // função que ordena lista já criada

        System.out.printf("Números gerados: %s\n", listaDeNumeros);
        System.out.printf("Números em ordem crescente: %s\n", numerosOrdenados);
    }
}
