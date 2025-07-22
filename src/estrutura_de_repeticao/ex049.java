package estrutura_de_repeticao;
import java.util.Scanner;

public class ex049 {
    public static void main(String[] args){
        int i  = 30;
        while(i > 0){
            if(i % 4 == 0){
                System.out.printf("[%d] ", i);
            } else {
                System.out.printf("%d ", i);
            }
            i-=1;
        }
        System.out.print("Acabou!");
    }
}
