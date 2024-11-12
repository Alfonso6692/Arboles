/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author ASUS-VASQUEZ
 */
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertamos algunos valores en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
//        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);
        arbol.insertar(100);

        // Imprimir el recorrido en orden del árbol
        System.out.println("Recorrido en orden del árbol binario:");
        arbol.inOrden(); // Debe imprimir: 20 30 40 50 60 70 80

        System.out.println("\nBuscar valor 40 en el árbol:");
        System.out.println(arbol.buscar(40)); // Debe imprimir: true

        System.out.println("Buscar valor 100 en el árbol:");
        System.out.println(arbol.buscar(100)); // Debe imprimir: false
    }
}
