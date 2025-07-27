package estrutura_de_dados;
import java.util.ArrayList;

public class ex080 {
    public static void main(String[] args){
        ArrayList<Integer> vetorNumerico = new ArrayList<>();
        int primeiroNumero = 0;
        int segundoNumero = 1;
        int terceiroNumero;

        vetorNumerico.add(primeiroNumero);
        vetorNumerico.add(segundoNumero);

        for(int i = 0; i < 15; i++){
            terceiroNumero = primeiroNumero + segundoNumero;
            vetorNumerico.add(terceiroNumero);

            primeiroNumero = segundoNumero;
            segundoNumero = terceiroNumero;
        }
    }
}
