package estrutura_de_repeticao;

import javax.annotation.processing.SupportedSourceVersion;

public class ex052 {
    public static void main(String[] args){
        int resultado = 0;
        int i = 6;
        while(i <= 100){
            if(i < 100){
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
            resultado+=i; // primeiro somamos o valor atual ao resultado
            i+=2; // depois incrementamos
        }
        System.out.printf(" = %d", resultado);
    }
}
