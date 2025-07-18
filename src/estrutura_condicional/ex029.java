package estrutura_condicional;
import java.util.Scanner;

public class ex029 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = Double.parseDouble(input.nextLine());
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = Double.parseDouble(input.nextLine());

        double area = largura * comprimento;

        if(area> 0 && area < 100){
            System.out.printf("Área: %.1fm² = TERRENO POPULAR", area);
        }else if(area >= 100 && area <= 500){
            System.out.printf("Área: %.1fm² = TERRENO MASTER", area);
        } else if(area > 500){
            System.out.printf("Área: %.1fm² = TERRENO VIP", area);
        } else {
            System.out.print("Área: Inválida!");
        }
    }
}
