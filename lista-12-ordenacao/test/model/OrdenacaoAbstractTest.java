/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class OrdenacaoAbstractTest {
    
    private Integer[] getVector() {
        return List.of(70, 2, 88, 15, 90, 30).toArray(new Integer[0]);
    }
  
    /**
     * Test of ordenar method, of class OrdenacaoBolha.
     */
    @Test
    public void testOrdenarBolha() {
        OrdenacaoBolha<Integer> ordenacaoBolha = new OrdenacaoBolha<>();
        
        Integer[] vector = getVector();
        ordenacaoBolha.setInfo(vector);
        
        ordenacaoBolha.ordenar();
                
        assertEquals("[2,15,30,70,88,90]", ordenacaoBolha.toString());
    }
    
    /**
     * Test of ordenar method, of class OrdenacaoBolhaOtimizado.
     */
    @Test
    public void testOrdenarBolhaOtimizado() {
        OrdenacaoBolhaOtimizado<Integer> ordenacaoBolhaOtimizado = new OrdenacaoBolhaOtimizado<>();
        
        Integer[] vector = getVector();
        ordenacaoBolhaOtimizado.setInfo(vector);
        
        ordenacaoBolhaOtimizado.ordenar();
        
        assertEquals("[2,15,30,70,88,90]", ordenacaoBolhaOtimizado.toString());
    }
    
    /**
     * Test of ordenar method, of class OrdenacaoQuickSort.
     */
    @Test
    public void testOrdenarQuickSort() {
        OrdenacaoQuickSort<Integer> ordenacaoQuickSort = new OrdenacaoQuickSort<>();
        
        Integer[] vector = getVector();
        ordenacaoQuickSort.setInfo(vector);
        
        ordenacaoQuickSort.ordenar();
        
        assertEquals("[2,15,30,70,88,90]", ordenacaoQuickSort.toString());
    }
    
    /**
     * Test of ordenar method, of class OrdenacaoMergeSort.
     */
    @Test
    public void testOrdenarMergeSort() {
        OrdenacaoMergeSort<Integer> ordenacaoMergeSort = new OrdenacaoMergeSort<>();
        
        Integer[] vector = getVector();
        ordenacaoMergeSort.setInfo(vector);
        
        ordenacaoMergeSort.ordenar();
        
        assertEquals("[2,15,30,70,88,90]", ordenacaoMergeSort.toString());
    }
}
