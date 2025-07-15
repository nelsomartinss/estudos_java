import java.util.Scanner;

public class ex010 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Quanto você tem na carteira: R$");
        String valorCarteira = entradaDados.nextLine();
        double valorCarteiraDouble = Double.parseDouble(valorCarteira);

        double dolar = 5.57;
        double valorEmDolar = valorCarteiraDouble / dolar;

        System.out.printf("Com R$%.2f vocé poderia comprar $%.2f",
                valorCarteiraDouble, valorEmDolar);
    }

}
