/*
 * Incluye el ArrayList<Game> para poder serializarlo
 * y grabarlo en fichero como un único objeto JavaBean
 */
package videojuegos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mar
 */
public class GameList implements Serializable {
    
    private ArrayList<Game> lista;

    public GameList() {
        lista = new ArrayList<>();
    }
    
    public ArrayList<Game> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Game> lista) {
        this.lista = lista;
    }

}
