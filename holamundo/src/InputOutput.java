import java.util.Scanner;


public class InputOutput {
    // creacion de funciones
    static void recibirInfo(Scanner valor, String mensaje){
        
        System.out.println( "Ingrese un valor");
        String valorLeido = valor.nextLine();
        System.out.println( mensaje + " "+ valorLeido);
         ;
    }
    
    public static void main(String[] args) throws Exception {
     


        Scanner entrada = new Scanner(System.in);
        recibirInfo(entrada,"Su nombre es:");
        recibirInfo(entrada,"Su edad es:");





    }

}
  