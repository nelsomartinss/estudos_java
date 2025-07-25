package estrutura_de_repeticao;
import java.util.Scanner;

public class ex069 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean verificar = true;
        int qtdNumeros = 0;
        double somatorioNumeros = 0;
        double menor = -1;
        int qtdNumerosPares = 0;

        do{
            System.out.print("Digite um número: ");
            double numero = Double.parseDouble(input.nextLine());

            qtdNumeros+=1;
            somatorioNumeros+=numero;

            if(menor == -1 || numero < menor){
                menor = numero;
            }

            if(numero % 2 == 0){
                qtdNumerosPares+=1;
            }


            while(true){
                System.out.print("Deseja sair? s/n: ");
                String sair = input.nextLine().toLowerCase();

                if(sair.equals("s")){
                    verificar = false;
                    break;
                } else if (sair.equals("n")){
                    break;
                } else {
                    System.out.print("Resposta inválida!");
                }
            }
        } while(verificar);

        double media = somatorioNumeros / qtdNumeros;
        System.out.printf("""
               
                O somatório entre todos os valores: %.0f
                Menor valor digitado: %.0f
                Média entre todos os valores: %.1f
                Quantidade de valores que são pares: %d
                """, somatorioNumeros, menor, media, qtdNumerosPares);
    }
}
