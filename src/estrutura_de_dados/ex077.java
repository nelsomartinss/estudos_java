package estrutura_de_dados;
import java.util.ArrayList;

public class ex077 {
    public static void main(String[] args){
        ArrayList<Integer> vetorNumerico = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            vetorNumerico.add(999);
            System.out.print(vetorNumerico.get(i) + " ");
        }

    }
}
