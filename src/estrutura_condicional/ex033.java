package estrutura_condicional;
import java.util.Random;
import java.util.Scanner;

public class ex033 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int numeroSorteado = random.nextInt(5) + 1; // de 1 a 5

        System.out.print("Adivinhe um número de 1 a 5: ");
        int numeroAdivinhado = Integer.parseInt(input.nextLine());

        if(numeroAdivinhado == numeroSorteado) {
            System.out.printf("\nNúmero sorteado: %d", numeroSorteado);
            System.out.printf("\nNúmero adivinhado: %d", numeroAdivinhado);
            System.out.print("\nACERTOU!!\n");
        } else {
            System.out.printf("\nNúmero sorteado: %d", numeroSorteado);
            System.out.printf("\nNúmero adivinhado: %d", numeroAdivinhado);
            System.out.print("\nERROU!\n");
        }
    }
}
