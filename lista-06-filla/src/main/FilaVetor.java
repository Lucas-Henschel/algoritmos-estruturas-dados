/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import exceptions.FilaCheiaException;
import exceptions.FilaVaziaException;
import interfaces.Fila;

/**
 *
 * @author lucas
 */
public class FilaVetor<T> implements Fila<T> {
    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        liberar();
        
        this.limite = limite;
        this.info = (T[]) new Object[this.limite];
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException("Fila está cheia");
        }
        
        int index = (this.inicio + this.tamanho) % this.limite;
        this.tamanho++;
        
        this.info[index] = valor;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException("Fila está vazia");
        }
        
        return (T) this.info[this.inicio];
    }

    @Override
    public T retirar() {
        if (estaVazia()) {
            throw new FilaVaziaException("Fila está vazia");
        }
        
        T elementRemoved = peek();
        
        this.inicio = (this.inicio + 1) % this.limite;
        this.tamanho--;
        
        return elementRemoved;
    }

    @Override
    public void liberar() {
        this.info = (T[]) new Object[0];
        this.tamanho = 0;
        this.limite = 0;
        this.inicio = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < tamanho; i++) {
            sb.append(info[i]);

            if (i != tamanho - 1) {
                sb.append(",");
            }
        }
        
        return sb.toString();
    }
    
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> filaVetor = new FilaVetor<>(this.limite + f2.limite);
        
        for (Object value : this.info) {
            if (value != null) {
                filaVetor.inserir((T) value);
            }
        }
        
        for (Object value : f2.info) {
            if (value != null) {
                filaVetor.inserir((T) value);
            }
        }
        
        return filaVetor;
    }

    public int getLimite() {
        return limite;
    }
}
