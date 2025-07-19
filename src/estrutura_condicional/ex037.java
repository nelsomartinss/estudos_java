package estrutura_condicional;
import java.util.Scanner;

public class ex037 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double totalPontos = 0;
        double faturamento = 0;

        System.out.print("Digite quantas horas de atividade física práticou esse mês: ");
        double horas = Double.parseDouble(input.nextLine());

        if(horas > 0 && horas <= 10){
            totalPontos = horas * 2;
            faturamento = totalPontos * 0.5;
        } else if(horas > 10 && horas <= 20){
            totalPontos = horas * 5;
            faturamento = totalPontos * 0.5;
        } else if (horas > 20){
            totalPontos = horas * 10;
            faturamento = totalPontos * 0.5;
        } else {
            System.out.print("Você não práticou horas suficientes para pontuar!");
        }

        if(horas > 0){
            System.out.printf("Pontuação: %.0f\nFaturamento: R$%.2f\n", totalPontos, faturamento);
        }

    }
}
