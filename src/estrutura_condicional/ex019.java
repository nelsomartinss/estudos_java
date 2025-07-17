package estrutura_condicional;
import java.util.Scanner;

public class ex019 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = input.nextInt();
        int idade = 2025 - anoNascimento;

        if(idade >= 16){
            System.out.printf("Idade: %d\nVocê pode votar!", idade);
        } else {
            System.out.printf("Idade %d\nVocê não pode votar!", idade);
        }
    }
}
