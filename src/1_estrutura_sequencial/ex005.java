import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
       Scanner entradaDados = new Scanner(System.in);

       System.out.print("Digite um número: ");
       int primeiroNumero = entradaDados.nextInt();

       System.out.print("Digite outro número: ");
       int segundoNumero = entradaDados.nextInt();

       int soma = primeiroNumero + segundoNumero;
       System.out.printf("%d + %d = %d", primeiroNumero, segundoNumero, soma);
    }
}
