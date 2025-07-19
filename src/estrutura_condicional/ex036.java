package estrutura_condicional;
import java.util.Scanner;

public class ex036 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\n[1] - CARRO POPULAR\n[2] - CARRO DE LUXO\n");

        System.out.print("Digite o tipo de carro que foi alugado (1 ou 2): ");
        int tipoDeCarro = Integer.parseInt(input.nextLine());
        System.out.print("Digite a quantidade de dias que o carro foi alugado: ");
        double qtdDiasAlugado = Double.parseDouble(input.nextLine());
        System.out.print("Digite a quantidade KM's que foram percorridos: ");
        double qtdKm = Double.parseDouble(input.nextLine());

        if(tipoDeCarro == 1){
            if(qtdKm <= 100){
                double valorTotal = (qtdDiasAlugado * 90) + (qtdKm * 0.20);
                System.out.println("\nTipo de carro: POPULAR\nValor diária: R$90,00\nValor do Km percorrido: R$0,20");
                System.out.printf("Valor total: R$%.2f", valorTotal);
            } else {
                double valorTotal = (qtdDiasAlugado * 90) + (qtdKm * 0.10);
                System.out.println("\nTipo de carro: POPULAR\nValor diária: R$90,00\nValor do Km percorrido: R$0,10");
                System.out.printf("Valor total: R$%.2f", valorTotal);
            }
        } else if(tipoDeCarro == 2){
            if(qtdKm <= 200){
                double valorTotal = (qtdDiasAlugado * 150) + (qtdKm * 0.30);
                System.out.println("\nTipo de carro: LUXO\nValor diária: R$150,00\nValor do Km percorrido: R$0,30");
                System.out.printf("Valor total: R$%.2f", valorTotal);
            } else {
                double valorTotal = (qtdDiasAlugado * 150) + (qtdKm * 0.25);
                System.out.println("\nTipo de carro: LUXO\nValor diária: R$150,00\nValor do Km percorrido: R$0,25");
                System.out.printf("Valor total: R$%.2f", valorTotal);
            }
        } else {
            System.out.print("\nTipo de carro inválido! Tente novamente.\n");
        }
    }
}
