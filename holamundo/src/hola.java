import static java.lang.System.out;

public class hola {
    public static void print(String inp) {
        System.out.println(inp);
    }
    public static void main(String[] args) throws Exception {
        print("Hello, World!");
        double resultado = Math.round(3.88866);
        System.out.println(resultado);
        //print(resultado);

        String nombre = "daniel";
        System.out.println("daniel tiene " + nombre.length() +" caracteres");
        String frase= "hola me llamo el aomo";
        print(frase.substring(0,2));

    }
}
