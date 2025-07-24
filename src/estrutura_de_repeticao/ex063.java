package estrutura_de_repeticao;
import java.util.Scanner;

public class ex063 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean verificar = true;
        double totalPagoHomens = 0;
        double totalPagoMulheres = 0;

        while(verificar){
            System.out.print("Digite o salário do funcionário: ");
            double salario = Double.parseDouble(input.nextLine());
            System.out.print("Digite o sexo do funcionário: ");
            String sexo = input.nextLine().toLowerCase();

            if(sexo.equals("m")){
               totalPagoHomens+=salario;
            } else if(sexo.equals("f")) {
                totalPagoMulheres+=salario;
            } else {
                System.out.print("\nSexo inválido!\n");
            }

            while(true){
                System.out.print("Deseja sair? s/n\n");
                String sair = input.nextLine().toLowerCase();

                if(sair.equals("s")){
                    System.out.println("Até a próxima!");
                    verificar = false;
                    break;
                } else if(sair.equals("n")){
                    break;
                } else {
                    System.out.println("Resposta inválida, digite 's' para SIM ou 'n' para NÃO!");
                }
            }

        }

        System.out.printf("\nTotal pago as mulheres: R$%.2f\nTotal pago aos homens: %.2f\n", totalPagoMulheres, totalPagoHomens);
    }
}
