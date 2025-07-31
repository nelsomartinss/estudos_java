package funcoes_metodos;

public class ex095 {
    public static void Gerador(String texto, int qtd, int borda){
            if(borda == 1){
                System.out.print("\n+-------=======------+\n");
                for(int i = 0; i < qtd; i++){
                    System.out.printf("%s\n", texto);
                }
                System.out.print("+-------=======------+");
            } else if(borda == 2){
                System.out.print("\n~~~~~~~~:::::::~~~~~~~\n");
                for(int i = 0; i < qtd; i++){
                    System.out.printf("%s\n", texto);
                }
                System.out.print("~~~~~~~~:::::::~~~~~~~");
            } else if(borda == 3){
                System.out.print("\n<<<<<<<<------->>>>>>>\n");
                for(int i = 0; i < qtd; i++){
                    System.out.printf("%s\n", texto);
                }
                System.out.print("<<<<<<<<------->>>>>>>");
            } else {
                for(int i = 0; i < qtd; i++){
                    System.out.printf("\n%s", texto);
                }
            }
    }

    public static void main(String[] args){
            Gerador("Aprendendo Java!", 2, 1);
            Gerador("Aprendendo Java!", 2, 2);
            Gerador("Aprendendo Java!", 2, 3);
            Gerador("Aprendendo Java!", 2, 4);
    }
}
