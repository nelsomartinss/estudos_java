import java.util.Scanner;

public class ex014{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$");
        double salario = Double.parseDouble(input.nextLine());

        double aumento = salario + ((salario * 15) / 100);
        System.out.printf("Seu salário obteve um aumento de 15%%, passou a ser R$%.2f", aumento);
    }
}