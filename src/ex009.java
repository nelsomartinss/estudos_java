import java.util.Scanner;

public class ex009 {
    public static void main(String[] args){
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        String distanciaMetros = entradaDados.nextLine();
        double distanciaMetrosDouble = Double.parseDouble(distanciaMetros);

        double km = distanciaMetrosDouble / 1000;
        double hm = distanciaMetrosDouble / 100;
        double dam = distanciaMetrosDouble / 10;
        double dm = distanciaMetrosDouble * 10;
        double cm = distanciaMetrosDouble * 100;
        double mm = distanciaMetrosDouble * 100;

        System.out.printf("A distância de %.1f corresponde a: \n%.1f\n%.1f\n%.1f\n%.1f\n%.1f\n%.1f",
                distanciaMetrosDouble, km, hm, dam, dm, cm, mm);



    }
}
