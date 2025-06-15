/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucas
 */
public class OrdenacaoQuickSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    
    private T[] info = getInfo();

    @Override
    public void ordenar() {
        int n = getInfo().length - 1;
        info = getInfo();
        
        quickSort(0, n);
    }
    
    private void quickSort(int inicio, int fim) {
        if (inicio < fim) {
            int idxPivo = particinar(inicio, fim);
            
            quickSort(inicio, idxPivo - 1);
            quickSort(idxPivo + 1, fim);
        }
    }
    
    private int particinar(int inicio, int fim) {
        int a = inicio;
        int b = fim + 1;
        T pivo = info[inicio];
        
        while (true) {
            do {
                a = a + 1;
            } while (a <= fim && info[a].compareTo(pivo) < 0);
            
            do {
                b = b - 1;
            } while (b >= inicio && info[b].compareTo(pivo) > 0);
            
            if (a >= b) {
                break;
            }
            
            trocar(a, b);
        }
        
        trocar(b, inicio);
        return b;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
