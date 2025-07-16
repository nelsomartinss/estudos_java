import java.util.Scanner;

public class ex016 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int qtdHoras = 8;
        double  horaTrabalhada = 25.0;

        System.out.print("Digite o número de dias trabalhados: ");
        int numeroDias = Integer.parseInt(input.nextLine());

        double ganhoDia = qtdHoras * horaTrabalhada;
        double salario = numeroDias * ganhoDia;

        System.out.printf("Salário R$%.1f", salario);


    }
}
