package estrutura_de_repeticao;

import java.util.Scanner;

public class ex064 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double totalIdades = 0;
        double totalAlunos = 0;

        while(true){
            System.out.print("Digite a idade do aluno: ");
            int idadeAluno = Integer.parseInt(input.nextLine());
            totalIdades+=idadeAluno;
            totalAlunos+=1;

            if(idadeAluno == 999){
                System.out.println("Encerrando programa...");
                break;
            }
        }

        double media = totalIdades / totalAlunos;
        System.out.printf("Número de alunos da turma: %.0f\nMédia das idades dos alunos: %.1f", totalAlunos, media);
    }

}
