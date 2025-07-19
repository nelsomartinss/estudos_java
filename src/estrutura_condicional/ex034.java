package estrutura_condicional;
import java.util.Scanner;

public class ex034 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o valor da casa: ");
        double valorCasa = Double.parseDouble(input.nextLine());
        System.out.print("Digite o seu salário: ");
        double salario = Double.parseDouble(input.nextLine());
        System.out.print("Digite a quantidade de anos que pretende pagar: ");
        double qtdAnos = Double.parseDouble(input.nextLine());

        double trintaPorcentoDoSalario = (salario * 30) / 100;
        double qtdMeses = qtdAnos * 12;
        double valorMensal = valorCasa / qtdMeses;

        if(valorMensal <= trintaPorcentoDoSalario){
            System.out.print("\nEmprestimo Aprovado!");
            System.out.printf("\nValor da prestação: R$%.1f\nQuantidade meses: %.0f\n",
            valorMensal, qtdMeses);
        } else{
            System.out.print("\nEmprestimo Reprovado!");
        }
    }
}
