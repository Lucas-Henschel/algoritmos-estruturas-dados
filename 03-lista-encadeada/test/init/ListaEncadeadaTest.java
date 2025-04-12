/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package init;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author lhenschel
 */
public class ListaEncadeadaTest {

    @Test
    public void testContrutor() {
        ListaEncadeada<Integer> list = new ListaEncadeada<>();
        
        assertNotNull(list);
        assertNull(list.getPrimeiro());
    }
    
    @Test
    public void testInserir1() {
        ListaEncadeada<Integer> list = new ListaEncadeada<>();
        
        list.inserir(10);
        
        assertNotNull(list);
        assertNotNull(list.getPrimeiro());
        assertNull(list.getPrimeiro().getProximo());
        assertEquals(list.getPrimeiro().getInfo(), 10);
        assertEquals(list.estaVazia(), false);
    }
    
    @Test
    public void testEstaVaziaTrue() {
        ListaEncadeada<Integer> list = new ListaEncadeada<>();
        
        assertNotNull(list);
        assertEquals(list.estaVazia(), true);
    }
    
    @Test
    public void testEstaVaziaFalse() {
        ListaEncadeada<Integer> list = new ListaEncadeada<>();
        
        list.inserir(10);
        
        assertNotNull(list);
        assertEquals(list.estaVazia(), false);
    }
    
    @Test
    public void testExibir() {
        ListaEncadeada<Integer> list = new ListaEncadeada<>();
        
        list.inserir(10);
        list.inserir(20);
        list.exibir();

        assertEquals(list.estaVazia(), false);
    }
    
    @Test
    public void testBuscar() {
        ListaEncadeada<String> list = new ListaEncadeada<>();
        
        list.inserir("Lucas");
        list.inserir("Ana");
        list.inserir("Nicola");

        assertNotNull(list.buscar("Lucas"));
        
        assertNotNull(list.buscar("Nicola").getProximo());
        assertEquals(list.buscar("Nicola").getProximo().getInfo(), "Ana");
        
        assertNull(list.buscar("Christian"));
    }
    
    @Test
    public void testObterComprimento() {
        ListaEncadeada<Integer> list = new ListaEncadeada<>();
        
        list.inserir(10);
        list.inserir(20);

        assertEquals(list.obterComprimento(), 2);
    }
    
    @Test
    public void testObterNo() {
        ListaEncadeada<String> list = new ListaEncadeada<>();
        
        list.inserir("Lucas");
        list.inserir("Ana");
        list.inserir("Nicola");

        assertNotNull(list.obterNo(0));
        assertEquals(list.obterNo(1).getInfo(), "Ana");
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testObterNoInvalido() {
        ListaEncadeada<String> list = new ListaEncadeada<>();
        
        list.inserir("Lucas");
        list.inserir("Ana");
        list.inserir("Nicola");

        list.obterNo(3);
    }
    
    @Test
    public void testRemover() {
        ListaEncadeada<Double> list = new ListaEncadeada<>();
        
        list.inserir(1.5);
        list.inserir(2.2);
        
        list.retirar(2.2);
        list.exibir();
    }
}
