package estrutura_de_dados;
import java.util.Scanner;
import java.util.ArrayList;

public class ex091 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> listaDeNomes = new ArrayList<>();
        ArrayList<String> listaDeSexos = new ArrayList<>();
        ArrayList<Double> listaDeSalarios = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            System.out.printf("Digite o nome do %dº funcionário(a): ", i);
            String entradaNome = input.nextLine();
            listaDeNomes.add(entradaNome);

            System.out.printf("Digite o sexo do %dº funcionário(a) (m/f): ", i);
            String entradaSexo = input.nextLine();
            if(entradaSexo.equals("m") || entradaSexo.equals("f")){
                listaDeSexos.add(entradaSexo);
            } else {
                System.out.print("Sexo inválido!\n");
            }

            System.out.printf("Digite o salário do %dº funcionário(a): ", i);
            double entradaSalario = Double.parseDouble(input.nextLine());
            listaDeSalarios.add(entradaSalario);
        }

        System.out.println("\nApenas mulheres:");
        for(int i = 0; i < listaDeSexos.size(); i++){
            if(listaDeSexos.get(i).equals("f")){
                System.out.printf("Nome: %s | Sexo: %s | Salário: R$%.2f\n", listaDeNomes.get(i), listaDeSexos.get(i), listaDeSalarios.get(i));
            }
        }
    }
}
