public class Triangulo {
    public static void main(String[] args) {
        trianguloRecursivo(5);
    }

    public static void trianguloRecursivo (int base){

        /*mientras la base sea mayo de 0 se llama a una base menor
        * de forma recursiva luego de eso se llama el metodo para 
        * construir las lineas
        */
        if (base>0) {
            /*aqui se llama primero a triangulo y luego a linea para contruir primero
            * los escalones superiores
            */
            trianguloRecursivo(base-1);
            linea(base);
        } 
    }
        /* este algoritmo construye las lineas tambien de manera recursiva, 
         * se le entrega el largo este lo va imprimiendo
         */
    public static void linea(int largo){
       if(largo>0){
        System.out.print("*");
        linea(largo-1);
       }else {
        System.out.println("");
       }
    }
}
