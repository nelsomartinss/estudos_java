package estrutura_condicional;
import java.util.Scanner;

public class ex024 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o seu nome: ");
        String nome = input.nextLine();

        System.out.print("\nM - Masculino\nF - Feminino\nDigite seu sexo: ");
        String sexo = input.nextLine().toLowerCase();

        System.out.print("\nDigite o valor das compras: ");
        double valorCompras = Double.parseDouble(input.nextLine());

        if(sexo.equals("m")){
            double desconto = valorCompras - (valorCompras * 5) / 100;
            System.out.printf("\nNome: %s\nSexo: %s\nValor das Compras: R$%.2f\nValor com desconto: R$%.2f",
                    nome, sexo, valorCompras, desconto);
        } else if(sexo.equals("f")){
            double desconto = valorCompras - (valorCompras * 13) / 100;
            System.out.printf("\nNome: %s\nSexo: %s\nValor das Compras: R$%.2f\nValor com desconto: R$%.2f",
                    nome, sexo, valorCompras, desconto);
        } else {
            sexo = "inválido!";
            System.out.print("\nSexo inválido!\nTente novamente.");
        }
    }
}
