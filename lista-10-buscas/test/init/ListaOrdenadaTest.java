/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package init;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ListaOrdenadaTest {
    private ListaOrdenada<Integer> createListaOrdenada() {
        ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada<>();
        
        listaOrdenada.inserir(0);
        listaOrdenada.inserir(10);
        listaOrdenada.inserir(20);
        listaOrdenada.inserir(30);
        listaOrdenada.inserir(40);
        listaOrdenada.inserir(50);
        listaOrdenada.inserir(60);
        listaOrdenada.inserir(70);
        listaOrdenada.inserir(80);
        listaOrdenada.inserir(90);
        listaOrdenada.inserir(100);
        
        return listaOrdenada;
    }
    
    /**
     * Test of inserir method, of class ListaOrdenada.
     */
    @Test
    public void testInserir() {
        ListaOrdenada<Integer> listaOrdenada = new ListaOrdenada<>();
        
        listaOrdenada.inserir(100);
        listaOrdenada.inserir(20);
        listaOrdenada.inserir(70);
        listaOrdenada.inserir(1);
        
        assertEquals("1,20,70,100", listaOrdenada.toString());
    }

    /**
     * Test of buscar method, of class ListaOrdenada.
     */
    @Test
    public void testBuscar20() {     
        ListaOrdenada<Integer> listaOrdenada = createListaOrdenada();
        
        assertEquals(2, listaOrdenada.buscar(20));
    }
    
    /**
     * Test of buscar method, of class ListaOrdenada.
     */
    @Test
    public void testBuscar40() {
        ListaOrdenada<Integer> listaOrdenada = createListaOrdenada();
        
        assertEquals(4, listaOrdenada.buscar(40));
    }
    
    /**
     * Test of buscar method, of class ListaOrdenada.
     */
    @Test
    public void testBuscar70() {        
        ListaOrdenada<Integer> listaOrdenada = createListaOrdenada();
        
        assertEquals(7, listaOrdenada.buscar(70));
    }
    
    /**
     * Test of buscar method, of class ListaOrdenada.
     */
    @Test
    public void testBuscar100() {  
        ListaOrdenada<Integer> listaOrdenada = createListaOrdenada();
        
        assertEquals(10, listaOrdenada.buscar(100));
    }
    
    /**
     * Test of buscar method, of class ListaOrdenada.
     */
    @Test
    public void testBuscar85() {   
        ListaOrdenada<Integer> listaOrdenada = createListaOrdenada();
        
        assertEquals(-1, listaOrdenada.buscar(85));
    }
}
