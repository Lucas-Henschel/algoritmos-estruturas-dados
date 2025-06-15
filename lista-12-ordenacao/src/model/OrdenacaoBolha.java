/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucas
 */
public class OrdenacaoBolha<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    
    private T[] info = getInfo();

    @Override
    public void ordenar() {
        int n = getInfo().length;
        info = getInfo();
        
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (info[j].compareTo(info[j + 1]) > 0) {
                    trocar(j, j + 1);
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
