package estrutura_de_repeticao;
import java.util.Scanner;

public class ex057 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double maior = -1;
        double menor = -1;

        int  i = 1;
        while(i <= 8){
            System.out.printf("Digite o valor do %d° produto: ", i);
            double precoProduto = Double.parseDouble(input.nextLine());

            // se o valor for == -1 ou o valor do preço for maior...
            if (maior == -1 || precoProduto > maior) {
                maior = precoProduto;
            }

            // se o valor for == -1 ou valor do preco for menor...
            if (menor == -1 || precoProduto < menor){
                menor = precoProduto;
            }

            i+=1;
        }
        System.out.printf("Maior valor digitado: R$%.2f\nMenor valor digitado: R$%.2f", maior, menor);
    }
}
