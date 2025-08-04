package funcoes_metodos;
import java.util.Scanner;

public class ex099 {
    public static void Contador(int inicio, int fim, int incremento){
        if(inicio <= fim){
            for(int i = inicio; i <= fim; i+=incremento){
                System.out.print(i + " ");
            }
        } else {
            for(int i = inicio; i >= fim; i-=incremento){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o inicio do loop: ");
        int inicio = Integer.parseInt(input.nextLine());
        System.out.print("Digite o final do loop: ");
        int fim = Integer.parseInt(input.nextLine());
        System.out.print("Digite o incremento: ");
        int incremento = Integer.parseInt(input.nextLine());

        Contador(inicio, fim, incremento);
    }

}
