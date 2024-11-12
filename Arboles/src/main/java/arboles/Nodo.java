/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author ASUS-VASQUEZ
 */
public class Nodo {
     int valor;
    Nodo izquierdo, derecho;

    // Constructor para crear un nodo con un valor dado
    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}
