/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucas
 */
public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    
    private T[] info = getInfo();

    @Override
    public void ordenar() {
        int n = getInfo().length - 1;
        info = getInfo();
        
        mergeSort(0, n);
    }
    
    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            
            merge(inicio, fim, meio);
        }
    }
    
    private void merge(int inicio, int fim, int meio) {
        int tamEsquerda = meio - inicio + 1;
        T[] esquerda = (T[]) new Comparable[tamEsquerda];
        
        for (int i = 0; i < tamEsquerda; i++) {
            esquerda[i] = info[inicio + i];
        }
        
        int tamDireita = fim - meio;
        T[] direita = (T[]) new Comparable[tamDireita];

        for (int i = 0; i < tamDireita; i++) {
            direita[i] = info[meio + 1 + i];
        }

        int cEsq = 0;
        int cDir = 0;
        int k = inicio;

        while (cEsq < tamEsquerda && cDir < tamDireita) {
            if (esquerda[cEsq].compareTo(direita[cDir]) <= 0) {
                info[k++] = esquerda[cEsq++];
            } else {
                info[k++] = direita[cDir++];
            }
        }

        while (cEsq < tamEsquerda) {
            info[k++] = esquerda[cEsq++];
        }

        while (cDir < tamDireita) {
            info[k++] = direita[cDir++];
        }
    }
}
