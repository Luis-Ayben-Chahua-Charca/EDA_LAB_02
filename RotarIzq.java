package EDA_LAB_02;
public class RotarIzq {

    public static void main(String[] args) {
        
        int[] A = new int[] {1, 2, 3, 4, 5};

        int[] B = rotarIzquierdaArray(A,2);

        for (int i = 0;i<B.length;i++){
            System.out.print(B[i] + ", ");
        }


    }
    public static int[] rotarIzquierdaArray(int[] A, int d){
        // creacion de un nuevo array con el mismo tamaño
        int[] B = new int[A.length];
        
        // variable auxiliar que ayudara a llenar el array B
        int aux = 0;

        /* bucle para llenar los datos que vienen luego del dato que se escogio "d"
         * si se escogio el index 1 por ejemplo, se comenzara a poner desde el index 2 en el array nuevo.
         * con ayuda del auxiliar
         */
        for(int i = d;i<A.length;i++){
            B[aux] = A[i];
            aux++;
        }

        /* Segundo bucle que permite llenar los datos que faltan, guiandose del auxiliar y llenado los
         *  datos que faltaban desde 0 a index d-1 , rotando asi la matriz.
         */
        for(int j = 0; j<d;j++){
            B[aux] = A[j];
            aux++;
        }




        return B;
    }
}
