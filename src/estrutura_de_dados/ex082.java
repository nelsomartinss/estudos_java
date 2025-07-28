package estrutura_de_dados;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ex082 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            System.out.print("Digite seu nome: ");
            String entradaNomes = input.nextLine();
            nomes.add(entradaNomes);
        }
        Collections.reverse(nomes); // invertendo ordem da array
        System.out.print(nomes);
    }
}
