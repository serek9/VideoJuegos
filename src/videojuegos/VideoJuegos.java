/*
 * Aplicación para guardar en fichero información de videojuegos
 */
package videojuegos;

import utilidades.EntradaDatos;
import utilidades.Fichero;

/**
 *
 * @author mar
 */
public class VideoJuegos {

    // Variable que contiene nuestra lista de juegos
    private static GameList misJuegos;
    private static Fichero miFichero;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializamos nuestro fichero
        miFichero = new Fichero("juegos.xml");
        // Para inicializar la lista de misJuegos leemos de disco
        misJuegos = (GameList) miFichero.leer();
        // Comprobamos si había fichero (o datos en el mismo)
        if (misJuegos == null) {
            // inicializamos la lista como una lista vacía
            misJuegos = new GameList();
        }
        
    }
    
}
