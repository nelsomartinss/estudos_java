package estrutura_de_dados;
import  java.util.ArrayList;

public class ex079 {
    public static void main(String[] args){
        ArrayList<Integer> vetorNumerico = new ArrayList<>();
        int primeiroNumero = 5;

        for(int i = 0; i < 10; i++){
            vetorNumerico.add(primeiroNumero);
            System.out.print(vetorNumerico.get(i) + " ");
            if(vetorNumerico.get(i) == 5){
                primeiroNumero = 3;
            } else {
                primeiroNumero = 5;
            }
        }
    }
}
