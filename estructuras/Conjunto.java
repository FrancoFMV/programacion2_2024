package estructuras;
import java.util.ArrayList;

public class Conjunto<E> {
    private ArrayList<E> elems;
    private int indice=0;

    public Conjunto(){
        elems = new ArrayList<>();
    }

    public int tamaño(){
        return elems.size();
    }

    public boolean agregar(E e){
        if (pertenece(e)){
            return false;
        }
        return elems.add(e);
    }

    public boolean pertenece(E e){
        return elems.contains(e);
    }

    public boolean quitar(E e){
        return elems.remove(e);
    }

    /**
     * -Devuelve un elemento del conjunto
     * -Cada vez que se llama devuelve uno diferente
     * -Cuando termine de devolver todos los elementos, debe comenzar a repetir
     * -Si está vacio, genera un error
     * 
     * @return
     */

    public E dameUno(){
        /**
         * -Al usar un arraylist, elems se puede recorrer de forma ascendente
         * -El conjunto hacia afuera igualmente no tiene orden
         */

        if (tamaño() == 0){
            throw new RuntimeException("El conjunto está vacio");
        }
        indice++;

        if (indice >= tamaño()){
            indice = 0;
        }
        return elems.get(indice);
    }

    //TODO: UNION E INTERSECCION DE TAREA
}