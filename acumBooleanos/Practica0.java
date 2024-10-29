package acumBooleanos;

public class Practica0 {

    public static boolean mayor10(int[] lista){
        boolean ret = true;
        for (int i=0; i<lista.length; i++){
            ret &= lista[i]>=10;
        }
        return ret;
    }

    public static boolean multiplo5AlgunoMayor10(int[] lista){
        boolean ret = true;
        boolean algunoMayor10 = false;

        for (int i=0; i<lista.length; i++){
            ret &= lista[i]%5==0;
            algunoMayor10 |= lista[i]>10;
        }
        return ret==algunoMayor10;
    }

    public static boolean pertenecenTodos(int[] elems, int[] arreglo){
        boolean ret = true;
        
        if (elems.length == 0) {
            return true;
        }
        if (arreglo.length == 0) {
            return false;
        }

        for (int i =0; i<elems.length; i++){
            boolean encontrado=false;

            for (int j=0; j<arreglo.length; j++){
                if (elems[i]==arreglo[j]){
                    encontrado=true;
                    break;
                }
            }
            ret &= encontrado;
        }
        return ret;
    }
    
    public static boolean tieneNegativos(int[][] matriz){
        boolean ret = false;

        for (int f=0; f<matriz.length; f++){
            for (int c=0; c<matriz[0].length; c++){
                ret |= matriz[f][c]<0;
            }
        }

        return ret;
    }

    public static boolean filasCrecientesParImpar(int[][] matriz){
        boolean filaCrec = true;
        boolean colParImpar = true;

        for (int f=0; f<matriz.length; f++){
            for (int c=0; c<matriz[0].length; c++){
                filaCrec &= matriz[f][c] < matriz[siguiente(f)][c] && matriz[siguiente(f)][c]<matriz[siguiente(siguiente(f))][c];

                colParImpar &= matriz[f][c]%2==0 && matriz[f][c]%2!=0;
            }
        }

        return filaCrec==colParImpar;
    }

    public static int siguiente(int i){
        return i++;
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] lista = {5,5};
        int[] lista2 = {5,10,15};
        int[][] matrizEj = {
            {1,3},
            {5,7}
        };

        /* Ej 1 */
        // System.out.println(mayor10(lista));

        /* Ej 2 */
        // System.out.println(multiplo5AlgunoMayor10(lista));
   
        /* Ej 3 */
        // System.out.println(pertenecenTodos(lista, lista2));
   
        /* Ej 4 */
        // System.out.print("Recorrido x filas: "); Matriz.matrizPorFilas(matrizEj);
        // System.out.println();
        // System.out.print("Recorrido x colums: "); Matriz.matrizPorColumnas(matrizEj);
        // System.out.println();
        // System.out.println("Suma de los elementos: " + Matriz.sumaElementos(matrizEj));
        
        /* Ej 5 */
        // int[] sumaFilas = Matriz.sumaElemDeFila(matrizEj);
        // int[] sumaColums = Matriz.sumaElemDeColumna(matrizEj);

        // System.out.println("Suma de elementos x fila: ");
        // for (int suma : sumaFilas){
        //     System.out.println(suma);
        // }
        // System.out.println("Suma de elementos x columna: ");
        // for (int suma : sumaColums){
        //     System.out.println(suma);
        // }

        /* Ej 6 */
        // System.out.println(tieneNegativos(matrizEj));

        /* Ej 7 */
        System.out.println(filasCrecientesParImpar(matrizEj));

    }
}
