/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import interfaces.Fila;

/**
 *
 * @author lucas
 */
public class FilaLista<T> implements Fila<T> {
    private ListaEncadeada listaEncadeada;

    public FilaLista() {
        liberar();
    }
    
    @Override
    public void inserir(T valor) {
        listaEncadeada.inserir(valor);
    }

    @Override
    public boolean estaVazia() {
        return listaEncadeada.getPrimeiro() == null;
    }

    @Override
    public T peek() {
        return (T) listaEncadeada.getPrimeiro().getInfo();
    }

    @Override
    public T retirar() {
        T value = peek();
        
        listaEncadeada.retirar(value);
        
        return value;
    }

    @Override
    public void liberar() {
        this.listaEncadeada = new ListaEncadeada();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> current = listaEncadeada.getPrimeiro();
        
        if (current == null) {
            sb.append("null");
        }
        
        while (current != null) {
            sb.append(current.getInfo());
            
            if (current.getProximo() != null) {
                sb.append(",");
            }
            
            current = current.getProximo();
        }
        
        return sb.toString();
    }
}
