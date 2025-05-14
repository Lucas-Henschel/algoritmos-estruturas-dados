/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import expections.PilhaCheiaException;
import expections.PilhaVaziaException;
import interfaces.Pilha;

/**
 *
 * @author lucas
 * @param <T>
 */
public class PilhaVetor<T> implements Pilha<T> {
    private Object[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        liberar();
    }
    
    @Override
    public void push(T value) {
        if (tamanho == limite) {
            throw new PilhaCheiaException("A pilha está cheia");
        }
        
        info[tamanho] = value;
        tamanho++;
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }
        
        T value = peek();
        
        info[tamanho] = null;
        
        tamanho--;
        return value;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }
        
        return (T) info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        this.info = (T[]) new Object[limite];
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
                
        for (int i = tamanho - 1; i >= 0; i--) {
            sb.append(info[i]);

            if (i > 0) {
                sb.append(",");
            }
        }
        
        return sb.toString();
    }
    
    public void concatenar(PilhaVetor<T> p) {
        if ((tamanho + p.tamanho) >= limite) {
            throw new PilhaCheiaException("A pilha não tem capacidade para inserir os elementos");
        }
        
        for (Object value : p.info) {
            if (value != null) {
                push((T) value);
            }
        }
    }
}
