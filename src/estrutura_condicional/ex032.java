package estrutura_condicional;
import java.util.Scanner;

public class ex032 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("\n[1] - PEDRA\n[2] - PAPEL\n[3] - TESOURA\n");
        System.out.print("\nPLAYER 1 - Digite sua jogada: ");
        int playerOne = Integer.parseInt(input.nextLine());
        System.out.print("PLAYER 2 - Digite sua jogada: ");
        int playerTwo = Integer.parseInt(input.nextLine());

        if(playerOne == playerTwo){
            System.out.println("EMPATE!");
        } else if(
            (playerOne == 1 && playerTwo == 3) ||
            (playerOne == 2 && playerTwo == 1) ||
            (playerOne == 3 && playerTwo == 2)
        ) {
            System.out.println("\nPLAYER 1 VENCEU!");
        } else {
            System.out.println("\nPLAYER 2 VENCEU!");
        }
    }
}
