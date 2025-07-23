package estrutura_de_repeticao;
import java.util.Scanner;

public class ex058 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numeroDeIdades = 0;
        double somatorio = 0;
        int maioresDe18 = 0;
        int menoresQue5 = 0;
        int maiorIdade = -1;

        int i = 1;
        while(i <= 3){
            System.out.printf("Digite a idade da %d° pessoa: ", i);
            int idades = Integer.parseInt(input.nextLine());

            if(idades > 18){
                maioresDe18+=1;
            }

            if(idades < 5){
                menoresQue5+=1;
            }

            if(maiorIdade == -1 || idades > maiorIdade){
                maiorIdade = idades;
            }

            numeroDeIdades+=1;
            somatorio+=idades;
            i+=1;
        }

        double media = somatorio / numeroDeIdades;
        System.out.printf("""
                
                Média de idade do grupo: %.1f
                Quantidade de pessoas que tem mais de 18 anos: %d
                Quantidade de pessoas que tem menos de 5 anos: %d
                Maior idade lida: %d
                """, media, maioresDe18, menoresQue5, maiorIdade);
    }
}
