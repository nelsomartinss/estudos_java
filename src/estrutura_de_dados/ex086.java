package estrutura_de_dados;
import java.util.ArrayList;
import java.util.Scanner;

public class ex086 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listaDeIdades = new ArrayList<>();
        ArrayList<Integer> posicoesMaiores25 = new ArrayList<>();
        ArrayList<Integer> posicoesMaiorIdade = new ArrayList<>();
        double somaIdades = 0;
        double numeroDeIdades = 0;
        double mediaIdades;
        int maiorIdade = 0;

        for(int i = 1; i <= 8; i++){

            System.out.printf("Digite a idade da %dº pessoa: ", i);
            int entradaIdade = Integer.parseInt(input.nextLine());

            // lista...
            listaDeIdades.add(entradaIdade);

            // Média...
            somaIdades+=entradaIdade;
            numeroDeIdades = i;

            // lista de pessoas que tem mais de 25 anos
            if(entradaIdade > 25){
                posicoesMaiores25.add(i - 1);
            }

            // maior idade da lista
            for (int idade : listaDeIdades) {
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
            }

        }

        // posições que a maior idade foi encontrada
        for (int y = 0; y < listaDeIdades.size(); y++) {
            if (listaDeIdades.get(y) == maiorIdade) {
                posicoesMaiorIdade.add(y);
            }
        }

        mediaIdades = somaIdades / numeroDeIdades;
        System.out.printf("""
                
                Média de idade: %.1f
                Posições de pessoas com mais de 25 anos: %s
                Maior idade digitada: %d
                Posições em que a maior idade apareceu: %s
                """, mediaIdades, posicoesMaiores25, maiorIdade, posicoesMaiorIdade);

    }
}
