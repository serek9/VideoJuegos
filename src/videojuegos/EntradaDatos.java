/*
 * Clase que incluye métodos para pedir datos x teclado
 */
package videojuegos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mar
 */
public class EntradaDatos {
    
   public static String pedirCadena(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String respuesta = "";
        boolean error;
        do {
            try {
                System.out.println(mensaje);
                respuesta = br.readLine();
                error = false;
            } catch (IOException ex) {
                System.out.println("Error de entrada / salida");
                error = true;
            }
        } while (error);
        return respuesta;
    }

    public static double pedirDouble(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean error;
        do {
            try {
                // mostramos el msg para el usuario para pedir dato
                System.out.println(mensaje);
                // Leemos dato del teclado y lo convertimos a entero
                numero = Double.parseDouble(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error de entrada y salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un nº entero.");
                error = true;
            }
        } while (error);
        return numero;
    }

    public static int pedirEntero(String mensaje) {
        // Variable para leer datos del teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Variable para guardar el nº introducido por el usuario
        int numero = 0;
        // variable para comprobar si ha habido error al introducir el nº
        boolean error;
        do {
            try {
                // mostramos el msg para el usuario para pedir dato
                System.out.println(mensaje);
                // Leemos dato del teclado y lo convertimos a entero
                numero = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error de entrada y salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un nº entero.");
                error = true;
            }
        } while (error);
        return numero;
    } 
}
