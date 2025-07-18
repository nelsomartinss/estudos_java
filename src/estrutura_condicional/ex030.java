package estrutura_condicional;
import java.util.Scanner;

public class ex030 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       System.out.print("Digite o seu nome: ");
       String nome = input.nextLine();
       System.out.print("Digite seu salário: ");
       double salario = Double.parseDouble(input.nextLine());
       System.out.print("Quantidade de anos trabalhando na empresa: ");
       double anosTrabalho = Double.parseDouble(input.nextLine());

       if(anosTrabalho > 0 && anosTrabalho <= 3){
           double aumento = salario + ((salario * 3) /100);
           System.out.printf("%s você obteve 3%% de aumento.\nSalário atualizado: R$%.2f", nome, aumento);
       }else if(anosTrabalho > 3 && anosTrabalho <= 10){
           double aumento = salario + ((salario * 12.5) /100);
           System.out.printf("%s você obteve 12,5%% de aumento.\nSalário atualizado: R$%.2f", nome, aumento);
       } else if (anosTrabalho > 10){
           double aumento = salario + ((salario * 20) /100);
           System.out.printf("%s você obteve 20%% de aumento.\nSalário atualizado: R$%.2f", nome, aumento);
       } else {
           System.out.print("Você ainda não pode obter aumento!");
       }
   }
}
