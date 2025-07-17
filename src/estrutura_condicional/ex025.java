package estrutura_condicional;
import java.util.Scanner;

public class ex025 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distância que deseja percorrer (KM's): ");
        double distanciaKm = Double.parseDouble(input.nextLine());

        if(distanciaKm <= 200){
            double precoPassagem = distanciaKm * 0.50;
            System.out.printf("Valor da passagem: R$%.2f", precoPassagem);
        } else {
            double precoPassagem = distanciaKm * 0.45;
            System.out.printf("Valor da passagem: R$%.2f", precoPassagem);
        }
    }
}
