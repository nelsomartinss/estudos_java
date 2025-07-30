package estrutura_de_dados;
import java.util.Scanner;
import java.util.ArrayList;

public class ex087 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> listaDeNotas = new ArrayList<>();
        ArrayList<Double> posicoesMaiorNota = new ArrayList<>();
        int qtdNotas = 0;
        double somaDasNotas = 0;
        int qtdAlunosAcima = 0;
        double maior = -1;

        for(int i = 1; i <= 5; i++){
            System.out.printf("Digite a nota do %dº aluno: ", i);
            double entradaNota = Double.parseDouble(input.nextLine());

            listaDeNotas.add(entradaNota);
            qtdNotas++;
        }

        for(double notas : listaDeNotas){
            somaDasNotas+=notas;

            // Qual foi a maior nota digitada
            if(notas > maior){
                maior = notas;
            }
        }

        // média da turma
        double mediaTurma = somaDasNotas / qtdNotas;

        // Quantos alunos estão acima da média da turma
        for(double alunoAcima : listaDeNotas){
            if(alunoAcima > mediaTurma){
                qtdAlunosAcima++;
            }
        }

        // Em que posições a maior nota aparece
        double indice = 0;
        for (double notas : listaDeNotas) {
            if (notas == maior) {
                posicoesMaiorNota.add(indice);
            }
            indice++;
        }


        System.out.printf("""
                
                A média da turma: %.1f
                Quantidade de alunos estão acima da média da turma: %d
                Maior nota digitada: %.1f
                Posições a maior nota aparece: %s
                """, mediaTurma, qtdAlunosAcima, maior, posicoesMaiorNota);

    }
}
