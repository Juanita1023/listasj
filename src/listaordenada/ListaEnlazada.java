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
//para recorrer la lista entera
public class ListaEnlazada <T>{

     Nodo <T>inicio;//cabeza de la lista
    int size = 0;

    public ListaEnlazada() {
        inicio = null;
    }
 
    public T obtener(int index)
    {
        int count=0; //contadorencuentra cada uno hasta el indice que yo quiero4
        Nodo <T> temporal=inicio;
        while(count<index)
        {
            temporal=temporal.obtenerSiguiente();
            count++;
    }
        return temporal.obtenerValor();
    }
    public void addPrimero(String str) {
        if (inicio == null) {

            inicio = new Nodo(str);
        } else {
            Nodo temp = inicio;
            Nodo nuevo = new Nodo(str);// nodo aislado
            nuevo.enlazarSiguiente(temp);
            inicio = nuevo;
        }
        size++;
    }
    public int size()
    {
       return size;// nos da el tamaño de la lista
    }

    public boolean isEmpty() {
        return (inicio == null) ? true : false;
    }
}
