/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import expections.PilhaVaziaException;
import interfaces.Pilha;

/**
 *
 * @author lucas
 */
public class PilhaLista<T> implements Pilha<T> {
    private ListaEncadeada<T> listaEncadeada;

    public PilhaLista() {
        liberar();
    }
    
    @Override
    public void push(T info) {
        listaEncadeada.inserir(info);
    }

    @Override
    public T pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }
        
        T value = peek();
        listaEncadeada.retirar(value);
        
        return value;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }
        
        return (T) listaEncadeada.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        return listaEncadeada.estaVazia();
    }

    @Override
    public void liberar() {
        this.listaEncadeada = new ListaEncadeada<>();
    }

    @Override
    public String toString() {
        return listaEncadeada.toString();
    }
}
