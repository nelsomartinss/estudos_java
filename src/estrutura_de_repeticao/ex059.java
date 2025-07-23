package estrutura_de_repeticao;
import java.util.Scanner;

public class ex059 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int qtdHomens = 0;
        int qtdMulheres = 0;
        int qtdIdades = 0;
        int somatorioIdades = 0;
        int qtdMulheresComMaisDe20Anos = 0;
        int somatorioIdadesHomens = 0;

        int i = 1;
        while(i <= 5){
            System.out.printf("Digite a idade da %d° pessoa: ", i);
            int idades = Integer.parseInt(input.nextLine());
            System.out.printf("Digite sexo da %d° pessoa: ", i);
            String sexos = input.nextLine().toLowerCase();

            if(sexos.equals("m")){
                qtdHomens+=1;
                somatorioIdadesHomens+=idades;
            } else if(sexos.equals("f")){
                qtdMulheres+=1;
            } else {
                System.out.println("\nSexo inválido!");
                continue;
            }

            if(sexos.equals("f") && idades > 20){
                qtdMulheresComMaisDe20Anos+=1;
            }

            // grupo
            qtdIdades+=1;
            somatorioIdades+=idades;

            i+=1;
        }

        double mediaDoGrupo = somatorioIdades / qtdIdades;
        double mediaHomens = somatorioIdadesHomens / qtdHomens;

        System.out.printf("""
                
                a) Quantos homens foram cadastrados: %d
                b) Quantas mulheres foram cadastradas: %d
                c) A média de idade do grupo: %.1f
                d) A média de idade dos homens: %.1f
                e) Quantas mulheres tem mais de 20 anos: %d
                """, qtdHomens, qtdMulheres, mediaDoGrupo, mediaHomens, qtdMulheresComMaisDe20Anos);
    }
}
