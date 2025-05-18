/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class FilaListaTest {

    /**
     * Test of inserir method, of class FilaLista.
     */
    @Test
    public void testInserir() {
        FilaLista<Integer> filaLista = new FilaLista<>();
        
        filaLista.inserir(10);
        
        assertEquals(false, filaLista.estaVazia());
    }

    /**
     * Test of estaVazia method, of class FilaLista.
     */
    @Test
    public void testEstaVazia() {
        FilaLista<Integer> filaLista = new FilaLista<>();
        
        assertEquals(true, filaLista.estaVazia());
    }
    
    /**
     * Test of estaVazia method, of class FilaLista.
     */
    @Test
    public void testNaoEstaVazia() {
        FilaLista<Integer> filaLista = new FilaLista<>();
        
        filaLista.inserir(10);
        
        assertEquals(false, filaLista.estaVazia());
    }

    /**
     * Test of peek method, of class FilaLista.
     */
    @Test
    public void testPeek() {
        FilaLista<Integer> filaLista = new FilaLista<>();
        
        filaLista.inserir(10);
        filaLista.inserir(20);
        filaLista.inserir(30);
        
        assertEquals(Integer.valueOf(10), filaLista.peek());
        assertEquals(Integer.valueOf(10), filaLista.retirar());
    }

    /**
     * Test of retirar method, of class FilaLista.
     */
    @Test
    public void testRetirar() {
        FilaLista<Integer> filaLista = new FilaLista<>();
        
        filaLista.inserir(10);
        filaLista.inserir(20);
        filaLista.inserir(30);
        
        assertEquals(Integer.valueOf(10), filaLista.retirar());
        assertEquals(Integer.valueOf(20), filaLista.retirar());
        assertEquals(Integer.valueOf(30), filaLista.retirar());
        assertEquals(true, filaLista.estaVazia());
    }

    /**
     * Test of liberar method, of class FilaLista.
     */
    @Test
    public void testLiberar() {
        FilaLista<Integer> filaLista = new FilaLista<>();
        
        filaLista.inserir(10);
        filaLista.inserir(20);
        filaLista.inserir(30);
        
        filaLista.liberar();
        
        assertEquals(true, filaLista.estaVazia());
    }

    /**
     * Test of toString method, of class FilaLista.
     */
    @Test
    public void testToString() {
        FilaLista<Integer> filaLista = new FilaLista<>();
        
        filaLista.inserir(10);
        filaLista.inserir(20);
        filaLista.inserir(30);
        
        assertEquals("10,20,30", filaLista.toString());
    }
}
