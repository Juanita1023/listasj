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
public class ListaOrdenada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada lista= new ListaEnlazada();
        System.out.println("Esta vacia: "+lista.isEmpty());
        
        lista.addPrimero("juan");
        lista.addPrimero("maria");
        lista.addPrimero("juanita");
        lista.addPrimero("leidy");
        
        System.out.println("Primer elemento:"+lista.obtener(0));
        System.out.println("segundo elemento:"+lista.obtener(1));
        System.out.println("tercer elemento: "+lista.obtener(2));
        System.out.println("ultimo elemento: "+lista.obtener(3)); 
        System.out.println("Tamaño: "+lista.size());
        
        System.out.println("¿La lista esta vacia?: "+lista.isEmpty());
 
} 
}
