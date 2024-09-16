package estructuras;

import java.util.LinkedList;

//C=claves
//V=valores

public class Diccionario<C,V>{
    LinkedList<Tupla<C,V>> entradas;
    Conjunto<C> claves;

    public Diccionario(){
        entradas = new LinkedList<>();
        claves = new Conjunto<>();
    }

    /**
     * Si la clave ya esta registrada, no se define el valor y devuelve falso
     */
    public boolean agregar(C c, V v){
        if (pertenece(c)){
            return false;
        }
        entradas.add(new Tupla<>(c,v));
        claves.agregar(c);
        return true;
    }
    public boolean modificar(C c, V v){
        //Hacer de Tarea
        //Actualiza el valor asociado a la clave
        //devuelve falso si no existe esa clave
    }
    public V obtener(C c){
        //Hacer de Tarea
        //devuelve null si la clave no esta definida
        throw new RuntimeException("IMPLEMENTAME!!");
    }

    public boolean pertenece(C c){
        return claves.pertenece(c);
    }

    public boolean quitar(C c){
        if (!pertenece(c)){
            return false;
        }
        claves.quitar(c);
        //TODO: quitar tupla
        return true;
    }

    public int tamaño(){
        return entradas.size();
        //return claves.tamaño(); //las dos funcionan
    }

    public boolean estaVacio(){
        return tamaño()==0;
    }
    
}
