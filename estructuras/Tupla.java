package estructuras;

/* Relaciona (mantiene juntos) 2 elementos de distinto tipo */
//T=tupla

public class Tupla<T1, T2> {
    private T1 elem1;
    private T2 elem2;

    public Tupla(T1 e1, T2 e2){
        elem1 = e1;
        elem2 = e2;
    }

    public T1 obtenerX(){
        return elem1;
    }

    public T2 obtenerY(){
        return elem2;
    }

    public void establecerX(T1 x){
        elem1=x;
    }

    public void establecerY(T2 y){
        elem2=y;
    }

    public String toString(){
        return "< " + elem1 + " : " + elem2 +" >";
    }

}
