package estrutura_de_dados;
import java.util.ArrayList;

public class ex080 {
    public static void main(String[] args){
        ArrayList<Integer> vetorNumerico = new ArrayList<>();
        int primeiroNumero = 0;
        int segundoNumero = 1;
        int terceiroNumero;

        // primeiro é necessário adicionar os 2 primeiros numeros a array
        vetorNumerico.add(primeiroNumero);
        vetorNumerico.add(segundoNumero);

        for(int i = 0; i < 15; i++){
            terceiroNumero = primeiroNumero + segundoNumero; // depois somamos os dois primeiros para termos o terceiro
            vetorNumerico.add(terceiroNumero); // agora é só adicionar o terceiro

            primeiroNumero = segundoNumero; // depois o primeiro vira o segundo
            segundoNumero = terceiroNumero; // e o segundo vira o terceiro
        }
        System.out.println(vetorNumerico);
    }
}
