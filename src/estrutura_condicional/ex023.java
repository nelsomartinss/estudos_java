package estrutura_condicional;
import java.util.Scanner;

public class ex023 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = Integer.parseInt(input.nextLine());

        int idade = 2025 - anoNascimento;

        if(idade < 18){
            int anosRestantes = 18 - idade;
            System.out.printf("Idade: %d\nRestam %d anos para o alistamento.", idade, anosRestantes);
        } else {
            int anosAtrasado = idade - 18;
            System.out.printf("Idade: %d\nVocê deveria ter se alistado a %d anos.", idade, anosAtrasado);
        }
    }
}
