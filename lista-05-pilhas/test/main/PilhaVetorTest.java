/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import expections.PilhaCheiaException;
import expections.PilhaVaziaException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class PilhaVetorTest {

    /**
     * Test of push method, of class PilhaVetor.
     */
    @Test
    public void testPush() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(5);
     
        pilhaVetor.push(10);
        pilhaVetor.push(20);
        pilhaVetor.push(30);
        
        assertEquals(Integer.valueOf(30), pilhaVetor.peek());
        assertEquals(false, pilhaVetor.estaVazia());
    }
    
    /**
     * Test of push method, of class PilhaVetor - with PilhaCheiaException ocurred.
     */
    @Test(expected = PilhaCheiaException.class)
    public void testPushWithException() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(3);
        
        pilhaVetor.push(10);
        pilhaVetor.push(20);
        pilhaVetor.push(30);
        pilhaVetor.push(40);
    }

    /**
     * Test of pop method, of class PilhaVetor.
     */
    @Test
    public void testPop() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(10);
        
        pilhaVetor.push(10);
        pilhaVetor.push(20);
        pilhaVetor.push(30);
        
        assertEquals(Integer.valueOf(30), pilhaVetor.pop());
        assertEquals(Integer.valueOf(20), pilhaVetor.pop());
        assertEquals(Integer.valueOf(10), pilhaVetor.pop());
        
        assertEquals(true, pilhaVetor.estaVazia());
    }
    
    /**
     * Test of push method, of class PilhaVetor - with PilhaVaziaException ocurred.
     */
    @Test(expected = PilhaVaziaException.class)
    public void testPopWithException() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(3);
        
        pilhaVetor.pop();
    }

    /**
     * Test of peek method, of class PilhaVetor.
     */
    @Test
    public void testPeek() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(5);
        
        pilhaVetor.push(10);
        pilhaVetor.push(20);
        pilhaVetor.push(30);

        assertEquals(Integer.valueOf(30), pilhaVetor.peek());
        assertEquals(Integer.valueOf(30), pilhaVetor.pop());
    }

    /**
     * Test of estaVazia method, of class PilhaVetor.
     */
    @Test
    public void testEstaVazia() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(10);
        
        assertEquals(true, pilhaVetor.estaVazia());
    }
    
    /**
     * Test of estaVazia method, of class PilhaVetor.
     */
    @Test
    public void testNaoEstaVazia() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(5);
        pilhaVetor.push(10);
        
        assertEquals(false, pilhaVetor.estaVazia());
    }

    /**
     * Test of liberar method, of class PilhaVetor.
     */
    @Test
    public void testLiberar() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(5);
        
        pilhaVetor.push(10);
        pilhaVetor.push(20);
        pilhaVetor.push(30);
        
        pilhaVetor.liberar();
        
        assertEquals(true, pilhaVetor.estaVazia());
    }

    /**
     * Test of toString method, of class PilhaVetor.
     */
    @Test
    public void testToString() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(5);
        
        pilhaVetor.push(10);
        pilhaVetor.push(20);
        pilhaVetor.push(30);
        
        assertEquals("30,20,10", pilhaVetor.toString());
    }

    /**
     * Test of concatenar method, of class PilhaVetor.
     */
    @Test
    public void testConcatenar() {
        PilhaVetor<Integer> pilhaVetor = new PilhaVetor<>(10);
        
        pilhaVetor.push(10);
        pilhaVetor.push(20);
        pilhaVetor.push(30);
        
        PilhaVetor<Integer> outraPilha = new PilhaVetor<>(5);
        
        outraPilha.push(40);
        outraPilha.push(50);
        
        pilhaVetor.concatenar(outraPilha);
        
        assertEquals("50,40,30,20,10", pilhaVetor.toString());
    }
}
