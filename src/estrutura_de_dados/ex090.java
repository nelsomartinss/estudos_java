package estrutura_de_dados;
import java.util.Scanner;
import java.util.ArrayList;

public class ex090 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> listaDeNomes = new ArrayList<>();
        ArrayList<Integer> listaDeIdades = new ArrayList<>();
        ArrayList<String> listaNomesPessoasMenores = new ArrayList<>();
        ArrayList<Integer> listaIdadesPessoasMenores = new ArrayList<>();

        for(int i = 1; i <= 3; i++){
            System.out.printf("Digite o nome da %dº pessoa: ", i);
            String entradaNome = input.nextLine();
            listaDeNomes.add(entradaNome);

            System.out.printf("Digite a idade da %dº pessoa: ", i);
            int entradaIdade = Integer.parseInt(input.nextLine());
            listaDeIdades.add(entradaIdade);

            if(entradaIdade < 18){
                listaNomesPessoasMenores.add(entradaNome);
                listaIdadesPessoasMenores.add(entradaIdade);
            }
        }

        System.out.printf("""
                
                Lista de nomes: %s
                Lista de idades: %s
                Nomes das pessoas menores: %s
                Idades das pessoas menores: %s
                """,listaDeNomes, listaDeIdades, listaNomesPessoasMenores, listaIdadesPessoasMenores);
    }
}
