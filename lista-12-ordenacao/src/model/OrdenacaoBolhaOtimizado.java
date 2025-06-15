/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucas
 */
public class OrdenacaoBolhaOtimizado<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    
    private T[] info = getInfo();

    @Override
    public void ordenar() {
        int n = getInfo().length;
        info = getInfo();
        
        boolean trocou = false;
        
        for (int i = n - 1; i >= 1; i--) {
            trocou = false;
            
            for (int j = 0; j <= i - 1; j++) {
                if (info[j].compareTo(info[j + 1]) > 0) {
                    trocar(j, j + 1);
                    trocou = true;
                }
            }
            
            if (!trocou) {
                return;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
