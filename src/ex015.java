import java.util.Scanner;

public class ex015{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double custoDia = 90.0;
        double custoKm = 0.20;

        System.out.print("Digite a quantidade de KMs percorridos: ");
        double qtdKm = Double.parseDouble(input.nextLine());
        System.out.print("Digite a quantidade de dias que ficou com o carro: ");
        int dias = Integer.parseInt(input.nextLine());

        double totalKm = qtdKm * custoKm;
        double totalDias = dias * custoDia;
        double total = totalKm + totalDias;

        System.out.printf("Valor total R$%.2f", total);


    }
}