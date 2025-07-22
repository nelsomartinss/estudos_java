package estrutura_de_repeticao;

public class ex053 {
    public static void main(String[] args){
        int resultado = 0;
        int i = 500;
        while(i >= 0){
            if(i > 0){
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
            resultado+=i; // primeiro somamos o valor atual ao resultado
            i-=50; // depois decrementamos
        }
        System.out.printf(" = %d", resultado);
    }
}
