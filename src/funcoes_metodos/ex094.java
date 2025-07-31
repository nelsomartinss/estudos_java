package funcoes_metodos;

public class ex094 {
    public static void Gerador(String texto, int qtd){
        System.out.print("+-------=======------+\n");
        for(int i = 0; i < qtd; i++){
            System.out.printf("%s\n", texto);
        }
        System.out.print("+-------=======------+");
    }

    public static void main(String[] args){
        Gerador("Aprendendo Java!", 10);
    }
}
