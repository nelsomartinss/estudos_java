import java.util.Scanner;

public class ex018 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro (KMs): ");
        double velocidadeCarro = Double.parseDouble(input.nextLine());

        if(velocidadeCarro > 80){
            double multa = (velocidadeCarro - 80) * 5;
            System.out.printf("Você foi multado em R$%.2f", multa);
        } else {
            System.out.print("Você obedeceu corretamente as leis de trânsito!");
        }
    }
}
