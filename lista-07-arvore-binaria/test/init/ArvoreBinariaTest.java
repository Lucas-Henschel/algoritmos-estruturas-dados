/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package init;

import model.NoArvoreBinaria;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ArvoreBinariaTest {

    /**
     * Test of estaVazia method, of class ArvoreBinaria.
     */
    @Test
    public void testEstaVazia() {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        
        assertTrue(arvoreBinaria.estaVazia());
    }
    
    /**
     * Test of estaVazia method, of class ArvoreBinaria.
     */
    @Test
    public void testNaoEstaVazia() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, null, null);
        
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setRaiz(no1);
        
        assertFalse(arvoreBinaria.estaVazia());
    }

    /**
     * Test of pertence method, of class ArvoreBinaria.
     */
    @Test
    public void testPertenceRaiz() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
        
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setRaiz(no1);
        
        assertTrue(arvoreBinaria.pertence(1));
    }
    
    /**
     * Test of pertence method, of class ArvoreBinaria.
     */
    @Test
    public void testPertenceNivel1() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
        
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setRaiz(no1);
        
        assertTrue(arvoreBinaria.pertence(3));
    }
    
    /**
     * Test of pertence method, of class ArvoreBinaria.
     */
    @Test
    public void testPertenceFolha() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
        
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setRaiz(no1);
        
        assertTrue(arvoreBinaria.pertence(6));
    }
    
    /**
     * Test of pertence method, of class ArvoreBinaria.
     */
    @Test
    public void testPertenceNaoInclui() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
        
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setRaiz(no1);
        
        assertFalse(arvoreBinaria.pertence(10));
    }

    /**
     * Test of toString method, of class ArvoreBinaria.
     */
    @Test
    public void testToString() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
        
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setRaiz(no1);
        
        assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvoreBinaria.toString());
    }

    /**
     * Test of contarNos method, of class ArvoreBinaria.
     */
    @Test
    public void testContarNos() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);
        
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
        
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.setRaiz(no1);
        
        assertEquals(6, arvoreBinaria.contarNos());
    }
}
