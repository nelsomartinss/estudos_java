package estrutura_de_repeticao;
import java.util.Scanner;

public class ex065 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean verificar = true;
        int maiorIdade = -1;
        double qtdHomens = 0;
        int mulherMaisJovem = -1;
        double somatorioHomens = 0;
        double mediaHomens = 0;

        while(verificar){
            System.out.print("Digite seu sexo: ");
            String sexo = input.nextLine().toLowerCase();
            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(input.nextLine());

            if(sexo.equals("m") || sexo.equals("f")){
                if(maiorIdade == -1 || idade > maiorIdade){
                    maiorIdade = idade;
                }

                if(sexo.equals("m")){
                    somatorioHomens+=idade;
                    qtdHomens+=1;
                }

                if(sexo.equals("f") && (mulherMaisJovem == -1 || idade < mulherMaisJovem)){
                    mulherMaisJovem = idade;
                }
            } else {
                System.out.println("Sexo inválido!");
                continue;
            }

            while(true){
                System.out.print("Deseja sair? s/n\n");
                String sair = input.nextLine().toLowerCase();

                if(sair.equals("s")){
                    verificar = false;
                    break;
                } else if(sair.equals("n")){
                    break;
                } else {
                    System.out.println("Resposta inválida, digite 's' para SIM ou 'n' para NÃO!");
                }
            }
        }

        mediaHomens = somatorioHomens / qtdHomens;
        System.out.printf("""
                    
                    A maior idade lida: %d
                    Quantidade de homens foram cadastrados: %.0f
                    Idade da mulher mais jovem: %d
                    Média de idade entre os homens: %.1f
                    """, maiorIdade, qtdHomens, mulherMaisJovem, mediaHomens);
    }
}
