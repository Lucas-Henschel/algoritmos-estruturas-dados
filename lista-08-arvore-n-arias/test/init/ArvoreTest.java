/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package init;

import model.NoArvore;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ArvoreTest {
    /**
     * Test of pertence method, of class Arvore.
     */
    @Test
    public void testPertence() {
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        
        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilho(no5);
        no2.inserirFilho(no6);
        no2.inserirFilho(no7);
        
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        no3.inserirFilho(no8);

        NoArvore<Integer> no10 = new NoArvore<>(10);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        
        NoArvore<Integer> no4 = new NoArvore<>(4);
        no4.inserirFilho(no9);
        no4.inserirFilho(no10);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilho(no2);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);
        
        assertTrue(arvore.pertence(7));
    }
    
    /**
     * Test of pertence method, of class Arvore.
     */
    @Test
    public void testPertenceDadoNaoArvore() {
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        
        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilho(no5);
        no2.inserirFilho(no6);
        no2.inserirFilho(no7);
        
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        no3.inserirFilho(no8);

        NoArvore<Integer> no10 = new NoArvore<>(10);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        
        NoArvore<Integer> no4 = new NoArvore<>(4);
        no4.inserirFilho(no9);
        no4.inserirFilho(no10);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilho(no2);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);
        
        assertFalse(arvore.pertence(55));
    }

    /**
     * Test of toString method, of class Arvore.
     */
    @Test
    public void testToString() {
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        
        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilho(no5);
        no2.inserirFilho(no6);
        no2.inserirFilho(no7);
        
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        no3.inserirFilho(no8);

        NoArvore<Integer> no10 = new NoArvore<>(10);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        
        NoArvore<Integer> no4 = new NoArvore<>(4);
        no4.inserirFilho(no9);
        no4.inserirFilho(no10);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilho(no2);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);
        
        System.out.println(arvore.toString());
        assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>", arvore.toString());
    }

    /**
     * Test of contarNos method, of class Arvore.
     */
    @Test
    public void testContarNos() {
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        
        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilho(no5);
        no2.inserirFilho(no6);
        no2.inserirFilho(no7);
        
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        no3.inserirFilho(no8);

        NoArvore<Integer> no10 = new NoArvore<>(10);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        
        NoArvore<Integer> no4 = new NoArvore<>(4);
        no4.inserirFilho(no9);
        no4.inserirFilho(no10);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilho(no2);
        no1.inserirFilho(no3);
        no1.inserirFilho(no4);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);
        
        assertEquals(10, arvore.contarNos());
    }
}
