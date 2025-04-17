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
public class ListaDuplaTest {

    @Test
    public void testContrutor() {
        ListaDupla<Integer> list = new ListaDupla<>();
        
        assertNotNull(list);
        assertNull(list.getPrimeiro());
    }
    
    @Test
    public void testInserir() {
        ListaDupla<Integer> list = new ListaDupla<>();
        
        list.inserir(1);
        
        assertNotNull(list);
        assertNotNull(list.getPrimeiro());
        assertEquals(list.getPrimeiro().getInfo(), 1);
        assertNull(list.getPrimeiro().getProximo());
        assertNull(list.getPrimeiro().getAnterior());
    }
    
    @Test
    public void testInserirMaisElementos() {
        ListaDupla<String> list = new ListaDupla<>();
        
        list.inserir("1");
        list.inserir("2");
        list.inserir("3");
        
        assertNotNull(list);
        assertNotNull(list.getPrimeiro());
        assertEquals(list.getPrimeiro().getInfo(), "3");
        assertNotNull(list.getPrimeiro().getProximo());
        assertNull(list.getPrimeiro().getAnterior());
    }
    
    @Test
    public void testExibir() {
        ListaDupla<String> list = new ListaDupla<>();
        
        list.inserir("1");
        list.inserir("2");
        list.inserir("3");
        
        list.exibir();
    }
    
    @Test
    public void testRetirar() {
        ListaDupla<String> list = new ListaDupla<>();
        
        list.inserir("1");
        list.inserir("2");
        list.inserir("3");
        
        list.retirar("3");
        
        assertEquals(list.getPrimeiro().getInfo(), "2");
        assertNotNull(list.getPrimeiro().getProximo());
        assertNull(list.getPrimeiro().getAnterior());
        
        assertEquals(list.obterComprimento(), 2);
    }
    
    @Test
    public void testExibirOrdemInversa() {
        ListaDupla<String> list = new ListaDupla<>();
        
        list.inserir("1");
        list.inserir("2");
        list.inserir("3");
        
        System.out.println("\nORDEM INVERSA");
        list.exibirOrdemInversa();
    }
    
    @Test
    public void testObterNo() {
        ListaDupla<String> list = new ListaDupla<>();
        
        list.inserir("1");
        list.inserir("2");
        list.inserir("3");
        
        assertEquals(list.obterNo(1).getInfo(), "2");
    }
    
    @Test
    public void testLiberar() {
        ListaDupla<String> list = new ListaDupla<>();
        
        list.inserir("1");
        list.inserir("2");
        list.inserir("3");
        
        list.liberar();
        assertNull(list.getPrimeiro());
    }
}
