package estrutura_condicional;
import java.util.Scanner;

public class ex042 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha o número de um mês de 1 a 12: ");
        int mes = Integer.parseInt(input.nextLine());

        switch (mes){
            case 12: case 1: case 2: case 3:
                System.out.print("VERÃO");
                break;
            case 4: case 5: case 6:
                System.out.print("OUTONO");
                break;
            case 7: case 8: case 9:
                System.out.print("INVERNO");
                break;
            case 10: case 11:
                System.out.print("PRIMAVERA");
                break;
            default:
                System.out.print("Mês inválido. Tente novamente!");
        }
        
    }
}
