/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arboles;

/**
 *
 * @author ASUS-VASQUEZ
 */
public class ArbolBinario {
Nodo raiz;

    // Constructor para crear un árbol vacío
    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    // Función recursiva para insertar un valor
    private Nodo insertarRecursivo(Nodo raiz, int valor) {
        // Si el árbol está vacío, retorna un nuevo nodo
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        // Si el valor es menor que el valor del nodo actual, insertamos en el subárbol izquierdo
        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, valor);
        }
        // Si el valor es mayor o igual, insertamos en el subárbol derecho
        else if (valor > raiz.valor) {
            raiz.derecho = insertarRecursivo(raiz.derecho, valor);
        }

        // Retornamos el nodo actual
        return raiz;
    }

    // Método para recorrer el árbol en orden (in-order traversal)
    public void inOrden() {
        inOrdenRecursivo(raiz);
    }

    // Función recursiva para recorrer el árbol en orden
    private void inOrdenRecursivo(Nodo raiz) {
        if (raiz != null) {
            inOrdenRecursivo(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inOrdenRecursivo(raiz.derecho);
        }
    }

    // Método para buscar un valor en el árbol
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    // Función recursiva para buscar un valor en el árbol
    private boolean buscarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            return false;
        }

        if (valor == raiz.valor) {
            return true;
        }

        // Si el valor es menor que el valor del nodo actual, buscar en el subárbol izquierdo
        if (valor < raiz.valor) {
            return buscarRecursivo(raiz.izquierdo, valor);
        }

        // Si el valor es mayor que el valor del nodo actual, buscar en el subárbol derecho
        return buscarRecursivo(raiz.derecho, valor);
    }
  
}
