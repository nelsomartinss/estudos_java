package estrutura_condicional;
import java.util.Scanner;

public class ex038 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double aumento = 0;
        int porcentagem = 0;

        System.out.print("\nDigite o seu salário atual: R$");
        double salarioAtual = Double.parseDouble(input.nextLine());
        System.out.print("\n[M] - MASCULINO\n[F] - FEMININO\n");
        System.out.print("Digite seu gênero: ");
        String sexo = input.nextLine().toLowerCase();
        System.out.print("\nDigite a quantidade de anos que trabalha na empresa: ");
        double anosTrabalho = Double.parseDouble(input.nextLine());

        if(sexo.equals("f")){
            if(anosTrabalho > 0 && anosTrabalho < 15){
                aumento = salarioAtual + ((salarioAtual * 5) / 100);
                porcentagem = 5;
            } else if(anosTrabalho > 15 && anosTrabalho <= 20){
                aumento = salarioAtual + ((salarioAtual * 12) / 100);
                porcentagem = 12;
            } else if(anosTrabalho > 20){
                aumento = salarioAtual + ((salarioAtual * 23) / 100);
                porcentagem = 23;
            } else {
                System.out.print("\nVocê não trabalhou tempo suficiente para receber aumento!\n");
            }
        } else if(sexo.equals("m")){
            if(anosTrabalho > 0 && anosTrabalho < 20){
                aumento = salarioAtual + ((salarioAtual * 3) / 100);
                porcentagem = 3;
            } else if(anosTrabalho > 20 && anosTrabalho <= 30){
                aumento = salarioAtual + ((salarioAtual * 13) / 100);
                porcentagem = 13;
            } else if(anosTrabalho > 30){
                aumento = salarioAtual + ((salarioAtual * 25) / 100);
                porcentagem = 25;
            } else {
                System.out.print("\nVocê não trabalhou tempo suficiente para receber aumento!\n");
            }
        } else {
            System.out.print("\nSexo inválido!\n");
        }

        if((sexo.equals("m") || sexo.equals("f")) && anosTrabalho > 0){
            System.out.printf("""
                
                Sexo: %s
                Salário Atual: R$%.2f
                Anos de trabalho: %.1f
                Porcentagem de Aumento: %d%%
                Salário novo: R$%.2f
                
                """,
                sexo, salarioAtual, anosTrabalho, porcentagem, aumento
            );


        }

    }
}
