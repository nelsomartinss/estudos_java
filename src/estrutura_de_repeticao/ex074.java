package estrutura_de_repeticao;
import java.util.Scanner;

public class ex074 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int qtdMulheres = 0;
        int qtdHomensPesamMaisQue100 = 0;
        double somatorioPesoMulheres = 0;
        double maiorPesoHomem = -1;
        double mediaMulheres = 0;

        for(int i = 1; i <= 5; i+=1){
            System.out.printf("Digite o sexo da %dº pessoa (M / F): ", i);
            String sexo = input.nextLine().toLowerCase();
            System.out.printf("Digite o peso da %dº pessoa: ", i);
            double peso = Double.parseDouble(input.nextLine());

            if(sexo.equals("m") || sexo.equals("f")) {
                if (sexo.equals("f")) {
                    qtdMulheres += 1;
                    somatorioPesoMulheres += peso;
                }

                if (sexo.equals("m") && peso > 100) {
                    qtdHomensPesamMaisQue100 += 1;

                }

                if (sexo.equals("m") && (maiorPesoHomem == -1 || peso > maiorPesoHomem)) {
                    maiorPesoHomem = peso;
                }
            } else {
                System.out.print("Sexo inválido!");
            }
        }

        mediaMulheres = somatorioPesoMulheres / qtdMulheres;
        System.out.printf("""
                
                Quantidade de mulheres que foram cadastradas: %d
                Quantidade de homens que pesam mais de 100Kg: %d
                A média de peso entre as mulheres: %.1f
                O maior peso entre os homens: %.1f
                """, qtdMulheres, qtdHomensPesamMaisQue100, mediaMulheres, maiorPesoHomem);
    }
}
