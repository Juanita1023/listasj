/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaordenada;

/**
 *
 * @author USUARIO
 */
public class Nodo<T> {
    
    T valor; 
    Nodo<T> siguiente; 

    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null; 
    }
    
    public T obtenerValor() {
        return valor; 
    } 
    
    public void enlazarSiguiente(Nodo<T> n) {
        siguiente = n;
    }
    
    public Nodo<T> obtenerSiguiente() {
        return siguiente; 
    }
}
