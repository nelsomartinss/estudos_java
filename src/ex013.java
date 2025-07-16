import java.util.Scanner;

public class ex013{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$");
        double precoProduto = Double.parseDouble(input.nextLine());

        double precoPromocional = precoProduto - ((precoProduto * 5) / 100);
        System.out.printf("Valor promocional do produto R$%.2f", precoPromocional);
    }
}