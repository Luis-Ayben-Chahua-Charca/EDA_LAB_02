package EDA_LAB_02;
public class Lista<T> {
    private T[] elementos;
    private int tamaño;
    private int capacidad;

    public Lista() {
        capacidad = 10;
        elementos = (T[]) new Object[capacidad];
        tamaño = 0;
    }

    public void add(T elemento) {
        if (tamaño == capacidad) {
            aumentarCapacidad();
        }
        elementos[tamaño] = elemento;
        tamaño++;
    }

    public T get(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return elementos[indice];
    }

    public boolean contains(T elemento) {
        for (int i = 0; i < tamaño; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(T elemento) {
        for (int i = 0; i < tamaño; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return tamaño == 0;
    }

    public void remove(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        for (int i = indice; i < tamaño - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamaño - 1] = null;
        tamaño--;
    }

    private void aumentarCapacidad() {
        capacidad *= 2;
        T[] nuevaLista = (T[]) new Object[capacidad];
        for (int i = 0; i < tamaño; i++) {
            nuevaLista[i] = elementos[i];
        }
        elementos = nuevaLista;
    }
}