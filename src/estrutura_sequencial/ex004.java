import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entradaDados.nextLine();

        System.out.print("Digite seu salário: ");
        double salario = entradaDados.nextDouble(); // usando nextDouble() por é um número com ponto flutuante

        System.out.printf("O funcionário %s tem um salário de R$%.2f", nome, salario);
    }

}
