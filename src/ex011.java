import java.util.Scanner;

public class ex011 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite a altura da parede (em m): ");
        double altura = Double.parseDouble(entradaDados.nextLine());

        System.out.print("Digite a largura da parede (em m): ");
        double largura = Double.parseDouble(entradaDados.nextLine());

        double area = altura * largura;

        System.out.printf("A área da parede é de: %.1fm²", area);
    }

}
