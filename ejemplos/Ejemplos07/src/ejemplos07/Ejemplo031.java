/*
*/
package ejemplos07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        boolean bandera = true;
        String salir;
        
        do {
            System.out.println("Desea seguir en el ciclo; digite: si");
            salir = entrada.nextLine(); // SI Si si
            salir = salir.toLowerCase(); // Siempre la cadena la hago minuscula, si, si, si
            if(!salir.equals("si")){
                bandera = false;
            }
        } while (bandera);
        
        
    }
}
