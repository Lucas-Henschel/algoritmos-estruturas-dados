/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package init;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lhenschel
 */
public class ListaEstaticaTest {
    
    public ListaEstaticaTest() {
    }

    /**
     * Test of inserir method, of class ListaEstatica.
     */
    @Test
    public void testInserir_01() {
        ListaEstatica listaEstatica = new ListaEstatica();
        
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
        
        assertEquals(listaEstatica.toString(), "5,10,15,20");
    }
    
    /**
     * Test of obterElemento method, of class ListaEstatica.
     */
    @Test
    public void testObterElemento_02() {
        ListaEstatica listaEstatica = new ListaEstatica();
        
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
        
        assertEquals(listaEstatica.getTamanho(), 4);
    }
    
    /**
     * Test of buscar method, of class ListaEstatica.
     */
    @Test
    public void testBuscarComElemento_03() {
        ListaEstatica<Integer> listaEstatica = new ListaEstatica<>();
        
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
        
        assertEquals(listaEstatica.buscar(15), 2);
    }
    
        /**
     * Test of buscar method, of class ListaEstatica.
     */
    @Test
    public void testBuscarElementoInexistente_04() {
        ListaEstatica listaEstatica = new ListaEstatica();
        
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
        
        assertEquals(listaEstatica.buscar(30), -1);
    }
    
    /**
     * Test of retirar method, of class ListaEstatica.
     */
    @Test
    public void testRetirar_05() {
        ListaEstatica listaEstatica = new ListaEstatica();
        
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
        
        listaEstatica.retirar(10);
        
        assertEquals(listaEstatica.getTamanho(), 3);
    }
    
    /**
     * Test of redimensionamento method, of class ListaEstatica.
     */
    @Test
    public void testRedimensionamento_06() {
        ListaEstatica listaEstatica = new ListaEstatica();
        
        listaEstatica.inserir(1);
        listaEstatica.inserir(2);
        listaEstatica.inserir(3);
        listaEstatica.inserir(4);
        listaEstatica.inserir(5);
        
        listaEstatica.inserir(6);
        listaEstatica.inserir(7);
        listaEstatica.inserir(8);
        listaEstatica.inserir(9);
        listaEstatica.inserir(10);
        
        listaEstatica.inserir(11);
        listaEstatica.inserir(12);
        listaEstatica.inserir(13);
        listaEstatica.inserir(14);
        listaEstatica.inserir(15);
               
        assertEquals(listaEstatica.toString(), "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15");
        assertEquals(listaEstatica.getTamanho(), 15);
    }

    /**
     * Test of obterElemento method, of class ListaEstatica.
     */
    @Test
    public void testObterElemento_07() {
        ListaEstatica listaEstatica = new ListaEstatica();
        
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
                
        assertEquals(listaEstatica.obterElemento(3), 20);
    }
    
    /**
     * Test of obterElemento Exception method, of class ListaEstatica.
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testObterElementoException_08() {
        ListaEstatica listaEstatica = new ListaEstatica();
        
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
                
        listaEstatica.obterElemento(5);
    }

    /**
     * Test of estaVazia method, of class ListaEstatica.
     */
    @Test
    public void testEstaVazia_09() {
        ListaEstatica listaEstatica = new ListaEstatica();
        
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
        
        listaEstatica.liberar();
                
        assertEquals(listaEstatica.estaVazia(), true);
    }
    
    /**
     * Test of inverter method, of class ListaEstatica.
     */
    @Test
    public void testInverter_10() {
        ListaEstatica listaEstatica = new ListaEstatica();
        
        listaEstatica.inserir(5);
        listaEstatica.inserir(10);
        listaEstatica.inserir(15);
        listaEstatica.inserir(20);
        
        listaEstatica.inverter();
        
        assertEquals(listaEstatica.toString(), "20,15,10,5");
    }
}
