package estrutura_de_repeticao;
import java.util.Scanner;

public class ex068 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean verificar = true;
        double qtdIdades = 0;
        double somatorioIdades = 0;
        double somatorioIdades21 = 0;

        do{
            System.out.print("Digite a sua idade: ");
            double idade = Integer.parseInt(input.nextLine());

            qtdIdades+=1;
            somatorioIdades+=idade;

            if(idade >= 21){
                somatorioIdades21+=1;
            }

            while(true){
                System.out.print("Deseja continuar? s/n: ");
                String sair = input.nextLine().toLowerCase();

                if(sair.equals("s")){
                    break;
                } else if (sair.equals("n")) {
                    verificar = false;
                    break;
                } else {
                    System.out.print("\nResposta inválida!\n");
                }
            }
        } while(verificar);

        double media = somatorioIdades / qtdIdades;
        System.out.printf("""
                
                Quantidade de idades foram digitadas: %.0f
                Média das idades digitadas: %.1f
                Quantidade de pessoas que tem 21 anos ou mais: %.0f
                """, qtdIdades, media, somatorioIdades21);
    }
}
