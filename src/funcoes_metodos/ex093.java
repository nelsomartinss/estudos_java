package funcoes_metodos;

public class ex093 {
    public static void Gerador(String texto){
        System.out.printf("""
                +-------=======------+
                  %s
                +-------=======------+
                """, texto);
    }

    public static void main(String[] args){
        Gerador("Aprendendo Java!");
    }
}
