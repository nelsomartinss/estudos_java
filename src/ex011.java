import java.util.Scanner;

public class ex011 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite a altura da parede (em m): ");
        String altura = entradaDados.nextLine();
        double alturaDouble = Double.parseDouble(altura);

        System.out.print("Digite a largura da parede (em m): ");
        String largura = entradaDados.nextLine();
        double larguraDouble = Double.parseDouble(largura);

        double area = alturaDouble * larguraDouble;

        System.out.printf("A área da parede é de: %.1fm²", area);
    }

}
