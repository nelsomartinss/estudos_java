import java.util.Scanner;
// precisamos importar o Scanner para ler dados do teclado

public class ex003 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entradaDados.nextLine(); // chamando scanner

        System.out.printf("Seja bem vindo, %s", nome); // exibindo nome
    }
}
