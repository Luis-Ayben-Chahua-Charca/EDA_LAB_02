package EDA_LAB_02;
class InvertirMatriz{
    public static void main(String[] args) {
        int[] A = new int[4];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        
        int[] B = invertirArray(A);

        for (int i = 0;i<B.length;i++){
            System.out.print(B[i] + ", ");
        }

        
    }

    public static int[] invertirArray(int[] A){
        // crea un nuevo array con el mismo tamaño que el primero
        int[] B = new int[A.length];
        
        //contador auxiliar
        int cont = 0;

        /*bucle donde se revisara cada dato del array original
         y se invertira usando el auxiliar*/
        for (int i = A.length;i>0;i--){
            B[cont] = A[i-1];
            cont++;

        }

        return B;

    }

}