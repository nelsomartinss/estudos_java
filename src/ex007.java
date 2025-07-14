import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entradaDados.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.printf("Número: %d\nAntecessor: %d\nSucessor: %d", numero, antecessor, sucessor);


    }
}
