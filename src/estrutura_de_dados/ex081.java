package estrutura_de_dados;
import java.util.Random;
import java.util.ArrayList;

public class ex081 {
    public static void main(String[] args){
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Random gerador = new Random();

        for(int i = 0; i < 7; i++){
           int numeroGerado = gerador.nextInt(10) + 1;
           listaNumeros.add(numeroGerado);
        }
        System.out.print(listaNumeros);
    }
}
