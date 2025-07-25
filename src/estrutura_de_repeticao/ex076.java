package estrutura_de_repeticao;

public class ex076 {
    public static void main(String[] args){
        int primeiroNumero = 0;
        int segundoNumero = 1;
        int proximoNumero;

        for(int i = 0; i < 10; i++){
            System.out.printf("%d ", primeiroNumero); // número atual
            proximoNumero = primeiroNumero + segundoNumero; // proximo
            primeiroNumero = segundoNumero; // atualizando primeiro
            segundoNumero = proximoNumero; // atualizando segundo
        }
    }
}
