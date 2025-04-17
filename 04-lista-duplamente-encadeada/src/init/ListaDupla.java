/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package init;

import model.NoListaDupla;

/**
 *
 * @author lhenschel
 */
public class ListaDupla<T> {
    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        liberar();
    }

    public NoListaDupla getPrimeiro() {
        return primeiro;
    }
    
    public void inserir(T value) {
        NoListaDupla<T> no = new NoListaDupla<>(value);
        
        if (primeiro == null) {
            primeiro = no;
        } else {
            no.setProximo(primeiro);
            primeiro.setAnterior(no);
            
            this.primeiro = no;
        }
    }
    
    public void exibir() {
        NoListaDupla<T> current = primeiro;
        
        while (current != null) {
            System.out.println(current.getInfo() + " -> ");
            current = current.getProximo();
        }
        
        System.out.println("null");
    }
    
    public NoListaDupla<T> buscar(T info) {
        NoListaDupla<T> current = primeiro;
        
        while (current != null) {
            if (current.getInfo().equals(info)) {
                return current;
            }
            
            current = current.getProximo();
        }
        
        return null;
    }
   
    public void retirar(T value) {
        NoListaDupla<T> no = buscar(value);
        
        if (no == null) return;
        
        NoListaDupla<T> anterior = no.getAnterior();
        NoListaDupla<T> proximo = no.getProximo();
        
        if (anterior != null) {
            anterior.setProximo(proximo);
        } else {
            primeiro = proximo;
        }
        
        if (proximo != null) {
            proximo.setAnterior(anterior);
        }
        
        no.setAnterior(null);
        no.setProximo(null);
    }
    
    public NoListaDupla<T> obterNo(int index) {
        if (index < 0 || index >= obterComprimento()) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        
        int count = 0;
        NoListaDupla<T> current = primeiro;
        
        while (count < index) {
            count++;
            current = current.getProximo();
        }
        
        return current;
    }
    
    public void exibirOrdemInversa() {
        NoListaDupla<T> atual = primeiro;

        while (atual != null && atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getAnterior();
        }
    }
    
    public boolean estaVazia() {
        return primeiro == null;
    }
    
    public int obterComprimento() {
        int count = 0;
        NoListaDupla<T> current = primeiro;
        
        while (current != null) {
            count++;
            current = current.getProximo();
        }
        
        return count;
    }
    
    public void liberar() {
        NoListaDupla<T> current = primeiro;
        
        while (current != null) {
            NoListaDupla<T> proximo = current.getProximo();
            proximo.setAnterior(null);
            proximo.setProximo(null);
            
            current = proximo;
        }
        
        primeiro = null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoListaDupla<T> current = primeiro;
        
        while (current != null) {
            sb.append(current.getInfo())
                .append(" -> ");
            
            current = current.getProximo();
        }
        
        sb.append("null");
        
        return sb.toString();
    }
}
