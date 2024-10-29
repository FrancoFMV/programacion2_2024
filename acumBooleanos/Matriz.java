package acumBooleanos;

public class Matriz {
    public static void matrizPorFilas(int matriz[][]){
        for (int f=0; f<matriz.length; f++){
            for (int c=0; c<matriz[0].length; c++){
                System.out.print(matriz[f][c]+" ");
            }
        }
    }

    public static void matrizPorColumnas(int matriz[][]){
        for (int c=0; c<matriz[0].length; c++){
            for(int f=0; f<matriz.length; f++){
                System.out.print(matriz[f][c]+" ");
            }
        }
    }
    
    public static int sumaElementos(int matriz[][]){
        int result=0;
        
        for (int f=0; f<matriz.length; f++){
            for (int c=0; c<matriz[0].length; c++){
                result += matriz[f][c];
            }
        }
        return result;
    }

    public static int[] sumaElemDeFila(int matriz[][]){
        int[] result = new int[matriz.length];

        for (int f=0; f<matriz.length; f++){
            for (int c=0; c<matriz[0].length; c++){
                result[f] += matriz[f][c];
            }
        }

        return result;
    }

    public static int[] sumaElemDeColumna(int matriz[][]){
        int[] result = new int[matriz[0].length];

        for(int c=0; c<matriz[0].length; c++){
            for (int f=0; f<matriz.length; f++){
                result[c] += matriz[f][c];
            }
        }

        return result;
    }

}