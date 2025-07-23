package estrutura_de_repeticao;
import java.util.Random;

public class ex056 {
    public static void main(String[] args){
        Random gerador = new Random();
        int numerosAcimaDeCinco = 0;
        int numerosDiviseisPorTres = 0;

        int i = 1;
        while (i <= 20) {
            int numeroSorteado = gerador.nextInt(10);
            System.out.printf("%d° número sorteado: %d\n", i, numeroSorteado);

            if(numeroSorteado > 5){
                numerosAcimaDeCinco+=1;
            }

            if(numeroSorteado % 3 == 0){
                numerosDiviseisPorTres+=1;
            }

            i+=1;
        }

        System.out.printf("\nQuantidade de números acima de 5: %d\nQuantidade de números divisíveis por 3: %d\n",
                numerosAcimaDeCinco, numerosDiviseisPorTres);
    }
}
