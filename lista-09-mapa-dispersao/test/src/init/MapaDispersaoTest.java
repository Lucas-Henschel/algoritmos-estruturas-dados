/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package src.init;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Test;
import static org.junit.Assert.*;
import src.model.Aluno;

/**
 *
 * @author lucas
 */
public class MapaDispersaoTest {

    /**
     * Test of inserir method, of class MapaDispersao.
     */
    @Test
    public void testInserir() {
        MapaDispersao<Aluno> mapaDispersao = new MapaDispersao<>(53);
        
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.of(2000, Month.JANUARY, 01));
        mapaDispersao.inserir(obj1.getMatricula(), obj1);
        
        assertEquals(obj1, mapaDispersao.buscar(obj1.getMatricula()));
    }

    /**
     * Test of remover method, of class MapaDispersao.
     */
    @Test
    public void testRemover() {
        MapaDispersao<Aluno> mapaDispersao = new MapaDispersao<>(53);
        
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.of(12000, Month.JANUARY, 01));
        mapaDispersao.inserir(obj1.getMatricula(), obj1);
        
        mapaDispersao.remover(obj1.getMatricula());
        
        assertNull(mapaDispersao.buscar(obj1.getMatricula()));
    }

    /**
     * Test of buscar method, of class MapaDispersao.
     */
    @Test
    public void testBuscarVariosElementos() {
        MapaDispersao<Aluno> mapaDispersao = new MapaDispersao<>(53);
        
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.of(2000, Month.JANUARY, 01));
        Aluno obj2 = new Aluno(14000, "Pedro", LocalDate.of(1999, Month.JANUARY, 20));
        Aluno obj3 = new Aluno(12500, "Marta", LocalDate.of(200, Month.FEBRUARY, 18));
        Aluno obj4 = new Aluno(13000, "Lucas", LocalDate.of(1998, Month.NOVEMBER, 25));
        
        mapaDispersao.inserir(obj1.getMatricula(), obj1);
        mapaDispersao.inserir(obj2.getMatricula(), obj2);
        mapaDispersao.inserir(obj3.getMatricula(), obj3);
        mapaDispersao.inserir(obj4.getMatricula(), obj4);
        
        assertEquals(obj1, mapaDispersao.buscar(obj1.getMatricula()));
        assertEquals(obj2, mapaDispersao.buscar(obj2.getMatricula()));
        assertEquals(obj3, mapaDispersao.buscar(obj3.getMatricula()));
        assertEquals(obj4, mapaDispersao.buscar(obj4.getMatricula()));
    }
    
    /**
     * Test of buscar method, of class MapaDispersao.
     */
    @Test
    public void testBuscarComColisao() {
        MapaDispersao<Aluno> mapaDispersao = new MapaDispersao<>(53);
        
        Aluno obj1 = new Aluno(12000, "Jean", LocalDate.of(2000, Month.JANUARY, 01));
        Aluno obj2 = new Aluno(14000, "Pedro", LocalDate.of(1999, Month.JANUARY, 20));
        Aluno obj3 = new Aluno(14226, "Marta", LocalDate.of(200, Month.FEBRUARY, 18));
        Aluno obj4 = new Aluno(17180, "Lucas", LocalDate.of(1998, Month.NOVEMBER, 25));
        
        mapaDispersao.inserir(obj1.getMatricula(), obj1);
        mapaDispersao.inserir(obj2.getMatricula(), obj2);
        mapaDispersao.inserir(obj3.getMatricula(), obj3);
        mapaDispersao.inserir(obj4.getMatricula(), obj4);
        
        assertEquals(obj1, mapaDispersao.buscar(obj1.getMatricula()));
        assertEquals(obj2, mapaDispersao.buscar(obj2.getMatricula()));
        assertEquals(obj3, mapaDispersao.buscar(obj3.getMatricula()));
        assertEquals(obj4, mapaDispersao.buscar(obj4.getMatricula()));
    }
}
