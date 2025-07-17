import java.util.Scanner;

public class ex017 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de cigarros fumados no dia: ");
        double qtdCigarrosDia = Double.parseDouble(input.nextLine());
        System.out.print("Digite a quantidade anos fumando: ");
        double qtdAnosFumando = Double.parseDouble(input.nextLine());

        double qtdCigarrosFumadosVida = qtdAnosFumando * qtdCigarrosDia;
        double tempoPerdidoPorCigarro = qtdCigarrosFumadosVida * 10;
        double totalDiasPerdidos = (tempoPerdidoPorCigarro / 60) / 24;

        System.out.printf("Você fumou %.0f cigarros por dia durante %.0f anos\n", qtdCigarrosDia, qtdAnosFumando);
        System.out.printf("Você perdeu o equivalente a %.0f dia(s) de vida", totalDiasPerdidos);
    }
}
