/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import exceptions.FilaCheiaException;
import exceptions.FilaVaziaException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class FilaVetorTest {  
   
    /**
     * Test of inserir method, of class FilaVetor.
     */
    @Test
    public void testInserir() {
        FilaVetor<Integer> filaVetor = new FilaVetor<>(3);
        
        filaVetor.inserir(10);
        
        assertEquals(false, filaVetor.estaVazia());
    }
    
    /**
     * Test of inserir method, of class FilaVetor.
     */
    @Test(expected = FilaCheiaException.class)
    public void testInserirFilaCheia() {
        FilaVetor<Integer> filaVetor = new FilaVetor<>(3);
        
        filaVetor.inserir(10);
        filaVetor.inserir(20);
        filaVetor.inserir(30);
        filaVetor.inserir(40);
    }

    /**
     * Test of estaVazia method, of class FilaVetor.
     */
    @Test
    public void testEstaVazia() {
        FilaVetor<Integer> filaVetor = new FilaVetor<>(10);
        
        assertEquals(true, filaVetor.estaVazia());
    }
    
    /**
     * Test of estaVazia method, of class FilaVetor.
     */
    @Test
    public void testNaoEstaVazia() {
        FilaVetor<Integer> filaVetor = new FilaVetor<>(5);
        
        filaVetor.inserir(10);
        
        assertEquals(false, filaVetor.estaVazia());
    }


    /**
     * Test of peek method, of class FilaVetor.
     */
    @Test
    public void testPeek() {
        FilaVetor<Integer> filaVetor = new FilaVetor<>(5);
        
        filaVetor.inserir(10);
        filaVetor.inserir(20);
        filaVetor.inserir(30);
        
        assertEquals(Integer.valueOf(10), filaVetor.peek());
        assertEquals(Integer.valueOf(10), filaVetor.retirar());
    }

    /**
     * Test of retirar method, of class FilaVetor.
     */
    @Test
    public void testRetirar() {
        FilaVetor<Integer> filaVetor = new FilaVetor<>(10);
        
        filaVetor.inserir(10);
        filaVetor.inserir(20);
        filaVetor.inserir(30);
        
        assertEquals(Integer.valueOf(10), filaVetor.retirar());
        assertEquals(Integer.valueOf(20), filaVetor.retirar());
        assertEquals(Integer.valueOf(30), filaVetor.retirar());
        assertEquals(true, filaVetor.estaVazia());
    }
    
    /**
     * Test of retirar method, of class FilaVetor.
     */
    @Test(expected = FilaVaziaException.class)
    public void testRetirarSemElementos() {
        FilaVetor<Integer> filaVetor = new FilaVetor<>(10);
        
        filaVetor.retirar();
    }

    /**
     * Test of liberar method, of class FilaVetor.
     */
    @Test
    public void testLiberar() {
        FilaVetor<Integer> filaVetor = new FilaVetor<>(5);
        
        filaVetor.inserir(10);
        filaVetor.inserir(20);
        filaVetor.inserir(30);
        
        filaVetor.liberar();
        
        assertEquals(true, filaVetor.estaVazia());
    }

    /**
     * Test of toString method, of class FilaVetor.
     */
    @Test
    public void testToString() {
        FilaVetor<Integer> filaVetor = new FilaVetor<>(5);
        
        filaVetor.inserir(10);
        filaVetor.inserir(20);
        filaVetor.inserir(30);
        
        assertEquals("10,20,30", filaVetor.toString());
    }

    /**
     * Test of criarFilaConcatenada method, of class FilaVetor.
     */
    @Test
    public void testCriarFilaConcatenada() {
        FilaVetor<Integer> f1 = new FilaVetor<>(5);
        
        f1.inserir(10);
        f1.inserir(20);
        f1.inserir(30);
        
        FilaVetor<Integer> f2 = new FilaVetor<>(3);
        
        f2.inserir(40);
        f2.inserir(50);
        
        FilaVetor<Integer> novaFila = f1.criarFilaConcatenada(f2);
        
        assertEquals("10,20,30,40,50", novaFila.toString());
        assertEquals("10,20,30", f1.toString());
        assertEquals("40,50", f2.toString());
        
        assertEquals(8, novaFila.getLimite());
    } 
}
