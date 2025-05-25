/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package init;

import model.NoArvoreBinaria;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        init();
    }
    
    private void init() {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
        
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
        
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);
        
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        
        System.out.println(arvore.toString());
    }
}
