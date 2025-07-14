import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        String primeiraNota = entradaDados.nextLine();
        double primeiraNotaDouble = Double.parseDouble(primeiraNota);

        System.out.print("Digite sua segunda nota: ");
        String segundaNota = entradaDados.nextLine();
        double segundaNotDouble = Double.parseDouble(segundaNota);

        double media = (primeiraNotaDouble + segundaNotDouble) / 2;
        System.out.printf("Média: %.1f", media);
    }
}
