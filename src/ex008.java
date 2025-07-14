import java.util.Scanner;

public class ex008 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numero = entradaDados.nextLine();
        double numeroDouble = Double.parseDouble(numero);

        double dobro = numeroDouble * 2;
        double tercaParte = numeroDouble / 3;

        System.out.printf("Número: %.1f\nDobro: %.1f\nTerça parte: %.1f", numeroDouble, dobro, tercaParte);

    }

}
