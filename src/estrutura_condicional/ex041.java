package estrutura_condicional;
import java.util.Scanner;

public class ex041 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma letra de A a F: ");
        String letra = input.nextLine().toUpperCase();

        switch (letra) {
            case "A":
                System.out.println("A – Excelente");
                break;
            case "B":
                System.out.println("B – Bom");
                break;
            case "C":
                System.out.println("C – Regular");
                break;
            case "D":
                System.out.println("D – Ruim");
                break;
            case "F":
                System.out.println("F – Reprovado");
                break;
            default:
                System.out.println("Letra inválida!");
        }
    }
}
