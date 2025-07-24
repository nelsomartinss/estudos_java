package estrutura_de_repeticao;
import java.util.Random;
import java.util.Scanner;

public class ex061 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int numeroAleatorio = random.nextInt(10) + 1; // entre 1 e 10
        int numeroAdivinhado = 0;
        int tentativasRestantes = 4;

        while(tentativasRestantes > 0){
            System.out.print("\nAdivinhe um número entre 1 e 10: ");
            numeroAdivinhado = Integer.parseInt(input.nextLine());

            if(numeroAdivinhado == numeroAleatorio){
                System.out.printf("\nNúmero sorteado: %d", numeroAleatorio);
                System.out.printf("\nNúmero adivinhado: %d", numeroAdivinhado);
                System.out.print("\nACERTOU!!\n");
                break;
            } else {
                System.out.print("\nERROU!\n");
                tentativasRestantes-=1;
                System.out.printf("\nTentativas restantes: %d\n", tentativasRestantes);
                }

            }

            if(tentativasRestantes == 0){
                System.out.print("\nVocê perdeu!\n");
                System.out.print("Fim de Jogo!\n");
            } else {
                System.out.print("\nVocê venceu!\n");
                System.out.print("Fim de Jogo!\n");
            }
        }
    }
