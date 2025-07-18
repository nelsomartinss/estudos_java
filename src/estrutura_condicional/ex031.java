package estrutura_condicional;
import java.util.Scanner;

public class ex031 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro segmento: ");
        double ladoA = Double.parseDouble(input.nextLine());
        System.out.print("Digite o comprimento do segundo segmento: ");
        double ladoB = Double.parseDouble(input.nextLine());
        System.out.print("Digite o comprimento do terceiro segmento: ");
        double ladoC = Double.parseDouble(input.nextLine());

        boolean equilatero = (ladoA == ladoB) && (ladoB == ladoC);
        boolean isosceles = (
                (ladoA == ladoB) && (ladoB != ladoC) ||
                (ladoB == ladoC) && (ladoC != ladoA)
        );

        if(equilatero){
            System.out.print("EQUILÁTERO: todos os lados iguais");
        } else if(isosceles){
            System.out.print("ISÓSCELES: dois lados iguais");
        } else{
            System.out.print("ESCALENO: todos os lados diferentes");
        }

    }
}
