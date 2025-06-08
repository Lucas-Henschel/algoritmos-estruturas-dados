/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package init;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class ArvoreBinariaBuscaTest {
    
    /**
     * Test of inserir method, of class ArvoreBinariaBusca.
     */
    @Test
    public void testInserir() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();
        
        arvoreBinariaBusca.inserir(50);
        arvoreBinariaBusca.inserir(30);
        arvoreBinariaBusca.inserir(70);
        arvoreBinariaBusca.inserir(40);
        arvoreBinariaBusca.inserir(25);
        arvoreBinariaBusca.inserir(75);
        arvoreBinariaBusca.inserir(65);
        arvoreBinariaBusca.inserir(35);
        arvoreBinariaBusca.inserir(60);
        
        assertEquals("<50<30<25<><>><40<35<><>><>>><70<65<60<><>><>><75<><>>>>", arvoreBinariaBusca.toString());
    }

    /**
     * Test of buscar method, of class ArvoreBinariaBusca.
     */
    @Test
    public void testBuscar() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();
        
        arvoreBinariaBusca.inserir(50);
        arvoreBinariaBusca.inserir(30);
        arvoreBinariaBusca.inserir(25);
        arvoreBinariaBusca.inserir(40);
        
        assertEquals(Integer.valueOf(40), arvoreBinariaBusca.buscar(40).getInfo());
    }

    /**
     * Test of retirar method, of class ArvoreBinariaBusca.
     */
    @Test
    public void testRetirar() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();
        
        arvoreBinariaBusca.inserir(50);
        arvoreBinariaBusca.inserir(30);
        arvoreBinariaBusca.inserir(25);
        arvoreBinariaBusca.inserir(40);
        
        arvoreBinariaBusca.retirar(40);
        
        assertEquals("<50<30<25<><>><>><>>", arvoreBinariaBusca.toString());
    }
    
    /**
     * Test of retirar method, of class ArvoreBinariaBusca.
     */
    @Test
    public void testRetirarNoComFilho() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();
        
        arvoreBinariaBusca.inserir(80);
        arvoreBinariaBusca.inserir(52);
        arvoreBinariaBusca.inserir(90);
        arvoreBinariaBusca.inserir(48);
        arvoreBinariaBusca.inserir(71);
        arvoreBinariaBusca.inserir(63);
        arvoreBinariaBusca.inserir(67);
        
        arvoreBinariaBusca.retirar(71);
                
        assertEquals("<80<52<48<><>><63<><67<><>>>><90<><>>>", arvoreBinariaBusca.toString());
    }
    
    /**
     * Test of retirar method, of class ArvoreBinariaBusca.
     */
    @Test
    public void testRetirarNoComDoisFilhos() {
        ArvoreBinariaBusca<Integer> arvoreBinariaBusca = new ArvoreBinariaBusca<>();
        
        arvoreBinariaBusca.inserir(250);
        arvoreBinariaBusca.inserir(38);
        arvoreBinariaBusca.inserir(26);
        arvoreBinariaBusca.inserir(72);
        arvoreBinariaBusca.inserir(55);
        arvoreBinariaBusca.inserir(90);
        arvoreBinariaBusca.inserir(41);
        arvoreBinariaBusca.inserir(60);
        arvoreBinariaBusca.inserir(43);
        arvoreBinariaBusca.inserir(78);
        arvoreBinariaBusca.inserir(92);
        arvoreBinariaBusca.inserir(74);
        
        arvoreBinariaBusca.retirar(38);
                
        assertEquals("<250<41<26<><>><72<55<43<><>><60<><>>><90<78<74<><>><>><92<><>>>>><>>", arvoreBinariaBusca.toString());
    }
}
