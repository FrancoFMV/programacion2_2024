package estructuras;

public class arbolesBinarios<T extends Comparable<T>> {
    private class Nodo {
        T elem;
        Nodo izq, der;

        Nodo(T t) {
            elem = t;
        }
    }

    private Nodo raiz;

    // Por ser una estructura de datos
    public void agregar(T t) {
        raiz = agregar(raiz, t);
    }

    private Nodo agregar(Nodo nodo, T t) {
        if (nodo == null) {
            return new Nodo(t);
        }
        if (nodo.elem.compareTo(t) > 0) {
            nodo.izq = agregar(nodo.izq, t);
        } else if (nodo.elem.compareTo(t) < 0) { 
            nodo.der = agregar(nodo.der, t);
        }
        return nodo;
    }

    public boolean pertenece(T t) {
        return pertenece(raiz, t);
    }

    private boolean pertenece(Nodo nodo, T t) {
        if (nodo == null) {
            return false;
        }
        if (nodo.elem.equals(t)) {
            return true;
        }

        if (nodo.elem.compareTo(t) > 0) {
            return pertenece(nodo.izq, t);
        }
        return pertenece(nodo.der, t);

    }

    public void quitar(T t) {
        raiz = quitar(raiz, t);
    }

    private void quirar(Nodo nodo, T t) {
        // TODO Terminar
    }

    public int cantElementos() {
        return cantElementosenNodos(raiz);
    }

    private int cantElementosenNodos(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + cantElementosenNodos(nodo.izq) + cantElementosenNodos(nodo.der);
    }

    // por ser un arbol
    public int altura() {
        return altura(raiz);
    }

    private int altura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + maximo(altura(nodo.izq), altura(nodo.der));
    }

    private int maximo(int a, int b) {
        return Math.max(a, b);
    }

    public boolean estaBalanceado() {

    }
}