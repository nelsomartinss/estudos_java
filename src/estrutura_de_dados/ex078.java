package estrutura_de_dados;
import java.util.ArrayList;

public class ex078 {
    public static void main(String[] args){
        ArrayList<Integer> vetorNumerico = new ArrayList<>();
        int primeiroNumero = 5;

        for(int i = 0; i < 10; i++){
            vetorNumerico.add(primeiroNumero);
            primeiroNumero+=5;
            System.out.print(vetorNumerico.get(i) + " ");
        }
    }
}
