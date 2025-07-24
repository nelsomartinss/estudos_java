package estrutura_de_repeticao;
import java.util.Scanner;

public class ex060 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int i = 1;
        double totalPessoas = 0;
        double totalAlturas = 0;
        int totalPessoasAcimaDos90Kg = 0;
        int totalPessoasAbaixoDos50KgEAbaixoDos160Cm = 0;
        int totalPessoasAcimaDos100KgEAcimaDos190Cm = 0;

        while(i <= 7){
            System.out.printf("Digite o peso da %dº pessoa: ", i);
            double peso = Double.parseDouble(input.nextLine());
            System.out.printf("Digite a altura da %dº pessoa: ", i);
            double altura = Double.parseDouble(input.nextLine());

            totalPessoas+=1;
            totalAlturas+=altura;

            if(peso > 90){
                totalPessoasAcimaDos90Kg+=1;
            }

            if(peso < 50 && altura < 1.60){
                totalPessoasAbaixoDos50KgEAbaixoDos160Cm+=1;
            }

            if(peso > 100 && altura > 1.90){
                totalPessoasAcimaDos100KgEAcimaDos190Cm+=1;
            }

            i+=1;
        }

        double mediaAltura = totalAlturas / totalPessoas;
        System.out.printf("""
                
                Média de altura do grupo: %.2f
                Quantidade de pessoas que pesam mais de 90Kg: %d
                Quantidade de pessoas que pesam menos de 50Kg tem menos de 1.60m: %d
                Quantidade de pessoas que medem mais de 1.90m pesam mais de 100Kg: %d
                """, mediaAltura, totalPessoasAcimaDos90Kg, totalPessoasAbaixoDos50KgEAbaixoDos160Cm, totalPessoasAcimaDos100KgEAcimaDos190Cm);
    }
}
