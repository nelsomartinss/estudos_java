package estrutura_condicional;
import java.util.Scanner;

public class ex035 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = Double.parseDouble(input.nextLine());
        System.out.print("Digite seu peso: ");
        double peso = Double.parseDouble(input.nextLine());

        double imc = peso / Math.pow(altura, 2);

        if(imc < 18.5){
            System.out.printf("IMC: %.1f - Abaixo do peso", imc);
        } else if(imc >= 18.5 && imc < 25){
            System.out.printf("IMC: %.1f - Peso ideal", imc);
        } else if(imc >= 25 && imc < 30){
            System.out.printf("IMC: %.1f - Sobrepeso", imc);
        } else if(imc >= 30 && imc < 40){
            System.out.printf("IMC: %.1f - Obesidade", imc);
        } else {
            System.out.printf("IMC: %.1f - Obesidade mórbida", imc);
        }

    }
}
