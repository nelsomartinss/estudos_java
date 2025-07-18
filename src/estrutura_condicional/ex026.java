package estrutura_condicional;
import java.util.Scanner;

public class ex026 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro segmento: ");
        double ladoA = Double.parseDouble(input.nextLine());
        System.out.print("Digite o comprimento do segundo segmento: ");
        double ladoB = Double.parseDouble(input.nextLine());
        System.out.print("Digite o comprimento do terceiro segmento: ");
        double ladoC = Double.parseDouble(input.nextLine());

        /*
        Matematicamente, para três segmentos formarem um triângulo,
        o comprimento de cada lado deve ser menor que a soma dos outros dois.
        */
        boolean formaTriangulo = (
            ladoA < ladoB + ladoC &&
            ladoB < ladoA + ladoC &&
            ladoC < ladoB + ladoA
        );

        if(formaTriangulo){
            System.out.print("Os três segmentos formam um triângulo!");
        } else {
            System.out.print("Os três segmentos NÃO formam um triângulo!");
        }

    }
}
