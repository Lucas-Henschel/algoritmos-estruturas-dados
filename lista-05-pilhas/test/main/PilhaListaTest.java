/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class PilhaListaTest {

    /**
     * Test of push method, of class PilhaLista.
     */
    @Test
    public void testPush() {
        PilhaLista<Integer> pilhaLista = new PilhaLista<>();
        
        pilhaLista.push(10);
        pilhaLista.push(20);
        pilhaLista.push(30);
       
        assertEquals(false, pilhaLista.estaVazia());
    }

    /**
     * Test of pop method, of class PilhaLista.
     */
    @Test
    public void testPop() {
        PilhaLista<Integer> pilhaLista = new PilhaLista<>();
        
        pilhaLista.push(10);
        pilhaLista.push(20);
        pilhaLista.push(30);
        
        assertEquals(Integer.valueOf(30), pilhaLista.pop());
        assertEquals(Integer.valueOf(20), pilhaLista.pop());
        assertEquals(Integer.valueOf(10), pilhaLista.pop());
        
        assertEquals(true, pilhaLista.estaVazia());
    }

    /**
     * Test of peek method, of class PilhaLista.
     */
    @Test
    public void testPeek() {
        PilhaLista<Integer> pilhaLista = new PilhaLista<>();
        
        pilhaLista.push(10);
        pilhaLista.push(20);
        pilhaLista.push(30);
        
        assertEquals(Integer.valueOf(30), pilhaLista.peek());
        assertEquals(Integer.valueOf(30), pilhaLista.pop());
    }

    /**
     * Test of estaVazia method, of class PilhaLista.
     */
    @Test
    public void testEstaVazia() {
        PilhaLista<Integer> pilhaLista = new PilhaLista<>();
        
        assertEquals(true, pilhaLista.estaVazia());
    }

    /**
     * Test of estaVazia method, of class PilhaLista.
     */
    @Test
    public void testNaoEstaVazia() {
        PilhaLista<Integer> pilhaLista = new PilhaLista<>();
        
        pilhaLista.push(10);
        
        assertEquals(false, pilhaLista.estaVazia());
    }
    
    /**
     * Test of liberar method, of class PilhaLista.
     */
    @Test
    public void testLiberar() {
        PilhaLista<Integer> pilhaLista = new PilhaLista<>();
        
        pilhaLista.push(10);
        pilhaLista.push(20);
        pilhaLista.push(30);
        
        pilhaLista.liberar();
        
        assertEquals(true, pilhaLista.estaVazia());
    }

    /**
     * Test of toString method, of class PilhaLista.
     */
    @Test
    public void testToString() {
        PilhaLista<Integer> pilhaLista = new PilhaLista<>();
        
        pilhaLista.push(10);
        pilhaLista.push(20);
        pilhaLista.push(30);
                
        assertEquals("30 -> 20 -> 10 -> null", pilhaLista.toString());
    }
}
