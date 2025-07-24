package estrutura_de_repeticao;
import java.util.Scanner;

public class ex066 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean verificar = true;
        int maiorIdade = -1;
        String pessoaMaisVelha = "";
        int mulherMaisJovem = -1;
        String nomeMulherMaisJovem = "";
        int qtdHomensMais30 = 0;
        int mulheresMenores = 0;
        double totalPessoas = 0;
        double totalIdades = 0;
        double mediaGrupo = 0;

        while(verificar){
            System.out.print("Digite o seu nome: ");
            String nome = input.nextLine();
            System.out.print("Digite a sua idade: ");
            int idade = Integer.parseInt(input.nextLine());
            System.out.print("Digite o seu sexo: ");
            String sexo = input.nextLine().toLowerCase();

            if(sexo.equals("m") || sexo.equals("f") && idade > 0){
                if(maiorIdade == -1 || idade > maiorIdade){
                    maiorIdade = idade;
                    pessoaMaisVelha = nome;
                }

                if(sexo.equals("f") && (mulherMaisJovem == -1 || idade < mulherMaisJovem)){
                    mulherMaisJovem = idade;
                    nomeMulherMaisJovem = nome;
                }

                if(sexo.equals("m") && idade > 30){
                    qtdHomensMais30+=1;
                }

                if (sexo.equals("m") && idade < 18){
                    mulheresMenores+=1;
                }
            } else {
                System.out.println("Sexo ou idade inválidos!");
                continue;
            }

            totalPessoas+=1;
            totalIdades+=idade;

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

        mediaGrupo = totalPessoas / totalIdades;
        System.out.printf("""
                
                O nome da pessoa mais velha: %s
                O nome da mulher mais jovem: %s
                A média de idade do grupo: %.1f
                Número de homens com mais de 30 anos: %d
                Número de mulheres com menos de 18 anos: %d
                """, pessoaMaisVelha, nomeMulherMaisJovem, mediaGrupo, qtdHomensMais30, mulheresMenores);
    }

}
